package outfitPicker;

public interface AttributeConstants {

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
    final static int NUM_ATTRS = 37;
    final static int ATTR_ARRAY_LEN = 38;

    //index in array indicating the domain of the garment
    final static int BODY_PART = 1;

    //possible values for the BODY_PART index
    //	these values are not related to the attribute values
    final static int LEGS = 100;
    final static int FEET = 101;
    final static int TORSO = 102;
    final static int WAIST = 103;
    final static int HANDS = 104;
    final static int NECK = 105;
    final static int HEAD = 106;
    final static int JEWELRY = 107;

    /**************************/
    /******ARRAY INDICES*******/
    /**************************/
    /* COLORS */
    final static int BLUE = 2;
    final static int BLACK = 3;
    final static int BROWN = 4;
    final static int RED = 5;
    final static int PINK = 6;
    final static int ORANGE = 7;
    final static int YELLOW = 8;
    final static int WHITE = 9;
    final static int TAN = 10;
    final static int CREAM = 11;
    final static int GREY = 12;
    final static int PURPLE = 13;
    final static int GREEN = 14;
    final static int GOLD = 15;
    final static int SILVER = 16;

    /* FABRIC */
    final static int SILK = 17;
    final static int COTTON = 18;
    final static int DENIM = 19;
    final static int LEATHER = 20;
    final static int LINEN = 21;
    final static int WOOL = 22;
    final static int POLYESTER = 23;
    final static int NYLON = 24;

    /* PATTERN  */
    //contrasting (paisley, plaid, animal print, loud prints, flowers,
    //		   aztec-style prints, prints with greatly contrasting colors)
    //complimentary ( polka dots, stripes, subtle prints, very small prints, 
    //		      prints with similar colors, etc.)
    final static int CONTRASTING = 25;
    final static int COMPLIMENTARY = 25;
    
    /* "FORMALNESS" */
    final static int EXERCISE = 26;
    final static int VERY_CASUAL = 27;
    final static int CASUAL = 28;
    final static int SNAPPY = 29;
    final static int DRESSY = 30;
    final static int FORMAL = 31;

    /* SKIN COVER */
    //long (long pants, long sleeves, long socks)
    //medium (capris, 3/4 length)
    //short (shorts, short sleaves)
    //very short (sleeveless)
    final static int LONG = 32;
    final static int MEDIUM = 33;
    final static int SHORT = 34;
    final static int VERY_SHORT = 35;

    /* UNDER/NORMAL/OUTERWEAR */
    final static int UNDERWEAR = 36;
    final static int NORMALWEAR = 37;
    final static int OUTERWEAR = 38;
}
