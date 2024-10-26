import java.util.Scanner;

public class main {
    public static int search(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int  i  = 0 ;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
//              if(matrix[i][j] == key){
//                  System.out.print("found at cell" + "(" + i + "," +j+")");
//                  return 0;
//              }
              if(largest <matrix[i][j]){
                  largest = matrix[i][j];


              }
                if(smallest >matrix[i][j]){
                    smallest = matrix[i][j];


                }
            }
        }
        System.out.println(smallest);
        System.out.print(largest);
        return 1;
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length ;
        int m = matrix[0].length;
        Scanner input = new Scanner(System.in);
        for(int  i  = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search( matrix);
    }
}
