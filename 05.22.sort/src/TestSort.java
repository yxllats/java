import java.util.Arrays;

/**
 * Author: dts
 * DateTime: 2020/5/22 18:58
 * Description: TODO
 */
public class TestSort {
    public static void insertSort(int[] array) {
        int i = 1;
        while (i<array.length){
            int temp = array[i];
            int j = i-1;
            while(j>-1){
                if(array[j]>temp){
                    array[j+1] = array[j];
                    j--;
                }else{
                    array[j+1] = temp;
                    break;
                }
            }
            array[j+1] = temp;
            i++;
        }
    }

    public static void shell(int[] array,int gap) {
        for(int i = gap;i<array.length;i++){
            int temp = array[i];
            int j = i-gap;
            for( ;j>-1;j-=gap){
                if(array[j]>temp){
                    array[j+gap] = array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = temp;
        }
    }

    public static  void  shellSort(int[] array) {

        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }

    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrays = {10,8,5,4,1,9};
        shellSort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
