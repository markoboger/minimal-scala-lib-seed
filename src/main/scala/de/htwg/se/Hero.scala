package de.htwg.se.Hero.model

object Hero {
    def main(args: Array[String]): Unit = {
        val student = Player("Alina & Ronny")
        println("Hello, " + student.name)
        println(gameName())
        //println(getBoardFinshed())
        println(stringTry())
    }
    def gameName() : String = {
        "Hero"
    }

    def getBoard() : String = {
        var board = ""
        for ( l <- 0 to 10) {
            for (line <- 0 to 61) {
                board = board + "-"
            }
            board = board + "\n"
            for (vert <- 0 to 61) {
                if(vert % 3 == 0) {

                } else {

                }
            }
            board = board + "\n"
        }
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