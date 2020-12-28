class Solution {
public:
    string convert(string s, int numRows) {
        vector<char>* matrix;
        matrix = new vector<char>[numRows];
        int row=0, i=0;
        int down=1;
        if (numRows == 1)
            return s;
        while(i<s.size()) {
            matrix[row].push_back(s[i]);
            row++;
            i++;
            if(row==numRows)
            {
                row=row-2;
                while(row>0 && i<s.size()) {
                    matrix[row].push_back(s[i]);
                    row--;
                    i++;
                }
            }
        }
        string res;
        for(int i=0; i<numRows; i++) {
            for(int j=0; j< matrix[i].size();j++) {
                res.push_back(matrix[i][j]);
            }
        }
        return res;
    }
};
