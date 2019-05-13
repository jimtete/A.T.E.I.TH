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
public class EPANALIPTIKOERG9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee E1 = new Employee(1000,14013,1000,6,1);
        staticMethods.trexonAM = E1.getAM();
        Employee E2 = new Employee();
        System.out.println("Give me employees' Bussiness code");
        int KEX = scannerUserInput.getInteger();
        E2.setKE(KEX);
        int AMX = staticMethods.trexonAM+1;
        E2.setAM(AMX);
        System.out.println("Give me Salaries");
        double SAL = scannerUserInput.getDouble();
        E2.setSALARY(SAL);
        System.out.println("Give me extra working hours for both employees");
        int OYX = scannerUserInput.getInteger();
        E2.setOY(OYX);
        System.out.println("Give me Degree Level");
        int DEGREEX = scannerUserInput.getInteger();
        E2.setDEGREE(DEGREEX);
        System.out.println(E1.toString());
        System.out.println(E2.toString());
        E1.setTelikosMisthos();
        E2.setTelikosMisthos();
        System.out.println("Second Employee's total salary is : " + E1.getTelikosMisthos() + " EURO!");
        System.out.println("Second Employee's total salary is : " + E2.getTelikosMisthos() + " EURO!");
        staticMethods.findMaxSalary(E1,E2);
        int i;
        Employee E[] = new Employee[5];
        for (i=0;i<=4;i++){
            E[i] = new Employee();
            E[i].setKE(KEX);
            //System.out.print("Give me AM : ");
            AMX = staticMethods.trexonAM + 1;
            E[i].setAM(AMX);
            System.out.println();
            System.out.print("Give me Salary : ");
            SAL = scannerUserInput.getDouble();
            E[i].setSALARY(SAL);
            System.out.println();
            System.out.print("Give me extra working hours : ");
            OYX = scannerUserInput.getInteger();
            E[i].setOY(OYX);
            System.out.println();
            System.out.print("Give me degree level : ");
            DEGREEX = scannerUserInput.getInteger();
            E[i].setDEGREE(DEGREEX);
            System.out.println();
            System.out.println(E[i].toString());
        }
        staticMethods.setTelikosMisthosAll(E);
        
        int MaxSAll = staticMethods.findMaxSalaryAll(E);
        System.out.println(E[MaxSAll].toString());
        
    }

    /*private static void ShowTelikosMisthos(Employee E1) {
        double ExtraSalary1,ExtraSalary2;
        switch (E1.DEGREE){
            case 1: ExtraSalary1=300;
            break;
            case 2: ExtraSalary1=150;
            break;
            case 3: ExtraSalary1=100;
            break;
            case 4: ExtraSalary1=50;
            break;
            default: ExtraSalary1=0;
            break;
        }
        ExtraSalary2 = E1.OY*20;
        double SALARY=E1.SALARY+ExtraSalary1+ExtraSalary2;
        System.out.println("First Employee's total salary is : " + SALARY + " EURO!");
        
    }

    private static double returnTelikosMisthos(Employee E2) {
        double ExtraSalary1,ExtraSalary2;
        switch (E2.DEGREE){
            case 1: ExtraSalary1=300;
            break;
            case 2: ExtraSalary1=150;
            break;
            case 3: ExtraSalary1=100;
            break;
            case 4: ExtraSalary1=50;
            break;
            default: ExtraSalary1=0;
            break;
        }
        ExtraSalary2 = E2.OY*20;
        double SALARY=E2.SALARY+ExtraSalary1+ExtraSalary2;
        return SALARY;
    }*/
    
}
