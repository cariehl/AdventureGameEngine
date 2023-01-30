package adventuregame.actions.factories;

import java.util.Map;

import adventuregame.actions.ErrorAction;
import adventuregame.actions.GameAction;
import adventuregame.engine.EngineContext;
import adventuregame.input.tokens.TokenList;

import static java.util.Map.entry;

/**
 * A {@link TopLevelGameActionFactory} provides methods to translate a list of
 * input tokens into a matching {@link GameAction}.
 */
public class TopLevelGameActionFactory extends GameActionFactory {
	/**
	 * Mapping of action keywords to their corresponding factories.
	 */
	private static Map<String, GameActionFactory> gameActionFactories = Map.ofEntries(
			entry("look", new ExamineGameActionFactory()));

	/**
	 * Create a new {@link TopLevelGameActionFactory}.
	 */
	public TopLevelGameActionFactory() {
	}

	@Override
	public GameAction fromTokens(TokenList tokenList, EngineContext engineContext) {
		String actionToken = tokenList.first();
		if (gameActionFactories.containsKey(actionToken)) {
			return gameActionFactories.get(actionToken).fromTokens(tokenList.after(0), engineContext);
		} else {
			return new ErrorAction(String.format("I don't recognize the action word '%s'.", actionToken));
		}
	}
}
