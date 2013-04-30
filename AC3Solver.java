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
    
    

    public Garment[] generateOutfit() {
        //This is the list of domains and their members
        //so domains.get(Constants.LEGS) is a list of all garments that haven't been removed yet that go on the legs
        ArrayList<ArrayList<Garment>> domains = new ArrayList<ArrayList<Garment>>();

        //initialize domain arrays
        for(int i = 0; i < 10; i++)
            domains.add(new ArrayList<Garment>());

        //fill them with COPIES of the garments from the wardrobe
        for(Garment each : wardrobe.garments) {
            Garment clone = new Garment(each.name, each.attrs);
            //add garment clone to proper domain arraylist
            domains.get(clone.attrs[Constants.BODY_PART]).add(clone); 
        }
        
        //testing - success
/*        for(int i = 0; i < 10; i++) {
            System.out.println("items in domain: "+i);
            ArrayList<Garment> darr = domains.get(i);
            for(Garment each : darr) {
                System.out.println(each.toString());
            }
        }
*/
        //initialize queue (add all arcs to the queue)
        //everything's connected!
        ArrayList<int[]> queue = new ArrayList<int[]>(); 
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(i != j) {
                    int[] arc = new int[2];
                    arc[0] = i;
                    arc[1] = j;
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
                for(int i = 0; i < 10; i++) {
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
        System.out.println("-------------------------------");   
        for(int i = 0; i < 10; i++) {
            System.out.println("items in domain: "+i);
            ArrayList<Garment> darr = domains.get(i);
            for(Garment each : darr) {
                System.out.println(each.toString());
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

        return null;
    }
    
    //returns true if it removed inconsistent values
    private boolean removedInconsistent(int[] arc, ArrayList<Garment> d_u, ArrayList<Garment> d_v) {
        boolean removed = false;
        for(Garment each : d_u) {
            //gets set to true if at least 1 garment in domain D_v doesn't conflict
            boolean no_conflicts = false;
            for(Garment every : d_v) {
                if(Conflict.garmentConflicts(each, every) == 0) {
                    no_conflicts = true;
                }
            }
            if(no_conflicts == true) {
                d_u.remove(each);
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
