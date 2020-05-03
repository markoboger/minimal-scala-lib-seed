package de.htwg.se.Dominion.model

import org.scalatest._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PlayerSpec extends WordSpec with Matchers {
  "A Player" when { "new" should {
    val player = Player("Jakob Strakhof")
    "have a name"  in {
      player.name should be("Jakob Strakhof")
    }
    "have a nice String representation" in {
      player.toString should be("Jakob Strakhof")
    }
  }}


}
