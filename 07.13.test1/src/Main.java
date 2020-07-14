import java.util.Iterator;
        import java.util.LinkedList;
        import java.util.Scanner;

public class Main{
    static int[][] map;
    static int m,n,minEnergy = 0;
    static boolean flag = false;
    static String path = "";
    static LinkedList<String > list = new LinkedList<String>();
    public static void goMap(int x,int y,int p){
        if(x<0||y<0||x>n-1||y>m-1||p<0||map[x][y]==0){
            return;
        }
        list.add("["+x+","+y+"]");
        map[x][y] = 0;
        if(x==0&&y==m-1){
            if(p>=minEnergy) {
                minEnergy = p;
                updatePath();
            }
            flag = true;
        }

        goMap(x,y+1,p-1);
        goMap(x,y-1,p-1);
        goMap(x+1,y,p);
        goMap(x-1,y,p-3);

        map[x][y] = 1;
        list.removeLast();
    }
    public static void updatePath() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            sb.append(iterator.next() + ",");
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        path = sb.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int p = in.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }
        goMap(0,0,p);
        if (!flag)
            System.out.println("Can not escape!");
        else
            System.out.println(path);

    }

}