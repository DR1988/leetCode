package com.company;
// https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] Res = new int[A.length];
        for (int i = 0; i < Res.length; i++) {
            Res[i] = A[i] * A[i];
        }
        Arrays.sort(Res);
        return Res;
    }
}