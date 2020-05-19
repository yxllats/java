import java.util.Arrays;

/**
 * Author: dts
 * DateTime: 2020/5/13 18:54
 * Description: TODO
 */
public class MyStack {
    public int[] elem;//数组
    public int top;//表示当前可以存放数据元素的下标

    public MyStack() {
        this.elem = new int[10];
    }

    public void push(int data) {
        if(this.full()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[top] = data;
        this.top++;
    }

    public boolean full() {
        if(this.elem.length == top) {
            return true;
        }
        return false;
    }

    public boolean empty() {
        return this.top==0;
    }

    public int pop() {
        return this.elem[--this.top];
    }

    public int peek() {
        return this.elem[this.top-1];
    }

    public int size() {
        return this.top;
    }

}