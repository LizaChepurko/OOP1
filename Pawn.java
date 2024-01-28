import java.util.Comparator;
import java.util.LinkedList;

public class Pawn extends ConcretePiece {

    private String D;
    private String A;
    private static int countD = 1;
    private static int countA = 1;

    private  LinkedList<ConcretePiece> kills ;

    private ConcretePlayer player = new ConcretePlayer(getColor());

    /**
     * Constructs a Pawn with the specified Position and ConcretePlayer.
     *
     * This constructor initializes a Pawn object with the provided Position and ConcretePlayer.
     * It extends the ConcretePiece class and includes additional attributes specific to a Pawn,
     * such as a list to track kills and a generated string representation.
     *
     * @param p The initial Position of the Pawn on the game board.
     * @param player The ConcretePlayer associated with the Pawn.
     *
     * Note:
     *   - The 'generateString' method is called during construction to generate a string representation.
     */

    public Pawn(Position p, ConcretePlayer player) {
        super(p, player);
        this.kills = new LinkedList<>();
        generateString();
    }

    /**
     * The method collects eaten tools for each piece on the board
     * @param piece
     */
     public void kill(ConcretePiece piece){
        kills.add(piece);
    }

    /**
     * Gets the string representation of the Pawn based on its player color.
     *
     * This method returns the string representation of the Pawn, which includes a prefix
     * ("D" for Player One and "A" for Player Two) followed by a unique identifier.
     *
     * @return The string representation of the Pawn.
     *
     */

    public String getPieceString(){
        if(player.isPlayerOne()){
            return D;
        }else{
            return A;
        }
    }

    /**
     * Resets the static counters used for generating unique string identifiers.
     *
     * This method resets the static counters used to generate unique string identifiers
     * for Pawns associated with Player One ("D") and Player Two ("A").
     */

    public static void resetStrings(){
        countA = 1;
        countD = 1;
    }

    /**
     * Generates a unique string identifier for the Pawn based on its player color.
     *
     * This method generates a unique string identifier for the Pawn, which includes a prefix
     * ("D" for Player One and "A" for Player Two) followed by an incremented counter.
     * The counters are static and reset when the 'resetStrings' method is called.
     *
     * Note:
     *   - This method is called during Pawn construction to set initial string representations.
     *   - The counters ensure that each Pawn of the same player color gets a unique identifier.
     */

    private void generateString(){
        if(getColor()){
            this.D = "D" + countD;
            this.countD++;
        }else{
            this.A = "A"+countA;
            this.countA++;
        }
    }

    /**
     * Gets the index value derived from the unique string identifier of the Pawn.
     *
     * This method extracts the numerical index value from the unique string identifier
     * of the Pawn. The string identifier is generated based on the player color and a
     * counter that ensures uniqueness among Pawns of the same color.
     *
     * @return The numerical index value extracted from the string identifier.
     */

    public int getIndex(){
        int n = 0;
        if(getPieceString().length() == 2) {
            n = Integer.valueOf(getPieceString().substring(1));

        }
        if(getPieceString().length() == 3) {
            n =  Integer.valueOf(getPieceString().substring(1,3));


        }
        return n;
    }

    /**
     * @return ArrayList<ConcretePiece>.size
     */
      public int getkills(){
        return kills.size();
      }

    /**
     * This function used for the squares printing only
     * It sets the king's strinf for a pown
     */
    public void setStringStatistics(String s){
            this.D = s;
    }

    @Override
    public Player getOwner() {
       return player;
    }


    @Override
    public String getType() {
    if(getColor()){
        return "♙";
    }else {
        return "♟";
    }
    }

}
