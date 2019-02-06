package com.company;
//https://leetcode.com/problems/jewels-and-stones/
public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if(J.contains(Character.toString(s)) ){
                counter++;
            }
        }
        return counter;
    }
}
