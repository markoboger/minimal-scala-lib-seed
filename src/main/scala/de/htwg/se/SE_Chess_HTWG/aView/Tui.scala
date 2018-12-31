package de.htwg.se.SE_Chess_HTWG.aView

import de.htwg.se.SE_Chess_HTWG.controller.{CellChanged, ControllerInterface, GameStatus}

import scala.swing.Reactor

class Tui(controller: ControllerInterface) extends Reactor {

  listenTo(controller)

  def processInputLine(input: String): Unit = {
    input match {
      case "q" =>
      case "g" => controller.createNewGrid
      case _ => printTui
    }
  }

  reactions += {
    case event: CellChanged => printTui
  }

  def printTui: Unit = {
    println(controller.gridToString)
    println(GameStatus.message(controller.gameStatus))
  }
}
