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
public class Employee {


    private static int KE;
    private int AM;
    private double SALARY;
    private int OY;
    private int DEGREE;
    private double TSALARY;

    Employee(int ke,int am,double salary,int oy,int degree) {
        KE = ke;
        AM = am;
        SALARY = salary;
        OY = oy;
        DEGREE = degree;
    }

    Employee() {
        KE = this.KE;
        AM = this.AM;
        SALARY = this.SALARY;
        OY = this.OY;
        DEGREE = this.DEGREE;
        TSALARY = this.TSALARY;
    }
    
    
    
    
    public void setTelikosMisthos() {
        double ExtraSalary1,ExtraSalary2;
        switch (this.DEGREE){
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
        ExtraSalary2 = this.OY*20;
        this.TSALARY=this.SALARY+ExtraSalary1+ExtraSalary2;
    }    

    public double getTelikosMisthos() {
        return this.TSALARY;
    }
    
    @Override
    public String toString(){
        return this.KE + " " + this.AM + " " + this.SALARY + " " + this.OY + " " + this.DEGREE + " TELIKOS : " + this.TSALARY; 
    }

    void setKE(int KEX) {
        Employee.KE = KEX;
    }

    void setAM(int AMX) {
        this.AM=AMX;
    }

    void setSALARY(double SAL) {
        this.SALARY = SAL;
    }

    void setOY(int OYX) {
        this.OY = OYX;
    }

    void setDEGREE(int DEGREEX) {
        this.DEGREE = DEGREEX;
    }

    int getKE() {
        return this.KE;
    }

    int getAM() {
        return this.AM;
    }

    double getSALARY() {
        return this.SALARY;
    }

    int getOY() {
        return this.OY;
    }

    int getDEGREE() {
        return this.DEGREE;
    }
    
    
}
