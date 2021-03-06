package strings;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class Anagram {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i = 0; i < t; i++) {
            System.out.println(getNumOfCharsToChange(in.next()));
        }

    }

    private static int getNumOfCharsToChange(String s) {
        if(s.length() % 2 != 0) {
            return -1;
        }
        String half1 = s.substring(0, s.length() / 2);
        String half2 = s.substring(s.length() / 2);
        for(int i = 0; i < half1.length(); i++) {
            if(half2.contains(half1.substring(i, i + 1))) {
                half2 = half2.replaceFirst(half1.substring(i, i + 1), "");
            }
        }
        return half2.length();
    }

}
