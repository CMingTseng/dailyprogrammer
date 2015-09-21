package dailyprogrammer.easy.challenge7;

import java.util.Scanner;

/**
 * @author Simin
 */
public class UserInterface {

    private Scanner reader;

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void run() {
        System.out.println("Translate morse or translate text? (m/t)");
        char command = reader.nextLine().charAt(0);
        switch(command) {
            case 'm':
                translateMorse();
                break;
            case 't':
                translateText();
                break;
        }
    }

    private void translateMorse() {
        System.out.println("Morse to translate?");
        MorseTranslator.translateMorse(reader.nextLine());
    }

    private void translateText() {
        System.out.println("Text to translate?");
        MorseTranslator.translateText(reader.nextLine());
    }

}