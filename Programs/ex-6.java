//Authour - Anmol Goyal
// Date - 06.12.2022

package exSix;
import java.util.*;
import java.util.Scanner;


class Bus{

    Scanner sc = new Scanner(System.in);
    int sum, count;

    void home(){

        System.out.println("Welcome to the passenger calculation system!");
        System.out.println("Please follow the given instructions carefully to get the desired output.");

    }

    void otpt(){

        System.out.println("There were a total of "+sum+" passengers on "+count+" buses.");
    }

    void input(){

        boolean i = true;
        String inpt;
         sum = 0;
         count = 0;

        while(i){

            System.out.println("How many passengers were on the bus?");
            inpt = sc.nextLine();
            try{
                sum = sum + Integer.parseInt(inpt);
                i = true;
                count = count+1;
            }
            catch (NumberFormatException e){
                inpt = inpt.toLowerCase();
                if(inpt.equals("x")){

                    i = false;
                }


            }


        }
        otpt();


    }

    void run(){
        home();
        input();

    }
}

class Run{

    public static void main(String args[]){

        Bus b = new Bus();
        b.run();
    }
}