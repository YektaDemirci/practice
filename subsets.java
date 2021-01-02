class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        return subroutine(list, new ArrayList<>(), nums, 0);
    }
    public List<List<Integer>> subroutine(List<List<Integer>> list, List<Integer> cur, int[] nums,int loc) {
        list.add(new ArrayList<>(cur));
        for(int i=loc; i < nums.length; i++) {
            cur.add(nums[i]);
            subroutine(list, cur, nums, i+1);
            cur.remove(cur.size()-1);
        }
        return list;
    }
}
