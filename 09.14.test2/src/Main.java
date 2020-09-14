import java.util.Scanner;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] findNumber(int num) {
        String string = Integer.toString(num,2);
        int[] arr = new int[2];
        char[] chars = string.toCharArray();
        if(string.contains("0")){
            if(string.length()==1){
                arr[1] = -1;
            } else {
                if(string.substring(1).contains("1")) {
                    {
                        int index_1 = -1;
                        int index_0 = -1;
                        for (int i = string.length() - 1; i >= 0; i--) {
                            if (chars[i] == '1' && index_1 < 0) {
                                index_1 = i;
                            }
                            if (chars[i] == '0' && index_0 < 0) {
                                index_0 = i;
                            }
                        }
                        int temp = index_0;
                        index_0 = index_1;
                        index_1 = temp;
                        if(chars[string.length()-1]=='1'){
                            arr[1] = -1;
                            arr[0] = Integer.parseInt((new String(chars)).substring(1),2);
                        }
                        arr[1] = Integer.parseInt((new String(chars)).substring(1),2);
                        if(string.substring(1,index_1).contains("0")){
                            index_0 = string.substring(1,index_1).lastIndexOf('0');
                            temp = index_0;
                            index_0 = index_1;
                            index_1 = temp;
                            arr[0] = Integer.parseInt((new String(chars)).substring(1),2);
                        }else {
                            arr[0] = -1;
                        }

                    }
                }else {
                    chars[1] = chars[0];
                    chars[0] = 0;
                    arr[1] = Integer.parseInt((new String(chars)).substring(1),2);
                    if(string.length()==32){
                        arr[0] = -1;
                    }else {
                        arr[0] = Integer.parseInt(string + "0", 2);
                    }
                }
            }
        }else {
            if(string.length()==32){
                arr[0] = -1;
                arr[1] = -1;
            }else {
                arr[0] = Integer.parseInt(string + "0", 2);
                arr[1] = -1;
            }
        }

        return arr;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _num;
        _num = Integer.parseInt(in.nextLine().trim());

        res = findNumber(_num);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
