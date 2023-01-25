package adventuregame;
import java.io.InputStream;
import java.io.PrintStream;

import adventuregame.actions.GameAction;
import adventuregame.actions.factories.TopLevelGameActionFactory;
import adventuregame.engine.EngineContext;
import adventuregame.exceptions.InvalidInputException;
import adventuregame.game.Adventurer;
import adventuregame.input.InputSystem;
import adventuregame.input.tokens.TokenList;
import adventuregame.world.DungeonMap;

public class AdventureGameEngine
{
    private EngineContext engineContext;

    private final TopLevelGameActionFactory gameActionFactory;

    /**
     * Create a new {@link AdventureGameEngine}.
     * @param dungeonMap The {@link DungeonMap} to use for this adventure.
     * @param inputStream The {@link InputStream} to use to retrieve user input.
     * @param outputStream The {@link PrintStream} to use for displaying game messages.
     */
    public AdventureGameEngine(DungeonMap dungeonMap, InputStream inputStream, PrintStream outputStream)
    {
        InputSystem inputSystem = new InputSystem(inputStream);
        Adventurer adventurer = new Adventurer();

        this.engineContext = new EngineContext(inputSystem, outputStream, adventurer, dungeonMap);
        this.gameActionFactory = new TopLevelGameActionFactory();
    }

    public void run()
    {
        // Display introduction text.
        engineContext.output.println("Welcome to the Dungeon.");
        engineContext.output.println();

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
                engineContext.output.println(errorMessage + "\n");
            }
            catch (RuntimeException ex)
            {
                String errorMessage = ex.getMessage();
                engineContext.output.println("FATAL ERROR: " + errorMessage + "\n");
                break; // TODO: Save user progress before quitting
            }
        }
    }

    private void processNextUserCommand()
    {
        // Get user command.
        TokenList inputTokens = engineContext.inputSystem.getInputTokens();

        // Process user command using the current game context.
        GameAction nextAction = gameActionFactory.fromTokens(inputTokens, engineContext);

        // Perform resulting action within the current game context.
        nextAction.perform(engineContext);
    }
}
