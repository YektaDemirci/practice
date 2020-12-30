class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
        
    }
    public void backtrack(List<List<Integer>> list, List<Integer> cur, int[] nums, int loc) {
        if(loc > nums.length)
            return;
        if(cur.size() == nums.length)
            list.add(new ArrayList<>(cur));
        for(int j=0; j < nums.length; j++) {
            if(!cur.contains(nums[j]))
            {
                cur.add(nums[j]);
                backtrack(list, cur, nums, loc+1);
                cur.remove(cur.size() -1 );
            }
        }
    }
}
