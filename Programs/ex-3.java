//Authour - Anmol Goyal
// Date - 04.12.2022

package exThree;
import java.util.*;



class Body{

    int rate,lngth,age,num,num2;
    String test;

    Scanner sc = new Scanner(System.in);

    void home(){

        System.out.println("Welcome to the health age calculator !");

        System.out.println("Please state your first name below for the record.");

        String name = sc.nextLine();

        System.out.println("Hi "+name+"! please follow the given instructions carefully to get the desired output :) .");

        System.out.println("What is your age ?");
        age = sc.nextInt();
    }



    void heart(){

        System.out.println("What is your heart rate?");
        rate = sc.nextInt();



        if(rate > 70){
            num = 2;
        }else if(rate>=65){
            num = 1;
        }else if(rate >=62){
            num = -1;
        }else{
            num = -5;
        }




    }

    void stretch(){

        System.out.println("How far can you stretch(in cm)? (round of to the nearest value)");
        lngth = sc.nextInt();

        if(lngth>37){
            num2 = -3;

        }else if(lngth >= 33){
            num2 = 0;
        }else if(lngth>=20){

            num2 = 1;
        }else{

            num2 = 4;
        }


    }
    void calc(){

        age = age + num + num2;

        System.out.println("Your body's age is "+age);


    }




    void run(){
        home();
        heart();
        stretch();
        calc();
    }


}


class Run{

    public static void main(String args[]){

        Body b = new Body();
        b.run();
    }
}