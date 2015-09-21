package dailyprogrammer.easy.challenge7;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Simin
 */
public class MorseTranslator {

    private static final Map<String, Character> morseToText = new HashMap<>();
    private static final Map<Character, String> textToMorse = new HashMap<>();

    private MorseTranslator() {

    }

    static {
        morseToText.put(".-", 'a');
        morseToText.put("-...", 'b');
        morseToText.put("-.-.", 'c');
        morseToText.put("-..", 'd');
        morseToText.put(".", 'e');
        morseToText.put("..-.", 'f');
        morseToText.put("--.", 'g');
        morseToText.put("....", 'h');
        morseToText.put("..", 'i');
        morseToText.put(".---", 'j');
        morseToText.put("-.-", 'k');
        morseToText.put(".-..", 'l');
        morseToText.put("--", 'm');
        morseToText.put("-.", 'n');
        morseToText.put("---", 'o');
        morseToText.put(".--.", 'p');
        morseToText.put("--.-", 'q');
        morseToText.put(".-.", 'r');
        morseToText.put("...", 's');
        morseToText.put("-", 't');
        morseToText.put("..-", 'u');
        morseToText.put("...-", 'v');
        morseToText.put(".--", 'w');
        morseToText.put("-..-", 'x');
        morseToText.put("-.--", 'y');
        morseToText.put("--..", 'z');
    }

    static {
        for (String key : morseToText.keySet())
            textToMorse.put(morseToText.get(key), key);
    }

    /**
     * Translate morse code to text.
     *
     * @param text
     */
    public static void translateMorse(String text) {
        String[] morseLetters = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String morseLetter : morseLetters) {
            if (morseLetter.equals("/")) {
                sb.append(" ");
                continue;
            } else if (morseToText.get(morseLetter) == null) {
                sb.append(morseLetter);
                continue;
            } else
                sb.append(morseToText.get(morseLetter));
        }
        System.out.println(sb.toString());
    }

    /**
     * Translate a String to morse code.
     *
     * @param text
     */
    public static void translateText(String text) {
        //Makes the whole string lowercase.
        String textFormat = text.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < textFormat.length(); i++) {
            char nextCharacter = textFormat.charAt(i);

            //Adds "/ " if the next character is space.
            if (nextCharacter == ' ') {
                sb.append("/ ");
                continue;

                //Checks if textToMorse contains the character, otherwise return the same symbol.
            } else if (textToMorse.get(nextCharacter) == null) {
                sb.append(nextCharacter);
                continue;
            }

            //If at the last character, don't add space.
            if (i == textFormat.length() - 1) {
                sb.append(textToMorse.get(nextCharacter));
                break;
            }

            //Otherwise add the translated character plus space.
            else
                sb.append(textToMorse.get(nextCharacter) + " ");
        }

        //Print the complete translated sentence.
        System.out.println(sb.toString());
    }
}
