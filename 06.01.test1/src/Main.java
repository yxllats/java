import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/1 10:09
 * Description: TODO
 */
public class Main {
    public static int Func(String str1,String str2){
        int num = 0;
        if(Is_Palindrome(str1+str2)){
            num++;
        }
        for (int i = 1; i < str1.length(); i++) {
            if(Is_Palindrome(str1.substring(0,i)+str2+str1.substring(i))){
                num++;
            }
        }
        if(Is_Palindrome(str2+str1)){
            num++;
        }
        return num;
    }

    public static boolean Is_Palindrome(String string){
        int left = 0;
        int right = string.length()-1;
        while(left<right){
            if(string.charAt(left)!=string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();

        System.out.println(Func(string1, string2));
    }
}
