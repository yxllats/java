import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/29 12:20
 * Description: TODO
 */
public class Main {
    public static char change_Num(int n){
        char c;
        switch (n){
            case 1:return '壹';
            case 2:return '贰';
            case 3:return '叁';
            case 4:return '肆';
            case 5:return '伍';
            case 6:return '陆';
            case 7:return '柒';
            case 8:return '捌';
            case 9:return '玖';
            default:return '零';
        }
    }

    public static char change_Bit(int n){
        if(n==9){
            return '亿';
        }
        if(n>5&&n<9){
            n=n%5+1;
        }else if(n>9){
            n = n%5+2;
        }
        switch (n){
            case 1:return '元';
            case 2:return '拾';
            case 3:return '佰';
            case 4:return '仟';
            case 5:return '万';
            default: return ' ';
        }


    }


    public static String fun(long n){
        StringBuffer stringBuffer = new StringBuffer();
        if(n>100) {
            int tem = 0;//位数
            int i = 0;
            long nu = n;
            while (nu > 0) {
                tem++;
                nu = nu / 10;
            }
            int[] arr = new int[tem];
            while (n > 0) {
                arr[i++] = (int) (n % 10);
                n = n / 10;
            }

            while (tem > 2) {
                if (tem != 7 && tem != 11) {
                    if (change_Num(arr[tem - 1]) != '零') {
                        stringBuffer.append(change_Num(arr[tem - 1]));
                        stringBuffer.append(change_Bit(tem - 2));
                    } else {
                        if (stringBuffer.charAt(stringBuffer.length() - 1) != '零') {
                            stringBuffer.append(change_Num(arr[tem - 1]));
                        }
                    }
                    tem--;
                } else if (tem == 7) {
                    if (change_Num(arr[tem - 1]) != '零') {
                        stringBuffer.append(change_Num(arr[tem - 1]));
                        stringBuffer.append(change_Bit(tem - 2));
                        tem--;
                    } else {
                        if (stringBuffer.charAt(stringBuffer.length() - 1) == '零') {
                            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                        }
                        if (stringBuffer.charAt(stringBuffer.length() - 1) != '亿') {
                            stringBuffer.append(change_Bit(tem - 2));
                        }
                        tem--;
                    }
                } else {
                    if (change_Num(arr[tem - 1]) != '零') {
                        stringBuffer.append(change_Num(arr[tem - 1]));
                        stringBuffer.append(change_Bit(tem - 2));
                        tem--;
                    } else {
                        stringBuffer.append(change_Bit(tem - 2));
                        tem--;
                    }
                }
            }


            if (stringBuffer.charAt(stringBuffer.length() - 1) == '零') {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                stringBuffer.append('元');
            }


            if (arr[0] == 0 && arr[1] == 0) {
                stringBuffer.append('整');
            } else if (arr[1] != 0 && arr[0] != 0) {
                stringBuffer.append(change_Num(arr[1]));
                stringBuffer.append('角');
                stringBuffer.append(change_Num(arr[0]));
                stringBuffer.append('分');
            } else if (arr[0] != 0) {

                stringBuffer.append(change_Num(arr[0]));
                stringBuffer.append('分');
            } else {
                stringBuffer.append(change_Num(arr[1]));
                stringBuffer.append('角');
            }


            if (stringBuffer.charAt(1) == '拾' && stringBuffer.charAt(0) == '壹') {
                stringBuffer.deleteCharAt(0);
            }
            stringBuffer.insert(0, "人民币");
        } else if(n==0){
            return "人民币零元整";
        } else {
            int tem = 0;//位数
            int i = 0;
            long nu = n;
            while (nu > 0) {
                tem++;
                nu = nu / 10;
            }
            int[] arr = new int[tem];
            while (n > 0) {
                arr[i++] = (int) (n % 10);
                n = n / 10;
            }
            if(tem==2) {
                if (arr[1] != 0 && arr[0] != 0) {
                    stringBuffer.append(change_Num(arr[1]));
                    stringBuffer.append('角');
                    stringBuffer.append(change_Num(arr[0]));
                    stringBuffer.append('分');
                } else if (arr[1] != 0) {
                    stringBuffer.append(change_Num(arr[1]));
                    stringBuffer.append('角');
                }
            }else {
                stringBuffer.append(change_Num(arr[0]));
                stringBuffer.append('分');
            }
            stringBuffer.insert(0, "人民币");
        }
        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            double n = in.nextDouble();
            if(n>1) {
                long num = (long) (n * 100);
                System.out.println(fun(num));
            }else {
                BigDecimal   b   =   new   BigDecimal(n);
                double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                double a1 = f1*1000;
                int num = (int)(a1/10);
                System.out.println(fun((num)));
            }
        }
    }
}
