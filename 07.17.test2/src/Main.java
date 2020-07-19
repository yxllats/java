import java.util.Scanner;

public class Main {
    public static String set_possword(String s){
        StringBuffer stringBuffer = new StringBuffer();
        for (char ch:s.toCharArray()){
            if(ch<90&&ch>64){
                stringBuffer.append((char)(ch + 33));
            }else if(ch==90){
                stringBuffer.append('a');
            }else if(ch>96&&ch<122){
                stringBuffer.append((char)(ch - 31));
            }else if(ch==122){
                stringBuffer.append('A');
            }else if((ch-'0')>=0&&(ch-'0')<=9){
                int x = ch - '0';
                x = x+1>9?0:x+1;
                stringBuffer.append(x);
            }
        }
        return stringBuffer.toString();
    }
    public static String get_possword(String s){
        StringBuffer stringBuffer = new StringBuffer();
        for (char ch:s.toCharArray()){
            if(ch<91&&ch>65){
                stringBuffer.append((char)(ch + 31));
            }else if(ch==65){
                stringBuffer.append('z');
            }else if(ch>97&&ch<123){
                stringBuffer.append((char)(ch - 33));
            }else if(ch==97){
                stringBuffer.append('Z');
            }else if((ch-'0')>=0&&(ch-'0')<=9){
                int x = ch - '0';
                x = x-1<0?9:x-1;
                stringBuffer.append(x);
            }
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            //String s2 = in.nextLine();
            System.out.println(set_possword(s1));
            //System.out.println(get_possword(s2));
        }
    }
}

        //XKu1yU72RuPE0ke9o5RNPlxe0ZzU9H50HX9NrBZTY3vU5gfN29b8U0WeTR7D8iy9uf5ie0579G1yJ2nu15yxIF4xpgs98HF
        //XKu1yU72RuPE0ke9o5RNPlxe0Z`U9H50HX9NrBZTY3vU5gfN29b8U0WeTR7D8iy9uf5ie0579G1yJ2nu15yxIF4xpgs98HF