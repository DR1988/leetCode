package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/insert-into-a-binary-search-tree/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public TreeNode insertIntoBST(TreeNode root, int val) {
        ArrayDeque<TreeNode> ard = new ArrayDeque<>();
        ard.add(root);
        while (!ard.isEmpty()) {
            TreeNode t = ard.pollFirst();
            if(t != null){
                if(t.val > val) {
                    if(t.left != null) {
                        ard.add(t.left);
                    } else {
                        t.left = new TreeNode(val);
                        break;
                    }
                } else {
                    if(t.right != null) {
                        ard.add(t.right);
                    } else {
                        t.right = new TreeNode(val);
                        break;
                    }
                }
            } else {
                t.val = val;
            }
        }
        return root;
    }
}
