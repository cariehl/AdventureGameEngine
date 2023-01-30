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
	public abstract void resolve(EngineContext engineContext);
}
