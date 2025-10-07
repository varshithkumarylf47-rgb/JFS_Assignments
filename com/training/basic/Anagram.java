package com.training.basic;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "earth";
        String word2 = "Heart";
        char[] word1check = word1.toLowerCase().toCharArray();
        char[] word2check = word2.toLowerCase().toCharArray();
        Arrays.sort(word1check);
        Arrays.sort(word2check);
        if(Arrays.equals(word1check, word2check)){
            System.out.println("anagram");
        }


    }
}
