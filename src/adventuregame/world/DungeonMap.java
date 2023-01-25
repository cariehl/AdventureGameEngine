package adventuregame.world;

import adventuregame.world.rooms.Room;

public abstract class DungeonMap
{
    /**
     * Title of this dungeon map. This is displayed along with the room title
     * whenever a room is entered, e.g.
     * "{mapTitle} - {Room Title}"
     * 
     * Examples:
     * "Maria's Basement"
     * "Bandit Camp"
     * "Underdark, Floor I"
     */
    public final String MAP_TITLE;

    public abstract Room getCurrentRoom();

    public abstract Room getRoomInDirection(CardinalDirection direction);

    public abstract void moveTo(Room room);
}
