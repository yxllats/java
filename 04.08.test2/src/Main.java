import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());         //道具数量
        int bagvolum = Integer.parseInt(in.nextLine());;    //背包容量
        int[] volum = new int[num];     //重量
        int[] price = new int[num];     //价值

        String str1 = in.nextLine();
        String[] volumstr = str1.split(" ");
        String str2 = in.nextLine();
        String[] pricestr = str2.split(" ");


        for (int i = 0; i < num; i++) {
            volum[i] = Integer.parseInt(volumstr[i]);
            price[i] = Integer.parseInt(pricestr[i]);
        }

        int[][] maxprice = new int[num+1][bagvolum+1];
        for (int i = 1; i <= num; i++) {
            int pri = price[i-1];
            int vol = volum[i-1];
            for (int j = 1; j <= bagvolum; j++) {
                if(j<vol){
                    maxprice[i][j] = maxprice[i-1][j];
                    continue;
                }
                maxprice[i][j] = Math.max(maxprice[i-1][j],maxprice[i-1][j-vol]+pri);
            }
        }
        System.out.println(maxprice[num][bagvolum]);

    }
}
