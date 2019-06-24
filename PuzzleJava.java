import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;

/**
 * PuzzleJava
 */
public class PuzzleJava {

    public static void main(String[] args) {

        int[] array1 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int[] result1 = printAndGreaterThan10(array1);
        System.out.println("Greater than 10: " + Arrays.toString(result1));

        String[] names = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa", "Jona" };
        String[] result2 = namesShuffleAndLongerThan5Chars(names);
        System.out.println("Longer than 5 chars: " + Arrays.toString(result2));

        playWithAlphabet();

        randomNumbers();
        randomness();
        randomString();
        randomStrings();
    }

    /*
     * Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the
     * sum of all numbers in the array. Also have the function return an array that
     * only includes numbers that are greater than 10 (e.g. when you pass the array
     * above, it should return an array with the values of 13,25,32)
     */

    public static int[] printAndGreaterThan10(int[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        System.out.println("The sum is: " + sum);

        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int val : array) {
            if (val > 10) {
                res.add(val);
            }
        }

        int[] output = new int[res.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = res.get(i);
        }
        return output;
    }

    /*
     * Create an array with the following values: Nancy, Jinichi, Fujibayashi,
     * Momochi, Ishikawa. Shuffle the array and print the name of each person. Have
     * the method also return an array with names that are longer than 5 characters.
     */
    public static String[] namesShuffleAndLongerThan5Chars(String[] array) {

        List<String> names = Arrays.asList(array);
        Collections.shuffle(names);
        System.out.println("The shuffled names are: " + names);

        ArrayList<String> result = new ArrayList<String>();

        for (String name : names) {
            if (name.length() > 5) {
                result.add(name);
            }
        }
        // System.out.println("Longer than 5 chars: " + result);

        String[] output = new String[result.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = result.get(i);
        }
        return output;
    }

    /*
     * Create an array that contains all 26 letters of the alphabet (this array must
     * have 26 values). Shuffle the array and, after shuffling, display the last
     * letter from the array. Have it also display the first letter of the array. If
     * the first letter in the array is a vowel, have it display a message. To
     * shuffle a collection, you can use the shuffle method of the Collections
     * class.
     */
    public static void playWithAlphabet() {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        List<Character> letters = new ArrayList<Character>();

        for (int i = 0; i < alphabet.length; i++) {
            Character ch = Character.valueOf(alphabet[i]);
            letters.add(ch);
        }

        Collections.shuffle(letters);
        System.out.println("After shuffle: " + letters);

        System.out.println("The last letter: " + letters.get(letters.size() - 1));
        System.out.println("The first letter: " + letters.get(0));

        if ("AEIOU".indexOf(letters.get(0)) != -1) {
            System.out.println("The first letter in the array is a vowel.");
        }
    }

    /*
     * Generate and return an array with 10 random numbers between 55-100. To get a
     * random integer, you can use the nextInt method of the Random class.
     */
    public static int[] randomNumbers() {
        int[] output = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            output[i] = r.nextInt(45) + 55;
        }

        /*
         * for (int var : output) { System.out.println("Random array: " + var); }
         */
        return output;
    }

    /*
     * Generate and return an array with 10 random numbers between 55-100 and have
     * it be sorted (showing the smallest number in the beginning). Display all the
     * numbers in the array. Next, display the minimum value in the array as well as
     * the maximum value. To sort a collection, you can use the sort method of the
     * Collections class.
     */
    public static void randomness() {
        int[] random = randomNumbers();

        List<Integer> res = new ArrayList<Integer>();
        for (int val : random) {
            res.add(val);
        }
        Collections.sort(res);
        System.out.println("Ordered random array: " + res);

        System.out.println("The smallest number is: " + res.get(0));
        System.out.println("The maximum number is: " + res.get(res.size() - 1));

    }

    /*
     * Create a random string that is 5 characters long.
     */
    public static String randomString() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();

        char[] vals = new char[5];
        for (int i = 0; i < 5; i++) {
            vals[i] = letters.charAt(r.nextInt(letters.length()));
        }
        String output = String.valueOf(vals);

        System.out.println("5-chars-long random string: " + output);
        return output;
    }

    /*
     * Generate an array with 10 random strings that are each 5 characters long
     */
    public static String[] randomStrings() {
        String[] output = new String[10];
        for (int i = 0; i < 10; i++) {
            String str = randomString();
            output[i] = str;
        }
        for (String s : output) {
            System.out.println("10 random strings: " + s);
        }
        return output;
    }

}