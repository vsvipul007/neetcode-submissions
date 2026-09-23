class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        unordered_set<char> sets[9];
        unordered_set<char> row, col;
        for(int i=0;i<9;i++)
        {
            row.clear();
            col.clear();
            for(int j=0;j<9;j++)
            {
                char x = board[i][j];
                if( x != '.')
                {
                    if(row.find(x) != row.end()) return false;
                    row.insert(x);
                    int sq_num = (i/3)*3 + (j/3);
                    unordered_set<char> curr_set = sets[sq_num];
                    if(sets[sq_num].find(x) != sets[sq_num].end())
                    {
                        return false;
                    }
                    sets[sq_num].insert(x);

                }
                char y = board[j][i];
                if(y != '.'){
                    if(col.find(y) != col.end()) return false;
                    col.insert(y);
                }
            }
        }
        return true;
    }
};
