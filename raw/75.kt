// 75. Sort Colors
// Medium

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library’s sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]

// Output: [0,0,1,1,2,2]

// Example 2:

// Input: nums = [2,0,1]

// Output: [0,1,2]

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.
// Follow up: Could you come up with a one-pass algorithm using only constant extra space?


class Solution() {

val nums = intArrayOf(2,0,2,1,1,0)

println(bubbleSort(nums))
  
  fun bubbleSort(numsy: IntArray) {
    val nums = numsy
    for(i in nums.indices) {
      for(j in 0 until nums.size - i -1) {
        if(nums[j] > nums[j+1]) {
          val temp = nums[j]
          nums[j] = nums[j+1]
          nums[j+1] = temp
        }
      }
    }
  }
}
