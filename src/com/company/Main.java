package com.company;


public class Main {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = account[0];
            for (int j = 1; j < accounts[0].length; j++) {
                sum += account[j];
            }
            max = Math.max(max, sum);
        }


        return max;
    }
    public static void main(String[] args) {
	// write your code here
        int [][] s = {{1,2,3},{3,2,1}};
        int [][] s1 = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(s));
        System.out.println(maximumWealth(s1));
    }
}
