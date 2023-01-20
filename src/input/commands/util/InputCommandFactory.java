package input.commands.util;

import java.util.Arrays;

import input.commands.InputCommand;

public class InputCommandFactory
{
    public static InputCommand fromInputString(String inputString)
    {
        return fromInputTokens(tokenizeInput(inputString));
    }

    public static InputCommand fromInputTokens(String[] inputTokens)
    {
        if (inputTokens.length == 0)
        {
            throw new RuntimeException("Argument 'inputTokens' of method 'InputCommandFactory.fromInputTokens' contained zero elements; expected at least one.");
        }

        String commandToken = inputTokens[0];
        String[] detailTokens = getDetailTokensFrom(inputTokens);
        CommandTokenSet commandTokenSet = new CommandTokenSet(commandToken, detailTokens);

        return fromCommandTokenSet(commandTokenSet);
    }

    public static InputCommand fromCommandTokenSet(CommandTokenSet commandTokenSet)
    {
        if (commandTokenSet.CommandToken == "move" || commandTokenSet.CommandToken == "go")
        {

        }
    }

    private static String[] tokenizeInput(String inputString)
    {
        return inputString.split("\\w");
    }

    private static String[] getDetailTokensFrom(String[] inputTokens)
    {
        // The first token in the token array is the command token. Every token
        // after that is a detail token.

        if (inputTokens.length > 1)
        {
            // Return an array of all the tokens past the first one.
            return Arrays.copyOfRange(inputTokens, 1, inputTokens.length);
        }
        else
        {
            // There are no detail tokens in the array. Return an array of size
            // 0.
            return new String[0];
        }
    }
}
