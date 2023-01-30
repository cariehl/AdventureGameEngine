package adventuregame.engine;

import java.io.PrintStream;

import adventuregame.game.Adventurer;
import adventuregame.input.InputSystem;
import adventuregame.world.Level;

/**
 * An {@link EngineContext} represents the current context of the adventure game
 * engine,. It is essentially a global state container that can be passed around
 * between the various layers of the program, so that lower layers can make
 * decisions based on the current state of the engine + game.
 */
public class EngineContext {
	/**
	 * The {@link InputSystem} to use to retrieve user input.
	 */
	public final InputSystem inputSystem;

	/**
	 * The {@link PrintStream} to write game messages to.
	 */
	public final PrintStream output;

	/**
	 * The single {@link Adventurer} that the user controls in the game.
	 */
	public final Adventurer adventurer;

	/**
	 * The current {@link Level} that the adventurer is exploring.
	 */
	public final Level level;

	/**
	 * Create a new {@link EngineContext} with the given properties.
	 * 
	 * @param inputSystem The {@link InputSystem} to use to retrieve user input.
	 * @param printStream The {@link PrintStream} to write game messages to.
	 * @param adventurer  The {@link Adventurer} that the user controls in the game.
	 * @param level       The {@link Level} that the adventurer is exploring.
	 */
	public EngineContext(InputSystem inputSystem, PrintStream printStream, Adventurer adventurer, Level level) {
		this.inputSystem = inputSystem;
		this.output = printStream;
		this.adventurer = adventurer;
		this.level = level;
	}
}
