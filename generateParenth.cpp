/* Obtained solution 
Runtime: 4 ms, faster than 77.57% of C++ online submissions for Generate Parentheses.
Memory Usage: 14.4 MB, less than 30.61% of C++ online submissions for Generate Parentheses.
*/
class Solution {
public:
    
    vector<string> ans;
    void recursive(string s, int left,int right){   
        if(left==0 && right==0){             
            ans.push_back(s);
            return;
        }
        if(left>0)
            recursive(s+"(", left-1, right);
        if(left<right)
            recursive(s+")", left, right-1);    
    }
    vector<string> generateParenthesis(int n) {
        ans.clear();
        recursive("",n,n);                              
        return ans;
    }
};

