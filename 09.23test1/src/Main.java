public class Main {
    public static int indexOf (String s, String pattern) {
        // write code here
        if(s==null||pattern==null||pattern.length()==0||s.length()<pattern.length()){
            return -1;
        }
        int index = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==pattern.charAt(k)){
                index = i;
                for (int j = i+1; k <pattern.length()&&j <s.length() ; j++) {
                    if(s.charAt(j)!=pattern.charAt(++k)){
                        k = 0;
                        break;
                    }
                    if(k==pattern.length()-1){
                        return index;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOf("abcd", "bd"));
    }
}
