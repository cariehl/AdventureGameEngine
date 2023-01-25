package adventuregame.actions;

import adventuregame.engine.EngineContext;

public class ErrorAction extends GameAction
{
    private String errorMessage;

    public ErrorAction(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    @Override
    public void perform(EngineContext engineContext)
    {
        
    }
}
