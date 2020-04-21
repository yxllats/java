import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.management.RuntimeMBeanException;
import java.util.Arrays;

/**
 * Author: dts
 * DateTime: 2020/4/19 15:57
 * Description: 顺序表
 */
public class MyArrayList {
    private int[] elem;
    private int usedSize;
    private static final int capacity = 10;

    public MyArrayList() {
        //构造函数
        this.elem = new int[capacity];
        this.usedSize=0;
    }

    private boolean posTrue(int pos) {
        //判断位置是否合法
        if(pos<0 || pos >this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
        return true;
    }

    private boolean IsFull() {
        //判断顺序表是否满了
        return this.usedSize == this.elem.length;
    }

    public void add(int pos,int data) {
        //添加数据
        if(this.posTrue(pos)) {
            if(this.IsFull()) {
                this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
            }
            for (int i = usedSize-1; i >= pos; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos]=data;
            this.usedSize++;
        }
    }

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos) {
        if(this.posTrue(pos)) {
            return this.elem[pos];
        }
        throw new RuntimeException("顺序表异常");
    }

    public void setPos(int pos,int value) {
        if(pos>0 || pos <this.usedSize) {
            this.elem[pos] = value;
        }
    }

    public void remove(int toRemove) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toRemove) {
                for (int j = i; j < this.usedSize-1; j++) {
                    this.elem[j]=this.elem[j+1];
                }
                this.usedSize--;
            }
        }
    }

    public int size() {
        return this.usedSize;
    }

    public void clear() {
        this.usedSize=0;
    }
}