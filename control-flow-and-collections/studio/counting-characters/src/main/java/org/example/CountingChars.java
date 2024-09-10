package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String tempString = input.nextLine().toLowerCase();
        char[] charactersInString = tempString.toCharArray();
        HashMap<Character, Integer> letters = new HashMap<>();

        for(Character letter : charactersInString){
            if(letter.toString().matches("[a-z]+")) {
                if (letters.containsKey(letter)) {
                    letters.put(letter, letters.get(letter) + 1);
                } else {
                    letters.put(letter, 1);
                }
            }
        }
        /*Group code
        for(Character letter: charactersInString){
            Integer charCount = 0;
            for(int i = 0;i<tempString.length();i++){
                if(letter.toString().matches("[a-z]+")){
                    charCount++;
                    letters.put(letter,charCount);
                }
            }
        }*/
        for (Map.Entry<Character, Integer> count: letters.entrySet()){
            System.out.println(count.getKey() + ":" + count.getValue());
        }
    }
}