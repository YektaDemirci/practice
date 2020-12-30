class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    
    public void backtrack(List<List<Integer>> list, List<Integer> cur, int[] cand, int target, int start) {
        for(int i=start; i<cand.length; i++) {
            if( (target-cand[i]) < 0 )
                return;
            else if( (target-cand[i]) == 0 ) {
                cur.add(cand[i]);
                list.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
                /*System.out.println(cur);*/
            }
            else{
                cur.add(cand[i]);
                backtrack(list,cur,cand,target-cand[i],i);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
