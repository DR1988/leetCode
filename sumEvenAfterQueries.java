package com.company;

import java.lang.reflect.Array;
import java.util.*;

https://leetcode.com/problems/sum-of-even-numbers-after-queries/solution/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] farr = new int[A.length];
        int sum = 0;
        int index = 0;
        for (int i = 0; i < queries.length; i++) {
            index = queries[i][1];
            A[index] += queries[i][0];
            sum = 0;
            for (int j = 0; j < A.length; j++) {
                if(A[j] % 2 == 0) sum +=A[j];
            }
            farr[i] = sum;
        }
        return farr;
    }
}
