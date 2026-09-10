
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = sc.nextInt();

        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = sc.nextInt();

        // Check multiplication condition
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication NOT possible!");
            System.out.println("Columns of A must be equal to rows of B.");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] product = new int[rowsA][colsB];

        // Input matrix A
        System.out.println("\nEnter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();

            }
        }

        // Input matrix B
        System.out.println("\nEnter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                product[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("\nResultant Matrix (A × B):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
