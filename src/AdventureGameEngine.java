import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import actions.Action;
import exceptions.InvalidInputException;
import game.Adventurer;
import game.GameContext;
import input.InputSystem;
import input.commands.InputCommand;
import world.DungeonMap;

public class AdventureGameEngine
{
    /**
     * The {@link InputSystem} to use to retrieve user input.
     */
    private InputSystem inputSystem;

    /**
     * The stream to write game messages to.
     */
    private PrintStream output;

    /**
     * The single {@link Adventurer} that the user controls in the game.
     */
    private Adventurer adventurer;

    /**
     * The current {@link DungeonMap} that the adventurer is exploring.
     */
    private DungeonMap currentDungeonMap;

    /**
     * Create a new {@link AdventureGameEngine} that uses the default
     * {@link DungeonMap}.
     * @param inputStream The {@link InputStream} to use to retrieve user input.
     * @param outputStream The {@link PrintStream} to use for displaying game messages.
     */
    public AdventureGameEngine(InputStream inputStream, PrintStream outputStream)
    {
        this.inputSystem = new InputSystem(inputStream);
        this.output = outputStream;
        this.adventurer = new Adventurer();
        this.currentDungeonMap = new DungeonMap();
    }

    /**
     * Create a new {@link AdventureGameEngine} that uses the given
     * {@link DungeonMap}
     * @param dungeonMap The {@link DungeonMap} to use for this adventure.
     * @param inputStream The {@link InputStream} to use to retrieve user input.
     * @param outputStream The {@link PrintStream} to use for displaying game messages.
     */
    public AdventureGameEngine(DungeonMap dungeonMap, InputStream inputStream, PrintStream outputStream)
    {

    }

    public void run()
    {
        // Display introduction text.
        output.println("Welcome to DungeonScape.\n");

        // Begin user interaction.
        while (true)
        {
            try
            {
                processNextUserCommand();
            }
            catch (InvalidInputException ex)
            {
                String errorMessage = ex.getMessage();
                output.println(errorMessage + "\n");
            }
            catch (RuntimeException ex)
            {
                String errorMessage = ex.getMessage();
                output.println("FATAL ERROR: " + errorMessage + "\n");
                break; // TODO: Save user progress before quitting
            }
        }
    }

    private void processNextUserCommand()
    {
        // Get user command.
        InputCommand nextCommand = inputSystem.getNextCommand();

        // Get the current game context.
        GameContext gameContext = getCurrentGameContext();

        // Process user command using the current game context.
        Action nextAction = nextCommand.process();

        // Perform resulting action within the current game context.
        nextAction.perform();
    }

    private GameContext getCurrentGameContext()
    {
        return new GameContext(adventurer, currentDungeonMap);
    }
}
