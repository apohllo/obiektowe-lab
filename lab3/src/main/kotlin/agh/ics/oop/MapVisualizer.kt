package agh.ics.oop

/**
 * The map visualizer converts the [IWorldMap] map into a string
 * representation.
 *
 * @author apohllo
 */
class MapVisualizer
/**
 * Initializes the MapVisualizer with an instance of map to visualize.
 * @param map
 */(private val map: IWorldMap) {
    /**
     * Convert selected region of the map into a string. It is assumed that the
     * indices of the map will have no more than two characters (including the
     * sign).
     *
     * @param lowerLeft  The lower left corner of the region that is drawn.
     * @param upperRight The upper right corner of the region that is drawn.
     * @return String representation of the selected region of the map.
     */
    fun draw(lowerLeft: Vector2d, upperRight: Vector2d): String {
        val (left, bottom) = lowerLeft
        val (right, top) = upperRight

        val builder = StringBuilder()
        builder.append(drawHeader(lowerLeft, upperRight))
        for (i in top + 1 downTo bottom - 1) {
            builder.append(String.format("%3d: ", i))
            for (j in left..right + 1) {
                if (i < bottom || i > top) {
                    builder.append(drawFrame(j <= right))
                } else {
                    builder.append(CELL_SEGMENT)
                    if (j <= right) {
                        builder.append(drawObject(Vector2d(j, i)))
                    }
                }
            }
            builder.append(System.lineSeparator())
        }
        return builder.toString()
    }

    private fun drawFrame(innerSegment: Boolean): String =
        if(innerSegment) FRAME_SEGMENT + FRAME_SEGMENT else FRAME_SEGMENT



    private fun drawHeader(lowerLeft: Vector2d, upperRight: Vector2d): String {
        val builder = StringBuilder()
        builder.append(" y\\x ")
        for (j in lowerLeft.x until upperRight.x + 1) {
            builder.append(String.format("%2d", j))
        }
        builder.append(System.lineSeparator())
        return builder.toString()
    }

    private fun drawObject(currentPosition: Vector2d): String =
        map.objectAt(currentPosition)?.toString() ?: EMPTY_CELL

    companion object {
        private const val EMPTY_CELL = " "
        private const val FRAME_SEGMENT = "-"
        private const val CELL_SEGMENT = "|"
    }
}