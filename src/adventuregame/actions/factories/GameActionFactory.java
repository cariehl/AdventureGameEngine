package adventuregame.actions.factories;

import adventuregame.actions.GameAction;
import adventuregame.engine.EngineContext;
import adventuregame.input.tokens.TokenList;

public abstract class GameActionFactory
{
    public abstract GameAction fromTokens(TokenList tokenList, EngineContext engineContext);
}
