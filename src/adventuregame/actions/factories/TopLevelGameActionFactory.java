package adventuregame.actions.factories;

import java.util.Map;

import adventuregame.actions.GameAction;
import adventuregame.engine.EngineContext;
import adventuregame.input.tokens.TokenList;

import static java.util.Map.entry;

public class TopLevelGameActionFactory extends GameActionFactory
{
    private static Map<String, GameActionFactory> gameActionFactories = Map.ofEntries(
        entry("look", new ExamineGameActionFactory())
    );

    public GameAction fromTokens(TokenList tokenList, EngineContext engineContext)
    {
        String actionToken = tokenList.first();
        if (gameActionFactories.containsKey(actionToken))
        {
            return gameActionFactories.get(actionToken).fromTokens(tokenList.after(0), engineContext);
        }
    }
}
