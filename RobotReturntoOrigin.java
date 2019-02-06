package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/robot-return-to-origin/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        for (int i = 0; i < moves.length(); i++) {
            Character ch = moves.charAt(i);
            switch (ch){
                case 'L':
                    h--;
                    break;
                case 'R':
                    h++;
                    break;
                case 'U':
                    v--;
                    break;
                case 'D':
                    v++;
                    break;
            }
        }
        if (v == 0 && h == 0) return true;
        return false;
    }
}
