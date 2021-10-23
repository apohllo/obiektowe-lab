package agh.ics.oop

import kotlin.math.max
import kotlin.math.min

class Vector2d(val x: Int,val y: Int){
    override fun toString(): String = "($x, $y)"
    fun precedes(other: Vector2d) = (this.x <= other.x) && (this.y <= other.y)
    fun follows(other: Vector2d) = (this.x >= other.x) && (this.y >= other.y)
    fun upperRight(other: Vector2d) = Vector2d(max(this.x, other.x), max(this.y, other.y))
    fun lowerLeft(other: Vector2d) = Vector2d(min(this.x, other.x), min(this.y, other.y))
    fun add(other: Vector2d) = Vector2d(this.x + other.x, this.y + other.y)
    fun subtract(other: Vector2d) = Vector2d(this.x - other.x, this.y - other.y)
    override fun equals(other: Any?): Boolean {
        if (other is Vector2d){
            return (this.x == other.x) && (this.y == other.y)
        }
        return false
    }
    fun opposite() = Vector2d(-this.x, -this.y)
}