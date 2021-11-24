package agh.ics.oop

import agh.ics.oop.MoveDirection.*
import agh.ics.oop.MapDirection.*

// animal jest tworzony na mapie

class Animal(private val map: IWorldMap) {
    private var orientation: MapDirection = NORTH
    var position: Vector2d = Vector2d(2, 2)

    constructor(map: IWorldMap, initalPosition: Vector2d) : this(map) {
        position = initalPosition
    }

    override fun toString(): String {
        return when (orientation) {
            NORTH -> "^"
            EAST -> ">"
            SOUTH -> "v"
            WEST -> "<"
        }
    }

    fun isAt(otherPosition: Vector2d) = position == otherPosition


    fun move(direction: MoveDirection){
        when (direction) {
            RIGHT -> {
                orientation = orientation.next()
            }
            LEFT -> {
                orientation = orientation.previous()
            }
            FORWARD -> {
                val newPosition = position + orientation.toUnitVector()
                if (map.canMoveTo(newPosition)) {
                    position = newPosition
                }
            }
            BACKWARD -> {
                val newPosition = position - orientation.toUnitVector()
                if (map.canMoveTo(newPosition)) {
                    position = newPosition
                }
            }
        }
    }
}