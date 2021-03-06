import sbt._

class BenchmarkProject(info: ProjectInfo) extends DefaultProject(info) {

  lazy  val maven_local = "Local Maven Repository" at "file://" + Path.userHome + "/.m2/repository"

  lazy val karaf_console = "org.apache.karaf.shell" % "org.apache.karaf.shell.console" % "2.1.0" 
  lazy val activemq = "org.apache.activemq" % "activemq-core" % "5.5.0"
  lazy val stompjms = "org.fusesource.stompjms" % "stompjms-client" % "1.1-SNAPSHOT" //intransitive()
  // lazy val stompjms = "org.fusesource.stompjms" % "stompjms-client" % "1.0" intransitive()

  lazy val slf4j = "org.slf4j" % "slf4j-api" % "1.5.11"
  lazy val slf4j_nop = "org.slf4j" % "slf4j-nop" % "1.5.11"
}

