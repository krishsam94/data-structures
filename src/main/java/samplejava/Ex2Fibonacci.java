package samplejava;

public class Ex2Fibonacci {
    public static void main(String[] args) {
        // Fibonacci
        int a = 0;
        int b = 1;
        int num = 8;
        for (int i = 0; i < num; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
