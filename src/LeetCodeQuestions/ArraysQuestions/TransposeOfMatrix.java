package LeetCodeQuestions.ArraysQuestions;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
/*
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
       System.out.println(Arrays.toString(transpose(matrix)));
        System.out.println(matrix.length);*/


    /*public static int[][] transpose(int[][] matrix) {
 int [][] result = new int[matrix[0].length][matrix.length];
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                result [col][row]= matrix[row][col];

            }
        }
        return result;
    }*/
        String input = "a,b,c e,f,g i,j,k";
        String[] rows = input.split(" ");

        // Assuming the matrix is 3x3 based on the provided input
        int rowCount = rows.length;
        int colCount = rows[0].split(",").length;

        String[][] matrix = new String[rowCount][colCount];
        String[][] transposedMatrix = new String[colCount][rowCount];

        // Fill the matrix
        for (int i = 0; i < rowCount; i++) {
            String[] columns = rows[i].split(",");
            for (int j = 0; j < colCount; j++) {
                matrix[i][j] = columns[j];
            }
        }

        // Transpose the matrix
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                System.out.print(transposedMatrix[i][j]);
                if (j < rowCount - 1) {
                    System.out.print(",");
                }
            }
            if (i < colCount - 1) {
                System.out.print(" ");
            }
        }
    }
}