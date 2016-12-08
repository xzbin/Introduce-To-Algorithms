package cn.nankai.zhoubin.chapter7;

/**
 * Created by Administrator on 2016/12/8.
 */
public class QuickSort {

    private void swap(int[] nums, int low, int high) {
        int tmp = nums[low];
        nums[low] = nums[high];
        nums[high] = tmp;

    }

    private int partitionSort(int[] nums, int low, int high) {
//        if (low >= high) return;
        int key = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < key) {
                swap(nums, j, ++i);
            }
        }
        swap(nums, high, i+1);
        return i + 1;
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int privot = partitionSort(nums, low, high);
            quickSort(nums, low, privot - 1);
            quickSort(nums, privot + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 6, 0, 3, 2};
        new QuickSort().quickSort(nums, 0, nums.length - 1);
        for (int num : nums)
            System.out.println(num);
    }
}
