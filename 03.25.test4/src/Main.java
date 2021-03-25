public class Main {
    public static void main(String[] args) {
        System.out.println(compressString("abbccd"));
    }
    public static String compressString (String str) {
        if(str==null||str.length()==0){
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                stringBuffer.append(str.charAt(i));
                stringBuffer.append(count);
                count=0;
            }
        }
        if(stringBuffer.length()>=str.length()){
            return str;
        }
        return stringBuffer.toString();
    }
}
