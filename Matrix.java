import java.util.Arrays;

public class Matrix {
    public static int[] getColumn(int[][] matrix, int col){
        int[] column = new int[matrix.length];
        for(int i = 0; i < matrix.length; i ++){
            column[i] = matrix[i][col];
        }
        return column;
    }

    public static int getDotProduct(int[] arr1, int[] arr2){
        int result = 0;
        for(int i = 0; i < arr1.length; i ++){
            result += arr1[i] * arr2[i];
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for(int i = 0; i < matrix1.length; i ++){
            for(int j = 0; j < matrix2[0].length; j ++){
                result[i][j] = getDotProduct(matrix1[i], getColumn(matrix2, j));
            }
        }
        return result;
    }



    public static void main(String[] args){
        int[][] matrix1 = {{1, 3, 2}, {1, 0, 0}, {1, 2, 2}};
        int[][] matrix2 = {{0, 0, 2}, {7, 5, 0}, {2, 1, 1}};
        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println(Arrays.deepToString(result));
    }
}
