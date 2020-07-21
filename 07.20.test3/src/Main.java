import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        while (in.hasNext()) {
            int temp = 0;
            int num = 0;
            int num2 = 0;
            for (int i = 0; i <n; i++) {
                arr[i] = in.nextInt();
                temp =temp^arr[i];
            }
            int t = temp&(-temp);
            for (int i = 0; i < n; i++) {
                if((arr[i]&t)==0){
                    num^=arr[i];
                }else {
                    num2^=arr[i];
                }
            }
            if(num>num2){
                System.out.println(num2+" "+num);
            }else {
                System.out.println(num + " " + num2);
            }
        }
    }
}
