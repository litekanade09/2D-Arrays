import java.util.Scanner;

public class transpose {
    public static void number(int array[][]){
        System.out.print("the matrix is :");
        for(int i = 0;i<array.length;i++){
            for(int j = 0 ;j<array[0].length;j++){
                System.out.println(array[i][j]);
            }
        }
        
    }
    public static void main(String[] args) {
        int array[][] = {{11,12,13},{21,22,23}};
        int row = 2;
        int col = 3;
        number(array);
        int transpose[][] = new int [col][row];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                transpose[j][i] = array[i][j];
            }
        }
        number(transpose);
    }
}
