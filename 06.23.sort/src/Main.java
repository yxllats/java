import java.util.Arrays;

/**
 * Author: dts
 * DateTime: 2020/6/23 17:06
 * Description: TODO
 */
public class Main {
    public static int Min(int array[],int index,int num)
    {
        int low=index;
        for(int i=index+1;i<array.length;i++)
        {
            if(array[low]>array[i]&&array[i]>num)
            {
                low=i;
            }
        }
        return low;
    }
    public static void Permutation(int array[])
    {
        boolean judge=true;
        System.out.println(Arrays.toString(array));
        while(judge)
        {
            for(int i=array.length-1;i>=1;i--)
            {
                if(array[i]>array[i-1])
                {
                    int low=Min(array,i,array[i-1]);
                    array[i-1]=array[i-1]^array[low];
                    array[low]=array[low]^array[i-1];
                    array[i-1]=array[i-1]^array[low];
                    Arrays.sort(array,i,array.length);
                    System.out.println(Arrays.toString(array));
                    break;
                }
                if(i==1)
                {
                    judge=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        Permutation(array);
    }

}