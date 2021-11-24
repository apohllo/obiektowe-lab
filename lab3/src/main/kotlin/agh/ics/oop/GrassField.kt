package agh.ics.oop

import java.lang.Math.sqrt
import java.util.*
import javax.xml.bind.util.ValidationEventCollector
import kotlin.math.roundToInt
import kotlin.random.Random

class GrassField(private val nOfGrassFields: Int): AbstractWorldMap() {

    private val grassHashMap: HashMap<Vector2d, Grass> = hashMapOf()
    private val upperBound: Int = (kotlin.math.sqrt((nOfGrassFields * 10).toDouble())).roundToInt()

    init {
        var i = 0
        while (i != nOfGrassFields){
            if (placeGrass(Grass(getRandomPosition())))
                i += 1
        }
    }

    // is it necessary?
    override fun canMoveTo(position: Vector2d): Boolean {
//        return !grassList.any {it
        return true
    }


    //place if you can
    private fun placeGrass(grass: Grass): Boolean {
        if (!(isOccupied(grass.getPosition()))){
            grassHashMap[grass.getPosition()] = grass
            return true
        }
        return false
    }

    // it doesn't take into consideration animals
    // but it should
    // because we iinitalize this random so  not all could spawn
    override fun isOccupied(position: Vector2d): Boolean {
        return grassHashMap.contains(position)
    }

    // it doesn't take into consideration animals
    override fun objectAt(position: Vector2d): Any? {
        return grassHashMap[position]
    }


    override fun animals(): List<Animal> {
        TODO("Not yet implemented")
    }

    fun grasses(): HashMap<Vector2d, Grass>{
        return grassHashMap
    }

    private fun getRandomPosition(): Vector2d{
        return Vector2d((0..upperBound).random(), (0..upperBound).random())
    }
}