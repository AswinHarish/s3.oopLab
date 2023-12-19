import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lb = 0, ub = n - 1;
        sort(arr, lb, ub);

        System.out.println("Sorted Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    static void sort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            sort(arr, lb, loc - 1);
            sort(arr, loc + 1, ub);
        }
    }

    static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;

        return end;
    }
}

