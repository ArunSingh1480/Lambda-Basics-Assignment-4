package com.knoldus;

import java.util.Scanner;

public abstract class LongNumbers implements Production {
    public static void main(String[] args) {
        System.out.println("Enter Border Value");
        Scanner sc=new Scanner(System.in);
        long leftRange= sc.nextLong();
        long rightRange= sc.nextLong();
        getProductionvalue obj=new getProductionvalue();
        long productionNumber= obj.Range(leftRange,rightRange);
        System.out.println(productionNumber);
    }
}
