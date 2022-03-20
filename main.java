package OOP2.BeyBlade;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        // Beyblade Program using Polymorphism

        System.out.println("----Welcome to the Beyblade Program----\n");
        System.out.println("Press 0 to exit");

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Which Beyblade do you want to produce? : ");
            String işlem = scanner.nextLine();
            if(işlem.equals("0")){
                System.out.println("Exiting the program");
                break;
            }
            else{
                BeyBladeFabrikasi fabrika = new BeyBladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(işlem);
                if(beyblade == null){
                    System.out.println("Please enter a valid Beyblade...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldır();
                    beyblade.kutsalCanavarOrtayaCıkar();
                }
            }
        }
    }
}
