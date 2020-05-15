package de.htwg.se.Dominion

import de.htwg.se.Dominion.model.Player

object Dominion {
  def main(args: Array[String]): Unit = {
    val student = Player("Jakob Strakhof")
    println("Dominion\n")
    println("Hello, " + student.name)
  }
}
