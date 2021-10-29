package agh.ics.oop

import org.junit.jupiter.api.Assertions.*

import agh.ics.oop.MoveDirection.*
import org.junit.jupiter.api.Test

internal class OptionsParserTest{
    val parser = OptionsParser()
    val T1 = listOf<String>("f", "F", "fOrwArd", "forward", "Forward","FORWARD",
        "b", "B", "baCkWard", "BACKWARD", "backward", "Backward",
        "l", "L", "leFt", "left", "Left", "LEFT",
        "r", "R", "RiGHt", "right", "Right", "RIGHT",
        "any", "sandasjk", "nonmatch")
    val R1 = listOf<MoveDirection>(
        FORWARD, FORWARD, FORWARD, FORWARD, FORWARD, FORWARD,
        BACKWARD, BACKWARD, BACKWARD, BACKWARD, BACKWARD, BACKWARD,
        lEFT, lEFT, lEFT, lEFT, lEFT, lEFT,
        RIGHT, RIGHT, RIGHT, RIGHT, RIGHT, RIGHT)

    @Test
    fun parse(){
        val parsedResult1 = parser.parse(T1)
        parsedResult1.forEachIndexed() {index, moveDirection ->
            assertEquals(moveDirection, R1[index])
        }
    }
}