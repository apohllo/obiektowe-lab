package agh.ics.oop

// problemy
class SimulationEngine(private val directions: List<MoveDirection>,
                       private val map: IWorldMap,
                       private val initialPositions: List<Vector2d>): IEngine {

    init {
        placeInitialPositions(this.initialPositions)
    }

    private val numberOfAnimals = this.initialPositions.size

    override fun run() {
        val animals = this.map.animals()
        var i = 0
        println(this.map)

        this.directions.forEach { direction ->
            if (i == numberOfAnimals)
                i = 0

            animals[i].move(direction)
            println(this.map)
            i += 1

        }
    }

    private fun placeInitialPositions(initialPositions: List<Vector2d>){
        initialPositions.forEach { position ->
            map.place(Animal(map, position))
        }
    }
//    private fun printEachPosition(animals: List<Animal>) {
//        animals.forEachIndexed {index, animal ->
//            val position = animal.posii
//            println("Position of $index animal: $position")
//        }
//    }

}