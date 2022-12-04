//Authour - Anmol Goyal
// Date - 03.12.2022

package exTwo;

import java.util.*;


import java.util.Scanner;

class Loan{


    float amt, paid, fnl_amt;


    Scanner sc = new Scanner(System.in);


    void home(){

        System.out.println("Welcome to HSBC loan calculation systems !");

        System.out.println("Please enter your name below: ");
        String name = sc.nextLine();

        System.out.println("Hi "+name+"! , Please follow the given instructions carefully to get the desired output.");

    }

    void ask(){

        System.out.println("Amount of loan at the start of the year?");
        amt = sc.nextFloat();

    }

    void paid(){

        System.out.println("Amount paid off this year?");

        paid = sc.nextFloat();

    }

    void  calc(){

        fnl_amt = (amt-paid);
        if(fnl_amt<0){
            fnl_amt = 0;
        }
        final float intrst = fnl_amt*7/100;
        fnl_amt = (fnl_amt + intrst)*10;

        fnl_amt = ((int)fnl_amt)/10;

        System.out.println("The new amount owed is (in pounds) : "+fnl_amt);

    }


    void run(){
        home();
        ask();
        paid();
        calc();
    }
}

class Run{

    public static void main(String args[]){

        Loan L = new Loan();
        L.run();
    }
}