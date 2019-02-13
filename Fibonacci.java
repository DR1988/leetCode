package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/fibonacci-number/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        N =N - 1;
        return fib(N) + fib(N - 1);
    }
}
