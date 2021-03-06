import java.util.Scanner;

public class BinarySearchWithRecursion {
    private static int binarySearchEngine(int[] array, int findNumber, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (findNumber > array[middle]) {
            return binarySearchEngine(array, findNumber, middle + 1, right);
        }

        if (findNumber < array[middle]) {
            return binarySearchEngine(array, findNumber, left, middle - 1);
        }

        return middle;
    }

    private static int binarySearch(int[] array, int findNumber) {
        int left = 0;
        int right = array.length - 1;

        return binarySearchEngine(array, findNumber, left, right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number whose index you want to find: ");
        int findNumber = scanner.nextInt();

        int[] array = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println(binarySearch(array, findNumber));
    }
}
