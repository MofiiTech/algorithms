import java.util.Arrays;

public class Temp {
    public static int passbyvalue(int[] a) {
        a[0] = a[0]+1000;
        return a[0];
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; ++i) {
            arr[i] = 6;
        }
        passbyvalue(arr);
        System.out.println(arr[0]);
    }
}