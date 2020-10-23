package de.htwg.se.Hero.model

object Hero {
  def main(args: Array[String]): Unit = {
    val student = Player("Alina & Ronny")
    println("Hello, " + student.name)
    println(gameName())
  }
  def gameName() : String = {
    "Hero"
  }
}
