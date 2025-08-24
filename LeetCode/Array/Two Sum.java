class Solution {
    public int[] twoSum(int[] nums, int target) {
                int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                     int a []={i, j}; //return array
                    return a;

                }
            }
        }
        return null;
    }
}
