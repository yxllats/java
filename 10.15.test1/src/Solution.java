public class Solution {
    private int sum = 0;
    public  int InversePairs(int [] array) {
        if(array==null){
            return sum;
        }
        sortA(array,0,array.length-1);
        return sum;
    }
    public  void sortA(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)>>>1;
        sortA(arr,left,mid);
        sortA(arr,mid+1,right);

        sortB(arr,left,mid,right);
    }

    public  void sortB(int[] arr,int left,int mid,int right){
        int size = right-left+1;
        int[] array = new int[size];
        int i = size -1;
        int s1 = mid;
        int s2 = right;
        while(s2>=mid+1&&s1>=left){
            if(arr[s1]>arr[s2]){
                sum+=(s2-mid);
                sum=sum%1000000007;
                array[i--] = arr[s1--];
            }else{
                array[i--] = arr[s2--];
            }
        }
        while(s2>=mid+1){
            array[i--] = arr[s2--];
        }
        while(s1>=left){
            array[i--] = arr[s1--];
        }
        for(int j=0;j<array.length;j++){
            arr[j+left] = array[j];
        }
    }
}