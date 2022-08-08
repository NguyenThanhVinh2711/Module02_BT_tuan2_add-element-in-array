import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        int numberIsAdd = scanner.nextInt();
        int positionIsAdd = findIndexAdd(arr, numberIsAdd);
        int[] arr1 = new int[arr.length + 1];
        if (positionIsAdd == -1) {
            System.out.println("Phan tu khong co trong mang. Them phan tu " + numberIsAdd + " vao mang .");
            arr1 = addOneElement(arr, 6, numberIsAdd);
        } else {
            System.out.println("Phan tu co trong mang");
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }

    public static int findIndexAdd(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public static int[] addOneElement(int[] arr, int index, int x) {
        int[] newarr = new int[arr.length + 1];
        for (int i = 0; i < newarr.length; i++) {
            if (i < index) {
                newarr[i] = arr[i];
            } else if (i == index) {
                newarr[i] = x;
            }
        }
        return newarr;
    }
}
