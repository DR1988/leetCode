package com.company;

import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/univalued-binary-tree/

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution{
    private ArrayDeque<TreeNode> trees = new ArrayDeque<TreeNode>();
    private int headValue;
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return false;
        trees.add(root);
        headValue = root.val;
        return equalTrees(trees, headValue);
    }

    private boolean equalTrees(ArrayDeque<TreeNode> tr, int initialVal) {
        TreeNode t = tr.pollFirst();
        if(t.left != null && initialVal == t.left.val){
            tr.add(t.left);
        } else if (t.left == null) {}
        else if (t.left != null && initialVal != t.left.val) {
            return false;
        }
        if(t.right != null && initialVal == t.right.val){
            tr.add(t.right);
        } else if (t.right == null) {
        }
        else if (t.right != null && initialVal != t.right.val) {
            return false;
        }
        if (t.left == null && t.right == null && tr.size() == 0) return true;
        return equalTrees(tr, initialVal);
    }
}
