package samplejava;

public class Ex1IntToByte {
    public static void main(String[] args) {
        int i = 287;
        byte a = (byte) i; // i % 256

        System.out.println(a);

        int j = 594;
        byte b = (byte) j;
        System.out.println(b);
    }
}