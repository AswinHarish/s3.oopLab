import java.util.Scanner;

public class binarySearch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter Sorted Array");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter element to be searched: ");
        int key = scanner.nextInt();
        
        int start = 0, end = n - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == key){
                System.out.println("Element found at index " + mid);
                return;
            }
            else if(key < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
}
