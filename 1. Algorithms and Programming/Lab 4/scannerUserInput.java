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
import java.util.Scanner;
public class scannerUserInput {

    static int getInteger(){
    Scanner ob = new Scanner(System.in);
      try{
	int i = ob.nextInt();
        return i;
      }
      catch(Exception e){
	return -1;
      }
}
    
    static byte getByte(){
    Scanner ob = new Scanner(System.in);
      try{
	byte b = ob.nextByte();
        return b;
      }
      catch(Exception e){
	return -1;
      }
}
    static short getShort(){
    Scanner ob = new Scanner(System.in);
      try{
	short s = ob.nextShort();
        return s;
      }
      catch(Exception e){
	return -1;
      }
}
    static long getLongInteger(){
    Scanner ob = new Scanner(System.in);
      try{
	long l = ob.nextLong();
        return l;
      }
      catch(Exception e){
	return -1;
      }
}
    static float getFloat(){
    Scanner ob = new Scanner(System.in);
      try{
	float f = ob.nextFloat();
        return f;
      }
      catch(Exception e){
	return -1;
      }
}
    static double getDouble(){
    Scanner ob = new Scanner(System.in);
      try{
	double d = ob.nextDouble();
        return d;
      }
      catch(Exception e){
	return -1;
      }
}
    static String getString(){
    Scanner ob = new Scanner(System.in);
      try{
	String s = ob.nextLine();
        return s;
      }
      catch(Exception e){
	return "";
      }
}
    
    static char getChar(){
    Scanner ob = new Scanner(System.in);
      try{
	char ch = ob.next().charAt(0);
        return ch;
      }
      catch(Exception e){
	return ' ';
      }
}    
    
} 

