package sbtstudent

object SSettings {
  import scala.Console._
  val consoleColorMap: Map[String, String] =
    Map("RESET" -> RESET, "GREEN" -> GREEN, "RED" -> RED, "BLUE" -> BLUE, "CYAN" -> CYAN, "YELLOW" -> YELLOW, "WHITE" -> WHITE, "BLACK" -> BLACK, "MAGENTA" -> MAGENTA)

  val testFolders = List("src/test", "greeting-impl/src/test", "whosthere-impl/src/test")

  val studentifiedBaseFolder = "lagomMiniWorkshop"

  val readmeInTestResources: Boolean = true

  val promptManColor         = "GREEN"
  val promptExerciseColor    = "GREEN"
  val promptCourseNameColor = "RESET"
}
       