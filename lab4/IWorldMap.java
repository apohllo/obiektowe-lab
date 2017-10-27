package agh.cs.lab4;

/**
 * Interface responsible for interacting with the map of the world.
 * 
 * @author apohllo
 *
 */
public interface IWorldMap {
	/**
	 * Indicates if any object can move to the given position.
	 * 
	 * @param position
	 *            The position checked for the movement possibility.
	 * @return True if the object can move to that position.
	 */
	boolean canMoveTo(Position position);

	/**
	 * Place a car on the map.
	 * 
	 * @param car
	 *            The car to place on the map.
	 * @return True if the car was placed. The car cannot be placed if the map is already occupied.
	 */
	boolean place(Car car);

	/**
	 * Move the cars on the map according to the provided move directions. Every
	 * n-th direction should be sent the n-th car on the map.
	 * 
	 * @param directions
	 *            Array of move directions.
	 */
	void run(MoveDirection[] directions);

	/**
	 * Returns true if given position on the map is occupied. Should not be
	 * confused with canMove since there might be empty positions where the car
	 * cannot move.
	 * 
	 * @param position
	 *            Position to check.
	 * @return True if the position is occupied.
	 */
	boolean isOccupied(Position position);

	/**
	 * Return object at given position.
	 * 
	 * @param position
	 *            The position of the object.
	 * @return Object or null if the position is not occupied.
	 */
	Object objectAt(Position position);
}
