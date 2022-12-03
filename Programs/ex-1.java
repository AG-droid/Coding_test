//Authour - Anmol Goyal
// Date - 05.11.2022

package exrOne;

class Initials{
    String letter;


    void A(){

        letter = "A";
        int num_spc = 6;
        int spc_btwn;
        int s = 0;
        int j = 1;

        for(int i=1; i<=6;i++){

            String spc = " ";
            int k;
            if(i==4){
                 k = i+3;
                 spc_btwn=0;

            }else{
                k = 1;
                spc_btwn=s;
            }

            String ltr = spc.repeat(num_spc)+letter.repeat(k)+ spc.repeat(spc_btwn)+letter;
            System.out.println(ltr);
            num_spc= num_spc-1;
            s+=2;
            j+=1;


        } }


        void N(){
        System.out.println(" ");

            String ltr = "N";
            String spc = " ";
            int j = 7;
            int k =0;

            for(int i=0;i<=7;i++){

                System.out.println(ltr+spc.repeat(k)+ltr+spc.repeat(j)+ltr);
                j--;
                k++;
            }


        }


        void M(){
        System.out.println(" ");

        String ltr = "M";
        String spc = " ";

        int j = 5;
        int k = 5;
        int f = 0;
        int n=1;

        for(int i=0;i<=5;i++){

            System.out.println(ltr+spc.repeat(f)+ltr.repeat(n)+spc.repeat(j)+spc.repeat(j)+ltr.repeat(n)+spc.repeat(i)+ltr);

            f++;
            j--;


        }
        }

        void O(){
        System.out.println(" ");
        String ltr = "O";
        String spc = " ";
        int j;
        int k;
        for(int i=1;i<=7;i++){
            if(i==1 || i==7){

                j = 0;
                k=13;


            }else{
                j=12;
                k=1;
            }

            System.out.println(ltr.repeat(k)+spc.repeat(j)+ltr);
        }
        }

        void L(){

        System.out.println(" ");

            String ltr= "L";
            int j;
            for(int i=0;i<=7;i++){
                if(i==7){
                    j=12;
                }else{
                    j=1;
                }

                System.out.println(ltr.repeat(j));
            }
            }






    void run(){

        this.A();
        this.N();
        this.M();
        this.O();
        this.L();
    }
}


class Run{

    public static void main(String args[]){
        Initials i = new Initials();
        i.run();
    }
}

