package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

final class Descrambler {

    public static void main(String[] args) {
        try {
            Set<String> dictionary = new HashSet<>(Files.readAllLines(Paths.get("dictionary.txt")));
            Descrambler descrambler = new Descrambler(dictionary);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (!Thread.interrupted()) {
                System.out.print("input: ");
                String input = reader.readLine();

                Collection<String> results = descrambler.descramble(input);
                if (results.isEmpty()) {
                    System.out.println("\tno results");
                    continue;
                }

                for (String result : results) {
                    System.out.println("\t" + result);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean equals(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] counts = new int[Character.MAX_VALUE];

        for (char c : a.toCharArray()) {
            counts[c]++;
        }

        for (char c : b.toCharArray()) {
            counts[c]--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    private final Set<String> dictionary;

    private Descrambler(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    private Collection<String> descramble(String input) {
        return dictionary.parallelStream()
                .filter(s -> s.length() == input.length())
                .filter(s -> equals(s, input))
                .collect(Collectors.toList());
    }
}