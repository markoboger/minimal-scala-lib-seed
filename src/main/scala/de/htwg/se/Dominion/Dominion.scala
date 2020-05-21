package de.htwg.se.Dominion

import de.htwg.se.Dominion.model.{Board, Card, CardSet, Hand, Player, PlayerDrawPile}

object Dominion {
  def main(args: Array[String]): Unit = {
    println("Dominion\n")
    val student1 = Player("Jakob Strakhof")
    val student2 = Player("Karsten Huber")
    println("Hello, " + student1.name + " and " + student2)
    //println(CardSet.copperCard.toString)
    //val board = Board()
    println(student1.startingPile)
    println(student2.startingPile)
    println(student1.playerDrawPile)
    println(student2.playerDrawPile)
    println(student1.startingHand)
    println(student2.startingHand)
  }
}