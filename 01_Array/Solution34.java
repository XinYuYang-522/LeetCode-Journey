class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target)
    {   
        int left = 0;
        int right = nums.length - 1;
        int first = -1;
        while(left <= right)
        {
            int mid = left + ((right - left) >> 1);
            if(target == nums[mid])
            {
                first = mid;
                right = mid - 1;
            }
            else if (target > nums[mid])
            {
                left = mid + 1;
            }
            else if (target < nums[mid])
            {
                right = mid - 1;
            }
        }
        return first;
    }

    private int findLast (int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int last = -1;
        while(left <= right)
        {
            int mid = left + ((right - left) >> 1);
            if(target == nums[mid])
            {
                last = mid;
                left = mid + 1;
            }
            else if (target < nums[mid])
            {
                right = mid - 1;
            }
            else if (target > nums[mid])
            {
                left = mid + 1;
            }
        }
        return last;
    }
}