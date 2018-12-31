package de.htwg.se.SE_Chess_HTWG.controller

object GameStatus extends Enumeration {
  type GameStatus = Value
  val IDLE, PLAYER1TURN, PLAYER2TURN = Value

  val gameStatusToString = Map[GameStatus, String](
    IDLE -> "",
    PLAYER1TURN -> "First player's turn",
    PLAYER2TURN -> "Second player's turn"
  )

  def message(gameStatus: GameStatus): String = {
    gameStatusToString(gameStatus)
  }
}
