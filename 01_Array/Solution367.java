class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
    
            int mid = left + ((right - left) >> 1); 
            
            if ((long)mid * mid == num) {
                return true;
            } else if ((long)mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}