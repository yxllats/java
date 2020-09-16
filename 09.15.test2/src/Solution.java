public class Solution {
    /**
     * 数组内数据循环平移
     * @param arr int整型一维数组 输入数组
     * @param pushOffset int整型 位移长度
     * @return int整型一维数组
     */
    public static int[] pushIntArray (int[] arr, int pushOffset) {
        // write code here
        StringBuffer stringBuffer = new StringBuffer();
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            stringBuffer.append(arr[i]);
            stringBuffer.append(",");
        }
        stringBuffer.append(arr[len-1]);
        pushOffset = pushOffset%len;
        String string = stringBuffer.toString();
        for (int i = 0; i < pushOffset; i++) {
            int index = string.lastIndexOf(",");
            string = string.substring(index+1)+","+string.substring(0,index);
        }
        String[] strings = string.split(",");
        int length = strings.length;
        int[] array = new int[length];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }
        return array;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        pushIntArray(arr,2);
    }
}