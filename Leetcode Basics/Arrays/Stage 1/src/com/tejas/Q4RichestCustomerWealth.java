//https://leetcode.com/problems/running-sum-of-1d-array/

//Changed class from solution to Q4RichestCustomerWealth
package com.tejas;

class Q4RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int[] ans = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int n = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                n = n + accounts[i][j];
            }
            ans[i] = n;
        }

        int max = ans[0];
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > max)
                max = ans[i];
        }
        return max;
    }
}