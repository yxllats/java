public class Main {
    static int[] arr = new int[10];
    static int sum = 0;

    public static void push(int element) {
        if (sum >= 10) {
            //arr =
        }
        arr[sum] = element;
        sum++;
    }

    public static int pop() {
        if (sum <0) {
            throw new RuntimeException("error");
        }
        return arr[--sum];
    }

    public static int getMin() {
        if (sum < 0) {

        }
        int min = arr[sum ];
        for (int i = sum - 1; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        push(1);
        push(3);
        push(5);
        int num = pop();
        System.out.println(num);
        int num1 = getMin();
        System.out.println(num1);
    }
}