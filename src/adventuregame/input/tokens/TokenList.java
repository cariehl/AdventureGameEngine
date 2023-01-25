package adventuregame.input.tokens;

public class TokenList
{
    private final String[] tokens;

    public TokenList()
    {
        tokens = new String[0];
    }

    public TokenList(String[] splitInputString)
    {
        this.tokens = splitInputString;
    }
    
    public boolean empty()
    {
        return tokens.length == 0;
    }

    public String first()
    {
        return tokens[0];
    }

    public String at(int index)
    {
        return tokens[index];
    }

    public TokenList after(int index)
    {
        if (index > tokens.length - 1)
        {
            return new TokenList();
        }
        else
        {
            String[] newTokens = new String[tokens.length - index];
            for (int i = 0; i < newTokens.length; ++i)
            {
                newTokens[i] = tokens[i + index];
            }
            return new TokenList(newTokens);
        }
    }
}
