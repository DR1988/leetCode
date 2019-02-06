package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/hamming-distance/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int count = 0;
        String str = Integer.toBinaryString(res).toString();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') count++;
        }
        return count;
    }
}
