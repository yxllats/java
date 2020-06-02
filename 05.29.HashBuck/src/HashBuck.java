/**
 * Author: dts
 * DateTime: 2020/5/29 20:12
 * Description: TODO
 */
public class HashBuck {

    static class Node {
        public int key;
        public int val;
        public Node next;
        public Node(int key,int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array = new Node[10];
    public int usedSize;

    public void put(int key,int val) {

        int index = key % array.length;
        for (Node cur = array[index];cur != null;cur = cur.next) {
            if(cur.key == key) {
                //key相同 更新val值
                cur.val = val;
                return;
            }
        }
        Node node = new Node(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        if(loadFactor() > 0.75) {
            resize();
        }

    }

    public void resize() {
        Node[] newArray = new Node[2*this.array.length];
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];
            while (cur != null) {
                Node node = cur.next;
                int index = cur.key&newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
                cur = node;
            }
        }
        array = newArray;
    }

    public double loadFactor(){
        return this.usedSize*1.0 / this.array.length;
    }


}