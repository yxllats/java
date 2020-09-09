import java.util.Arrays;
        import java.util.Scanner;

public class Main {
    public static String word_Replace(String string,String word,String word_Get){
        char[] ch = word.toCharArray();
        Arrays.sort(ch);

        StringBuffer stringBuffer = new StringBuffer();
        String[] word_sort = string.split(" ");
        for (int i = 0; i < word_sort.length; i++) {
            String str = word_sort[i];
            char[] chars = word_sort[i].toCharArray();
            Arrays.sort(chars);
            if(chars.length==ch.length&&same(ch,chars)){
                stringBuffer.append(word_Get);
            }else {
                stringBuffer.append(str);
            }
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public static boolean same(char[] ch1,char[] ch2){
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String string  = in.nextLine();
        String word_get = in.nextLine();
        String[] word_split = string.split(",");
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < word_split.length-1; i++) {
            String str = word_Replace(word_split[i],word,word_get);
            stringBuffer.append(str);
            stringBuffer.append(",");
        }
        String str = word_Replace(word_split[word_split.length-1],word,word_get);
        stringBuffer.append(str);
        System.out.println(stringBuffer.toString());
    }
}
