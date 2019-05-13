/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg6;

/**
 *
 * @author jim-t
 */
public class EPANALIPTIKOERG6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,npar;
        do{
            System.out.println("Give me number for n: ");
            n=scannerUserInput.getInteger();
        }while (n > 10 || n < 0);
        npar = 1;
        int i;
        for (i=2;i<=n;i++){
            npar = staticMethods.PARAGONTIKO(npar,i);
            System.out.println("Quick answer : " + npar);
        }
        System.out.println("Producer of n is : " + (double)npar);
        
        
        
        System.out.println("------ASKHSH 2------");
        
        int N;
        boolean isProtos=true;
        do{
            System.out.println("Give me number for N: ");
            N = scannerUserInput.getInteger();
        }while (N>100||N<2);
        System.out.println("You chose : " + N );
        for (i=2;i<=N;i++){
            if (N%i==0 && N!=i)
                isProtos=false;
        }
        if (isProtos){
            System.out.println("Number N = " + N + " is first");
        }else{
            System.out.println("Number N = " + N + " is not first");
        }
        
    }
    
}
