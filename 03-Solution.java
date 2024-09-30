class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    if (i < j) {
                        result = new int[]{i, j};
                    } else {
                        result = new int[]{j, i};
                    }
                }
            }
        }
        return result;
    }
}
