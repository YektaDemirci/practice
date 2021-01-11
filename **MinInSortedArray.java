class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int l = 0;
        int h = nums.length-1;
        /*Control the sorted array, it does not follow if else structure below*/
        if (nums[h] > nums[l]) return nums[l];
        while(h-l > 1) {
            int mid = l + (h-l)/2;
            /*Anything bigger than mid is redundant*/
            if(nums[mid] < nums[l])
                h=mid;
            /*The mid was smaller than the low(global) so discard the local small*/
            else
                l=mid;
        }
        return Math.min(nums[l],nums[h]);    
    }
}
