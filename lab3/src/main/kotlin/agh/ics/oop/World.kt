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

    val myAnimal: Animal = Animal()

    println(myAnimal.toString())
    myAnimal.move(RIGHT)
    myAnimal.move(FORWARD)
    myAnimal.move(FORWARD)
    myAnimal.move(FORWARD)

    println(myAnimal.toString())
    val parser = OptionsParser()
    val strList = listOf("f", "b", "backward", "shit")
    val parsedList = parser.parse(strList)
    parsedList.forEach { println(it) }

}