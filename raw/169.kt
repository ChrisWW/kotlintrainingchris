// 169. Majority Element
// Easy

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]

// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]

// Output: 2

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109
// Follow-up: Could you solve the problem in linear time and in O(1) space?

class Solution() {

  // Basically BayerMoyer approach checks if it the majority in the array that's way we use -1 expression instead of 0, if appears the same amount of time result will be 0, and count == 0 rese it

  fun findAppearBayerMoyer(): Int {
    val nums = [3,2,3]
    val length = nums.length
    var majority = nums[0]
    var count = 0
    
    nums.forEach {
      if (count == 0) {
        majority = it
      }

      count += if (majority == num) +1 else -1
    }

    nums.forEach {
      if (it == majority) {
        count++
      }

      if (count > length/2) {
        return majority else -110
      }
    }
    
  }
}
