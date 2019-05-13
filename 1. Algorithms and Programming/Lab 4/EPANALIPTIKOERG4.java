/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epanaliptiko.erg4;

/**
 *
 * @author jim-t
 */
public class EPANALIPTIKOERG4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month;
        String Month;
        System.out.println("Give me an integer number between 1 and 12 for the month");
        month = scannerUserInput.getInteger();
        if (month == 1){
            Month = "January";
        }else{
            if (month == 2){
                Month = "February";
            }else{
                if (month == 3){
                Month = "March";
                }   else{
                    if (month == 4){
                        Month = "April";
                    }else{
                        if (month == 5){
                            Month = "May";
                        }else{
                            if (month == 6){
                                Month = "June";
                            }else{
                                if (month==7){
                                    Month= "July";
                                }else{
                                    if (month==8){
                                        Month ="August";
                                    }else{
                                        if (month == 9){
                                            Month = "September";
                                        }else{
                                            if (month == 10){
                                                Month = "October";
                                            }else{
                                                if (month == 11){
                                                    Month = "November";
                                                }else{
                                                    if (month == 12){
                                                        Month = "December";
                                                    }else
                                                        Month = "WRONG ANSWER";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    
        
        System.out.println(Month);
        System.out.println("--------ASKHSH 2--------");
        
        System.out.print("Give me an innegative Integer Number X: ");
        int x = scannerUserInput.getInteger();
        switch (x){
            case 0: System.out.println("X = 0");
            break;
            case 1: System.out.println("X is odd");
            break;
            case 2: System.out.println("X is even");
            break;
            case 3: System.out.println("X is odd");
            break;
            case 4: System.out.println("X is even");
            break;
            case 5: System.out.println("X is odd");
            break;
            default: System.out.println("X > 5");
            break;
            
        }
        
        System.out.println("----------ASKHSH3----------");
        
        
        int LOTS;
        double income,incomeSale,taxSale;
        System.out.println("How many LOTS do you own;");
        LOTS = scannerUserInput.getInteger();
        System.out.println("What's ur income;");
        income = scannerUserInput.getDouble();
        System.out.println("Give me income sale:");
        incomeSale = scannerUserInput.getDouble();
        System.out.println("Give me Tax Sale: ");
        taxSale = scannerUserInput.getDouble();
        System.out.println("LOTS : "+ LOTS + " INCOME : " + income + " SALE FROM INCOME : " + incomeSale + " SALE FROM TAX : " + taxSale);
        int taxFree = txFree(LOTS);
        double TaxedIncome = income - incomeSale - taxFree;
        System.out.println("Taxed income = "+ TaxedIncome);
        double taxPlus = 0.3* TaxedIncome;
        System.out.println("Tax with no sale = " + taxPlus);
        double tax = taxPlus - taxSale;
        System.out.println("Real Tax = "+ tax );
        
        
    }

    public static int txFree(int LOTS) {
        int RET;
        switch (LOTS){
            case 0:RET=12000;
            break;
            case 1:RET=10000;
            break;
            case 2:RET=8000;
            break;
            case 3:RET=5000;
            break;
            default:RET=0;
            break;
        }
        System.out.println("Tax Free = " + RET);
        return RET;
        
    }
}

