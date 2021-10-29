package agh.ics.oop

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MapDirectionTest {
    @Test
    fun next() {
        assertEquals(MapDirection.NORTH.next(), MapDirection.EAST)
        assertEquals(MapDirection.EAST.next(), MapDirection.SOUTH)
        assertEquals(MapDirection.SOUTH.next(), MapDirection.WEST)
        assertEquals(MapDirection.WEST.next(), MapDirection.NORTH)
    }

    @Test
    fun previous() {
        assertEquals(MapDirection.NORTH.previous(), MapDirection.WEST)
        assertEquals(MapDirection.EAST.previous(), MapDirection.NORTH)
        assertEquals(MapDirection.SOUTH.previous(), MapDirection.EAST)
        assertEquals(MapDirection.WEST.previous(), MapDirection.SOUTH)
    }
    @Test
    fun toStringTests() {
        assertEquals(MapDirection.NORTH.toString(), "North")
        assertEquals(MapDirection.EAST.toString(), "East")
        assertEquals(MapDirection.SOUTH.toString(), "South")
        assertEquals(MapDirection.WEST.toString(), "West")
    }
    @Test
    fun toUnitVector(){
        assertEquals(MapDirection.NORTH.toUnitVector(), Vector2d(0, 1))
        assertEquals(MapDirection.EAST.toUnitVector(), Vector2d(1, 0))
        assertEquals(MapDirection.SOUTH.toUnitVector(), Vector2d(0, -1))
        assertEquals(MapDirection.WEST.toUnitVector(), Vector2d(-1, 0))
    }


}