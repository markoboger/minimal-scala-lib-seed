package de.htwg.se.SE_Chess_HTWG

import de.htwg.se.SE_Chess_HTWG.model.gridComponent.{Cell, GridBaseImpl, Matrix}


object SE_Chess_HTWG {
  def main(args: Array[String]): Unit = {
    var grid = new GridBaseImpl(new Matrix(new Cell(None, false)))
    grid.createNewGrid
    println(grid.toString)
  }
}
