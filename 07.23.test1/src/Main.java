import java.util.Arrays;

public class Main {
    public static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count = 0;
        int n = array[array.length/2];
        for (int num:array){
            if(num==n){
                count++;
                if(count>array.length/2){
                    return n;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
