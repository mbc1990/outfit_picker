import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
public class Wardrobe {

    ArrayList<Garment> garments;

    //arraylist of garment for each body part (class with primative array of attributes and string with name)

    public Wardrobe(String f){
        garments = new ArrayList<Garment>();
        File file = new File(f);
        Scanner console = null;
        try{
            console = new Scanner(file);
        }
        catch(FileNotFoundException e){
            System.err.println("Not a valid closet file");
            System.exit(1);
        }
        int line_number = 0;

        /* Reading in a wardrobe file, line by line */
        while(console.hasNextLine()){
            line_number++;

            String garmentString = console.nextLine();
            String[] input_attrs = garmentString.split("\\|");

            String garmentName = "";
            int[] output_attrs = new int[Constants.ATTR_ARRAY_LEN];


            //Loop through each attribute on the line
            for(int i = 0; i<Constants.NUM_COLUMNS; i++){
                String cur_attr = input_attrs[i];
               // System.out.println("cur_attr is: "+cur_attr);
                switch(i){
                    case Constants.NAME_COLUMN:
                        garmentName = input_attrs[i];
                        break;
                    case Constants.GARMENT_COLUMN:
                        if(cur_attr.compareTo("pants") == 0 ){
                            output_attrs[Constants.BODY_PART] = Constants.LEGS;
                            break;
                        }
                        else if(cur_attr.compareTo("shorts") == 0){
                            output_attrs[Constants.BODY_PART] = Constants.LEGS;
                            break;
                        }
                        else if(cur_attr.compareTo("skirt") == 0){
                            output_attrs[Constants.BODY_PART] = Constants.LEGS;
                            break;
                        }
                        else if(cur_attr.compareTo("shirt") == 0){
                            output_attrs[Constants.BODY_PART] = Constants.TORSO;
                            break;
                        }
                        else if(cur_attr.compareTo("vest") == 0){
                            output_attrs[Constants.BODY_PART] = Constants.CHEST;
                            break;
                        }
                        else if(cur_attr.compareTo("scarf") == 0 ){
                            output_attrs[Constants.BODY_PART] = Constants.NECK;
                            break;
                        }
                        else if(cur_attr.compareTo("jewelry") == 0 ){
                            output_attrs[Constants.BODY_PART] = Constants.JEWELRY;
                            break;
                        }
                        else if(cur_attr.compareTo("socks") == 0) {
                            output_attrs[Constants.BODY_PART] = Constants.FEET;
                            break;
                        }
                        else if(cur_attr.compareTo("shoes") == 0) {
                            output_attrs[Constants.BODY_PART] = Constants.FEET;
                            break;
                        }
                        else if(cur_attr.compareTo("gloves") == 0){ 
                            output_attrs[Constants.BODY_PART] = Constants.HANDS;
                            break;
                        }
                        else if(cur_attr.compareTo("hat") == 0 ){
                            output_attrs[Constants.BODY_PART] = Constants.HEAD;
                            break;
                        }
                        else{
                            System.err.println("Malformed wardrobe file at line "+line_number+
                                    ", in the GARMENT column.");
                            System.exit(1);
                        }
                        break;
                    case Constants.COLOR_COLUMN:
                        String[] colors = cur_attr.split("\n");
                        for(int j = 0; j<colors.length; j++){
                            String color = colors[j];
                            if(color.compareTo("blue") == 0 ){
                                output_attrs[Constants.BLUE] = 1;
                                break;
                            }
                            else if(color.compareTo("black") == 0){
                                output_attrs[Constants.BLACK] = 1;
                                break;
                            }
                            else if(color.compareTo("brown") == 0){
                                output_attrs[Constants.BROWN] = 1;
                                break;
                            }
                            else if(color.compareTo("red") == 0 ){
                                output_attrs[Constants.RED] = 1;
                                break;
                            }
                            else if(color.compareTo("pink") == 0 ){
                                output_attrs[Constants.PINK] = 1;
                                break;
                            }
                            else if(color.compareTo("orange") == 0) {
                                output_attrs[Constants.ORANGE] = 1;
                                break;
                            }
                            else if(color.compareTo("yellow") == 0){ 
                                output_attrs[Constants.YELLOW] = 1;
                                break;
                            }
                            else if(color.compareTo("white") == 0 ){
                                output_attrs[Constants.WHITE] = 1;
                                break;
                            }
                            else if(color.compareTo("tan") == 0 ){
                                output_attrs[Constants.TAN] = 1;
                                break;
                            }
                            else if(color.compareTo("cream") == 0) {
                                output_attrs[Constants.CREAM] = 1;
                                break;
                            }
                            else if(color.compareTo("grey") == 0){ 
                                output_attrs[Constants.GREY] = 1;
                                break;
                            }
                            else if(color.compareTo("purple") == 0){ 
                                output_attrs[Constants.PURPLE] = 1;
                                break;
                            }
                            else if(color.compareTo("green") == 0){ 
                                output_attrs[Constants.GREEN] = 1;
                                break;
                            }
                            else if(color.compareTo("gold") == 0){ 
                                output_attrs[Constants.GOLD] = 1;
                                break;
                            }
                            else if(color.compareTo("silver") == 0){ 
                                output_attrs[Constants.SILVER] = 1;
                                break;
                            }
                            else{
                                System.err.println("Malformed wardrobe file at line "+line_number+
                                        ", in the COLOR column.");
                                System.exit(1);
                            }
                        }
                        break;
                    case Constants.FABRIC_COLUMN:
                        if(cur_attr.compareTo("silk") == 0 ){
                            output_attrs[Constants.SILK] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("cotton") == 0){
                            output_attrs[Constants.COTTON] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("denim") == 0){
                            output_attrs[Constants.DENIM] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("leather") == 0 ){
                            output_attrs[Constants.LEATHER] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("linen") == 0 ){
                            output_attrs[Constants.LINEN] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("wool") == 0) {
                            output_attrs[Constants.WOOL] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("polyester") == 0){ 
                            output_attrs[Constants.POLYESTER] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("nylon") == 0 ){
                            output_attrs[Constants.NYLON] = 1;
                            break;
                        }
                        else{
                            System.err.println("Malformed wardrobe file at line "+line_number+
                                    ", in the FABRIC column.");
                            System.exit(1);
                        }
                        break;
                    case Constants.PATTERN_COLUMN:
                        if(cur_attr.compareTo("solid") == 0){ 
                            output_attrs[Constants.SOLID] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("contrasting") == 0){ 
                            output_attrs[Constants.CONTRASTING] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("complementary") == 0 ){
                            output_attrs[Constants.COMPLIMENTARY] = 1;
                            break;
                        }
                        else{
                            System.err.println("Malformed wardrobe file at line "+line_number+
                                    ", in the PATTERN column.");
                            System.exit(1);
                        }
                        break;
                    case Constants.FORMALNESS_COLUMN:
                        if(cur_attr.compareTo("exercise") == 0){ 
                            output_attrs[Constants.EXERCISE] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("very casual") == 0){ 
                            output_attrs[Constants.VERY_CASUAL] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("casual") == 0 ){
                            output_attrs[Constants.CASUAL] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("snappy") == 0 ){
                            output_attrs[Constants.SNAPPY] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("dressy") == 0 ){
                            output_attrs[Constants.DRESSY] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("formal") == 0 ){
                            output_attrs[Constants.FORMAL] = 1;
                            break;
                        }
                        else{
                            System.err.println("Malformed wardrobe file at line "+line_number+
                                    ", in the FORMALNESS column.");
                            System.exit(1);
                        }
                        break;
                    case Constants.SKIN_COVER_COLUMN:
                        if(cur_attr.compareTo("long") == 0){ 
                            output_attrs[Constants.LONG] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("medium") == 0){ 
                            output_attrs[Constants.MEDIUM] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("short") == 0 ){
                            output_attrs[Constants.SHORT] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("very short") == 0 ){
                            output_attrs[Constants.VERY_SHORT] = 1;
                            break;
                        }
                        else{
                            System.err.println("Malformed wardrobe file at line "+line_number+
                                    ", in the SKIN COVER column.");
                            System.exit(1);
                        }
                        break;
                    case Constants.VOLUME_COLUMN:
                        if(cur_attr.compareTo("tight") == 0){ 
                            output_attrs[Constants.TIGHT] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("normal") == 0){ 
                            output_attrs[Constants.NORMAL] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("loose") == 0 ){
                            output_attrs[Constants.LOOSE] = 1;
                            break;
                        }
                        else if(cur_attr.compareTo("very loose") == 0 ){
                            output_attrs[Constants.VERY_LOOSE] = 1;
                            break;
                        }
                        else{
                            System.err.println("Malformed wardrobe file at line "+line_number+
                                    ", in the VOLUME column.");
                            System.exit(1);
                        }
                        break;
                }
            }
            Garment g = new Garment(garmentName, output_attrs);
            //add garment to wardrobe
            garments.add(g);
           // g.debugInfo();
        }
    }
    
    //returns a random garment for a specific bodypart
    public Garment getGarment(int bodypart) {
        //get all the garments for this bodypart
        List<Garment> bp = new ArrayList<Garment>();
        for(Garment each : garments) {
            if(each.attrs[Constants.BODY_PART] == bodypart)
                bp.add(each);
        }
        Random rand = new Random();
        int r = rand.nextInt(bp.size());
        return bp.get(r);
        
  //      return null;
    }
}
