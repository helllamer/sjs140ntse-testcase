enablePlugins(ScalaJSBundlerPlugin)

name := "sjs140ntse"

organization := "io.suggest"

scalaVersion := "2.13.4"

version := "0.0.0"

libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.5",
)

npmDependencies in Compile ++= Seq(
  "react" -> "16.13.1",
  "react-dom" -> "16.13.1",
  "react-leaflet" -> "1.9.1",
  "leaflet.locatecontrol" -> "0.62.0",
)
