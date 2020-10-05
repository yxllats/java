import java.util.*;
public class Main {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if(str==null||str.length()==0){
            return list;
        }
        if(str.length()==1){
            list.add(str);
            return list;
        }
        char[] chars = str.toCharArray();
        sort(chars,list);
        return list;
    }
    public void sort(char[] chars,ArrayList<String> list){
        Arrays.sort(chars);
        while(true){
            list.add(new String(chars));
            int j = 0;
            int index = 0;
            for(j = chars.length-2;j>=0;j--){
                if(chars[j]<chars[j+1]){
                    index = j;
                    break;
                }
                if(j==0){
                    return;
                }
            }
            for(j=chars.length-1;j>=0;j--){
                if(chars[j]>chars[index]){
                    break;
                }
            }
            swap(chars,index,j);
            reverse(chars,index+1);
        }
    }
    public void reverse(char[] chars,int i){
        int len = chars.length-1;
        while(i<len){
            swap(chars,i,len);
            i++;
            len--;
        }
    }
    public void swap(char[] chars,int i,int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}