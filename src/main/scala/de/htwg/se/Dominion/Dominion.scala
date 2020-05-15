package de.htwg.se.Dominion

import de.htwg.se.Dominion.model.Player

object Dominion {
  def main(args: Array[String]): Unit = {
    println("Dominion\n")
    val student = Player("Jakob Strakhof und Karsten Huber")
    println("Hello, " + student.name)
  }
}
