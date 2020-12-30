/*Runtime: 5 ms, faster than 98.81% of Java online submissions for Group Anagrams.
Memory Usage: 41.9 MB, less than 85.17% of Java online submissions for Group Anagrams.*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        int loc=0;
        int tempLoc;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] tempArray= strs[i].toCharArray(); 
            Arrays.sort(tempArray);
            String key = String.valueOf(tempArray);
            if(map.containsKey(key)) {
                tempLoc=map.get(key);
                list.get(tempLoc).add(strs[i]);
            }
            else {
                map.put(key, loc);
                list.add( new ArrayList<String>());
                list.get(list.size()-1).add(strs[i]);                
                loc++;
            }
        }
        return list;
    }
}

/* trick used by using map.values- no value check.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] tempArray= strs[i].toCharArray(); 
            Arrays.sort(tempArray);
            String key = String.valueOf(tempArray);
            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(strs[i]);
        }
        return  new ArrayList(map.values());
    }
}*/
