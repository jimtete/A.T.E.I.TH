/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg8;

/**
 *
 * @author jim-t
 */
public class EPANALIPTIKOERG8 {

    static int n = 10;
    
    public static void main(String[] args) {
        
        int my2DArray[][] = new int [n][n];
        fillPin(my2DArray,n);
        showPin2D(my2DArray,n);
        double avgLine[] = new double [n];
        findMeanLine(my2DArray,avgLine,n);
        showPin1D(avgLine,n);
        double avgCol[] = new double [n];
        findMeanCol(my2DArray,avgCol,n);
        showPin1D(avgCol,n);
        int sum = findDSum(my2DArray,n);
        System.out.println("The sum of 2 diagonial lines is : " + sum);
        
        
    }

    private static void fillPin(int[][] my2DArray, int n) {
        int i,j;
        for (i=0;i<=n-1;i++){
            for (j=0;j<=n-1;j++){
                my2DArray[i][j] =  (int) (Math.random()*10) + 1;          
            }
        }
    }

    private static void showPin2D(int[][] my2DArray, int n) {
        int i,j;
        for (i=0;i<=n-1;i++){
            for (j=0;j<=n-1;j++){
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findMeanLine(int[][] my2DArray , double[] avgLine, int n) {
        int i,j;
        int sum;
        for (i=0;i<=n-1;i++){
            sum = 0;
            for (j=0;j<=n-1;j++){
                sum = sum + my2DArray[i][j];
            }
            avgLine[i] = (double)sum / 10;
        }
    }

    private static void showPin1D(double[] avgLine, int n) {
        int i;
        for (i=0;i<=n-1;i++){
            System.out.print(avgLine[i] + "  ");
        }
        System.out.println();
    }

    private static void findMeanCol(int[][] my2DArray, double[] avgCol, int n) {
        int i,j;
        int sum;
        for (i=0;i<=n-1;i++){
            sum = 0;
            for (j=0;j<=n-1;j++){
                sum = sum + my2DArray[j][i];
            }
            avgCol[i] = (double)sum / 10;
        }
    }

    private static int findDSum(int[][] my2DArray, int n) {
        int i;
        int sum = 0;
        for (i=0;i<=n-1;i++){
            sum = sum + my2DArray[i][i];
            sum = sum + my2DArray[n-i-1][n-i-1];
        }
        return sum;
    }


}
