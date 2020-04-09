import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = creatRandomArray();
        Scanner scn = new Scanner(System.in);
        System.out.print("\n Input index of array:");
        try {
            int index = scn.nextInt();
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException Ex) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

//    private static Integer[] creatRandomArray() {
//        Random rd = new Random();
//        Integer[] arr = new Integer[100];
//        System.out.println("Danh sách phần tử của mảng: ");
//        for (int i = 0; i < 100; i++) {
//            arr[i] = rd.nextInt(100);
//            System.out.print(arr[i] + " ");
//        }
//        return arr;
//    }

    static int[] creatRandomArray() {
        int[] arr = new int[100];
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
