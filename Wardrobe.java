import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Wardrobe {
   

    //arraylist of garment for each body part (class with primative array of attributes and string with name)

    public Wardrobe(String f){
	File file = new File(f);
	Scanner console = null;
	try{
	    console = new Scanner(file);
	}
	catch(FileNotFoundException e){
	    System.err.println("Not a valid closet file");
	    System.exit(1);
	}
	while(console.hasNextLine()){
	    String garmentString = console.nextLine();
	    String[] input_attrs = garment.split("|");
	    String garmentName = "";
	    int[] output_attrs = new int[Constants.ATTR_ARRAY_LEN];
	    for(int i = 0; i<Constants.NUM_COLUMNS){
		switch(i){
		    case NAME_COLUMN:
			garmentName = attrs[i];
			break;
		    case GARMENT_COLUMN:
			break;
		    case COLOR_COLUMN:
			break;
		    case FABRIC_COLUMN:
			break;
		    case PATTERN_COLUMN:
			break;
		    case FORMALNESS_COLUMN:
			break;
		    case SKIN_COVER_COLUMN:
			break;
		}
	    }
	}

    }
    
    public Garment getGarment(int bodypart) {
        return null;    
    }
}
