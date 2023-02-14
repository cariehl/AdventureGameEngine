package adventuregame.actions;

import adventuregame.engine.EngineContext;

/**
 * A {@link GameAction} represents a single action that can be taken within the
 * game.
 */
public abstract class GameAction {
	/**
	 * Resolve this {@link GameAction} within the given {@link EngineContext},
	 * and perform any resulting effects.
	 *
	 * @param engineContext The current engine context.
	 */
	public void resolve(EngineContext engineContext) {
		// Print a line of spacing, to separate the action output from whatever came
		// before it.
		engineContext.output.println();

		// Resolve this action.
		resolveImpl(engineContext);
	}

	/**
	 * Protected implementation of the resolve method. Since
	 * {@code resolve(EngineContext)} may perform additional bookkeeping and
	 * formatting, this method is the one that should be overwritted by subclasses
	 * in order to perform their action.
	 *
	 * @param engineContext The current engine context.
	 */
	protected abstract void resolveImpl(EngineContext engineContext);
}
