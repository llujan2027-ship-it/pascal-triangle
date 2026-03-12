/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pascaltriangle;

/**
 *
 * @author llujan2027
 */
import java.util.Arrays;
import java.util.Scanner;
public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a row of Pascal's Triangle to output.");
        int row = scan.nextInt();
        PasCalculations.pascalRowOut(row);
    }
    
}

class PasCalculations {
   
   static void pascalRowOut(int n){
       int[] pascalRow = new int[n];
       for (int i = 0; i < n; i++){
           pascalRow[i] = pascalNumberCalc(n, i);
       }
       for (int j = 0; j < n; j++){
           System.out.print(pascalRow[j] + "   ");
       }
       System.out.println("1");
   }
   
   static int pascalNumberCalc(int row, int col){
        if (col == 0) {
            return 1;
        } else if (col == row) {
            return 1;
        } else {
            int returnInt = pascalNumberCalc((row - 1), (col - 1));
            returnInt = returnInt + pascalNumberCalc((row - 1), col);
            return returnInt;
        }
   }
}