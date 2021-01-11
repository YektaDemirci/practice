
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] holder = new boolean[s.length()+1];
        holder[0]=true;
        for(int i=1; i <= s.length(); i++) {
            for(int j=0; j<i; j++) {
                if(holder[j]==true && wordDict.contains(s.substring(j,i)))
                {
                    holder[i]=true;
                    break;
                }
            }
        }
        return holder[s.length()];
    }
}

/*Failed solution; does not solve the case;not dynamic "aaa aaa a", aaaa aaa
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Integer> map =  new HashMap<String, Integer>();
        for(int i=0; i < wordDict.size(); i++)
            map.put(wordDict.get(i), i);
        int b = 0;
        int e = 0;
        while(e <= s.length()){
            String temp = s.substring(b, e);
            if(map.containsKey(temp)){
                //System.out.println(temp);
                b = e;
            }
            e++;
        }
        System.out.println(b+" "+e);
        if( (b+1) == e)
            return true;
        else
            return false;
    }
}
*/

/*Solution 1 O(2^n)?
public boolean wordBreak(String s, List<String> wordDict) {    
    return wordBreak(0,s,new HashSet(wordDict));   
}
private boolean wordBreak(int p, String s, Set<String> dict){
    int n=s.length();
    if(p==n) return true;
    for(int i=p;i<n;i++)
        if(dict.contains(s.substring(p,i+1)) && wordBreak(i+1,s,dict)) 
            return true;
    return false;
}
*/
