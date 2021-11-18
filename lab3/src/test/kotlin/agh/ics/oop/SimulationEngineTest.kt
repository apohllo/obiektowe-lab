package agh.ics.oop

import org.junit.jupiter.api.Test
import agh.ics.oop.MoveDirection.*
import org.junit.jupiter.api.Assertions.*

class SimulationEngineTest {

    @Test
    fun simulationEngineTest(){

        val directions = listOf(FORWARD, BACKWARD, RIGHT, LEFT, FORWARD,
            FORWARD, RIGHT, RIGHT, FORWARD, FORWARD,FORWARD,FORWARD,FORWARD,FORWARD,FORWARD,FORWARD)
        val map = RectangularMap(10, 10)
        val initialPositions = listOf(Vector2d(2,2), Vector2d(3,4))
        SimulationEngine(directions, map, initialPositions).run()
        val myAnimals = map.animals()

        val endingPositions = listOf(Vector2d(2, 0), Vector2d(3, 7))

        myAnimals.forEach { animal ->
            val animalPos: Vector2d = animal.get_position()
            assertEquals(true, animalPos in endingPositions)
        }

    }



}