
import sbt._

lazy val `lagom_greetings` = (project in file("."))
  .aggregate(
    common,
    `lagomMiniWorkshop`
  )
  .settings(CommonSettings.commonSettings: _*)
lazy val common = project.settings(CommonSettings.commonSettings: _*)

lazy val `lagomMiniWorkshop` = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")
       