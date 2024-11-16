//Medium

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.

//Example 1:

//Input: nums = [-1,0,1,2,-1,-4]

//Output: [[-1,-1,2],[-1,0,1]]

//Example 2:

//Input: nums = []

//Output: []

//Example 3:

//Input: nums = [0]

//Output: []

//Constraints:

//0 <= nums.length <= 3000
//-105 <= nums[i] <= 105

class Solution() {
val nums =  = [-1,0,1,2,-1,-4]

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    if (nums.size < 3) return result // Jeśli mniej niż 3 elementy, zwracamy pustą listę
    
    nums.sort() // Sortujemy tablicę
    
    for (i in nums.indices) {
        if (i > 0 && nums[i] == nums[i - 1]) continue // Pomijamy duplikaty
        
        var left = i + 1
        var right = nums.size - 1
        
        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]
            when {
                sum == 0 -> {
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--
                    // Pomijamy duplikaty na wskaźnikach
                    while (left < right && nums[left] == nums[left - 1]) left++
                    while (left < right && nums[right] == nums[right + 1]) right--
                }
                sum < 0 -> left++ // Jeśli suma za mała, przesuwamy left w prawo
                else -> right--   // Jeśli suma za duża, przesuwamy right w lewo
            }
        }
    }
    return result
}
}
