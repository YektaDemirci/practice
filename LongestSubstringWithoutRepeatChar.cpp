class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length(), ans = 0;
        unordered_map<char,int> m;
        for(int i=0, j=0; j<n; j++) {
            if(m.find(s[j]) != m.end() ) {
                cout << j;
                i=max(m.find(s[j])->second,i);
                m.erase(s[j]);
            }   
            ans = max(ans, j-i+1);
            m.insert( {s[j], j+1} );
        }
        cout << " " << m.size() << endl;
        return ans;
        
    }
};

/*Brute Force
class Solution {
public:
    int checker (const char *first, const char *second) {
        int ctr;
        while(*first==*second){
            ctr++;
            first=first+1;
            second=second+1;
        }
        return ctr;
    }
    int lengthOfLongestSubstring(string s) {
        const char *head = s.c_str();
        const char *tail = s.c_str()+1;
        const char *c1,*ch2;
        int len,res = 0;
        while(*head != '\0') {
            len=checker(head,tail);
            if(len>res) {
                res=len;
            }
            tail=tail+1;
            if(*tail == '\0') {
                head = head+1;
                if(*head != '\0')
                    tail = head+1;
            }
                
        }
        return res;
    }
};

*/
