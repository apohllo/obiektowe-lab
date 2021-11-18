package agh.ics.oop

import agh.ics.oop.MoveDirection.*
import agh.ics.oop.MapDirection.*

class Animal(private val map: IWorldMap) {
    private var orientation: MapDirection = NORTH
    private var position: Vector2d = Vector2d(2, 2)

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

    fun get_position(): Vector2d {
        return position
    }

    fun isAt(otherPosition: Vector2d): Boolean {
        return position == otherPosition
    }

    fun move(direction: MoveDirection): Boolean {
        when (direction) {
            RIGHT -> {
                orientation = orientation.next()
                return true
            }
            LEFT -> {
                orientation = orientation.previous()
                return true
            }
            FORWARD -> {
                val newPosition = position + orientation.toUnitVector()
                if (map.canMoveTo(newPosition)) {
                    map.free(position)
                    position = newPosition
                    if (map.place(this))
                        return true
                }
            }
            BACKWARD -> {
                val newPosition = position - orientation.toUnitVector()
                if (map.canMoveTo(newPosition)) {
                    map.free(position)
                    position = newPosition
                    if (map.place(this))
                        return true
                }
            }
        }
        return false
    }
}