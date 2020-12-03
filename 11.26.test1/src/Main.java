import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int index = -1;
        int num = 0;
        int sum = 0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='0'&&string.charAt(i)<='9'){
                num++;
            }else{
                if(sum<num){
                    sum = num;
                    index = i;

                }num = 0;
            }
            if(i==string.length()-1){
                if(sum<num){
                    sum = num;
                    index = i;

                }
            }
        }
        if(index<0){
            System.out.println("");
        }else{
            String str = string.substring(index - sum+1,index+1);
            System.out.println(str);
        }
    }
}