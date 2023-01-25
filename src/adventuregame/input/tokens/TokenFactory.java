package adventuregame.input.tokens;

public class TokenFactory
{
    public static TokenList fromInputString(String inputString)
    {
        String[] splitInputString = inputString.split("\\w");
        return new TokenList(splitInputString);
    }
}
