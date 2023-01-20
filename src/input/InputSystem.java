package input;

import java.io.InputStream;
import java.util.Scanner;

import input.commands.InputCommand;
import input.commands.util.InputCommandFactory;

public class InputSystem
{
    /**
     * The {@link Scanner} that acts as an input source for this
     * {@link InputSystem}.
     */
    private Scanner scanner;

    /**
     * Construct an {@link InputSystem} that uses the given {@link InputStream}
     * to retrieve input.
     * @param inputStream The stream to use for input.
     */
    public InputSystem(InputStream inputStream)
    {
        this.scanner = new Scanner(inputStream);
    }

    /**
     * Get the next command from this {@link InputSystem}'s input source.
     * @return The next command from this {@link InputSystem}'s input source.
     */
    public InputCommand getNextCommand()
    {
        String inputString = scanner.nextLine();
        return InputCommandFactory.fromInputString(inputString);
    }
}
