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

    private boolean removedInconsistent() {
        //removed = false
        //for each x_u (garment) in D_u
            //if NO x_v in D_v is conflict-free
                //delete x_u from D_u
                //removed = true
        //return removed
        return true;
    }

}
