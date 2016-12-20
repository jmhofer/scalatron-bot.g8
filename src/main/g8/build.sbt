// copy all jars from Scalatron's distribution (bin directory) into lib/

lazy val botDirectory = settingKey[File]("bot-directory")
lazy val play = taskKey[Int]("play")

lazy val root = (project in file(".")).settings(
  inThisBuild(Seq(
    organization := "com.example",
    scalaVersion := "2.12.1",
    scalacOptions ++= Seq("-encoding", "UTF8", "-deprecation", "-unchecked"),
    scalacOptions in Test += "-Yrangepos"
  )),

  name := "$name;format="normalize"$",

  botDirectory := file("bots"),
  javaOptions += "-Xmx1g",

  play := {
    val bots = botDirectory.value
    val ucp = (unmanagedClasspath in Compile).value
    val botJar = (Keys.`package` in Compile).value

    IO createDirectory (bots / name.value)
    IO copyFile (botJar, bots / name.value / "ScalatronBot.jar")

    Fork.java(
      config = ForkOptions(
        runJVMOptions = javaOptions.value ++ Seq("-cp", (ucp.files :+ botJar).absString)
      ),
      arguments = Seq("scalatron.main.Main", "-plugins", bots.absolutePath)
    )
  }
)
