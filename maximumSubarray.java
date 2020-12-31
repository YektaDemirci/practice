/* Inspired Solution, divide-n-conq is more complex */
class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            curMax = Math.max(nums[i], curMax+nums[i]);
            ans = Math.max(curMax,ans);
        }
        return ans;
    }
}
