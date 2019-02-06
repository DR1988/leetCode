package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0;
        int hi = A.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] < A[mid + 1]) { lo = mid + 1; } // peak index is after mid.
            else{ hi = mid; } // peak index <= mid.
        }
        return lo; // found peak index.
    }
}
