package de.htwg.se.SE_Chess_HTWG.model.gridComponent

import de.htwg.se.SE_Chess_HTWG.model.gridComponent.pieceComponent.Piece

trait GridInterface {
  def createNewGrid: GridInterface
}

trait CellInterface {
  def value: Option[Piece]
  def isHighlighted: Boolean
  def isWhite: Boolean
}