package exceptions;

public class InvalidInputException extends RuntimeException
{
    public InvalidInputException()
    {
        super("Unrecognized input.");
    }
}
