import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();

        System.out.print("Enter the no of cols: ");
        int col = scanner.nextInt();

        int[][] matrixA = new int[row][col];
        System.out.println("Enter elements of matrix A");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("["+i+"]["+j+"] : ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixB = new int[row][col];
        System.out.println("Enter elements of matrix B");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("["+i+"]["+j+"] : ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] res = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                res[i][j] = 0;
                for (int k = 0; k < row; k++){
                    res[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
