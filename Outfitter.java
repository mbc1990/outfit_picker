
import java.util.Scanner;

public class Outfitter {
    //array of garments 

    public static void main(String[] args) {
        //load input wardrobe file
        if(args.length < 1) {
            System.out.println("Usage: >java Outfitter wardrobe");
            System.exit(1);
        }
        Wardrobe w = new Wardrobe(args[0]);
        boolean done = false;
        Scanner s = new Scanner(System.in);

        //get input from user
        while(!done) {
            printOptions();
            int o;
            try {
                o = s.nextInt();
            } catch(Exception e) {
                System.out.println("That is not a valid option! Please try again.");
                continue;
            }
            switch(o) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("You picked the brute force method");

                    //run the bruteforce method
                    BruteForceSolver bf = new BruteForceSolver(w);
                    Garment[] outfit = bf.generateOutfit();
                    if (outfit == null) {
                        System.out.println("You have no matching outfits available! Try doing a load of laundry, or take a day off and go shopping!");
                    } else {
                        System.out.println("We have chosen the following outfit for you:");
                        for(Garment g : outfit) {
                            System.out.println(g.toString());
                        }
                    }
                   
                    

                    break;
               /*     ISolver s = new ISolver;
                    Garment[] outfit = ISolver.getOutfit();
                    if (outfit == null) {
                        System.out.println("You have no matching outfits available! Try doing a load of laundry, or take a day off and go shopping!");
                    } else {
                        System.out.println("We have chosen the following outfit for you:");
                        for(Garment g : outfit) {
                            System.out.println(g.toString());
                        }
                    }
                    done = true;
                    */
                default:
                    System.out.println(""+o+"is not a valid option! Please try again.");
            }
        }


    }

    public static void printOptions() {
        System.out.println("0 - exit \n 1 - Generate an outfit via brute force.");
        System.out.print("Please enter a number: ");
    }

}
