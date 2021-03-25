public class Main {
    public static void main(String[] args) {
    }
    public int[] sort (int[] array) {
        int len = array.length;
        int i = 0;
        int j = len - 1;
        int k = 0;
        while (k<j){
            if(array[k]==2){
                while (array[j]==2&&j>k){
                    j--;
                }
                if(j>k){
                    int temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
            if(array[k]==0){
                while (array[i]==0&&i<k){
                    i++;
                }
                if(i<k){
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
            if(array[k]==1||i==k){
                k++;
            }
        }
        return array;
    }

}
