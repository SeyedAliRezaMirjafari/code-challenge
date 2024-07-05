package com.sed;

public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        System.out.println(bs.binarySearch(nums, target)); // خروجی: 3
    }
}
