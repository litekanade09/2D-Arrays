import java.util.Scanner;

public class numberof7 {

    public static int number(int array[][]){
        int count = 0;
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j< array[0].length;j++){
                if( 7 == array[i][j]){
                    count++;
                }
            }
        }
      System.out.print(count);
        return 1;
    }
    public static void main(String[] args) {
        int array[][] = {{4,7,8},{8,8,7}};
        number(array);
    }
}
