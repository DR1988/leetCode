package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/search-in-a-binary-search-tree/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    public TreeNode searchBST(TreeNode root, int val) {
        ArrayDeque<TreeNode> trd = new ArrayDeque<>();
        if(root.val > val){
            trd.offer(root.left);
        }else if(root.val < val){
            trd.offer(root.right);
        }else {
            return root;
        }
        while(!trd.isEmpty()){
            TreeNode t = trd.poll();
            if(t.val == val) {
                return t;
            } else {
                if(t.left != null) {
                    trd.offer(t.left);
                }
                if(t.right != null) {
                    trd.offer(t.right);
                }
            }
        }
        return null;
    }
}
