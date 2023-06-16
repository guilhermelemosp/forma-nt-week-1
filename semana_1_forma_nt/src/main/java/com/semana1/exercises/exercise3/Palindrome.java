package com.semana1.exercises.exercise3;

public class Palindrome {
    public boolean isPalindrome(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }
}
