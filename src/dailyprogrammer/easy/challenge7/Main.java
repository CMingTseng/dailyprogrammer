package dailyprogrammer.easy.challenge7;

import java.util.Scanner;

/**
 * MorseTranslator program
 * @author Simin
 */
public class Main {
    public static void main(String[] args) {
        //new UserInterface(new Scanner(System.in)).run();
        MorseTranslator.translateMorse(".... .- .-.. .-.. --- / .... --- . / --. .- .- - / .... . - ?");
        MorseTranslator.translateText("Hallo hoe gaat het?");
    }
}
