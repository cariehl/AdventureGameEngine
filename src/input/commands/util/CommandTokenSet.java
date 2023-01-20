package input.commands.util;

import java.util.Arrays;
import java.util.List;

public class CommandTokenSet
{
    public final String CommandToken;

    public final List<String> DetailTokens;

    public CommandTokenSet(String commandToken, String[] detailTokens)
    {
        CommandToken = commandToken.toLowerCase();
        DetailTokens = Arrays.stream(detailTokens)
            .map(detailToken -> detailToken.toLowerCase())
            .toList();
    }
}
