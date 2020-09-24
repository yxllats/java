import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();
            Boolean flag = false;
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i)!='_'){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(string);
            }else {
                if (string.contains("_")) {
                    String[] strings = string.split("_");
                    for (int i = 0; i < strings.length - 1; i++) {
                        if (strings[i].equals("") || strings[i].length() == 0) {
                            System.out.print("_");
                        } else {
                            StringBuffer stringBuffer = new StringBuffer(strings[i]);
                            System.out.print(stringBuffer.reverse());
                            System.out.print("_");
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer(strings[strings.length - 1]);
                    System.out.print(stringBuffer.reverse());
                    for (int i = string.length() - 1; i >= 0; i--) {
                        if (string.charAt(i) == '_') {
                            System.out.print(string.charAt(i));
                        } else {
                            break;
                        }
                    }
                    System.out.println();
                } else if (string.equals("") || string.length() == 0) {
                    System.out.println();
                } else {
                    StringBuffer stringBuffer = new StringBuffer(string);
                    System.out.println(stringBuffer.reverse());
                }
            }
        }
    }
}
