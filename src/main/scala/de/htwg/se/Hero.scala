package de.htwg.se.Hero.model

import scala.math.sqrt

object Hero {
    def main(args: Array[String]): Unit = {
        val student = Player("Alina & Ronny")
        println("Hello, " + student.name)
        println(gameName())
        getBoard()
        for ( i <- 0 to 10) {
            for (j <- 0 to 14) {
                printf(field(i)(j).toString)
            }
        }
    }

    def gameName() : String = {
        "Hero"
    }

    case class Cell (unit:String) {
        override def toString: String = "-" * 7 + "\nI " + unit + " I\n" + "-" * 7
    }

    case class Field(cells: Array[Cell])
    val field = Array.ofDim[Cell](11,15)

    def getBoard() : Unit = {
        for ( i <- 0 to 10) {
            for (j <- 0 to 14) {
                field(i)(j) = Cell("   ")
            }
        }
    }

    def lines() : String = {
        val x = "=" * 7
        x
    }

    def mid(x:String) : String = {
        val y = "I " + x + " I"
        y
    }

    def line () : String = {
        val line = Array(lines() * 15 + "\n" + mid("HA.") + mid("   ") * 13 + mid(".FA") + "\n",
            lines() * 15 + "\n" + mid("MA.") + mid("   ") * 5 + mid("xxx") + mid("   ") * 7 + mid("MAG") + "\n",
            lines() * 15 + "\n" + mid("RO.") + mid("   ") * 6 + mid("xxx") + mid("   ") * 6 + mid(".CE") + "\n",
            lines() * 15 + "\n" + mid("   ") * 15 + "\n",
            lines() * 15 + "\n" + mid("   ") * 5 + mid("xxx") * 2 + mid("   ") * 8 + "\n",
            lines() * 15 + "\n" + mid("AN.") + mid("   ") * 13 + mid(".DE") + "\n",
            lines() * 15 + "\n" + mid("   ") * 15 + "\n",
            lines() * 15 + "\n" + mid("   ") * 15 + "\n",
            lines() * 15 + "\n" + mid("CH.") + mid("   ") * 6 + mid("xxx") * 2 + mid("   ") * 5 + mid(".EF") + "\n",
            lines() * 15 + "\n" + mid("ZE.") + mid("   ") * 5 + mid("xxx") + mid("   ") * 7 + mid(".PI") + "\n",
            lines() * 15 + "\n" + mid("CR.") + mid("   ") * 13 + mid(".HO") + "\n" + lines() * 15 + "\n",
            "I Player 1 I" + " " * 81 + "I Player 2 I" + "\n")

        val board = "%s%s%s%s%s%s%s%s%s%s%s%s"
            .format(line(11), line(0), line(1), line(2), line(3), line(4), line(5), line(6), line(7), line(8), line(9), line(10))
        board
    }


    def stringTry() : String = {
        //12 lines + 61*-
        val line = "-" * 61
        //11 fields + 15 modul
        val field = Array(
            ("|HA." + "|   " * 13)+ "|.FA|",
            ("|MA." + "|   " * 5) + "|xxx" + "|   " * 7 + "|MAG" + "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|",
            ("|   " * 15)+ "|")
        //11 lines & fields + 1 line
        /*
        val board = (line + "\n" + field(0) + "\n" + //) * 11 + line
            line + "\n" + field(1) + "\n" +
            line + "\n" + field(2) + "\n" +
            line + "\n" + field(3) + "\n" +
            line + "\n" + field(4) + "\n" +
            line + "\n" + field(5) + "\n" +
            line + "\n" + field(6) + "\n" +
            line + "\n" + field(7) + "\n" +
            line + "\n" + field(8) + "\n" +
            line + "\n" + field(9) + "\n" +
            line + "\n" + field(10) + "\n" + line)
            */
        var i = 0
        //val board = (line + "\n" + field(i = i+1) + "\n" ) * 11 + line
        //val board = ("%1$s\n%2$s\n".format(line, field(i))) *11
        val board = f"$line%s\n${field(0)}%s\n" +
            f"$line%s\n${field(1)}%s\n" +
            f"$line%s\n${field(2)}%s\n" +
            f"$line%s\n${field(3)}%s\n" +
            f"$line%s\n${field(4)}%s\n" +
            f"$line%s\n${field(5)}%s\n" +
            f"$line%s\n${field(6)}%s\n" +
            f"$line%s\n${field(7)}%s\n" +
            f"$line%s\n${field(8)}%s\n" +
            f"$line%s\n${field(9)}%s\n" +
            f"$line%s\n${field(10)}%s\n"
        board
    }

    def getBoardFinshed() : String = {
        "-------------------------------------------------------------" +
            "\n|HA.|   |   |   |   |   |   |   |   |   |   |   |   |   |.FA|" +
            "\n-------------------------------------------------------------" +
            "\n|MA.|   |   |   |   |   |xxx|   |   |   |   |   |   |   |MAG|" +
            "\n-------------------------------------------------------------" +
            "\n|RO.|...|   |   |   |   |   |xxx|   |   |   |   |   |...|.CE|" +
            "\n-------------------------------------------------------------" +
            "\n|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |" +
            "\n-------------------------------------------------------------" +
            "\n|   |   |   |   |   |xxx|xxx|   |   |   |   |   |   |   |   |" +
            "\n-------------------------------------------------------------" +
            "\n|AN.|   |   |   |   |   |   |   |   |   |   |   |   |   |.DE|" +
            "\n-------------------------------------------------------------" +
            "\n|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |" +
            "\n-------------------------------------------------------------" +
            "\n|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |" +
            "\n-------------------------------------------------------------" +
            "\n|CH.|...|   |   |   |   |   |xxx|xxx|   |   |   |   |   |.EF|" +
            "\n-------------------------------------------------------------" +
            "\n|ZE.|   |   |   |   |   |xxx|   |   |   |   |   |   |   |.PI|" +
            "\n-------------------------------------------------------------" +
            "\n|CR.|   |   |   |   |   |   |   |   |   |   |   |   |   |.HO|" +
            "\n-------------------------------------------------------------"
    }
}