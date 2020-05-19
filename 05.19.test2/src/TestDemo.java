import java.util.ArrayList;
import java.util.List;

/**
 * Author: dts
 * DateTime: 2020/5/19 22:00
 * Description: TODO
 */
public class TestDemo {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length-1;
        int n = grid[0].length-1;


        for(int h = 0;h<k;h++){


            for(int i = 0;i<=m;i++){
                int temp = grid[i][n];
                for(int j = n;j>0;j--){
                    grid[i][j] = grid[i][j-1];
                }
                grid[i][0]=temp;
            }


            int temp = grid[m][0];
            for(int i = m;i>0;i--){
                grid[i][0] = grid[i-1][0];
            }
            grid[0][0] = temp;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            result.add(listRow);
            for (int v : row) listRow.add(v);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arrays = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<List<Integer>> result = shiftGrid(arrays,1);
    }
}