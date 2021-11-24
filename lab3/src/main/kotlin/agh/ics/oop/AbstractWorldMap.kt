package agh.ics.oop

import java.util.*

abstract class AbstractWorldMap : IWorldMap {

    protected val objectsHashMap: HashMap<Vector2d, Any> = hashMapOf()
    protected var lowerLeft = Vector2d(2,2)
    protected var upperRight = Vector2d(2, 2)

    override fun isOccupied(position: Vector2d): Boolean = objectsHashMap.containsKey(position)

    override fun objectAt(position: Vector2d): Any? = objectsHashMap[position]
    override fun canMoveTo(position: Vector2d): Boolean = objectsHashMap.containsKey(position)


    override fun place(animal: Animal): Boolean {
        if (!isOccupied(animal.position)){
            updateVectors(animal.position)
            objectsHashMap[animal.position] = animal
            return true
        }
        return false
    }
    override fun animals(): List<Animal> {
        val list = mutableListOf<Animal>()
        objectsHashMap.forEach { (_, v) ->
            if (v is Animal){
                list.add(v)
            } }
        return list
    }

    fun updateVectors(newPosition: Vector2d){
        lowerLeft = lowerLeft.lowerLeft(newPosition)
        upperRight = upperRight.upperRight(newPosition)
    }
}