
import java.util.Scanner;

public class Outfitter {
    //array of garments 

    public static void main(String[] args) {
        //load input wardrobe file
        if(args.length < 2) {
            System.out.println("Usage: >java Outfitter wardrobe temperature (in degrees)");
            System.exit(1);
        }
	int temperature = Integer.parseInt(args[1]);
	if(temperature > 100 || temperature < 0){
	    System.out.println("Please enter a temperature between 0 and 100 degrees");
	    System.exit(1);
	}
        Wardrobe w = new Wardrobe(args[0]);
        boolean done = false;
        Scanner s = new Scanner(System.in);

        //construct the conflict matrix
        ConflictMatrix.constructMatrix();

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
                    Garment[] outfit = bf.generateOutfit(temperature);
                    if (outfit == null) {
                        System.out.println("You have no matching outfits available! Try doing a load of laundry, or take a day off and go shopping!");
                    } else {
                        System.out.println("We have chosen the following outfit for you:");
                        //for every body part
                        for(int i = 0; i < Constants.NUM_BODY_PARTS; i++) {
                            if( outfit[i] == null) {
                                //System.out.println("nothing at all");
                            } else {
                                System.out.println(outfit[i].toString());
                            }
                        }
                       /* for(Garment g : outfit) {
                            System.out.println(g.toString());
                        } */
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
                case 2:
                    System.out.println("Generating an outfit using AC-3");
                    AC3Solver solver = new AC3Solver(w);
                    outfit = solver.generateOutfit();
       
		    System.out.println("We have chosen the following outfit for you:");
		    //for every body part
		    for(int i = 0; i < Constants.NUM_BODY_PARTS; i++) {
			if( outfit[i] == null) {
			    System.out.println("nothing at all");
			} else {
			    System.out.println(outfit[i].toString());
			}
		    }
       

                    break;
                default:
                    System.out.println(""+o+" is not a valid option! Please try again.");
            }
        }


    }

    public static void printOptions() {
        System.out.println("0 - Exit. \n1 - Generate an outfit via brute force. \n2 - Generate an outfit via AC-3.");
        System.out.print("Please enter a number: ");
    }

}
