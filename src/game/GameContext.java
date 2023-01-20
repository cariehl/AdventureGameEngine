package game;

import world.DungeonMap;

/**
 * Provides information about the current state of the game.
 */
public class GameContext
{
    /**
     * The single adventurer within the game.
     */
    public final Adventurer adventurer;

    /**
     * The current dungeon map that the adventurer is exploring.
     */
    public final DungeonMap dungeonMap;

    public GameContext(Adventurer adventurer, DungeonMap dungeonMap)
    {
        this.adventurer = adventurer;
        this.dungeonMap = dungeonMap;
    }
}
