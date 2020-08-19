/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package height_inch_program;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class replace_word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);      
 String string1=sc.next();
 String string2=sc.next();
 int len1=string1.length();
 int len2=string2.length(); 
 String last1=string2.substring(len2-2,len2);
 String last2=string2.substring(len1-2, len1);
 
 String first1=string2.substring(0, 2);
 String first2=string1.substring(0, 2);
 
 String result1=last1+string1.substring(2,len1-2)+first1;
 String result2=last1+string2.substring(2,len1-2)+first1; 
 
 System.out.println(result1);
 System.out.println(result2);
 }
    
        }
    
    

