/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg1;

/**
 *
 * @author jim-t
 */
public class EPANALIPTIKOERG1 {
    static int S = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,sum;
        sum = 0;
        num = (int) (Math.random()*10);
        System.out.println("O Arithmos einai : " + num);
        while ( num > 0 ){
            sum = staticMethods.addSUM(num,sum);
            num = (int) (Math.random()*S);
            System.out.println("O Arithmos einai : " + num);
        }
        System.out.println("To athrisma twn arithmwn einai : " + sum);
        int i;
        for (i=0;i<=5;i++){
            System.out.println("----------");
            if (i==2){
                System.out.println("Next excercise");
            }
        }
        System.out.println("Hello World");
    }
    
}
