package agh.ics.oop

import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.*


class RectangularMap(private val width: Int, private val height: Int): AbstractWorldMap() {

    private val lowerLeft = Vector2d(0, 0)
    private val upperRight = Vector2d(height - 1, width - 1)

    override fun toString(): String = MapVisualizer(this).draw(lowerLeft, upperRight)

    override fun canMoveTo(position: Vector2d): Boolean {
        return !(animalList.any { it.position == position }) &&
                (position follows lowerLeft) && (position precedes upperRight)
    }


    override fun isOccupied(position: Vector2d): Boolean = animalList.any { it.position == position }

    override fun objectAt(position: Vector2d): Any? = animalList.firstOrNull { it.position == position }
}