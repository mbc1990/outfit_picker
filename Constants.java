public class Constants {

    /*************/
    /* CONSTANTS */
    /*************/

    /* COLORS */
    //blue
    //black
    //brown
    //red
    //pink
    //orange
    //yellow
    //white
    //tan
    //cream
    //grey
    //purple
    //green
    //gold
    //silver

    /* FABRIC */
    //silk
    //cotton
    //denim
    //leather
    //linen
    //wool
    //polyester
    //nylon

    /* PATTERN  */
    //contrasting (paisley, plaid, animal print, loud prints, flowers,
    //		   aztec-style prints, prints with greatly contrasting colors)
    //complimentary ( polka dots, stripes, subtle prints, very small prints, 
    //		      prints with similar colors, etc.)
    
    /* "FORMALNESS" */
    //exercise
    //very casual
    //casual
    //snappy
    //dressy
    //formal

    /* SKIN COVER */
    //long (long pants, long sleeves, long socks)
    //medium (capris, 3/4 length)
    //short (shorts, short sleaves)
    //very short (sleeveless)

    /* INNER/OUTERWEAR */
    //inner
    //outer
    
    /* BODY PART GARMENT GOES ON */
    //legs
    //feet
    //torso
    //waist
    //hands
    //neck
    //head
    //jewelery

    //number of attributes--so that we know how long to make our attribute arrays
    public final static int NUM_ATTRS = 40;
    public final static int ATTR_ARRAY_LEN = 41;

    //index in array indicating the domain of the garment
    public final static int BODY_PART = 0;

    //possible values for the BODY_PART index
    //	these values are not related to the attribute values
    public final static int LEGS = 0;
    public final static int FEET = 1;
    public final static int TORSO = 2;
    public final static int WAIST = 3;
    public final static int HANDS = 4;
    public final static int NECK = 5;
    public final static int HEAD = 6;
    public final static int JEWELRY = 7;

    /**************************/
    /******ARRAY INDICES*******/
    /**************************/
    /* COLORS */
    public final static int LIGHT_BLUE = 1;
    public final static int BLUE = 2;
    public final static int BLACK = 3;
    public final static int BROWN = 4;
    public final static int RED = 5;
    public final static int PINK = 6;
    public final static int ORANGE = 7;
    public final static int YELLOW = 8;
    public final static int WHITE = 9;
    public final static int TAN = 10;
    public final static int CREAM = 11;
    public final static int GREY = 12;
    public final static int PURPLE = 13;
    public final static int GREEN = 14;
    public final static int GOLD = 15;
    public final static int SILVER = 16;

    /* FABRIC */
    public final static int SILK = 17;
    public final static int COTTON = 18;
    public final static int DENIM = 19;
    public final static int LEATHER = 20;
    public final static int LINEN = 21;
    public final static int WOOL = 22;
    public final static int POLYESTER = 23;
    public final static int NYLON = 24;

    /* PATTERN  */
    //contrasting (paisley, plaid, animal print, loud prints, flowers,
    //		   aztec-style prints, prints with greatly contrasting colors)
    //complimentary ( polka dots, stripes, subtle prints, very small prints, 
    //		      prints with similar colors, etc.)
    public final static int CONTRASTING = 25;
    public final static int COMPLIMENTARY = 25;
    
    /* "FORMALNESS" */
    public final static int EXERCISE = 26;
    public final static int VERY_CASUAL = 27;
    public final static int CASUAL = 28;
    public final static int SNAPPY = 29;
    public final static int DRESSY = 30;
    public final static int FORMAL = 31;

    /* SKIN COVER */
    //long (long pants, long sleeves, long socks)
    //medium (capris, 3/4 length)
    //short (shorts, short sleaves)
    //very short (sleeveless)
    public final static int LONG = 32;
    public final static int MEDIUM = 33;
    public final static int SHORT = 34;
    public final static int VERY_SHORT = 35;

    /* UNDER/NORMAL/OUTERWEAR */
    public final static int UNDERWEAR = 36;
    public final static int NORMALWEAR = 37;
    public final static int OUTERWEAR = 38;

    /* VOLUME */
    public final static int TIGHT = 39;
    public final static int LOOSE = 40;
    public final static int VERY_LOOSE = 41;
}
