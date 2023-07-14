package com.company;

import java.util.Locale;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String polindrome = scan.nextLine();

        System.out.println(IsPalindrome(polindrome));

    }

    static String IsPalindrome(String polindrom){
        // 1 variant
        //        StringBuffer buffer = new StringBuffer(polindrome);
        //        String c = buffer.reverse().substring(0);

        // 2 variant
        String c = "";
        for(int i = polindrom.length()-1; i >= 0; i--){
            c+= polindrom.charAt(i);
        }
        boolean isPalondrome = c.equalsIgnoreCase(polindrom);
        String message = isPalondrome ? "It's a palindrome" : "Sorry it's not a palindrome";
        return message;
    }
}
