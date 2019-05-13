/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg7;

/**
 *
 * @author jim-t
 */
public class EPANALIPTIKOERG7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=10;
        int PIN[] = new int[n];
        fillPin(PIN,n);
        showPin(PIN,n);
        int min = findMin(PIN,n);
        int max = findMax(PIN,n);
        System.out.println("Min = " + PIN[min] + " in position : [" + min + "]");
        System.out.println("Max = " + PIN[max] + " in position : [" + max + "]");
        int cAVG = countAVG(PIN,n);
        System.out.println("There are total of " + cAVG + " above average number");
        swapPin(PIN,n);
        showPin(PIN,n);
    }

    private static void fillPin(int P[],int n) {
        int i;
        for (i=0;i<=n-1;i++){
            P[i] = ((int) (Math.random()*9))+1;
        }
    }

    private static void showPin(int[] PIN, int n) {
        int i;
        System.out.print("Numbers : ");
        for (i=0;i<=n-1;i++){
            System.out.print(PIN[i] + " | ");
        }
        System.out.println();
    }

    private static int findMin(int[] PIN, int n) {
        int Pmin = 0;
        int min = PIN[0];
        int i;
        for (i=1;i<=n-1;i++){
            if (PIN[i]< min){
                Pmin = i;
                min = PIN[i];
            }
        }
        return Pmin;
    }

    private static int findMax(int[] PIN, int n) {
        int Pmax = 0;
        int max = PIN[0];
        int i;
        for (i=1;i<=n-1;i++){
            if (PIN[i]> max){
                Pmax = i;
                max = PIN[i];
            }
        }
        return Pmax;
    }

    private static int countAVG(int[] PIN, int n) {
        int i,SUM;
        SUM = 0;
        for (i=0;i<=n-1;i++){
            SUM = SUM + PIN[i];
        }
        double AVG = ((double) SUM)/10;
        System.out.println("Average number is = " + AVG);
        int counted=0;
        for (i=0;i<=n-1;i++){
            if (PIN[i]>AVG){
                counted = counted + 1;
            }
        }
        return counted;
    }

    private static void swapPin(int[] PIN, int n) {
        int x;
        x = (int) (Math.random() * 8);
        int temp;
        System.out.println("Changing number " + PIN[x] + " in position " + x );
        System.out.println("with number " + PIN[x+1] + " in position " + (x+1));
        temp = PIN[x];
        PIN[x] = PIN[x+1];
        PIN[x+1] = temp;
        
    }
    
}
