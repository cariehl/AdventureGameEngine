package adventuregame.input.tokens;

/**
 * Provides methods for tokenizing strings.
 */
public class TokenFactory
{
    /**
     * Split the given input strings into tokens, and return them in a
     * {@link TokenList}.
     * @param inputString The input string to split.
     * @return The resulting list of tokens.
     */
    public static TokenList fromInputString(String inputString)
    {
        String[] splitInputString = inputString.split("\\w");
        return new TokenList(splitInputString);
    }
}
