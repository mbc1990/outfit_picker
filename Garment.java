import java.util.*;

public class Garment {
    //name of garment 
    protected String name;
    public boolean isEmpty;


    //list of attributes that define the garment
    public int[] attrs = new int[Constants.ATTR_ARRAY_LEN];

    public Garment(String name, int[] attrs) {
        this.name = name;
        this.attrs = attrs;
	isEmpty = false;
    }

    //This creates and 'empty' garment for AC3
    public Garment(){
	name = "";
	attrs = new int[Constants.ATTR_ARRAY_LEN];
	isEmpty = true;
    }

    public String toString() {
        return this.name;
    }

    public void debugInfo() {
        System.out.println("Name: "+this.toString());
        System.out.println();
        for(int i = 0; i < Constants.ATTR_ARRAY_LEN; i++) {
            System.out.print(i+" : "+this.attrs[i]+" ");
        }
    }
}
