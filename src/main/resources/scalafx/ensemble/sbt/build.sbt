name := "@name@"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.3"

libraryDependencies +="org.scalafx" %% "scalafx" % "1.0.0-M7-SNAPSHOT"

// Repository for snapshots
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// Add JavaFX 2.0 to classpath
// For Java 8 it is not needed, it has`jfxrt.jar` in classpath
unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))

scalacOptions ++= Seq("-unchecked", "-deprecation")

mainClass in Compile := Some("@mainClass@")

// Run in separate VM, so there are no issues with double initialization of JavaFX
fork := true

fork in Test := true
