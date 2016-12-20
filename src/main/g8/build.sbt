lazy val scalatronDirectory = settingKey[File]("Base directory of your Scalatron installation.")
lazy val play = taskKey[Unit]("Installs your bot and starts Scalatron.")

lazy val root = (project in file(".")).settings(
  inThisBuild(Seq(
    organization := "com.example",
    scalaVersion := "2.12.1",
    scalacOptions ++= Seq("-encoding", "UTF8", "-deprecation", "-unchecked"),
    scalacOptions in Test += "-Yrangepos"
  )),

  name := "$name;format="normalize"$",

  scalatronDirectory := file("$scalatronDirectory$"),
  javaOptions += "-Xmx1g",

  target in assembly := target.value,
  assemblyJarName in assembly := "ScalatronBot.jar",
  assemblyOption in assembly := (assemblyOption in assembly).value copy (includeScala = false),

  play := {
    val scalatron = scalatronDirectory.value

    IO delete (scalatron / "bots" / name.value)
    IO copyFile (assembly.value, scalatron / "bots" / name.value / "ScalatronBot.jar")

    Fork.java.fork(
      config = ForkOptions(
        runJVMOptions = javaOptions.value,
        workingDirectory = Some(scalatron / "bin")
      ),
      arguments = Seq("-jar", "Scalatron.jar", "-browser", "no")
    )
  }
)
