import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            double x=in.nextFloat();
            double y=in.nextFloat();
            double z=in.nextFloat();
            double x1=in.nextFloat();
            double y1=in.nextFloat();
            double z1=in.nextFloat();

            double r = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y) + (z1-z)*(z1-z));
            double V = 4.0/3*Math.acos(-1)*Math.pow(r,3);

            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f",V);
        }
    }
}
