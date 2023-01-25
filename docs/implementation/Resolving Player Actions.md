# Resolving Player Actions

There are four primary steps to resolve a player action based on the user's input.

1. Get input string
2. Tokenize input string
3. Parse tokens into an action
   1. If any confusion, prompt for further input
4. Resolve action



Example:

```
> look
```

1. Get input string

   ```
   String inputString = getInputString();
   // inputString: "look"
   ```

2. Tokenize input string

   ```
   TokenList tokens = TokenFactory.fromInputString(inputString);
   	{
   		List<String> splitInputString = inputString.split();
   		return new TokenList(splitInputString);
   	}
   // tokens: ["look"]
   ```

3. Parse tokens into an action

   ```
   GameAction action = GameActionFactory.fromTokens(tokens);
   	{
   		String actionWord = tokens.raw[0];
   		TokenList remainingTokens = tokens.after(0);
   		if (actionFactories.keys.contains(actionWord))
   		{
   			return actionFactories[actionWord].fromTokens(remainingTokens);
   				{
   					if (remainingTokens.empty())
   					{
   						return new ExamineRoomAction();
   					}
   				}
   		}
   	}
   // action: ExamineRoomAction()
   ```

4. Resolve action

   ```
   action.resolve();
   ```

```
**Cooper's Castle - Kitchen**

You are standing in a large kitchen. There is a passageway to the west. There is a small door to the east.

There is a **metal spoon** sitting on a counter.
There is a **wooden spoon** sitting on a counter.
```



Example:

```
> look spoon
```

1. Get input string

   ```
   String inputString = getInputString();
   // inputString: "look spoon"
   ```

2. Tokenize input string

   ```
   TokenList tokens = TokenFactory.fromInputString(inputString);
   	{
   		List<String> splitInputString = inputString.split();
   		return new TokenList(splitInputString);
   	}
   // tokens: ["look", "spoon"]
   ```

3. Parse tokens into an action

   ```
   GameAction action = GameActionFactory.fromTokens(tokens);
   	{
   		String actionWord = tokens.raw[0];
   		TokenList remainingTokens = tokens.after(0);
   		if (actionFactories.keys.contains(actionWord))
   		{
   			return actionFactories[actionWord].fromTokens(remainingTokens);
   				{
   					if (remainingTokens.size() == 1)
   				}
   		}
   	}
   ```

   