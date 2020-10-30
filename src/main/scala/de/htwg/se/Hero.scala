package de.htwg.se.Hero.model

import scala.math.sqrt

object Hero {
    def main(args: Array[String]): Unit = {
        val student = Player("Alina & Ronny")
        println("Hello, " + student.name)
        println(gameName())
        //println(stringTry())
        println(line())

    }

    def gameName(): String = {
        "Hero"
    }

    val lines: String = "=" * 7

    def mid(x: String): String = "I " + x + " I"

    def line(): String = {
        val line = Array(lines * 15 + "\n" + mid("HA.") + mid("   ") * 13 + mid(".FA") + "\n",
            lines * 15 + "\n" + mid("MA.") + mid("   ") * 5 + mid("xxx") + mid("   ") * 7 + mid("MAG") + "\n",
            lines * 15 + "\n" + mid("RO.") + mid("   ") * 6 + mid("xxx") + mid("   ") * 6 + mid(".CE") + "\n",
            lines * 15 + "\n" + mid("   ") * 15 + "\n",
            lines * 15 + "\n" + mid("   ") * 5 + mid("xxx") * 2 + mid("   ") * 8 + "\n",
            lines * 15 + "\n" + mid("AN.") + mid("   ") * 13 + mid(".DE") + "\n",
            lines * 15 + "\n" + mid("   ") * 15 + "\n",
            lines * 15 + "\n" + mid("   ") * 15 + "\n",
            lines * 15 + "\n" + mid("CH.") + mid("   ") * 6 + mid("xxx") * 2 + mid("   ") * 5 + mid(".EF") + "\n",
            lines * 15 + "\n" + mid("ZE.") + mid("   ") * 5 + mid("xxx") + mid("   ") * 7 + mid(".PI") + "\n",
            lines * 15 + "\n" + mid("CR.") + mid("   ") * 13 + mid(".HO") + "\n" + lines * 15 + "\n",
            "I Player 1 I" + " " * 81 + "I Player 2 I" + "\n")

        val board = "%s%s%s%s%s%s%s%s%s%s%s%s"
            .format(line(11), line(0), line(1), line(2), line(3), line(4), line(5), line(6), line(7), line(8), line(9), line(10))
        board
    }

    def stringTry(): String = {
        //12 lines + 61*-
        val line = "-" * 61
        val s = "|   "
        //11 fields + 15 modul
        val field = Array(
            "|HA." + s * 13 + "|.FA|",
            "|MA." + s * 5 + "|xxx" + s * 7 + "|MAG|",
            "|RO.|..." + s * 5 + "|xxx" + s * 5 + "|..|.CE|",
            s * 15 + "|",
            s * 5 + "|xxx|xxx" + s * 8 + "|",
            "|AN." + s * 13 + "|.DE|",
            (s * 15) + "|",
            (s * 15) + "|",
            "|CH.|..." + s * 5 + "|xxx|xxx" + s * 5 + "|.EF|",
            "|ZE." + s * 5 + "|xxx" + s * 7 + "|.PI|",
            "|CR." + s * 13 + "|.HO|")
        //11 lines & fields + 1 line


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
        board
    }

}