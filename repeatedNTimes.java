package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public int repeatedNTimes(int[] A) {
        for (int k = 1; k <= 3; ++k)
            for (int i = 0; i < A.length - k; ++i)
                if (A[i] == A[i+k])
                    return A[i];
        throw null;
    }
}
