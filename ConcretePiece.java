import java.util.*;

public abstract class ConcretePiece implements Piece{
    private Position position;
    private ConcretePlayer player;
    private ArrayList<Position> steps;
    private int distance;

    /**
     * Constructs a ConcretePiece object with the specified position and player.
     *
     * This constructor initializes a ConcretePiece with the given position and player.
     * initializes an empty set of steps and sets the distance traveled to 0.
     *
     * Notes:
     *   - The 'isBlue' property is set based on the color of the associated player.
     */

    public ConcretePiece(Position p,ConcretePlayer player){
        this.position = p;
        this.player = player;
        this.steps = new ArrayList<>();
        this.distance = 0;

    }


    /**
     * The method collects steps for each piece on the board
     * @param position
     */
    public void addStep(Position position){
        steps.add(position);
    }

    /**
     * The method computes distance for each piece on the board
     * @param a
     * @param b
     */
    public void computedistance(Position a, Position b){
        if(a.getX() == b.getX()){
            this.distance += Math.abs(b.getY() - a.getY());
        }else if(a.getY() == b.getY()){
            this.distance += Math.abs(b.getX() - a.getX());
        }
    }

    /**
     * returns the distance
     */

    public int getDistance(){
        return this.distance;
    }

    /**
     * This function used for the squares printing only
     * It used to set the distance of the king
     */
    public void setDistance(int distance){
        this.distance = distance;
    }

    /**
     * @return ArrayList<Position>
     */
    public ArrayList<Position> getSteps(){
        return steps;
    }

    /**
     * This function used for the steps printing only
     * It used to set the steps of the king
     */
    public void setSteps(ArrayList<Position> s){
        this.steps = s;
    }

    /**
     * @return ArrayList<Position>.size
     */
    public int getNumOfSteps(){
        return steps.size();
    }


    /**
     * Retrieves the color of the piece.
     *
     * This method returns a boolean value representing the color of the piece.
     * If the associated player is Player One, it returns 'true' (indicating blue color),
     * otherwise, it returns 'false' (indicating red color).
     *
     * @return 'true' if the piece color is blue (Player One), 'false' if the color is red.
     */
    public boolean getColor(){
        if(player.isPlayerOne()){
            return true;
        }else{
            return false;
        }
    }


}
