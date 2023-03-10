package world.rooms;

public abstract class Room
{
    /**
     * Title of this room. This will be displayed alongside the title of the
     * dungeon map that this room belongs to, e.g.
     * "{Dungeon Map Title} - {roomTitle}".
     * 
     * Examples:
     * "Throne Room"
     * "Entry Hallway"
     * "Treasure Horde"
     */
    private String roomTitle;
    
    /**
     * Description of this room. This should be formatted so that it can fit
     * into various types of messages, e.g.
     * "You enter {roomDescription}."
     * "You are in {roomDescription}."
     * 
     * Examples:
     * "a dark, smelly cavern"
     * "the king's throne room"
     */
    private String roomDescription;

    /**
     * Protected constructor for subclasses to call while initializing.
     * @param roomTitle Title of this room.
     * @param roomDescription Description of this room.
     */
    protected Room(String roomTitle, String roomDescription)
    {
        this.roomTitle = roomTitle;
        this.roomDescription = roomDescription;
    }
}
