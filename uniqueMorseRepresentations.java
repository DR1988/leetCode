package com.company;
// https://leetcode.com/problems/unique-morse-code-words/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> Mors = new HashMap();
        for (char i = 97; i < 123; i++) {
            Mors.put(i, morse[i - 97]);
        }
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < words.length ; i++) {
            StringBuffer sb = new StringBuffer(20);
            for (int j = 0; j < words[i].length() ; j++) {
                String str = Mors.get(words[i].charAt(j));
                sb.append(str);
            }
            if(!ls.contains(sb.toString())){
                ls.add(sb.toString());
            }
        }
        return ls.size();
    }
}