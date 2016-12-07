package cn.nankai.zhoubin.chapter2;

/**
 * Created by zhou bin on 2016/12/4.
 */
public class MergeSort {

    private static void mergeSort(int[] nums, int low, int high) {
//        if (nums == null || nums.length <= 1) return nums;
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {

        int len1 = mid - low + 1, len2 = high - mid;
        int[] nums1 = new int[len1 + 1], nums2 = new int[len2 + 1];

        for (int i = 0; i < len1; i++)
            nums1[i] = nums[low + i];
        nums1[len1] = Integer.MAX_VALUE;


        for (int j = 0; j < len2; j++)
            nums2[j] = nums[mid + 1 + j];
        nums2[len2] = Integer.MAX_VALUE;


        int i = 0, j = 0, k = low;
        while (k <= high) {
            if (nums1[i] < nums2[j])
                nums[k++] = nums1[i++];
            else
                nums[k++] = nums2[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 8, 9};
        MergeSort.mergeSort(nums, 0, nums.length - 1);
        for (int num : nums)
            System.out.println(num);
    }
}
