package agh.ics.oop


class RectangularMap(private val width: Int, private val height: Int): IWorldMap {

    private val map = Array(height) {Array<Animal?>(width) {null} }

    override fun toString(): String {
        val lowerLeft = Vector2d(0,0)
        val upperRight = Vector2d(height-1, width-1)
        return MapVisualizer(this).draw(lowerLeft, upperRight)
    }

    override fun canMoveTo(position: Vector2d): Boolean {
        val (x, y) = position
        if ((x in 0 until height) && (y in 0 until width))
            if (!isOccupied(position))
                return true
        return false
    }

    override fun place(animal: Animal): Boolean {
        val position = animal.get_position()
        val (x, y) = position
        if (!isOccupied(position)) {
            map[x][y] = animal
            return true
        }
        return false
    }

    override fun isOccupied(position: Vector2d): Boolean {
        val (x, y) = position
        if (map[x][y] == null)
            return false
        return true

    }

    override fun objectAt(position: Vector2d): Animal? {
        val (x, y) = position
        if (isOccupied(position))
            return map[x][y]
        return null
    }

    override fun animals(): List<Animal> {
        val animalsList = mutableListOf<Animal>()
        for (i in 0 until height)
            for (j in 0 until width){
                val position = Vector2d(i, j)
                val animal: Animal? = objectAt(position)
                if (animal != null)
                    animalsList.add(animal)
                }
        return animalsList
    }

    /**
     * Free a position on a map
     * @param position of type Vector2d to free
     * @return true if succeeded .
     */
    override fun free(position: Vector2d){
        val (x, y) = position
        map[x][y] = null
    }

}