package agh.ics.oop

class SimulationEngine(private var directions: List<MoveDirection>,
                       private var map: IWorldMap,
                       private var initialPositions: List<Vector2d>): IEngine {

    private val numberOfAnimals = initialPositions.size
    override fun run() {
        placeInitialPositions(initialPositions)
        val animals = map.animals()
        var i = 0

        println(map)

        directions.forEach { direction ->
            if (i == numberOfAnimals)
                i = 0

            val succeeded = animals[i].move(direction)
            if (succeeded) println("Went well") else println("whoops i crashed")
            println(map)


            i += 1
        }
    }
    fun placeInitialPositions(initialPositions: List<Vector2d>){
        initialPositions.forEach { position ->
            map.place(Animal(map, position))
        }
    }
    fun printEachPosition(animals: List<Animal>) {
        animals.forEachIndexed {index, animal ->
            val position = animal.get_position()
            println("Position of $index animal: $position")
        }
    }

}