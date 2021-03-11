import mill._, scalalib._

object autosome extends ScalaModule {
  def scalaVersion = "2.13.5"

  object test extends Tests {
    def ivyDeps = Agg(ivy"org.scalatest::scalatest:3.2.6")
    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }
}

