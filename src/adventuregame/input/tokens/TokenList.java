package adventuregame.input.tokens;

/**
 * A list of tokens (words/symbols), generally retrieved as user input.
 */
public class TokenList {
	/**
	 * The actual tokens contained within this list.
	 */
	private final String[] tokens;

	/**
	 * Create an empty {@link TokenList}.
	 */
	public TokenList() {
		tokens = new String[0];
	}

	/**
	 * Create a {@link TokenList} containing the given tokens.
	 * 
	 * @param splitInputString The tokens contained by this list.
	 */
	public TokenList(String[] splitInputString) {
		this.tokens = splitInputString;
	}

	/**
	 * @return True if this list is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return tokens.length == 0;
	}

	/**
	 * @return The first token in this list.
	 * @throws TokenListIndexOutOfBoundsException if the list is empty.
	 */
	public String first() throws TokenListIndexOutOfBoundsException {
		if (tokens.length == 0) {
			throw new TokenListIndexOutOfBoundsException(0, tokens.length);
		} else {
			return tokens[0];
		}
	}

	/**
	 * @param index The index of the desired token.
	 * @return The token at the given index.
	 * @throws TokenListIndexOutOfBoundsException if the given index is out of
	 *                                            bounds.
	 */
	public String at(int index) throws TokenListIndexOutOfBoundsException {
		if (index < 0 || index >= tokens.length) {
			throw new TokenListIndexOutOfBoundsException(index, tokens.length);
		} else {
			return tokens[index];
		}
	}

	/**
	 * Get a new list of the tokens that appear in this list after a given
	 * index.
	 * 
	 * @param index The index of the last token that should not appear in the
	 *              new list. That is, the new list will contain all the tokens in
	 *              the list
	 *              beginning with [index + 1].
	 * @return A list of tokens appearing after the given index, or an empty
	 *         list if {@code index > tokens.length}.
	 * @throws TokenListIndexOutOfBoundsException if the given index is less
	 *                                            than 0.
	 */
	public TokenList after(int index) throws TokenListIndexOutOfBoundsException {
		if (index < 0) {
			throw new TokenListIndexOutOfBoundsException(index, tokens.length);
		} else if (index > tokens.length - 1) {
			return new TokenList();
		} else {
			String[] newTokens = new String[tokens.length - index];
			for (int i = 0; i < newTokens.length; ++i) {
				newTokens[i] = tokens[i + index];
			}
			return new TokenList(newTokens);
		}
	}

	/**
	 * Exception class used when attempting to access an invalid index of a
	 * token list.
	 */
	public class TokenListIndexOutOfBoundsException extends Exception {
		/**
		 * Create an exception about the given index and list length.
		 * 
		 * @param index      The index that was attempted to access.
		 * @param listLength The actual length of the token list.
		 */
		public TokenListIndexOutOfBoundsException(int index, int listLength) {
			super(String.format("Index %d is out of bounds (list length: %d)", index, listLength));
		}
	}
}
