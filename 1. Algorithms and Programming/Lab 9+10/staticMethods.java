/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg9;

/**
 *
 * @author jim-t
 */
public class staticMethods {
    static int trexonAM;

    static void findMaxSalary(Employee E1, Employee E2) {
        if (E1.getTelikosMisthos() > E2.getTelikosMisthos()){
            System.out.println("Max Salary Guy : " + E1.toString());
        }else{
            System.out.println("Max Salary Guy : " + E2.toString());
        }
    }



    static void setTelikosMisthosAll(Employee[] E) {
        int i;
        for (i=0;i<=4;i++){
            E[i].setTelikosMisthos();
        }
    }

    static int findMaxSalaryAll(Employee[] E) {
        double max;
        int maxp;
        max = E[0].getTelikosMisthos();
        maxp = 0;
        int i;
        for (i=1;i<=4;i++){
            if (E[i].getTelikosMisthos() > max){
                max = E[i].getTelikosMisthos();
                maxp = i;
            }
        }
        return maxp;
    }
    
    
}
