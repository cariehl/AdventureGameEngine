package adventuregame.actions.factories;

import adventuregame.actions.GameAction;
import adventuregame.actions.examine.ExamineRoomAction;
import adventuregame.engine.EngineContext;
import adventuregame.input.tokens.TokenList;

public class ExamineGameActionFactory extends GameActionFactory
{
    public ExamineGameActionFactory()
    {
    }

    @Override
    public GameAction fromTokens(TokenList tokenList, EngineContext engineContext)
    {
        if (tokenList.isEmpty())
        {
            return new ExamineRoomAction();
        }
    }
    
}
