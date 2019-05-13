/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg5;

/**
 *
 * @author jim-t
 */
public class EPANALIPTIKOERG5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        do{
            System.out.println("Gimme number bútch : ");
            num = scannerUserInput.getInteger();
            if ( num > 5 || num < 2)
                System.out.println("Wrong Number bútch");
        }while ( num > 5 || num < 2);
        System.out.println("Η 1-η δύναμη του αριθμού είναι: " + num);
        
        double num2 = 0;
        int i= 2;
        num2 = (double) Math.pow(num, i);
        while (num2<=1000){
            System.out.println("Η "+i+"-η δύναμη του αριθμού είναι: " + num2);
            i = i + 1;
            num2 = (int) Math.pow(num, i);
            
        }
        
        
        
        System.out.println("Askisi 2");
        int space,totalSpace,observers,classes;
        totalSpace=0;
        classes = 0;
        observers = 0;
        while (totalSpace<100){
            System.out.println("Give me class' space");
            space = scannerUserInput.getInteger();
            totalSpace = totalSpace + space;
            if (space < 16){
                System.out.println("This class needs 1 observer");
                observers = observers + 1;
            }else{
                if ( space < 24 ){
                    System.out.println("This class needs 2 observers");
                    observers = observers + 2;
                }else{
                    observers = observers + 3;
                    System.out.println("This class needs 3 observers");
                }
                    
            }
            
            if (totalSpace <= 100){
                System.out.println("There are "+ (100-totalSpace) + " people remaining");
                
            }
            classes = classes + 1;
            
        }
        
        System.out.println("We need : "+ classes + " classes " + observers + " observers and " + totalSpace + " total space.");
            
    }
    
}
