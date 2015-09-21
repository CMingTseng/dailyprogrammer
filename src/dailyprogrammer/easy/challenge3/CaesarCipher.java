package dailyprogrammer.easy.challenge3;

/**
 * @author Simin
 */
public final class CaesarCipher {

    private CaesarCipher() {

    }

    public static void encrypt(String text, int switches) {
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c != ' ')
                c += switches;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

    public static void decrypt(String text, int switches) {
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            c -= switches;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

}
