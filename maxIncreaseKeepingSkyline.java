package com.company;
// https://leetcode.com/problems/max-increase-to-keep-city-skyline/
import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] arr = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        com.company.Solution s = new com.company.Solution();
        int height = s.maxIncreaseKeepingSkyline(arr);
        System.out.println(height);
    }
}

class Solution {
    private int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int height = 0;
        int gridSize = grid.length;
        int[] horizSkyline  = new int[gridSize];
        int[] vertSkyline  = new int[gridSize];
        int[] tmp = new int[gridSize];
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                tmp[j] = grid[j][i];
            }
            vertSkyline[i] = this.getMax(tmp);
            horizSkyline[i] = this.getMax(grid[i]);
        }
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                int currentHeight = grid[i][j];
                if(currentHeight < horizSkyline[i]){
                    if(horizSkyline[i] < vertSkyline[j]) {
                        height+= horizSkyline[i] - currentHeight;
                    } else {
                        height+= vertSkyline[j] - currentHeight;
                    }
                }
            }
        }
        return height;
    }
}