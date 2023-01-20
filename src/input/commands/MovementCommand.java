package input.commands;

import world.CardinalDirection;

public class MovementCommand extends InputCommand
{
    private CardinalDirection movementDirection;

    public MovementCommand(CardinalDirection movementDirection)
    {
        this.movementDirection = movementDirection;
    }
}
