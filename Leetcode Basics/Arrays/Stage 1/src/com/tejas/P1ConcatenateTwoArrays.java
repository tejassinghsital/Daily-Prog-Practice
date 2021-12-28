

package com.tejas;

import java.util.Scanner;

class P1ConcatenateTwoArrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int[] nums= new int[10];
        int[] nums1= new int[10];

        for(int i=0;i<(nums.length);i++)
        {
            nums[i]=sc.nextInt();
        }

        for(int i=0;i<(nums1.length);i++)
        {
            nums1[i]=sc.nextInt();
        }

        int[] ans=new int[(nums1.length)+(nums.length)];
        int n=0;

        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            n=n+i;
        }

        for(int i=0;i<(ans.length-nums.length);i++)
        {
            ans[n+1]=nums1[i];
        }
        
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]);
        }
    }
}