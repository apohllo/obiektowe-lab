package agh.ics.oop

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

import agh.ics.oop.MapDirection.*

internal class MapDirectionTest {
    @Test
    fun next() {
        assertEquals(NORTH.next(), EAST)
        assertEquals(EAST.next(), SOUTH)
        assertEquals(SOUTH.next(), WEST)
        assertEquals(WEST.next(), NORTH)
    }

    @Test
    fun previous() {
        assertEquals(NORTH.previous(), WEST)
        assertEquals(EAST.previous(), NORTH)
        assertEquals(SOUTH.previous(), EAST)
        assertEquals(WEST.previous(), SOUTH)
    }

    @Test
    fun toStringTests() {
        assertEquals(NORTH.toString(), "North")
        assertEquals(EAST.toString(), "East")
        assertEquals(SOUTH.toString(), "South")
        assertEquals(WEST.toString(), "West")
    }

    @Test
    fun toUnitVector() {
        assertEquals(NORTH.toUnitVector(), Vector2d(0, 1))
        assertEquals(EAST.toUnitVector(), Vector2d(1, 0))
        assertEquals(SOUTH.toUnitVector(), Vector2d(0, -1))
        assertEquals(WEST.toUnitVector(), Vector2d(-1, 0))
    }


}