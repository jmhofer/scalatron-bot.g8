lazy val Versions = new {
  lazy val Specs2 = "3.8.6"
}

libraryDependencies += "org.specs2" %% "specs2-core" % Versions.Specs2 % Test
