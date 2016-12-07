package cn.nankai.zhoubin.chapter2;

/**
 * Created by Administrator on 2016/12/4.
 */
public class BubbleSort {

    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j >= i + 1; j--) {
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 3, 6, 8, 2, 0};
        BubbleSort.bubbleSort(nums);
        for (int num : nums)
            System.out.println(num);

    }
}
