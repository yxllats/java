public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,1};
        int temp = 0;
        for (int i : arr){
            temp ^=i;
        }
        int index = 0;
        index = temp&(-temp);
        int a = 0;
        int b = 0;
        for (int i:arr){
            if((i&index)==0){
                a^=i;
            }else {
                b^=i;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
