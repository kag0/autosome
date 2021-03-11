package io.github.kag0.autosome.test

import io.github.kag0.autosome.{AutoNone, AutoSome}

object Examples extends App {

case class User(name: String, bio: AutoSome[String])

val clarice = User("Clarice Starling", "Wants to be an FBI agent")
val hannibal = User("Hannibal Lecter", None)

{

def formatUser(name: String, bio: Option[String]) =
  name + bio.map(": " + _).getOrElse("")

formatUser(clarice.name, clarice.bio)

}

def formatUser(user: User) =
  user.name + user.bio match {
    case AutoSome(bio) => s": $bio"
    case AutoNone() => ""
  }

val auto: AutoSome[String] = "hello"
auto.map(s"$_ world") // Some

def optionalDefaultParameters(defaultable: AutoSome[Int] = 9)

}



