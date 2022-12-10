//Authour - Anmol Goyal
// Date - 11.12.2022

package exSeven;
import java.util.*;


class ParaRelayTeam{

    Scanner sc = new Scanner(System.in);
    int points;
    String cntry;
    int ctgry;
    int sum;



}




 class Run extends ParaRelayTeam{

     void getCountry(String country){

         cntry = country;
     }

     void getPoints(int point){

         points = point;
     }

     void getCategory(int cat){
         ctgry = cat;
         sum = sum + ctgry;
     }


     void records(){

        System.out.println("What is the classification (maximum points) of the relay event ?");
        getPoints(sc.nextInt());
        sc.nextLine();
        System.out.println("What country is the team representing?");
        getCountry(sc.nextLine());
        for(int i=1;i<5;i++){
            System.out.println("What is the disability category of Swimmer "+i+" ?");
            getCategory(sc.nextInt());
        }

    }

    void check(){

         String verdict;
         if(sum>points){
             verdict = "illegal";
         }else{
             verdict="legal";
         }

         System.out.println("The "+ cntry+" team has "+sum+" points so is "+verdict);
    }


     void run(){
        records();
        check();

    }

     public static void main(String args[]){
         Run r = new Run();
         r.run();

     }
 }






