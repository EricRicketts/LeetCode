package org.example;

public class App {
    public String longestPalindrome(String s) {
        String[] arrayOfWords = s.split("\\s+");
        int lengthOfLongestPalindrome = 0;
        String longestPalindrome = "";
        for (String word:arrayOfWords) {
            if (this.isPalindrome(word) && word.length() > lengthOfLongestPalindrome) {
                lengthOfLongestPalindrome = word.length();
                longestPalindrome = word;
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
/*
    Algorithm
    1.  Split the String into an array of words, arrayOfWords
    2.  init longestPalindrome
    3.  Develop a method which test to see if the word is a Palindrome
    4.  Loop through the array
        1.  if the word is a palindrome
        2.  compare it to the length of the previous palindrome
        3.  if larger update longestPalindrome
*/
