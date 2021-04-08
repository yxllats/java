public class Main {
    public static void main(String[] args) {
        System.out.println(indexOf("abc", "de"));
    }
    public static int indexOf (String s, String pattern) {
        // write code here
        if(s==null||s.length()==0||pattern.length()>s.length()){
            return -1;
        }
        if(pattern.length()==0||pattern==null){
            return 0;
        }
        int i = 0;
        int j = 0;
        int istart = -1;
        for (; i < s.length()&&j<pattern.length(); ) {
            if(s.charAt(i)==pattern.charAt(j)){
                if(istart==-1){
                    istart = i;
                    i++;
                    j++;
                }else {
                    i++;
                    j++;
                }
            }else {
                if(j!=0){
                    j = 0;
                    i = istart+1;
                }else {
                    i++;
                }
            }
        }
        if(j==pattern.length()){
            return i-j;
        }
        return -1;
    }
}
