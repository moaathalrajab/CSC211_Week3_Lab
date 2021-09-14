/*
 * Write an app that has a method with a String para and the method returns how many char there
 */
package com.mycompany.week3_lab;


public class Task1 {
    
    int lengthName(String str){
        return str.length();
    }
    
    public static void main(String[] args) {
        Task1 tsk= new Task1();
        int lnth= tsk.lengthName("Moaath Alrajab");
        System.out.println(" Length is "+ lnth);
    }
    
}
