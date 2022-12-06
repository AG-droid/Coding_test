//Authour - Anmol Goyal
// Date - 06.12.2022

package exFive;
import java.util.*;



class Football{

    Scanner sc = new Scanner(System.in);
    ArrayList<String> players = new ArrayList<String>();
    ArrayList<Integer> score = new ArrayList<Integer>();
    ArrayList<String> country = new ArrayList<String>();


    void home(){

        System.out.println("Welcome to women football data collection program!");
        System.out.println("Please follow the given instructions carefully to get the desired output.");
    }

    void calc(ArrayList<String> player, ArrayList<Integer> scores, ArrayList<String> country){

        int z,k,j,indx,sum;
        z = scores.get(0);
        k = scores.size() - 1;
        sum = 0;

        for(int i=0; i<k;i++){
            j = scores.get(i+1);
            if(z<j){
                z = j;
            };
        }

        for(int i=0;i<4;i++){
            sum = sum + scores.get(i);
        }

        indx = scores.indexOf(z);

        System.out.println("The highest scorer was "+player.get(indx));
        System.out.println("These players scored "+sum+" goals between them.");


    }

    void input(){


        for(int i=1;i<5;i++){

            System.out.println("Name footballer "+i+" ?");
            String name = sc.nextLine();
            System.out.println("How many goals did they score?");
            int scr = sc.nextInt();
            sc.nextLine();
            System.out.println("What country did they play for?");
            String cntry = sc.nextLine();


            players.add(name);
            score.add(scr);
            country.add(cntry);



        }

        calc(players,score,country);


    }

    void fnl(){
        System.out.println("The details of the player are:");

        for(int i=0;i<4;i++){
            System.out.println(players.get(i)+", "+country.get(i)+" ,"+score.get(i));
        }

    }





    void run(){

        home();
        input();
        fnl();


    }

}

class Run{

    public static void main(String args[]){

        Football f = new Football();
        f.run();
    }
}