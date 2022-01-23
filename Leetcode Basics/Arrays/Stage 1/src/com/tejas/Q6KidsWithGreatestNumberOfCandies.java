//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
//SOlved in first attempt after 6 days of jatin and mine confusion becaus eat that time it is not the fastest and still it is only 20% faster than other submissions because in discussion tab many people are using same logic...
package com.tejas;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Q6KidsWithGreatestNumberOfCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int[] cal = new int[candies.length];
    List<Boolean> ans = new ArrayList<Boolean>();
    int max = Arrays.stream(candies).max().getAsInt();
    /*
     * this method provide the max value from an Array directly using Java Streams
     * but that value is converted into int since we are using getAsInt() method.
     */

    for (int i = 0; i < candies.length; i++) {
      cal[i] = candies[i] + extraCandies;
      if (cal[i] >= max) {
        ans.add(true);
      } else
        ans.add(false);
    }
    return ans;
  }

}