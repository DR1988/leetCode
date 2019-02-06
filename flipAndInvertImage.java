package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/flipping-an-image/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    static int flip(int f){
        if(f == 0) return 1;
        return 0;
    }

    public int[][] flipAndInvertImage(int[][] A) {

        int[][] res = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            int[] tempar = new int[A[i].length];
            for(int j = A[i].length - 1; j >= 0; j--){
                tempar[A[i].length - 1 - j] = flip(A[i][j]);
            }
            res[i] = tempar;
        }
        return res;
    }
}
