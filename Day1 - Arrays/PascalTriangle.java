package sdestriverSheet;

import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {
	public static int NCr(int row, int col){
        int res = 1;
        for(int i=0; i<col; i++){
            res = res*(row-i);
            res = res/(i+1);
        }
        return (int)res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1; row<=numRows; row++){
            List<Integer> tempList = new ArrayList<>();
            for(int col=1; col<=row; col++){
                tempList.add(NCr(row-1, col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }
}
