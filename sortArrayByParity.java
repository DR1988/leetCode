package com.company;
// https://leetcode.com/problems/sort-array-by-parity/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] arrs = new int[A.length];
        List<Integer> arr = new ArrayList(A.length);
        List<Integer> even = new ArrayList();
        List<Integer> odd = new ArrayList();
        for (int i: A) {
            if(i%2 == 0) {
                even.add(i);
            } else{
                odd.add(i);
            }
        }
        for (int i: even) {
            arr.add(i);
        }
        for (int i: odd) {
            arr.add(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            arrs[i] = arr.get(i);
        }

        return arrs;
    }
}