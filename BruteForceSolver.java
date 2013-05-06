/*
    Solves CSP with a boring brute force method
    might take a while
    who knows
*/

import java.util.*;

public class BruteForceSolver {
    
    private Wardrobe wardrobe;
    //number of allowable conflicts (default 0)
    private int confs_allowed = 0;

    public BruteForceSolver(Wardrobe w) {
        this.wardrobe = w;
    }

    public BruteForceSolver(Wardrobe w, int confs_allowed) {
        this.wardrobe = w;
        this.confs_allowed = confs_allowed;
    }

    protected Garment[] generateOutfit(int temperature) {
	//  latest attempt should be an array of bodyparts (however many that is)

	//if the temperature is cold, then we should have a sweater and gloves and hat and such
	boolean outfitIsKindaWarm = temperature <= 65 ;
	boolean outfitIsReallyWarm = temperature <= 30 ;

	//incorporate a vest into the outfit with some probability
	boolean outfitHasVest = false;
	if(outfitIsKindaWarm){
	    Random rand = new Random();
	    int r = rand.nextInt(100);
	    if(r < 33){
		outfitHasVest = true;
	    }
	}

        //assuming there are only 10 body parts (this should perhaps be in constants so we can add more body parts in the future)
        Garment[] attempt = new Garment[Constants.NUM_BODY_PARTS];
        int num_tries = 0;
        //will an outfit ever be found? Will this loop ever terminate? Who knows!
        while(true) {
	    if(num_tries % 50 == 0)
		System.out.println("Searching for an outfit...");

            //generate a random outfit
            for(int i = 0; i < Constants.NUM_BODY_PARTS; i++){
		//if we're picking a vest but we're not supposed to have a vest
		if(i == Constants.VEST && !outfitHasVest){
		    attempt[i] = null;		    
		    continue;
		}
		if((i == Constants.SWEATER && !outfitIsKindaWarm) || (i == Constants.SWEATER && outfitHasVest)){ //don't want to have a sweater AND a vest
		    attempt[i] = null;		    
		    continue;
		}
		if((i == Constants.HANDS || i == Constants.HEAD || i == Constants.NECK) && !outfitIsReallyWarm){
		    attempt[i] = null;
		    continue;
		}

		Garment g = wardrobe.getGarment(i);
		int attempts_to_find_garment = 0;
		while(!Wardrobe.isWeatherAppropriate(g, temperature) && attempts_to_find_garment < 50){
	//	    if(attempts_to_find_garment % 10 == 0)
	//		System.out.println("Searching for a weather appropriate garment...");
		    g = wardrobe.getGarment(i);
		    attempts_to_find_garment++;
		}
		attempt[i] = g;
	    }
            
            //return the first randomly generated valid outfit
            if(Conflict.totalConflicts(attempt) <= this.confs_allowed) {
                System.out.println("generated an outfit after: "+num_tries+" attempts");
                return attempt;
            }
            
            num_tries++;
        }
    }
    
}
