package de.htwg.se

import de.htwg.se.Hero.model.Player

object Hero {
  def main(args: Array[String]): Unit = {
    val student = Player("Ronny Klotz")
    println("Hello, " + student.name)
  }
}
