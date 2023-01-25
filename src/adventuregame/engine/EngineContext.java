package adventuregame.engine;

import java.io.PrintStream;

import adventuregame.game.Adventurer;
import adventuregame.input.InputSystem;
import adventuregame.world.DungeonMap;

public class EngineContext
{
    /**
     * The {@link InputSystem} to use to retrieve user input.
     */
    public final InputSystem inputSystem;

    /**
     * The stream to write game messages to.
     */
    public final PrintStream output;

    /**
     * The single {@link Adventurer} that the user controls in the game.
     */
    public final Adventurer adventurer;

    /**
     * The current {@link DungeonMap} that the adventurer is exploring.
     */
    public final DungeonMap dungeonMap;

    public EngineContext(InputSystem inputSystem, PrintStream printStream, Adventurer adventurer, DungeonMap dungeonMap)
    {
        this.inputSystem = inputSystem;
        this.output = printStream;
        this.adventurer = adventurer;
        this.dungeonMap = dungeonMap;
    }
}
