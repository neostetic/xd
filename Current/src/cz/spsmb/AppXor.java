package cz.spsmb;

import java.util.Scanner;

public class AppXor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.print("Text       : ");
        String text = sc.next();
        System.out.print("Password   : ");
        String pass = sc.next();

        String generated = encrypt(text, pass);
        String correction = encrypt(generated, pass);

        System.out.println("Out        : " + generated);
        System.out.println("--------------------------------------\nCorrection : " + correction);
    }

    private static String encrypt(String text, String pass) {
        char[] textChars = text.toCharArray();
        char[] passChars = pass.toCharArray();
        int diff = text.length() - pass.length();

        char[] encryptedText = new char[textChars.length];
        for (int i = 0; i < encryptedText.length; i++) {
            int j = 0;
            if (j > diff) {
                j -= diff;
            }
            encryptedText[i] = (char) (textChars[i] ^ passChars[j]);
            // encryptedText[i] = (char) (textChars[i] ^ passChars[i % pass.length()]);
        }
        return new String(encryptedText);
    }

}
