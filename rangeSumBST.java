package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/range-sum-of-bst/submissions/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        ArrayDeque<TreeNode> arrDeq = new ArrayDeque<>();
        arrDeq.add(root);
        while(!arrDeq.isEmpty()){
            TreeNode t = arrDeq.pollFirst();
            if(t.val < L){
                if(t.right != null) arrDeq.add(t.right);
            }
            if(t.val > R){
                if(t.left != null) arrDeq.add(t.left);
            }
            if(t.val >= L && t.val <= R){
                sum += t.val;
                if(t.left != null) arrDeq.add(t.left);
                if(t.right != null) arrDeq.add(t.right);
            }
        }
        return sum;
    }
}
