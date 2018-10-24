package de.htwg.se.SE_Chess_HTWG

import de.htwg.se.SE_Chess_HTWG.model.Player

object SE_Chess_HTWG {
  def main(args: Array[String]): Unit = {
    val student = Player("Your Name")
    println("Hello, " + student.name)
  }
}
