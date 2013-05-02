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

    //number of attributes--so that we know how long to make our attribute arrays
    public final static int NUM_ATTRS = 46;
    public final static int ATTR_ARRAY_LEN = 47;

    //index in array indicating the domain of the garment
    public final static int BODY_PART = 0;

    public final static int NUM_BODY_PARTS = 8;

    //possible values for the BODY_PART index
    //	these values are not related to the attribute values
    public final static int LEGS = 0;
    public final static int FEET = 1;
    public final static int TORSO = 2;
    public final static int SWEATER = 3;
    public final static int VEST = 4; //for vests
    public final static int HANDS = 5;
    public final static int NECK = 6;
    public final static int HEAD = 7;

    /**************************/
    /******ARRAY INDICES*******/
    /**************************/
    /* COLORS */
    public final static int NUM_COLORS = 18;
    public final static int FIRST_COLOR = 1;
    public final static int LAST_COLOR = 18;

    public final static int NAVY_BLUE = 1;
    public final static int BLUE = 2;
    public final static int TEAL = 3;
    public final static int BLACK = 4;
    public final static int BROWN = 5;
    public final static int RED = 6;
    public final static int PINK = 7;
    public final static int ORANGE = 8;
    public final static int YELLOW = 9;
    public final static int WHITE = 10;
    public final static int TAN = 11;
    public final static int CREAM = 12;
    public final static int GREY = 13;
    public final static int PURPLE = 14;
    public final static int MAROON = 15;
    public final static int GREEN = 16;
    public final static int GOLD = 17;
    public final static int SILVER = 18;

    /* FABRIC */
    public final static int SILK = 19;
    public final static int COTTON = 20;
    public final static int DENIM = 21;
    public final static int LEATHER = 22;
    public final static int LINEN = 23;
    public final static int WOOL = 24;
    public final static int POLYESTER = 25;
    public final static int NYLON = 26;

    /* PATTERN  */
    //contrasting (paisley, plaid, animal print, loud prints, flowers,
    //		   aztec-style prints, prints with greatly contrasting colors)
    //complimentary ( polka dots, stripes, subtle prints, very small prints, 
    //		      prints with similar colors, etc.)
    public final static int CONTRASTING = 27;
    public final static int COMPLIMENTARY = 28;
    public final static int SOLID = 29;
    
    /* "FORMALNESS" */
    public final static int EXERCISE = 30;
    public final static int VERY_CASUAL = 31;
    public final static int CASUAL = 32;
    public final static int SNAPPY = 33;
    public final static int DRESSY = 34;
    public final static int FORMAL = 35;

    /* SKIN COVER */
    //long (long pants, long sleeves, long socks)
    //medium (capris, 3/4 length)
    //short (shorts, short sleaves)
    //very short (sleeveless)
    public final static int LONG = 36;
    public final static int MEDIUM = 37;
    public final static int SHORT = 38;
    public final static int VERY_SHORT = 39;

    /* UNDER/NORMAL/OUTERWEAR */
    public final static int UNDERWEAR = 40;
    public final static int NORMALWEAR = 41;
    public final static int OUTERWEAR = 42;

    /* VOLUME */
    public final static int TIGHT = 43;
    public final static int NORMAL = 44;
    public final static int LOOSE = 45;
    public final static int VERY_LOOSE = 46;

    /*****************************/
    /**CONSTANTS FOR FILE PARSING*/
    /*****************************/
    public final static int NUM_COLUMNS = 8;

    public final static int NAME_COLUMN = 0;
    public final static int GARMENT_COLUMN = 1;
    public final static int COLOR_COLUMN = 2;
    public final static int FABRIC_COLUMN = 3;
    public final static int PATTERN_COLUMN = 4;
    public final static int FORMALNESS_COLUMN = 5;
    public final static int SKIN_COVER_COLUMN = 6;
    public final static int VOLUME_COLUMN = 7;
}
