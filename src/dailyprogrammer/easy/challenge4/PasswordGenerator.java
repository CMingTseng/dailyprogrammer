package dailyprogrammer.easy.challenge4;

import java.util.Random;

/**
 * @author Simin
 */
public final class PasswordGenerator {

    private static final String characters = "abcdefghijklmnopqrstovwxyzABCDEFGHIJKLMNOPQRSTOVWXYZ1234567890";
    private static final char[] chars = characters.toCharArray();
    private static Random rand = new Random();

    private PasswordGenerator() {

    }

    public static void generatePassword(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
            sb.append(chars[rand.nextInt(chars.length)]);
        System.out.println(sb.toString());
    }

    public static void generateMultiplePasswords(int length, int amount) {
        for (int i = 0; i < amount; i++)
            generatePassword(length);
    }

}
