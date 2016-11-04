package agh.cs.lab4;

/**
 * The map visualizer converts the {@link IWorldMap} map into a string
 * representation.
 * 
 * @author apohllo
 *
 */
public class MapVisualizer {
	/**
	 * Convert selected region of the map into a string. It is assumed that the
	 * indices of the map will have no more than two characters (including the
	 * sign).
	 * 
	 * @param map
	 *            The map to convert.
	 * @param lowerLeft
	 *            The lower left corner of the region that is dumped.
	 * @param upperRight
	 *            The upper right corner of the region that is dumped.
	 * @return String representation of the selected region of the map.
	 */
	public String dump(IWorldMap map, Position lowerLeft, Position upperRight) {
		StringBuilder builder = new StringBuilder();
		for (int i = upperRight.y + 1; i >= lowerLeft.y - 1; i--) {
			if (i == upperRight.y + 1) {
				builder.append(" y\\x ");
				for (int j = lowerLeft.y; j < upperRight.x + 1; j++) {
					builder.append(String.format("%2d", j));
				}
				builder.append(System.lineSeparator());
			}
			builder.append(String.format("%3d: ", i));
			for (int j = lowerLeft.y; j <= upperRight.x + 1; j++) {
				Position currentPosition = new Position(j, i);
				if (j <= upperRight.x) {
					if (i < lowerLeft.y || i > upperRight.y) {
						builder.append("--");
					} else {
						builder.append("|");
						if (map.isOccupied(currentPosition)) {
							Object object = map.objectAt(currentPosition);
							builder.append(object.toString());
						} else {
							builder.append(" ");
						}
					}
				} else {
					if (i < lowerLeft.y || i > upperRight.y) {
						builder.append("-");
					} else {
						builder.append("|");
					}
				}
			}
			builder.append(System.lineSeparator());
		}
		return builder.toString();
	}
}
