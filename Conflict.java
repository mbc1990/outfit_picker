
public class Conflict {

    private static int[][] conflict_matrix = new int[6][6];
    private static int num_attr = 6;

    //for testing purposes
    public static void main(String[] args) {
        System.out.println("hello conflicts");
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

    }

    //returns the number of conflicts between these two garments
    //this will pass the arrays from the garments to the arr conflicts method
    public int binaryConflicts(Garment g1, Garment g2) {
        return 1;
    }

    //returns the number of conflicts in the arrays
    public static int arrConflicts(int[] a1, int[] a2) {
        int num_conf = 0;
        for(int i = 1; i < num_attr; i++) {
            for(int j = i; j < num_attr; j++) {
                if(((a1[i] == 1 && a2[j] == 1) || (a1[j] ==1 && a2[i] ==1)) && conflict_matrix[i][j] == 1) {
                    num_conf++;
                    System.out.println(i+" in ar1 conflicts with "+j+" in ar2");
                }
            }
        }
        return num_conf;
    }

    //returns the total number of conflicts in the outfit
    public int totalConflicts(Garment[] outfit) {
        return 0;
    }
}
