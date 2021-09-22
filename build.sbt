name := "akka-initial-test"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("org.tudux.scala")

val AkkaVersion = "2.6.16"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion,
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"


)
