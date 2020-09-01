public class Main {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return sortPart(a,0,n-1,K);

    }

    public int sortPart(int[] a,int left,int right,int k){
        int m = sort(a,left,right);
        if(m+1>k){
            return sortPart(a,left,m-1,k);
        }else if(m+1<k){
            return sortPart(a,m+1,right,k);
        }else{
            return a[m];
        }
    }


    public int sort(int[] a,int left,int right){
        int temp = a[left];
        while(left<right){
            while(temp>=a[right]&&right>left){
                right--;
            }
            a[left] = a[right];
            while(temp<=a[left]&&right>left){
                left++;
            }
            a[right] = a[left];
        }
        a[left ] = temp;
        return left;
    }
}