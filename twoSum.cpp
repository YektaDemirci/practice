/* Hash functioned solution */
class Solution {
public:
    vector<int> twoSum(vector<int>&, int);
};

vector<int> Solution::twoSum(vector<int>& nums, int target)
{
    vector<int> res;
    int dif;

    unordered_map<int, int> m;
    for(int i=0; i<nums.size(); i++)
    {
        m.insert({nums[i], i});
    }
    for(int i=0; i<nums.size(); i++)
    {
        dif=target-nums[i];
        if( (m.find(dif) != m.end()) && (i!= m.find(dif)->second) )
        {
            res.push_back(m.find(dif)->second);
            res.push_back(i);
            break;
        }
    }
    return res;
}

/*
//Brute force solution, less memory consumption, slower speed
class Solution {
public:
    vector<int> twoSum(vector<int>&, int);
};

vector<int> Solution::twoSum(vector<int>& nums, int target)
{
    vector<int> res;
    for(auto i=nums.begin(); i != (nums.end()-1); i++)
    {
        for(auto j=i+1; j!= nums.end(); j++)
        {
            if(*i + *j == target)
            {
                res.push_back(i-nums.begin());
                res.push_back(j-nums.begin());
            }
            else
                continue;

        }
    }
    return res;
}
*/

