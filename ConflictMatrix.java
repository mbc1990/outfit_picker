public class ConflictMatrix {
    
    public static int[][] matrix = new int[Constants.ATTR_ARRAY_LEN][Constants.ATTR_ARRAY_LEN];

    //called once in main when program is run
    //assigns values that correspond to rules
    static void constructMatrix() {
        matrix[Constants.BLUE][Constants.BLACK] = 1;
	matrix[Constants.BLACK][Constants.BROWN] = 1;
	matrix[Constants.YELLOW][Constants.BROWN] = 1;
	matrix[Constants.PINK][Constants.PURPLE] = 1;
	matrix[Constants.GOLD][Constants.SILVER] = 1;
	matrix[Constants.CONTRASTING][Constants.CONTRASTING] = 1;
	matrix[Constants.VERY_LOOSE][Constants.VERY_LOOSE] = 1;
	matrix[Constants.TIGHT][Constants.TIGHT] = 1;
	matrix[Constants.SILK][Constants.WOOL] = 1;
	matrix[Constants.LINEN][Constants.WOOL] = 1;
	matrix[Constants.POLYESTER][Constants.WOOL] = 1;
	matrix[Constants.LEATHER][Constants.POLYESTER] = 1;
	matrix[Constants.EXERCISE][Constants.CASUAL] = 1;
	matrix[Constants.EXERCISE][Constants.SNAPPY] = 1;
	matrix[Constants.EXERCISE][Constants.DRESSY] = 1;
	matrix[Constants.EXERCISE][Constants.FORMAL] = 1;
	matrix[Constants.VERY_CASUAL][Constants.FORMAL] = 1;
	matrix[Constants.CASUAL][Constants.FORMAL] = 1;
	matrix[Constants.SNAPPY][Constants.FORMAL] = 1;
	matrix[Constants.VERY_CASUAL][Constants.DRESSY] = 1;
    }

}
