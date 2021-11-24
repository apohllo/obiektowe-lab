package agh.ics.oop

class Grass(private val position: Vector2d) {
    fun getPosition(): Vector2d = position
    override fun toString(): String {
        return "*"
    }
}