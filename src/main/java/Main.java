import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);

    LampToggler lamp1 = new LampToggler("Lampe 1", false);
    LampToggler lamp2 = new LampToggler("Lampe 2", false);
    LampToggler lamp3 = new LampToggler("Lampe 3", false);
    LampToggler lamp4 = new LampToggler("Lampe 4", false);
    LampToggler lamp5 = new LampToggler("Lampe 5", false);

    public void lamps(){
        System.out.println(lamp1.toString());
        System.out.println(lamp2.toString());
        System.out.println(lamp3.toString());
        System.out.println(lamp4.toString());
        System.out.println(lamp5.toString());
    }
    
    public void firstMenu(){

        lamps();

        boolean ts = false;
        int aendre = 0;

        while (aendre != 6){
            try {
                System.out.println("Hvilken lampe vil du tændte/slukke? AFSLUT 6");
                aendre = scan.nextInt();
                if (aendre == 1){
                    lamp1.switchTs();
                    lamps();
                } else if (aendre == 2) {
                    lamp2.switchTs();
                    lamps();
                } else if (aendre == 3) {
                    lamp3.switchTs();
                    lamps();
                } else if (aendre == 4) {
                    lamp4.switchTs();
                    lamps();
                } else if (aendre == 5) {
                    lamp5.switchTs();
                    lamps();
                } else if (aendre == 6) {
                    System.out.println("du har valgt at afslutte programmet");
                    System.exit(0);
                } else {
                    System.out.println("du skal en lampe 1-5, prøv igen");
                }
            } catch (Exception e){
                System.out.println("du skal vælge et tal, prøv igen");
                scan.nextLine();
            }

        }



    }

    public void start(){
        System.out.println("Velkommen til programmet");
        firstMenu();
    }

    public static void main(String[] args){
        Main program = new Main();
        program.start();
    }
}
