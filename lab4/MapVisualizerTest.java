package agh.cs.lab4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapVisualizerTest {
    MapVisualizer visualizer = new MapVisualizer(new WorldMap());
    String drawing = " y\\x  0 1 2\n" +
            "  3: -------\n" +
            "  2: | | | |\n" +
            "  1: | |C| |\n" +
            "  0: | | | |\n" +
            " -1: -------\n";

    @Test
    public void testDraw() {
        assertEquals(drawing, visualizer.draw(new Position(0, 0), new Position(2, 2)));
    }

}
