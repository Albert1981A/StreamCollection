import java.util.stream.IntStream;

public class StreamToArrays {

    public static void main(String[] args) {

        printArray(magic());
        printArray(magic2());
    }

    public static int[] magic() {
      int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
      return arr;
    }

    public static int[] magic2() {
        return IntStream.range(1,11).toArray();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
