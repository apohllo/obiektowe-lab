package agh.ics.oop

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Vector2dTest {

    @Test
    fun testToString() {
        for (i in -100..100)
            for (j in -100..100) assertEquals(Vector2d(i, j).toString(), "($i, $j)")
    }

    @Test
    fun precedes() {
        assertEquals(Vector2d(0, 0) precedes (Vector2d(0, 0)), true)
        assertEquals(Vector2d(0, 0) precedes (Vector2d(1, 0)), true)
        assertEquals(Vector2d(0, 0) precedes (Vector2d(1, 1)), true)
        assertEquals(Vector2d(0, 0) precedes (Vector2d(0, 1)), true)
        assertEquals(Vector2d(0, 0) precedes (Vector2d(-1, 1)), false)
        assertEquals(Vector2d(0, 0) precedes (Vector2d(-1, 0)), false)
    }

    @Test
    fun follows() {
        assertEquals(Vector2d(0,0 ) follows (Vector2d(-1,0)), true)
        assertEquals(Vector2d(0,0 ) follows (Vector2d(0,-1)), true)
        assertEquals(Vector2d(0,0 ) follows (Vector2d(-1,-1)), true)
        assertEquals(Vector2d(0,0 ) follows (Vector2d(-452, -420)), true)
        assertEquals(Vector2d(0,0 ) follows (Vector2d(1,0)), false)
        assertEquals(Vector2d(0,0 ) follows (Vector2d(0,1)), false)
    }

    @Test
    fun upperRight() {
        assertEquals(Vector2d(0, 0).upperRight(Vector2d(1,1)), Vector2d(1, 1))
        assertEquals(Vector2d(1, 1).upperRight(Vector2d(0,0)), Vector2d(1, 1))
        assertEquals(Vector2d(0, 1).upperRight(Vector2d(1,1)), Vector2d(1, 1))
        assertEquals(Vector2d(1, 1).upperRight(Vector2d(0,1)), Vector2d(1, 1))
        assertEquals(Vector2d(1, 0).upperRight(Vector2d(1,1)), Vector2d(1, 1))
        assertEquals(Vector2d(1, 1).upperRight(Vector2d(1,0)), Vector2d(1, 1))
    }

    @Test
    fun lowerLeft() {
        assertEquals(Vector2d(0, 0).lowerLeft(Vector2d(1,1)), Vector2d(0, 0))
        assertEquals(Vector2d(1, 1).lowerLeft(Vector2d(0,0)), Vector2d(0, 0))
        assertEquals(Vector2d(0, 1).lowerLeft(Vector2d(1,1)), Vector2d(0, 1))
        assertEquals(Vector2d(1, 1).lowerLeft(Vector2d(0,1)), Vector2d(0, 1))
        assertEquals(Vector2d(1, 0).lowerLeft(Vector2d(1,1)), Vector2d(1, 0))
        assertEquals(Vector2d(1, 1).lowerLeft(Vector2d(1,0)), Vector2d(1, 0))
    }

    @Test
    fun plus() {
        assertEquals(Vector2d(0, 0) + (Vector2d(0,0)), Vector2d(0, 0))
        assertEquals(Vector2d(0, 1) + (Vector2d(0,0)), Vector2d(0, 1))
        assertEquals(Vector2d(1, 0) + (Vector2d(0,0)), Vector2d(1, 0))
        assertEquals(Vector2d(-1, 0) + (Vector2d(1,0)), Vector2d(0, 0))
        assertEquals(Vector2d(-1, 3) + (Vector2d(1,-3)), Vector2d(0, 0))
        assertEquals(Vector2d(-1, 5) + (Vector2d(1,1)), Vector2d(0, 6))
    }

    @Test
    fun minus() {

        assertEquals(Vector2d(0, 0) - (Vector2d(0,0)), Vector2d(0, 0))
        assertEquals(Vector2d(0, 1) - (Vector2d(0,0)), Vector2d(0, 1))
        assertEquals(Vector2d(1, 0) - (Vector2d(0,0)), Vector2d(1, 0))
        assertEquals(Vector2d(-1, 0) - (Vector2d(1,0)), Vector2d(-2, 0))
        assertEquals(Vector2d(-1, 3) - (Vector2d(1,-3)), Vector2d(-2, 6))
        assertEquals(Vector2d(-1, 5) - (Vector2d(1,1)), Vector2d(-2, 4))
    }

    @Test
    fun testEquals() {
        assertEquals(Vector2d(0, 0).equals(Vector2d(0, 0)), true)
        assertEquals(Vector2d(402, 452).equals(Vector2d(402, 452)), true)
        assertEquals(Vector2d(402, 452).equals(null), false)
        assertEquals(Vector2d(402, 452).equals("null"), false)
        assertEquals(Vector2d(402, 452).equals('c'), false)
        assertEquals(Vector2d(402, 452).equals(false), false)
        assertEquals(Vector2d(402, 452).equals(true), false)
        assertEquals(Vector2d(402, 452).equals(0), false)
        assertEquals(Vector2d(402, 452).equals(0f), false)
        assertEquals(Vector2d(402, 452).equals(3.14), false)
        assertEquals(Vector2d(402, 452) == Any(), false)
    }

    @Test
    fun opposite() {
        assertEquals(Vector2d(0,0).opposite(), Vector2d(0, 0))
        assertEquals(Vector2d(0,1).opposite(), Vector2d(0, -1))
        assertEquals(Vector2d(1,0).opposite(), Vector2d(-1, 0))
        assertEquals(Vector2d(452,71).opposite(), Vector2d(-452, -71))
        assertEquals(Vector2d(-452,-71).opposite(), Vector2d(452, 71))
    }

    @Test
    fun getX() {
        assertEquals(Vector2d(0, 0).x, 0)
        assertEquals(Vector2d(-1, 0).x, -1)
    }

    @Test
    fun getY() {
        assertEquals(Vector2d(0, 0).y, 0)
        assertEquals(Vector2d(-1, 2).y, 2)
    }
}