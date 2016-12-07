package cn.nankai.zhoubin.chapter2;

public class IntertionSort {

    /*

     */

    private static int[] insertSort(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 7, 6, 5};
        ;
        for (int num : IntertionSort.insertSort(nums))
            System.out.println(num);


    }
}
