package input.commands;

import actions.Action;
import game.GameContext;

/**
 * Represents a single game command from an input source.
 */
public abstract class InputCommand
{
    /**
     * Process this command and figure out what {@link Action} to take next,
     * according to the given {@link GameContext}.
     * @return The next {@link Action} to perform.
     */
    public abstract Action process(GameContext gameContext);
}
