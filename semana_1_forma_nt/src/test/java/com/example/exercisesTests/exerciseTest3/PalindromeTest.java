package com.example.exercisesTests.exerciseTest3;

import com.semana1.exercises.exercise3.Palindrome;

public class PalindromeTest {
 public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();
    String word = "ana";
    System.out.println("A palavra é um palíndrome? Resposta: " + palindrome.isPalindrome(word));
    }
}
