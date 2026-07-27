class Solution {
    /**
     * 原地移除数组中所有等于 val 的元素，并返回剩余元素的数量。
     *
     * LeetCode 只检查 nums 的前 k 个元素，k 之后的内容无需处理。
     *
     * 目标时间复杂度：O(n)
     * 目标空间复杂度：O(1)
    */
    public int removeElement(int[] nums, int val) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}
