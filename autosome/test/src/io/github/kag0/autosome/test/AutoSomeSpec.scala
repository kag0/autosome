package io.github.kag0.autosome.test

import org.scalatest._
import flatspec._
import matchers._

import io.github.kag0.autosome.{AutoNone, AutoSome}

class AutoSomeSpec extends AnyFlatSpec with should.Matchers {

  def target(maybe: AutoSome[String]) = maybe match {
    case AutoSome(s) => s
    case AutoNone() => "none"
  }

  "AutoSome" should "convert from Some" in {
    target(Some("hello")) shouldEqual "hello"
  }

  it should "convert from None" in {
    target(None) shouldEqual "none"
  }

  it should "convert from Option" in {
    val opt: Option[String] = Some("hello")
    target(opt) shouldEqual "hello"
  }

  it should "convert from inner type" in {
    target("hello") shouldEqual "hello"
  }

  it should "convert to Option" in {
    val auto: AutoSome[String] = "hello"
    auto.map(_ + " world") shouldEqual Some("hello world")

    def fun(opt: Option[Seq[Int]]) = opt.get
    val auto2: AutoSome[List[Int]] = List(1, 2, 3)
    fun(auto2) shouldEqual Seq(1, 2, 3)
  }
}
