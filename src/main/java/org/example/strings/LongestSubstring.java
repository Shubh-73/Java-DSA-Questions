package org.example.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int longestSubstringWithoutRepetition(String str){

        int maximumLength = 0;
        int currentMaximumLength = 0;
        int startIndex = 0;
        Map<Character, Integer> mapOfCharacterIndex = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            Character currentChar = str.charAt(i);

            if(mapOfCharacterIndex.containsKey(currentChar)){
                startIndex = Math.max(startIndex, mapOfCharacterIndex.get(currentChar));
            }
            currentMaximumLength = i - startIndex + 1;
            maximumLength = Math.max(maximumLength, currentMaximumLength);
            mapOfCharacterIndex.put(currentChar, i);

            maximumLength = Math.max(maximumLength, currentMaximumLength);
        }

        return maximumLength;
    }

    public static void main(String[] args) {

        String str = "a quick brown fox jumps over the lazy dog";
        System.out.println(longestSubstringWithoutRepetition(str));
    }

}
