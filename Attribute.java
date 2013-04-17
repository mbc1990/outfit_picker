package outfitPicker;
import java.util.*;

public class Attribute{
    String attr_name;
    ArrayList<String> attr_values;

    public ArrayList<String> getAttrs(String attr){
	return attr_values;
    }

    public void setAttr(String attr){
	attr_values.add(attr);
    }
}
