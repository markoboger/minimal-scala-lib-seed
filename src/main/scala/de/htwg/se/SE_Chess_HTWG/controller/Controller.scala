package de.htwg.se.SE_Chess_HTWG.controller

import de.htwg.se.SE_Chess_HTWG.controller.GameStatus.GameStatus
import de.htwg.se.SE_Chess_HTWG.model.gridComponent.GridInterface

import scala.swing.Publisher

class Controller (var grid: GridInterface) extends ControllerInterface with Publisher {

  var gameStatus: GameStatus = GameStatus.IDLE
  override def gridToString: String = grid.toString

  override def createNewGrid: Unit = {
    grid = grid.createNewGrid
    gameStatus = GameStatus.PLAYER2TURN
    publish(new CellChanged)
  }

}
