package cn.nankai.zhoubin.chapter6;

/**
 * Created by Administrator on 2016/12/8.
 */
public class HeapSort {

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void adjustHeap(int[] nums, int i, int length) {
        int left = (i == 0) ? (i + 1) : (2 * i), right = (i == 0) ? (i + 2) : (2 * i + 1), largest = i;
        if (left < length && nums[left] > nums[i]) largest = left;
        if (right < length && nums[right] > nums[largest]) largest = right;
        if (largest != i) {
            swap(nums, largest, i);
            adjustHeap(nums, largest, length);
        }
    }

    private void buildHeap(int[] nums, int length) {
        for (int i = length / 2; i >= 0; i--) {
            adjustHeap(nums, i, length);
        }
    }

    public void heapSort(int[] nums) {
        int length = nums.length - 1;
        buildHeap(nums, length);
//        System.out.print(nums[0]);
        for (int i = length;i>=1;i--){
            swap(nums,0,i);
            adjustHeap(nums,0,i);

        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, -4, 0, 1, 4,5,3,1,3, 6, 7, -10};
        new HeapSort().heapSort(nums);
        for (int num : nums)
            System.out.println(num);
    }
}

