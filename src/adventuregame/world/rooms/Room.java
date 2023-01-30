package adventuregame.world.rooms;

import adventuregame.game.Adventurer;

/**
 * A {@link Room} is the basic unit of exploration for the adventure game. The
 * {@link Adventurer} occupies exactly one room at a time. Rooms may contain
 * items and/or entities, and often have exits leading to other rooms.
 */
public abstract class Room {
	/**
	 * The title of this room. This will be displayed alongside the title of the
	 * dungeon map that this room belongs to, e.g.
	 * "{Dungeon Map Title} - {roomTitle}".
	 *
	 * Examples:
	 * "Throne Room"
	 * "Entry Hallway"
	 * "Treasure Horde"
	 */
	public final String TITLE;

	/**
	 * A description of this room. This should be formatted so that it can fit
	 * into various types of messages, e.g.
	 * "You enter {roomDescription}."
	 * "You are in {roomDescription}."
	 *
	 * Examples:
	 * "a dark, smelly cavern"
	 * "the king's throne room"
	 */
	public final String DESCRIPTION;

	/**
	 * Protected constructor for subclasses to call while initializing.
	 * 
	 * @param roomTitle       Title of this room.
	 * @param roomDescription Description of this room.
	 */
	protected Room(String roomTitle, String roomDescription) {
		this.TITLE = roomTitle;
		this.DESCRIPTION = roomDescription;
	}
}
