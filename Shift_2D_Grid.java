import java.util.ArrayList;
import java.util.List;

public class Shift_2D_Grid {
    
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> allList=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                allList.add(grid[i][j]);
            }
        }
        int z=0;
         while(z<k){
            int temp=allList.get(allList.size()-1);
            allList.remove(allList.size()-1);
            allList.add(0,temp);           
            z++;
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<grid.length*grid[0].length;i=i+grid[0].length){
            List<Integer> ansList=new ArrayList<>();
        for(int j=i;j<i+grid[0].length;j++){
            ansList.add(allList.get(j));
            }
            ans.add(ansList);  }   
        return ans;
    }
}
/*

0,1,2,3,4,5,6,7,8,9
9,1,2
3,4,5
6,7,8


*/