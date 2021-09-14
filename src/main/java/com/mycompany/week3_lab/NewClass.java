package com.mycompany.week3_lab;
public class NewClass { 
    private int checkStr(String b){
        a=5; b=7;
        return a+b;
    }
    public static void main(String[] args) {
        NewClass nc= new NewClass();
        Integer x1=10, x2=20;
       
        System.out.println("The value of x1 and x2 are "
                + x1 + " , "+ x2); 
        int x= nc.getSum(x1,x2);
        System.out.println("The value after call of x1 and x2 are "
                + x1 + " , "+ x2); 
    }
}
