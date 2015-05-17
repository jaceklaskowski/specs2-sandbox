name         := """specs2-sandbox"""
organization := "pl.japila.specs2"
version      := "1.0"
scalaVersion := "2.11.6"

val specsVersion = "3.6"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
libraryDependencies += "org.specs2" %% "specs2-core"          % specsVersion % "test"
libraryDependencies += "org.specs2" %% "specs2-form"          % specsVersion % "test"
libraryDependencies += "org.specs2" %% "specs2-scalacheck"    % specsVersion % "test"
libraryDependencies += "org.specs2" %% "specs2-html"          % specsVersion % "test"
libraryDependencies += "org.specs2" %% "specs2-matcher-extra" % specsVersion % "test"

