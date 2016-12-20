lazy val versions = new {
  lazy val specs2 = "3.8.6"
  lazy val cats = "0.8.1"
}

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats" % versions.cats, // just as an example for using external dependencies
  "org.specs2" %% "specs2-core" % versions.specs2 % Test,
  "org.specs2" %% "specs2-scalacheck" % versions.specs2 % Test
)
