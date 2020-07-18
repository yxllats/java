import java.util.Scanner;

public class Main {
    public static int get_Day(int year,int month,int day){
        boolean flag = false;
        int sum  = 0;
        if((year%4==0&&year%100!=0)||year%400==0){
            flag = true;
        }
        switch (month){
            case 12:
                sum +=30;
            case 11:
                sum +=31;
            case 10:
                sum +=30;
            case 9:
                sum +=31;
            case 8:
                sum +=31;
            case 7:
                sum +=30;
            case 6:
                sum +=31;
            case 5:
                sum +=30;
            case 4:
                sum +=31;
            case 3:
                sum +=28;
            case 2:
                sum +=31;
        }
        if(flag&&month>2){
            sum +=1;
        }
        sum +=day;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            System.out.println(get_Day(year, month, day));
        }
    }
}
