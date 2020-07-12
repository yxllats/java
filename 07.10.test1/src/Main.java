public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int j = 1;
        for (int i = 0; i < 30; i++) {
            sum +=j;
            j*=2;
        }
        System.out.print(10 * 30+" ");
        System.out.print(sum);
    }
}
