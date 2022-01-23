//https://leetcode.com/problems/number-of-good-pairs/

// this can also be done with hashap so comeback once you learn the topic...
package com.tejas;

public class Q7NumberOfGoodPairs {
 public int numIdenticalPairs(int[] nums) {
  int ans = 0;
  for (int i = 0; i < nums.length; i++) {

   for (int j = i + 1; j < nums.length; j++) {
    if (nums[i] == nums[j]) {
     ans++;
    }
   }

  }
  return ans;
 }
}
