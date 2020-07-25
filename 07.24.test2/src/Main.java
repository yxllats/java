import java.util.Arrays;

public class Main {
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] array = new int[m*n];
        int k = 0;

        int i = 0;
        int j = 0;
        int startX = 0;
        int startY = 0;
        int endY = m-1;
        int endX = n-1;

        while (startX <= endX && startY <= endY){
            if( startX == endX ){
                for( ; j <= endY ;j++ ){
                    array[k++] = mat[startX][j];
                }
                break;
            }
            if( startY == endY ){
                for( ; i <= endX ; i++){
                    array[k++] =  mat[i][startY];
                }
                break;
            }
            for(; j < endY ; j++){
                array[k++] =    mat[i][j];
            }
            //将矩阵右边除边下顶点添加到返回的数组中
            for( ; i < endX ; i++){
                array[k++] =    mat[i][j];
            }
            //将矩阵下边除边左顶点添加到返回的数组中
            for( ; j > startY ; j--){
                array[k++] =    mat[i][j];
            }
            //将矩阵左边除边上顶点添加到返回的数组中
            for( ; i > startX ; i--){
                array[k++] =    mat[i][j];
            }

            i++;
            j++;
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return array;
    }
    public static void main(String[] args) {
        int[][] arr = {{4,46,89},{28,66,99},{26,21,71}};
        System.out.println(Arrays.toString(clockwisePrint(arr,3,3)));
    }
}
