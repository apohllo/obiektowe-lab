package agh.ics.oop


import agh.ics.oop.MoveDirection.*

/*
How to implement mechanism such that no two animals can stand on the same position

1. Make a class grid of a game (5x5) 0..4 rows, 0..4 columns
2. Mark position of an animals
3. When moving check whether the position is free, else stop moving.

Maybe consider spawning animal not always at (2,2), passing argument to the animal constructor.

 */

fun main(){
    println("Started Main")
    val parser = OptionsParser()
    val stringInput = readLine()!!

    val stringList = stringInput.split(" ")
    val directions = parser.parse(stringList)



//    println("Enter initial positions in a following format: ")
//    println("(a,b) (c,d) (e,f) ... (y,z)")
//
//    val initialPositionsStringTuples = stringInput.split(" ")

    val initialPositions = listOf(Vector2d(2,2), Vector2d(3,4))

    val map = RectangularMap(10, 10)

    SimulationEngine(directions, map, initialPositions).run()


}