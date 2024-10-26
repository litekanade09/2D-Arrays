import java.util.Scanner;

public class sumofsecondrow {
    public static int second(int array[][]){
        int sum = 0;
        for(int j = 0;j<array[0].length;j++){
            sum += array[1][j];
        }
        System.out.print(sum);
        return sum;
    }
    public static void main(String[] args) {
        int array[][] = {{1,4,9},{11,4,3},{2,2,3}};
        second(array);
    }
}
