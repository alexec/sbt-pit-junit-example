import org.pitest.sbt.PitKeys._

name := "sbt-pit-junit-example"

organization := "com.example"

version := "1.0"

scalaVersion := "2.11.8"

// JUnit
testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies += "junit" % "junit" % "4.12" % "test"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

// Pitest
verbose := true
timestampedReports := false

