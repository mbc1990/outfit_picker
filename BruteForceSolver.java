/*
    Solves CSP with a boring brute force method
    might take a while
    who knows
*/

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

    protected Garment[] generateOutfit() {
        //System.out.println("Garment: "+wardrobe.getGarment(Constants.LEGS));
    //  latest attempt should be an array of bodyparts (however many that is)
        
        //assuming there are only 10 body parts (this should perhaps be in constants so we can add more body parts in the future)
        Garment[] attempt = new Garment[Constants.NUM_BODY_PARTS];
        int num_tries = 0;
        //will an outfit ever be found? Will this loop ever terminate? Who knows!
        while(true) {
            //generate a random outfit
            //bodypart constants happen to be 0...9
            for(int i = 0; i < 10; i++)
                attempt[i] = wardrobe.getGarment(i);
            
            //return the first randomlyg generated valid outfit
            if(Conflict.totalConflicts(attempt) <= this.confs_allowed) {
                System.out.println("generated an outfit after: "+num_tries+" attempts");
                return attempt;
            }
            
            num_tries++;
        }
    }
    
}
