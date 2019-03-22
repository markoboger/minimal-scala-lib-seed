package de.htwg.se.Schach.model.Figures

import de.htwg.se.Schach.util.Colour.Colour
import de.htwg.se.Schach.model.Field.Field
import de.htwg.se.Schach.model.rules.Moves.pawnMove
import de.htwg.se.Schach.util.Coordinates
import de.htwg.se.Schach.util.{Colour, Coordinates}

private[model] case class Pawn(colour: Colour, stepCounter: Int) extends Figure {

  override def getName: String = "Pawn"

  override def getPossibleNewPositions(field: Field, coordinates: Coordinates): Vector[Vector[Coordinates]] = pawnMove(field, this.colour, coordinates, hasAbility)

  override def toString: String = if (colour == Colour.black) "♟" else "♙"

  override def move: Figure = {
    Pawn(this.colour, this.stepCounter + 1)
  }

  override def unMove: Figure = {
    Pawn(this.colour, this.stepCounter - 1)
  }

  def hasAbility = stepCounter == 0
}
