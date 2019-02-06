package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/di-string-match/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int currentMin = 0;
        int currentMax = S.length();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'I') {
                res[i] = currentMin;
                currentMin++;
            } else {
                res[i] = currentMax;
                currentMax--;
            }
        }
        res[S.length()] = currentMin;
        return res;
    }
}
