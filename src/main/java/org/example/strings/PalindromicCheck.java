package org.example.strings;

public class PalindromicCheck {

    public static boolean isPalindromeWithOnlyAlphanumeric(String str) {


        String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "");
        String reversedCleanedString = new StringBuilder(cleanedString).reverse().toString();

        return cleanedString.equals(reversedCleanedString);
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = "No 'x' in Nixon";

        System.out.println("'" + input1 + "' is palindrome: " + isPalindromeWithOnlyAlphanumeric(input1));
        System.out.println("'" + input2 + "' is palindrome: " + isPalindromeWithOnlyAlphanumeric(input2));
        System.out.println("'" + input3 + "' is palindrome: " + isPalindromeWithOnlyAlphanumeric(input3));

    }
}
