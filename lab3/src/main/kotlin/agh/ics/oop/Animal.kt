package agh.ics.oop
import agh.ics.oop.MoveDirection.*

class Animal {
    private var orientation: MapDirection = MapDirection.NORTH
    private var position: Vector2d = Vector2d(2, 2)

    override fun toString(): String {
        return """
            -------------------------
            Position: ${position.toString()}
            Orientation: ${orientation.toString()}
            -------------------------""".trimIndent()
    }

    fun isAt(otherPosition: Vector2d): Boolean {
        return position.equals(otherPosition)
    }

    fun move(direction: MoveDirection){
        when (direction){
            RIGHT -> orientation = orientation.next()
            lEFT -> orientation = orientation.previous()
            FORWARD -> {
                val newPosition = position.add(orientation.toUnitVector())
                if (newPosition.x >= 0 && newPosition.y >= 0 && newPosition.x <= 4 && newPosition.y <= 4)
                    position = newPosition
            }
            BACKWARD -> {
                val newPosition = position.subtract(orientation.toUnitVector())
                if (newPosition.x >= 0 && newPosition.y >= 0 && newPosition.x <= 4 && newPosition.y <= 4)
                    position = newPosition
            }
        }
    }
}