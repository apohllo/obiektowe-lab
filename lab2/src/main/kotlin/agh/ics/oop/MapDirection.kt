package agh.ics.oop

enum class MapDirection {
    NORTH{
        override fun toString() = "North"
        override fun next() = EAST
        override fun previous() = WEST
        override fun toUnitVector() = Vector2d(0, 1)
    },
    EAST{
        override fun toString() = "East"
        override fun next() = SOUTH
        override fun previous() = NORTH
        override fun toUnitVector() = Vector2d(1, 0)
    },
    SOUTH{
        override fun toString() = "South"
        override fun next() = WEST
        override fun previous() = EAST
        override fun toUnitVector() = Vector2d(0, -1)
    },
    WEST{
        override fun toString() = "West"
        override fun next() = NORTH
        override fun previous() = SOUTH
        override fun toUnitVector() = Vector2d(-1, 0)
    };

    abstract override fun toString(): String
    abstract fun next(): MapDirection
    abstract fun previous(): MapDirection
    abstract fun toUnitVector(): Vector2d

}
