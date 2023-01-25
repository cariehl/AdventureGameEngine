package adventuregame.actions;

import adventuregame.engine.EngineContext;

/**
 * A {@link GameAction} representing an error on the part of the user, i.e.
 * attempting to move through a wall, using two items together that have no
 * interaction, etc.
 *
 * In terms of implementation, this action simply prints a message to the output
 * stream.
 */
public class ErrorAction extends GameAction
{
    /**
     * The error message that is displayed when this action resolves.
     */
    private String errorMessage;

    /**
     * Create a new {@link ErrorAction} that displays the given message.
     * @param errorMessage The message to display when this action resolves.
     */
    public ErrorAction(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    @Override
    public void resolve(EngineContext engineContext)
    {
        engineContext.output.println(errorMessage);
    }
}
