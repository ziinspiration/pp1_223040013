package Sesi11;

import java.io.IOException;
import java.util.Scanner;

public class PostFixApp {
    public static void main (String[] args) throws IOException {
        String input;
        int output;

        while(true) {
            System.out.println("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) break;

            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Hasil operasi: "+ output);
        }
    }
    public static String getString() throws  IOException
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
