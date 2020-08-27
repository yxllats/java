import java.util.ArrayList;
import java.util.List;

class Main {
    public static List<String> letterCombinations(String digits) {
        int len = digits.length();
        List<String> list = new ArrayList<>();
        if(len==0){
            return list;
        }
        String[] arr = new String[len];
        for(int i = 0;i<len;i++){
            int a = digits.charAt(i)-'0';
            switch(a){
                case 2:arr[i] = "abc";break;
                case 3:arr[i] = "def";break;
                case 4:arr[i] = "ghi";break;
                case 5:arr[i] = "jkl";break;
                case 6:arr[i] = "mno";break;
                case 7:arr[i] = "pqrs";break;
                case 8:arr[i] = "tuv";break;
                case 9:arr[i] = "wxyz";break;
            }
        }
        list = getCombinations(arr,0,"",list);
        return list;
    }
    public static List<String> getCombinations(String[] array, int j, String string, List<String> list){
        if(j<array.length-1){
            for(int i=0;i<array[j].length();i++){
                list = getCombinations(array,j+1,string+array[j].charAt(i),list);
            }
        }else{
            for(int i=0;i<array[j].length();i++){
                list.add(string+array[j].charAt(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}