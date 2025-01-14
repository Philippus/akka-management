enablePlugins(JavaServerAppPackaging)

name := "bootstrap-demo-marathon-api"

resolvers += "Akka library repository".at("https://repo.akka.io/maven")

version := "0.1.0"

scalaVersion := "2.13.13"

val akkaManagementVersion = "1.5.0"

libraryDependencies ++= Vector(
  "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % akkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % akkaManagementVersion,
  "com.lightbend.akka.discovery" %% "akka-discovery-marathon-api" % akkaManagementVersion
)
