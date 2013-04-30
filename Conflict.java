
public class Conflict {

    private static int[][] conflict_matrix = ConflictMatrix.matrix;
    private static int num_attr = 6;

    //for testing purposes
    public static void main(String[] args) {
/*        System.out.println("hello conflicts");
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                conflict_matrix[i][j] = 0;
            }
        }
        
        //test attributes
        //0 = bodypart 
        //1 = blue
        //2 = black
        //3 = patterened
        //4 = fancy
        //5 = casual

        //blue conflicts with black
        conflict_matrix[1][2] = 1;

        //patterned conflicts with patterned
        conflict_matrix[3][3] = 1;

        //fancy conflicts with casual
        conflict_matrix[4][5] = 1;
        
        //some simulated garments
        //a black fancy patterned clothing
        int[] bfp = new int[6];
        bfp[1] = 0;
        bfp[2] = 1;
        bfp[3] = 1; 
        bfp[4] = 1;
        bfp[5] = 0;

        //blue patterned cloth
        int[] bp = new int[6];
        bp[1] = 1;
        bp[2] = 0;
        bp[3] = 1; 
        bp[4] = 0;
        bp[5] = 0;

        System.out.println(arrConflicts(bfp,bp) + " conflicts");
*/
    }

    //returns the number of conflicts between these two garments
    //this will pass the arrays from the garments to the arr conflicts method
    public int binaryConflicts(Garment g1, Garment g2) {
        return arrConflicts(g1.attrs, g2.attrs);
    }

    //returns the number of conflicts in the arrays
    public static int arrConflicts(int[] a1, int[] a2) {
        int num_conf = 0;
        for(int i = 1; i < Constants.ATTR_ARRAY_LEN; i++) {
            for(int j = i; j < Constants.ATTR_ARRAY_LEN; j++) {
                if(((a1[i] == 1 && a2[j] == 1) || (a1[j] ==1 && a2[i] ==1)) && conflict_matrix[i][j] == 1) {
                    num_conf++;
//                    System.out.println(i+" in ar1 conflicts with "+j+" in ar2");
                }
            }
        }
        return num_conf;
    }

    //returns the total number of conflicts in the outfit
    public static int totalConflicts(Garment[] outfit) {
        int total_confs = 0; 
        //for each piece of clothing in the outfit
        for(int i = 0; i < 10; i++) {
            //for each other piece of clothing in the outfit
            for(int j = 0; j < 10; j++) {
                //don't compare a piece of clothing to itself
                if(i != j) {
                    //number of conflicts between the two garments
                    total_confs += garmentConflicts(outfit[i],outfit[j]);
                }
            }
        }
        
        //like below, each outfit is being compared twice, so we want half this number
        return total_confs/2;
    }
    
    //returns the number of conflicts between two garments
    public static int garmentConflicts(Garment g1, Garment g2) {
        //if either garment is null, there are no conflicts
        if(g1 == null || g2 == null)
            return 0;

        int num_total_conflicts = 0;
        for(int i = 0; i < Constants.ATTR_ARRAY_LEN; i++) {
            for(int j = 0; j < Constants.ATTR_ARRAY_LEN; j++) {
                if(i != j && conflict_matrix[i][j] == 1)
                    num_total_conflicts++;
            }
        }
        System.out.println("Conflict matrix has "+num_total_conflicts+" conflicts");

        //but if both are there, see if they conflict
        int[] att1 = g1.attrs;
        int[] att2 = g2.attrs;
        int num_conf = 0;
        //for each attribute in clothing 1
        for(int i = 0; i < Constants.ATTR_ARRAY_LEN; i++) {
            //for each attribute in clothing 2
            for(int j = 0; j < Constants.ATTR_ARRAY_LEN; j++) {
                //if they both have these respective attributes
                if(att1[i] == 1 && att2[j] == 1) {
                    System.out.println("garment 1 has attribute: "+i+" garment 2 has attribute: "+j);
                    //if they in fact conflict
                    /*
                        little note here - we in fact only need HALF the conflict matrix. But making sure the attributes are correctly inserted is a pain, and so is inserting everything twice. So when the conflicts in the matrix are hard coded on (by Liz), we just code each conflict once, at either one of its two possible positions. Here both positions are checked for conflict, so it's okay that everything doesn't divide up perfectly on one side of the diagonal
                    */
                    if(conflict_matrix[i][j] == 1 || conflict_matrix[j][i] == 1) {
                        //increment conflicts
                        num_conf++;
                    }
                }
            }
        }
        //because each attribute was checked against each other attribute, there are exactly num_conf/2 conflicts
        return num_conf/2;
    }



}
