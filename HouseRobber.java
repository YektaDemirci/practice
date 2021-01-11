/*class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return rob(nums, nums.length-1);
    }
    public int rob(int[] nums, int i) {
        if(i<0) return 0;
        if (memo[i]>=0) return memo[i];
        int res = Math.max(rob(nums,i-2)+nums[i], rob(nums,i-1));
        memo[i] = res;
        return res;
    }
}*/
class Solution{
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int prev1=0;
        int prev2=0;
        for(int num:prev) {
            int temp = prev1;
            prev1 = Math.max(prev2+num, prev1);
            prev2=temp;
        }
        return prev1;
    }
}

/*Amazing solution
public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    int prev1 = 0;
    int prev2 = 0;
    for (int num : nums) {
        int tmp = prev1;
        prev1 = Math.max(prev2 + num, prev1);
        prev2 = tmp;
    }
    return prev1;
}
*/

/*Great solution
public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    int[] memo = new int[nums.length + 1];
    memo[0] = 0;
    memo[1] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        int val = nums[i];
        memo[i+1] = Math.max(memo[i], memo[i-1] + val);
    }
    return memo[nums.length];
}
*/
