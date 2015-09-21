package dailyprogrammer.easy.challenge8;

/**
 * Created by Simin on 6-9-2015.
 */
public class BottlesOfBeer {

    private static final int BOTTLES = 99;

    public static void startSong() {
        for (int i = BOTTLES; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
        }

        //When song reaches 0 bottles of beer.
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");

    }

}
