package solutions.No_0601_To_No_0700.No_0628_maximum_product_of_three_numbers;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * @author Nacht
 * Created on 2019/5/27
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * Note:
 * The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 解题思路:
 * 排序即可, 记得考虑负数情况
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1]);
    }
}
