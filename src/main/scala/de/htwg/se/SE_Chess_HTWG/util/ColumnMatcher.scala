package de.htwg.se.SE_Chess_HTWG.util

import de.htwg.se.SE_Chess_HTWG.model.gridComponent.pieceComponent._

object ColumnMatcher {
  // Hilfsmethode um die Randannotationen am Brett zu setzen
  def matchColToLetter(number: Int): String = {
    number match {
      case 0 => "a"
      case 1 => "b"
      case 2 => "c"
      case 3 => "d"
      case 4 => "e"
      case 5 => "f"
      case 6 => "g"
      case 7 => "h"
    }
  }

  // Hilfsmethode um die richtige Figur in der jeweiligen Spalte zu setzen
  def matchColToPiece(col: Int, isWhite: Boolean): Piece = {
    col match {
      case 0 => new Rook(isWhite)
      case 1 => new Knight(isWhite)
      case 2 => new Bishop(isWhite)
      case 3 => if (isWhite) new Queen(isWhite) else new King(isWhite)
      case 4 => if (isWhite) new King(isWhite) else new Queen(isWhite)
      case 5 => new Bishop(isWhite)
      case 6 => new Knight(isWhite)
      case 7 => new Rook(isWhite)
    }
  }
}
