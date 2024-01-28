import java.util.*;

public class Position {
    private int x;
    private int y;

    private Set<ConcretePiece> pieces;

    /**
     * Constructs a Position object with specified coordinates.
     *
     * This constructor initializes a Position object with the given x and y coordinates.
     *
     * @param x The x-coordinate of the position.
     * @param y The y-coordinate of the position.
     *
     */
    public Position(int x, int y){
        this.y = y;
        this.x = x;
        this.pieces = new HashSet<>();
    }
    /**
     * Returns a string representation of the Position object.
     *
     * This method generates and returns a string representing the coordinates of the position
     * in the format "(x, y)".
     *
     */

    public String toString(){
        return "("+x+", "+y+")";
    }

    /**
     * The method adds a piece
     * @param piece
     */
    public void addPiece(ConcretePiece piece){
            pieces.add(piece);
    }


    public int numOfPieces(){
        return pieces.size();
    }


    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
