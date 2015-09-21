package dailyprogrammer.easy.challenge15;

import com.sun.deploy.util.StringUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Justify text left or right
 *
 * @author Simin
 */
public class Main {

    private static final int justifyLength = 20;

    public static void main(String[] args) throws FileNotFoundException {
        readTextFromFile();
    }

    /**
     * Read text from a file
     *
     * @throws FileNotFoundException
     */
    private static void readTextFromFile() throws FileNotFoundException {
        //
        StringBuilder textBuilder = new StringBuilder();
        Scanner fileReader = null;
        fileReader = new Scanner(new FileReader("challenge15.txt"));
        while (fileReader.hasNextLine()) {
            String nextLine = fileReader.nextLine();
            textBuilder.append(nextLine + "\n");
        }
        fileReader.close();
        System.out.println(textBuilder);
        //


        String[] words = textBuilder.toString().split(" ");
        String line = "";

        for (int i = 0; i < words.length - 1; i++) {
            StringBuilder sb = new StringBuilder();
            while (line.length() < justifyLength) {
                line += " " + words[i];
                i++;
            }
            sb.append(line);
            line = "";

            System.out.println(sb);
        }
    }

    /**
     * old
     *
     * @throws FileNotFoundException
     */
    private static void readTextFromFileOld() throws FileNotFoundException {
        StringBuilder textBuilder = new StringBuilder();
        Scanner fileReader = null;
        fileReader = new Scanner(new FileReader("challenge151.txt"));
        while (fileReader.hasNextLine()) {
            String nextLine = fileReader.nextLine();
            while (nextLine.length() > justifyLength) {
                String sub = nextLine.substring(0, 10);
                String remainder = nextLine.substring(10);
                textBuilder.append(sub + "\n");
                nextLine = remainder;
                continue;
            }
            textBuilder.append(nextLine + "\n");
        }
        fileReader.close();

        String[] words = textBuilder.toString().split(" ");

    }

    /**
     * Write text to a text file.
     */
    private void writeTextToFile() {
        try {
            PrintWriter pw = new PrintWriter(new File("challenge15.txt"));
            // pw.println(USERNAME);
            //  pw.println(PASSWORD);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
