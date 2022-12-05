
//Authour - Anmol Goyal
// Date - 05.12.2022
package exFour;

import java.util.*;



class StatInform{

    String name;

    Scanner sc = new Scanner(System.in);

    void home(){

        System.out.println("Welcome to Station information systems !");
        System.out.println("Please follow the given instructions carefully to get the desired output.");

    }

    void info(String stat){

        Map<String, ArrayList<Object>> stations = new HashMap<String,ArrayList<Object>>();
        stations.put("oxford circus",new ArrayList<Object>());
        stations.get("oxford circus").add(200);
        stations.get("oxford circus").add(true);

        stations.put("stepney green",new ArrayList<Object>());
        stations.get("stepney green").add(100);
        stations.get("stepney green").add(false);

        stations.put("westminster abbey",new ArrayList<Object>());
        stations.get("westminster abbey").add(50);
        stations.get("westminster abbey").add(true);

        stations.put("piccadily circus",new ArrayList<Object>());
        stations.get("piccadily circus").add(300);
        stations.get("piccadily circus").add(true);

        stations.put("kensington",new ArrayList<Object>());
        stations.get("kensington").add(10);
        stations.get("kensington").add(false);

        stations.put("northern",new ArrayList<Object>());
        stations.get("northern").add(500);
        stations.get("northern").add(false);

        stations.put("bakerloo",new ArrayList<Object>());
        stations.get("bakerloo").add(70);
        stations.get("bakerloo").add(false);

        stations.put("central",new ArrayList<Object>());
        stations.get("central").add(600);
        stations.get("central").add(false);

        stations.put("kings cross",new ArrayList<Object>());
        stations.get("kings cross").add(700);
        stations.get("kings cross").add(false);



        if(stations.containsKey(stat)){
            String check;

            int dstnc = (int)stations.get(stat).get(0);
            boolean stp = (boolean)stations.get(stat).get(1);

            if(stp){
                 check = "";
            }else{
                 check = " not";
            }

            System.out.println(stat+" does"+check+" have step free access.");
            System.out.println("It is "+dstnc+"m from entrance to platform");

        }else{

            System.out.println(stat+" is not a London underground station.");
        }


    }

    void input(){

        System.out.println("What station do you want to know about? ");
        name = sc.nextLine();
        name = name.toLowerCase();
        info(name);
    }

    void count(){

        System.out.println("How many stations do you need to know about ?");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=num;i>0;i--){

            input();
        }




    }



    void run(){
        home();
        count();

    }
}

class Run{

    public static void main(String args[]){

        StatInform si = new StatInform();
        si.run();
    }
}