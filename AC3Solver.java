import java.util.*;
/*
    Picks a garment using the AC3 algorithm

    The "hipster" of constraint satisfaction algorithms
*/
public class AC3Solver {
    
    private Wardrobe wardrobe;

    public AC3Solver( Wardrobe w ) {
        wardrobe = w;
    }
    
    

    public Garment[] generateOutfit(int temperature) {
        //This is the list of domains and their members
        //so domains.get(Constants.LEGS) is a list of all garments that haven't been removed yet that go on the legs
        ArrayList<ArrayList<Garment>> domains = new ArrayList<ArrayList<Garment>>();       

        //initialize domain arrays
        for(int i = 0; i < Constants.NUM_BODY_PARTS; i++)
            domains.add(new ArrayList<Garment>());

        //fill them with COPIES of the garments from the wardrobe
        for(Garment each : wardrobe.garments) {
            Garment clone = new Garment(each.name, each.attrs);
            //add garment clone to proper domain arraylist
            domains.get(clone.attrs[Constants.BODY_PART]).add(clone); 
        }

	//put <empty> garments in appropriate domains based on temperature
	/////Empty garments are created with an empty constructor and can be
	//identified by checking garment.IsEmpty which is a public field.
	Garment emptyGarment = new Garment();
	if(temperature > 65){
	    //must have a sweater or vest if it's cold enough
	    Random rand = new Random();
	    int r = rand.nextInt();
	    if(r < .33){
		domains.get(Constants.VEST).add(emptyGarment);
	    }
	    else{
		domains.get(Constants.SWEATER).add(emptyGarment);
	    }
	}
	if(temperature > 30){
	    //it's really cold, must have hat, gloves and scarf
		domains.get(Constants.HEAD).add(emptyGarment);
		domains.get(Constants.NECK).add(emptyGarment);
		domains.get(Constants.HANDS).add(emptyGarment);
	}
        
        //initialize queue (add all arcs to the queue)
        //everything's connected!
        ArrayList<int[]> queue = new ArrayList<int[]>(); 
        for(int i = 0; i < Constants.NUM_BODY_PARTS; i++) {
            for(int j = 0; j < Constants.NUM_BODY_PARTS; j++) {
                if(i != j) {
                    int[] arc = new int[2];
                    arc[0] = i;
                    arc[1] = j;
                    queue.add(arc);
                }
            }
        }

        //AC-3
        while(queue.size() != 0) {
            //pop the front of the queue
            int[] front = queue.remove(0); 
            //get the domains for the arc and remove inconsistent values
            if(removedInconsistent(front,domains.get(front[0]),domains.get(front[1]))) {
                //inconsistent values were removed, so we need to put things back in the queue
                for(int i = 0; i < Constants.NUM_BODY_PARTS; i++) {
                    int[] qmember = new int[2];
                    qmember[0] = i;
                    qmember[1] = front[0];
                    if(front[0] != i && !queue.contains(qmember)) {
                        //arc isn't already in the queue
                        queue.add(qmember);
                    }
                }
            }
        }

	for(ArrayList<Garment> each : domains) {
	    if(each.size() == 0) { //no valid assignment!!
		return null;
	    }
	}

        //list of values x_u for each domain (body part) D_u
        
        //queue of (bodypart,bodypart) arcs (starts with an ordered pair for each body part for each other body part)

        //while the queue is not empty
            //(u,v) front = queue.remove(0) (arraylist as queue)
            //if removedInconsistent(front, D_u, D_v)
                //for each body part that's not u
                    //if (w,u) is not already in the queue (it might have been removed)
                        //add it to the end of the queue

        //MAKE AN ASSIGNMENT FROM THE NARROWED DOWN DOMAINS    
	Garment[] generatedOutfit = new Garment[domains.size()];
	if(!recOutfit(generatedOutfit, domains, 0)) {
	    generatedOutfit=null;
	}

        return generatedOutfit;
    }

    private boolean recOutfit(Garment[] generatedOutfit, ArrayList<ArrayList<Garment>> domains, int i) {
	if(i == domains.size()) { //we're done here
	    return true;
	}
	Random r = new Random();
	boolean done = false;
	while(!done) {
	    if(domains.get(i).size() == 0) { //no valid assignment!!
		return false;
	    }
	    generatedOutfit[i] = domains.get(i).remove(r.nextInt(domains.get(i).size()));
	    if(Conflict.totalConflicts(generatedOutfit) == 0) {
		done = recOutfit(generatedOutfit, domains, i+1);
	    }
	}
	return true;
    }
    
    //returns true if it removed inconsistent values
    private boolean removedInconsistent(int[] arc, ArrayList<Garment> d_u, ArrayList<Garment> d_v) {
        boolean removed = false;
        ArrayList<Garment> ducopy = new ArrayList<Garment>(d_u);
        for(Garment each : ducopy) {
            //gets set to true if at least 1 garment in domain D_v doesn't conflict
            boolean no_conflicts = false;
            for(Garment every : d_v) {
                if(Conflict.garmentConflicts(each, every) == 0) {
                    no_conflicts = true;
                }
            }
            //if d_v is empty, also no conflicts
            if(d_v.size() == 0)
                no_conflicts = true;
            if(no_conflicts == false) {
               
                d_u.remove(each);
                System.out.println("removing "+each.toString());
                removed = true;
            }
        }
        return removed;
        //removed = false
        //for each x_u (garment) in D_u
            //if NO x_v in D_v is conflict-free
                //delete x_u from D_u
                //removed = true
        //return removed
    }

}
