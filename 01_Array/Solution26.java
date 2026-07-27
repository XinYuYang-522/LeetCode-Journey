class Solution {
    /**
     * 原地删除非严格递增数组中的重复元素，使每个元素只出现一次，
     * 并返回去重后数组的有效长度。
     *
     * 前置条件：根据题目约束，nums.length >= 1。
     *
     * LeetCode 只检查 nums 的前 k 个元素，k 之后的内容无需处理。
     *
     * 目标时间复杂度：O(n)
     * 目标空间复杂度：O(1)
     */
    public int removeDuplicates(int[] nums) {
        int slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}
