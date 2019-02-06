package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/merge-two-binary-trees/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return  t2;
        if(t2 == null) return  t1;
        int val = t1.val + t2.val;
        t1.val = val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
