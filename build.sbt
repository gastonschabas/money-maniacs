ThisBuild / version      := "0.0.0"
ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name         := "Money Maniacs",
    organization := "com.gaston.schabas",
    libraryDependencies ++= Seq(
      "org.scalatest"              %% "scalatest"       % "3.2.11" % Test,
      "ch.qos.logback"              % "logback-classic" % "1.2.11",
      "com.typesafe.scala-logging" %% "scala-logging"   % "3.9.4"
    ),
    scalacOptions := Seq(
      "-encoding",
      "utf8",
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfatal-warnings",
      "-language:higherKinds"
    )
  )
