val scalaJSViteVersion = sys.props.getOrElse(
  "plugin.version",
  sys.error("'plugin.version' environment variable is not set")
)
addSbtPlugin("me.ptrdom" % "sbt-scalajs-vite" % scalaJSViteVersion)
addSbtPlugin(
  "me.ptrdom" % "sbt-web-scalajs-vite" % scalaJSViteVersion
)

libraryDependencies += "org.scalatestplus" %% "selenium-4-4" % "3.2.14.0"
libraryDependencies += "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.14"
