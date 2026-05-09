import java.io.*;
import java.util.*;

public class Token {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        // Remove leading and trailing spaces
        s = s.trim();
        System.out.println(s);

        // Check empty string
        if (s.length() == 0) {

            System.out.println(0);

        } else {

            // Split using special characters
            String[] tokens = s.split("[ !,?._'@]+");

            // Print number of tokens
            System.out.println(tokens.length);

            // Print each token
            for (String word : tokens) {

                System.out.println(word);
            }
        }

        scan.close();
    }
}