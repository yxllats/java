import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class myStack{
    public List<Integer> list = new ArrayList<>(100);
    public List<Integer> list_MAX = new ArrayList<>(100);
    public int size = 0;
    public int size_Max = 0;
    public myStack(){

    }

    public int pop(){
        if(size==0) {
            return -1;
        }
        int ret = 0;
        if(list.get(size-1)==list_MAX.get(size_Max-1)){
            ret = list.get(size-1);
            list.remove(size-1);
            list_MAX.remove(size_Max-1);
            size--;
            size_Max--;
        }else {
            ret = list.get(size-1);
            size--;
        }
        return ret;
    }
    public void push(int val){
        if(size==0){
            list.add(val);
            list_MAX.add(val);
            size++;
            size_Max++;
        }else {
            if (val>=list.get(size-1)){
                list.add(val);
                list_MAX.add(val);
                size++;
                size_Max++;
            }else {
                list.add(val);
                size++;
            }
        }
    }
    public int max(){
        if(size_Max==0){
            return -1;
        }
        return list_MAX.get(size_Max-1);
    }
}
public class Main {

    public static void main(String[] args) {
        myStack stack = new myStack();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if(i>1000){
                break;
            }
            stack.push(Integer.parseInt(strings[i]));
        }
        System.out.println(stack.max());
    }

}
