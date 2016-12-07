package cn.nankai.zhoubin.chapter4;

import java.util.Random;

/**
 * Created by zhoubin on 2016/12/7.
 */
public class SubArray {

    public static int findMaxSubArray(int[] nums, int low, int high) {
        if (low == high)
            return nums[low];
        else {
            int mid = (low + high) / 2;
            int leftSum = findMaxSubArray(nums, low, mid);
            int rightSum = findMaxSubArray(nums, mid + 1, high);
            int crossSum = findMaxCrossSubArray(nums, low, mid, high);
            if (leftSum >= rightSum && leftSum >= crossSum)
                return leftSum;
            else if (rightSum >= leftSum && rightSum >= crossSum)
                return rightSum;
            else
                return crossSum;
        }
    }

    private static int findMaxCrossSubArray(int[] nums, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += nums[i];
            if (leftSum < sum)
                leftSum = sum;
        }
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += nums[i];
            if (rightSum < sum)
                rightSum = sum;
        }
        return (leftSum + rightSum);
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -5, -7};
//        System.out.print(SubArray.findMaxSubArray(nums, 0, nums.length - 1));

        System.out.print(Math.random());

    }
}
