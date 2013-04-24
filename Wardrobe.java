import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Wardrobe {
   

    //arraylist of garment for each body part (class with primative array of attributes and string with name)

    public Wardrobe(String f){
	File file = new File(f);
	try{
	Scanner console = new Scanner(file);
	}
	catch(FileNotFoundException e){
	    System.err.println("Not a valid closet file");
	    exit(1);
	}
	while(console.hasNextLine()){

	}

    }
    
    public Garment getGarment(int bodypart) {
        return null;    
    }
}
