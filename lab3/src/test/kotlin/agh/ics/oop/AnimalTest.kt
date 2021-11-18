package agh.ics.oop

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

import agh.ics.oop.MoveDirection.*

internal class AnimalTest {
    private val map = RectangularMap(100, 100)

    @Test
    fun isAt() {
        val otherVector2d: Vector2d = Vector2d(2, 2)
        val myAnimal: Animal = Animal(map)
        assertEquals(myAnimal.isAt(otherVector2d), true)

        myAnimal.move(FORWARD)
        val other2Vector2d = Vector2d(2, 3)
        assertEquals(myAnimal.isAt(other2Vector2d), true)
        assertEquals(myAnimal.isAt(otherVector2d), false)
    }

    @Test
    fun move() {
        val myAnimal: Animal = Animal(map)
        myAnimal.move(RIGHT)
        assertEquals(myAnimal.isAt(Vector2d(2, 2)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(3, 2)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(4, 2)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(4, 2)), true)
        myAnimal.move(LEFT)
        assertEquals(myAnimal.isAt(Vector2d(4, 2)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(4, 3)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(4, 4)), true)
        myAnimal.move(RIGHT)
        assertEquals(myAnimal.isAt(Vector2d(4, 4)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(4, 4)), true)
        myAnimal.move(RIGHT)
        assertEquals(myAnimal.isAt(Vector2d(4, 4)), true)
        myAnimal.move(RIGHT)
        assertEquals(myAnimal.isAt(Vector2d(4, 4)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(3, 4)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(2, 4)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(1, 4)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 4)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 4)), true)
        myAnimal.move(LEFT)
        assertEquals(myAnimal.isAt(Vector2d(0, 4)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 3)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 2)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 1)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 0)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 0)), true)
        myAnimal.move(FORWARD)
        assertEquals(myAnimal.isAt(Vector2d(0, 1)), false)


        val myNewAnimal = Animal(map)
        val parser: OptionsParser = OptionsParser()
        val T1 = listOf(
            "b", // 2,1
            "B", // 2,0
            "Backward", // 2,0
            "right", // 2, 0
            "f", // 3, 0
            "Forward", // 4,0
            "l",
            "left",
            "forwaRd", // 3,0
            "r", // 3,0
            "FORWARD", // 3, 1
        )
        val Moves = parser.parse(T1)
        Moves.forEach() { direction ->
            myNewAnimal.move(direction)
        }
        assertEquals(myNewAnimal.isAt(Vector2d(3, 1)), true)
        assertEquals(myNewAnimal.isAt(Vector2d(3, 0)), false)
    }
}