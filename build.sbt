val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "lighthouse",
    version := "0.1",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.10" % "test"
  )
