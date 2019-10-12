package de.htwg.se.Rush_Hour

import de.htwg.se.Rush_Hour.model.Player

object Rush_Hour {
  def main(args: Array[String]): Unit = {
    val student = Player("Jakob Strakhof")
    println("Hello, " + student.name)
  }
}
