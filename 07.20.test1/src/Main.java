import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList linkedList = new LinkedList();
    public static void fun(int begin,int m,int n){
        if(m==0){
            for (int i = 0; i < linkedList.size(); i++) {
               if(i==0){
                   System.out.print(linkedList.get(0));
               }else {
                   System.out.print(" " + linkedList.get(i));
               }
            }
            System.out.println();
        }else {
            for (int i = begin; i <=m&&i<=n; i++) {
                linkedList.add(i);
                fun(i+1,m-i,n);
                linkedList.removeLast();
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            fun(1,n,m);
            linkedList.clear();
        }
    }
}
