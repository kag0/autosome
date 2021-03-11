package io.github.kag0

import scala.language.implicitConversions

package object autosome {

  case class AutoSome[+A](maybe: Option[A]) extends AnyVal
  object AutoSome {
    implicit def fromOption[A](maybe: Option[A]): AutoSome[A] = AutoSome(maybe)
    implicit def from[A](a: A): AutoSome[A] = AutoSome(Some(a))
    implicit def toOption[A](autoSome: AutoSome[A]): Option[A] = autoSome.maybe

    def unapply[A](autoSome: AutoSome[A]) = autoSome.maybe
  }

  object AutoNone {
    def unapply[A](autoSome: AutoSome[A]) = autoSome.maybe.isEmpty
  }
}
