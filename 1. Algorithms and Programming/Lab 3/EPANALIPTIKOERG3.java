/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg3;

/**
 *
 * @author jim-t
 */
public class EPANALIPTIKOERG3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = scannerUserInput.getInteger();
        String A= "A";
        int b = scannerUserInput.getInteger();
        String B= "B";
        int c = scannerUserInput.getInteger();
        String C= "C";
        if (a>b){
            if (b>c){
                show(a,b,c,A,B,C);
            }else{
                if (a>c){
                show (a,c,b,A,C,B);
                }else{
                    show (c,a,b,C,A,B);
                }
            }
        }else{
            if (a>c){
                show(b,a,c,B,A,C);
            }else{
                if ( c > b ){
                    show(c,b,a,C,B,A);
                }else{
                    show(b,c,a,B,C,A);
                }
            }
        }
        
        if (a > b && b > c){
            show(a,b,c,A,B,C);
        }else{
            if ( a > c && c > b ){
                show(a,c,b,A,C,B);
            }else{
                if (b > c && c > a){
                    show(b,c,a,B,C,A);
                }else{
                    if (b > a && a > c ){
                        show(b,a,c,B,A,C);
                    }else
                        if (c > a && a > b){
                            show(c,a,b,C,A,B);
                        }else{
                            show(c,b,a,C,B,A);
                        }
                }
            }
        }
        
       
        
        System.out.println("-----------Askisi 3-----------");
        System.out.println("Give me age : ");
        int Age= scannerUserInput.getInteger();
        if (Age > 18){
            System.out.println("Give me Height in cm");
            int Height= scannerUserInput.getInteger();
            System.out.println("Give me Weight in kg");
            int Weight= scannerUserInput.getInteger();
            double DMS;
            double H = ((double)Height)/100;
            DMS = ((double)Weight)/(H*H);
            System.out.println("Mass/Muscle inticator :" + DMS);
            String Answer;
            if (DMS>=30){
                Answer = "Overweight person";
            }else{
                if (DMS >= 25){
                    Answer = "Thicc person";
                }else{
                    if (DMS >= 18.5){
                        Answer = "Normal person";
                    }else{
                        Answer = "Weightless person";
                    }
                }
            }
            System.out.println(Answer);
        }else{
            System.out.println("Invalid Age proceed");
        }
    }

    private static void show(int a, int b, int c, String A, String B, String C) {
        System.out.println("Oi arithmoi einai oi eksis : " + A + " = " + a + " | " + B + " = " + b + " | " + C + " = " + c);
    }
    
}
