package adventuregame.input;

import java.io.InputStream;
import java.util.Scanner;

import adventuregame.input.tokens.TokenFactory;
import adventuregame.input.tokens.TokenList;

/**
 * An {@link InputSystem} provides a simple way to retrieve tokenized user input
 * from some input source.
 */
public class InputSystem {
	/**
	 * The {@link Scanner} that provides user input for this
	 * {@link InputSystem}.
	 */
	private Scanner scanner;

	/**
	 * Construct an {@link InputSystem} that uses the given {@link InputStream}
	 * to retrieve user input.
	 * 
	 * @param inputStream The stream to use to retrieve user input.
	 */
	public InputSystem(InputStream inputStream) {
		this.scanner = new Scanner(inputStream);
	}

	/**
	 * @return A list of tokens representing the next line of user input.
	 */
	public TokenList getInputTokens() {
		String inputString = scanner.nextLine();
		return TokenFactory.fromInputString(inputString);
	}
}
