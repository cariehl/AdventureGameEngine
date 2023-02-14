package adventuregame.world;

import adventuregame.world.rooms.Room;

/**
 * A {@link Level} is a collection of connected {@link Room}s.
 */
public abstract class Level {
	/**
	 * The title of this level. This is displayed along with the room title
	 * whenever a room is entered, e.g.
	 * "{MAP_TITLE} - {ROOM_TITLE}"
	 *
	 * Examples:
	 * "Maria's Basement - Storage Closet"
	 * "Bandit Camp - Leader's Tent"
	 * "Underdark, Floor I - Above a dark chasm"
	 */
	public final String mapTitle;

	protected Level(String mapTitle) {
		this.mapTitle = mapTitle;
	}

	/**
	 * @return The room that the {@link Adventurer} currently occupies.
	 */
	public abstract Room getCurrentRoom();

	/**
	 * Get the next room in the given direction from the current room.
	 *
	 * @param direction The direction from the current room to retrieve.
	 * @return The {@link Room} in the given direction, or {@code null} if there
	 *         is no such room.
	 */
	public abstract Room getRoomInDirection(CardinalDirection direction);

	/**
	 * Move the {@link Adventurer} to the given room.
	 *
	 * @param room The room to move to.
	 */
	public abstract void moveTo(Room room);
}
