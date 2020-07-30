import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
    }
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] canBreak = new boolean[s.length()+1];
        canBreak[0] =true;
        for (int i = 1; i < s.length()+1; i++) {
            for (int j = 0; j < i; j++) {
                if(canBreak[j]&&dict.contains(s.substring(j,i))){
                    canBreak[i]=true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }
}
