val root = project.in(file(".")).settings(commonSettings: _*).settings(
  libraryDependencies ++= Seq(
    "io.circe" %% "circe-core" % "0.13.0",
  )
)

lazy val commonSettings = Seq(
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-effect" % "2.3.1"
  )
)
