/*
Runtime: 0 ms, faster than 100.00% of C++ online submissions for Valid Parentheses.
Memory Usage: 6.7 MB, less than 43.40% of C++ online submissions for Valid Parentheses.
*/
class Solution {
public:
    bool isValid(string s) {
        cout << s << endl;
        stack<char> dummy;
        char dummyChar;
        for(int i=0; i<s.size(); i++)
        {
            if(s[i]=='(')
                dummy.push(s[i]);
            else if (s[i]=='[')
                dummy.push(s[i]);
            else if (s[i]=='{')
                dummy.push(s[i]);
            else if (dummy.empty())
                return false;
            else if (s[i]=='}')
                if (dummy.top() == '{')
                    dummy.pop();
                else return false;
            else if (s[i]==')')
                if (dummy.top() == '(')
                    dummy.pop();
                else return false;
            else if (s[i]==']')
                if (dummy.top() == '[')
                    dummy.pop();
                else return false;
        }
        if (dummy.empty())
            return true;
        return false;
    }
};;
