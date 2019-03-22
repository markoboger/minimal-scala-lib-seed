package de.htwg.se.Schach.model.Figures

import de.htwg.se.Schach.util.Colour.Colour
import de.htwg.se.Schach.model.Field.Field
import de.htwg.se.Schach.model._
import de.htwg.se.Schach.model.rules.Moves.knightMove
import de.htwg.se.Schach.util.{Colour, Coordinates}


case class Knight(colour: Colour, stepCounter: Int) extends Figure {

  override def getName: String = "Knight"

  override def getPossibleNewPositions(field: Field, coordinates: Coordinates): Vector[Vector[Coordinates]] = knightMove(field, this.colour, coordinates)

  override def toString: String = if (colour == Colour.black) "♞" else "♘"

  override def move: Figure = {
    Knight(this.colour, this.stepCounter + 1)
  }

  override def unMove: Figure = {
    Knight(this.colour, this.stepCounter - 1)
  }
}

object Knight {

  import Figure.{ROW_BLACK, ROW_WHITE}

  val COL_FIGURE_LEFT = 1
  val COL_FIGURE_RIGHT = 6
  val COORDINATES_BLACK_LEFT: Coordinates = Coordinates(ROW_BLACK, COL_FIGURE_LEFT)
  val COORDINATES_BLACK_RIGHT: Coordinates = Coordinates(ROW_BLACK, COL_FIGURE_RIGHT)
  val COORDINATES_WHITE_LEFT: Coordinates = Coordinates(ROW_WHITE, COL_FIGURE_LEFT)
  val COORDINATES_WHITE_RIGHT: Coordinates = Coordinates(ROW_WHITE, COL_FIGURE_RIGHT)
}