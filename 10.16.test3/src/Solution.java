import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

    }
    public int func1 (int[] block_list, int[] unblock_list) {
        // write code here
        if(block_list.length==0){
            return 0;
        }
        int sum = 0;
        int n = block_list[0];
        if(unblock_list.length==0){

            for (int i = 1; i < block_list.length; i++) {
                if(block_list[i]>60+n){
                    sum+=60;
                }else {
                    sum+=block_list[i]-n;
                }
                n = block_list[i];
            }
            return sum;
        }
        Arrays.sort(unblock_list);
        int size = 0;
        int m = unblock_list[size];
        boolean flag = true;
        int[] arr = new int[block_list[block_list.length-1]+60];
        for (int i = 0; i <block_list.length ; i++) {
            for (int j = i; j < 60+i; j++) {
                while (m<i&&flag){
                    if(++size<unblock_list.length){
                        m = unblock_list[size];
                    }
                    flag =false;
                    break;
                }
                if(j==m){
                    break;
                }
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                sum++;
            }
        }

        return  sum;
    }
}
