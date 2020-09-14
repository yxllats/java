import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.nextLine();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = in.nextLine();
            }

            char[][] chars = new char[n][n];
            for (int i = 0; i < n; i++) {
                String string = in.nextLine();
                for (int j = 0; j < n; j++) {

                    chars[i][j] = strings[i].charAt(j);
                }
            }
            dfs(chars, 0, 0, n - 1, k, 0);
        }
    }
    public static void dfs(char[][] chars,int x,int y,int n,int k,int temp){
        if(x<0||y<0||x>n||y>n){
            return;
        }
        if(x==n&&y==n){
            System.out.println(temp);
            return ;
        }
        if(chars[x][y]=='#'){
            temp+=k;
        }
        if(chars[x][y]=='1'){
            return;
        }
        dfs(chars,x+1,y,n,k,temp+1);
        dfs(chars,x-1,y,n,k,temp+1);
        dfs(chars,x,y+1,n,k,temp+1);
        dfs(chars,x,y-1,n,k,temp+1);
    }
}
