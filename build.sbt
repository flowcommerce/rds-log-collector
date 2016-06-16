/*
javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

lazy val root = (project in file(".")).
  settings(
    name := "rds-log-provider",
    organization := "io.flow",
    scalaVersion in ThisBuild := "2.11.8",
    version := "0.0.1",
    retrieveManaged := true,
    libraryDependencies ++= Seq(
      "org.apache.commons" % "commons-io" % "1.3.2",
      "com.amazonaws" % "aws-java-sdk-s3" % "1.11.7",
      "com.amazonaws" % "aws-java-sdk-rds" % "1.11.7",
      "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
      "com.amazonaws" % "aws-lambda-java-events" % "1.1.0",

    )
  )

assemblyMergeStrategy in assembly := {
  {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
  }
}
*/
