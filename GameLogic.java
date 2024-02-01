import java.util.*;

public class GameLogic implements PlayableLogic{
    private ArrayList<Pawn> pa = new ArrayList<>();
    private ArrayList<Pawn> pd = new ArrayList<>();
    private King king;
    private ArrayList<Position> positions = new ArrayList<>();
    private ConcretePiece[][] Board = new ConcretePiece[11][11];
    private boolean isGameStarted = false;
    private boolean isPlayer1 = false;
    private final ConcretePlayer player1=new ConcretePlayer(true);
    private final ConcretePlayer player2= new ConcretePlayer(false);
    private ConcretePlayer player = new ConcretePlayer(isPlayer1);
    private boolean isPlayer1won = false;
    private boolean isPlayer2won = false;
    private boolean _isGameIsFinished;

    /**
     * Sets up the initial state of the game by populating the board with pieces.
     *
     * This method initializes the board with pawns and a king for both players
     * following the standard setup of the game. Blue pieces and the king are placed
     * at the middle, and red pieces are placed at the sides.
     * Each piece is associated with a Position on the board.
     *
     * This method also collects data for pieces and positions.
     *
     * @param board The 2D array representing the board with ConcretePiece objects.
     */
    private void setGame(Piece[][] board){
        // Reset the string representation of the Pawn class
        Pawn.resetStrings();
        for(int j= 0; j< Board.length; j++){
            for(int i = 0; i< Board[0].length; i++){
                if (i == 0 && (j>2 && j<8)) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if (i == 1 && j == 5) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);

                }
                if (i == 10 && (j>2 && j<8)) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if (i == 9 && j == 5) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 10 && i == 3){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 0 && i == 3){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 10 && i == 4){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    position.addPiece(p);
                    p.addStep(position);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 0 && i == 4){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    position.addPiece(p);
                    p.addStep(position);
                    positions.add(position);
                    pa.add(p);
                }
                if((j>8) && i == 5){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    position.addPiece(p);
                    p.addStep(position);
                    positions.add(position);
                    pa.add(p);
                }
                if((j<2) && i == 5){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 10 && i == 6){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 0 && i == 6){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    position.addPiece(p);
                    p.addStep(position);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 10 && i == 7){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                if(j == 0 && i == 7){
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(false));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pa.add(p);
                }
                // Set the blue pieces
                if (i == 5 && j == 3) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(true));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pd.add(p);
                }
                if (j == 4 && (i>3 && i<7)) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(true));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pd.add(p);
                }
                if (j == 5 && (i>2 && i<8)) {
                    if(i == 5 && j == 5){
                        Position position = new Position(5,5);
                        Pawn p = new Pawn(position, new ConcretePlayer(true));
                        King k = new King(position, new ConcretePlayer(true));
                        this.king = k;
                        Board[i][j] = k;
                        k.addStep(position);
                        position.addPiece(k);
                        positions.add(position);
                    }
                    else {
                        Position position = new Position(i, j);
                        Pawn p = new Pawn(position, new ConcretePlayer(true));
                        Board[j][i] = p;
                        p.addStep(position);
                        position.addPiece(p);
                        positions.add(position);
                        pd.add(p);
                    }
                }
                if (j == 6 && (i>3 && i<7)) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(true));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pd.add(p);
                }
                if (i == 5 && j == 7) {
                    Position position = new Position(i,j);
                    Pawn p = new Pawn(position, new ConcretePlayer(true));
                    Board[j][i] = p;
                    p.addStep(position);
                    position.addPiece(p);
                    positions.add(position);
                    pd.add(p);
                }
            }
        }
        this.isGameStarted = true;
    }

    /**
     * Updates the board by moving a piece from the specified starting position (a)
     * to the target position (b). This method handles the movement of a piece, updating
     * its position and collecting data for pieces and positions.
     *
     * @param board The 2D array representing the board with ConcretePiece objects.
     *
     * @param a     The starting Position of the piece to be moved.
     * @param b     The target Position to move the piece to.
     *
     * Special Conditions might affect the board after move:
     *    - isKingOnSide(): Checks if the king is on the side of the board.
     *    - isEatenCorners(): Checks if any corners are occupied by pieces.
     *    - isEatenTrapped(): Checks if any pieces are trapped after the move.
     */
    private void updateBoard(ConcretePiece[][] board, Position a ,Position b){
        // Flag to track if the target position already contains a piece
        boolean flag = false;
        // Loop through the board to find the piece that moved
        for(int j= 0; j< Board.length; j++){
            for(int i = 0; i< Board[0].length; i++) {
                if(a.getX() == i && a.getY() == j){
                    // Move the piece to the target position b - copy the object to a new position on the board
                    Board[b.getY()][b.getX()] =  Board[j][i];
                    // Update the Position object for the moved piece in the positions list
                    for(int k = 0; k< positions.size(); k++){
                        if(positions.get(k).toString().equals(b.toString())) {
                            positions.get(k).addPiece(Board[b.getY()][b.getX()]);
                            flag = true;
                        }
                    }
                    // If the target position is not in the positions list, add it
                    if(flag == false){
                        positions.add(b);
                        b.addPiece(Board[b.getY()][b.getX()]);
                    }
                    // Compute distance (in object's class), add step, and remove the piece from the original position
                            Board[b.getY()][b.getX()].computedistance(a, b);
                            Board[b.getY()][b.getX()].addStep(b);
                            Board[j][i] = null;
                }
            }
        }
        // Check for special conditions after the move
        isKingOnSIde();
        isEatenCorners(b);
        isEatenTrapped(b);
    }

    @Override
/**
 * This method checks if player's piece can move from one position to another on the board.
 *
 * This method allows a player to move their piece from position a to position b, following
 * the rules of straight-line movement. The piece can move either horizontally or vertically,
 * but not diagonally.
 * The path between positions a and b must be clear of obstacles.
 *
 * @param a The starting Position of the piece to be moved.
 * @param b The target Position to move the piece to.
 * @return True if the move is valid and executed successfully, false otherwise.
 *
 * Notes:
 *   - The method checks if the piece at position a belongs to the current player.
 *   - The piece can move either horizontally or vertically, but not diagonally.
 *   - The path between positions a and b must be clear of obstacles.
 *   - Pawns cannot move to corner positions (0,0), (0,10), (10,0), (10,10).
 *   - King can move to corner positions (0,0), (0,10), (10,0), (10,10).
 *   - The 'updateBoard' method is called if the move is valid, updating the chess board accordingly.
 *
 * Special Conditions:
 *   - isPlayerOne(): Checks if the current player is Player One.
 *   - getPieceAtPosition(): Returns the piece at a given position on the board.
 *   - checkOnPath(): Checks if the path between two positions is clear of obstacles.
 *   - updateBoard(): Updates the chess board after a successful move.
 *   - isPlayer1: Tracks the turn of the players.
 *   - player: Represents the current player making the move.
 */
    public boolean move(Position a, Position b) {
        // Boolean to truck if player want to move on Y axis
        boolean isY;
        // Spacial condition for king - can move to the corners.
        if(this.getPieceAtPosition(a).getType() != "♚") {
            if ((b.getX() == 0 && b.getY() == 0) || (b.getX() == 10 && b.getY() == 0) || (b.getX() == 0 && b.getY() == 10) || (b.getX() == 10 && b.getY() == 10)) {
                return false;
            }
        }
        // Check if the piece at position a belongs to the current player
        if(Board[a.getY()][a.getX()] != null && (Board[a.getY()][a.getX()].getOwner().isPlayerOne() == player.isPlayerOne()) ) {
            // Check if the move is straight (either horizontally or vertically)
            if (b.getX() == a.getX() && this.getPieceAtPosition(b) == null) {
                // Move vertically
                isY = false;
                // Execute the move if the path is clear
                if (checkOnPath(a, b, isY)) {
                    updateBoard(Board, a, b);
                    // Toggles the player turn.
                    if (isPlayer1) {
                        this.isPlayer1 = false;
                        this.player = new ConcretePlayer(false);
                    } else {
                        this.isPlayer1 = true;
                        this.player = new ConcretePlayer(true);
                    }
                    return true;
                }
            }
            // Move horizontally
            if (b.getY() == a.getY() && this.getPieceAtPosition(b) == null) {
                isY = true;
                // Execute the move if the path is clear
                if (checkOnPath(a, b, isY)) {
                    updateBoard(Board, a, b);
                    // Toggles the player turn.
                    if (isPlayer1) {
                        this.isPlayer1 = false;
                        this.player = new ConcretePlayer(false);
                    } else {
                        this.isPlayer1 = true;
                        this.player = new ConcretePlayer(true);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the path between two positions on the board is clear of obstacles.
     *
     * This method determines if the path between the starting position (a) and the target
     * position (b) is unobstructed. It considers the direction of movement, whether
     * horizontally or vertically, and iterates through the positions along the path to check
     * for the presence of any pieces.
     *
     * @param a    The starting Position of the piece.
     * @param b    The target Position to check the path towards.
     * @param isY  A boolean flag indicating whether the movement is in the vertical direction.
     * @return True if the path is clear, false if there are obstacles in the path.
     *
     * Notes:
     *   - It considers the direction of movement, either horizontally or vertically.
     *   - Returns true if the path is clear of obstacles; otherwise, returns false.
     *   - The 'isY' parameter indicates the direction of movement: true for horizontal, false for vertical.
     */
    private boolean checkOnPath(Position a, Position b, boolean isY) {
        if(!isY) {
            // from up to down on board
            if (a.getY() < b.getY()) {
                for (int i =  b.getY(); i > a.getY(); i--) {
                    if (Board[i][b.getX()] != null) {
                        return false;
                    }
                }
            }
            // from down to up on board
            else if (a.getY() > b.getY()) {
                for (int i= b.getY(); i < a.getY(); i++) {
                    if (Board[i][b.getX()] != null) {
                        return false;
                    }

                }
            }
        }else {
            // from left to right on board
            if (a.getX() < b.getX()) {
                for (int i = b.getX() ; i > a.getX(); i--) {
                    if (Board[b.getY()][i] != null) {
                        return false;
                    }
                }
            }
            // from right to left on board
            else if (a.getX() > b.getX()) {
                for (int i = b.getX(); i < a.getX(); i++) {
                    if (Board[b.getY()][i] != null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    /**
     * Checks and handles special conditions when a piece is moved to a border position or near a border on the board.
     *
     * This method is called after a piece is moved to a new position b to check for specific borders cases.
     * It examines the surroundings of the target position and performs actions based on the game rules.
     * This method also collects statistics for kills.
     *
     * @param b The target Position where a piece has been moved.
     *
     * Notes:
     *   - For pawns: 4 corners of the board are behave as opponent piece
     *   - The method checks if the piece type at the target position is not a king ('♚').
     *   - Handles specific corner and border cases based on the target position and adjacent positions.
     *   - Calls the 'isKingTrapped' method if a king is present in a corner position.
     *   - Executes actions such as capturing opponent pieces based on certain conditions.
     *   - Updates the chess board based on the actions performed.
     *   - The 'isKingTrapped' method is invoked to handle specific conditions related to king.
     *   - This method is typically called after a successful move to handle special conditions.
     *
     * Special Conditions:
     *   - isKingTrapped(): Handles conditions related to trapping king in corner positions.
     */
private void isEatenCorners(Position b){
// Checking if piece is near one of the 4 edges of board
if(Board[b.getY()][b.getX()].getType() != "♚") {
    if (b.getX() == 1 && Board[b.getY()][0] != null) {
        if (Board[b.getY()][0].getType() == "♚") {
            isKingtrapped(b.getY(), 0,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[b.getY()][0].getType().equals(Board[b.getY()][1].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][0]);
            Board[b.getY()][0] = null;

        }
    }
    // Checking if the opponent is on the right border.
    if (b.getX() == 9 && Board[b.getY()][10] != null) {
        if (Board[b.getY()][10].getType() == "♚") {
            isKingtrapped(b.getY(), 10,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[b.getY()][10].getType().equals(Board[b.getY()][9].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][10]);
            Board[b.getY()][10] = null;

        }
    }
    // Checking if the opponent is on the upper border.
    if (b.getY() == 1 && Board[0][b.getX()] != null) {
        if (Board[0][b.getX()].getType() == "♚") {
            isKingtrapped(0, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[1][b.getX()].getType().equals(Board[0][b.getX()].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[0][b.getX()]);
            Board[0][b.getX()] = null;

        }
    }
    // Checking if the opponent is on the bottom border.
    if (b.getY() == 9 && Board[10][b.getX()] != null) {
        if (Board[10][b.getX()].getType() == "♚") {
            isKingtrapped(10, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[10][b.getX()].getType().equals(Board[9][b.getX()].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[10][b.getX()]);
            Board[10][b.getX()] = null;

        }
    }
    // Checking if the opponent is on the left border.
    if (b.getY() == 10 && b.getX() == 2 && Board[10][1] != null) {
        if (Board[10][1].getType() == "♚") {
            isKingtrapped(10, 1,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[10][2].getType().equals(Board[10][1].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[10][1]);
            Board[10][1] = null;

        }
    }
    // Spacial conditions for positions around the corners
    if (b.getY() == 0 && b.getX() == 2 && Board[0][1] != null) {
        if (Board[0][1].getType() == "♚") {
            isKingtrapped(0, 1,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[0][2].getType().equals(Board[0][1].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[0][1]);
            Board[0][1] = null;

        }
    }
    if (b.getY() == 2 && b.getX() == 0 && Board[1][0] != null) {
        if (Board[1][0].getType() == "♚") {
            isKingtrapped(1, 0,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[2][0].getType().equals(Board[1][0].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[1][0]);
            Board[1][0] = null;

        }
    }
    if (b.getY() == 10 && b.getX() == 8 && Board[10][9] != null) {
        if (Board[10][9].getType() == "♚") {
            isKingtrapped(10, 9,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[10][8].getType().equals(Board[10][9].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[10][10]);
            Board[10][9] = null;

        }
    }
    if (b.getY() == 8 && b.getX() == 10 && Board[9][10] != null) {
        if (Board[9][10].getType() == "♚") {
            isKingtrapped(1, 0,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[8][10].getType().equals(Board[9][10].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[9][10]);
            Board[9][10] = null;

        }
    }
    if (b.getY() == 10 && b.getX() == 2 && Board[10][1] != null) {
        if (Board[10][1].getType() == "♚") {
            isKingtrapped(10, 1,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[10][8].getType().equals(Board[10][9].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[10][0]);
            Board[10][1] = null;

        }
    }
    if (b.getY() == 8 && b.getX() == 0 && Board[9][0] != null) {
        if (Board[9][0].getType() == "♚") {
            isKingtrapped(9, 0,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[8][0].getType().equals(Board[9][0].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[9][0]);
            Board[9][0] = null;

        }
    }
    if (b.getY() == 0 && b.getX() == 8 && Board[0][9] != null) {
        if (Board[0][9].getType() == "♚") {
            isKingtrapped(0, 9,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[0][8].getType().equals(Board[0][9].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[0][9]);
            Board[0][9] = null;

        }
    }
    if (b.getY() == 2 && b.getX() == 10 && Board[1][10] != null) {
        if (Board[1][10].getType() == "♚") {
            isKingtrapped(1, 10,(Pawn)Board[b.getY()][b.getX()]);
        } else if (!Board[2][10].getType().equals(Board[1][10].getType())) {
            ((Pawn)Board[b.getY()][b.getX()]).kill(Board[1][10]);
            Board[1][10] = null;

        }
    }
    /////////////////////////////////
    // Checking for upper and bottom sides
    if((b.getY() == 10 || b.getY() == 0)&&(b.getX() > 1 && b.getX()<9)){
        // Checking if opponent is on the right side
        if(Board[b.getY()][b.getX() - 2] != null && Board[b.getY()][b.getX()-1] != null) {
            if (Board[b.getY()][b.getX()-1].getType() == "♚") {
                isKingtrapped(0, b.getX()-1,(Pawn)Board[b.getY()][b.getX()]);
            }
            if (Board[b.getY()][b.getX()-1].getType() == "♚") {
                isKingtrapped(10, b.getX()-1,(Pawn)Board[b.getY()][b.getX()]);
            }
           else if (!Board[b.getY()][b.getX() - 2].getType().equals(Board[b.getY()][b.getX() - 1].getType())) {
                ((Pawn) Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() - 1]);
                Board[b.getY()][b.getX() - 1] = null;

            }
        }
        // Checking if opponent is on the left side
        if(Board[b.getY()][b.getX() + 2]!= null && Board[b.getY()][b.getX()+1] != null) {
            if (Board[b.getY()][b.getX()+1].getType() == "♚") {
                isKingtrapped(0, b.getX()+1,(Pawn)Board[b.getY()][b.getX()]);
            }
            if (Board[b.getY()][b.getX()+1].getType() == "♚") {
                isKingtrapped(10, b.getX()+1,(Pawn)Board[b.getY()][b.getX()]);
            }
           else if (!Board[b.getY()][b.getX() + 2].getType().equals(Board[b.getY()][b.getX() + 1].getType())) {
                ((Pawn) Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() + 1]);
                Board[b.getY()][b.getX() + 1] = null;

            }
        }
    }
    // Checking for left and right sides
    if((b.getX() == 10 || b.getX() == 0)&&(b.getY() > 1 && b.getY()<9)){
        if(Board[b.getY() - 2][b.getX()] != null && Board[b.getY()-1][b.getX()] != null) {
            // Checking if opponent is on the right side
            if (Board[b.getY()-1][b.getX()].getType() == "♚") {
                isKingtrapped(b.getY()-1, 0,(Pawn)Board[b.getY()][b.getX()]);
            }
            if (Board[b.getY()-1][b.getX()].getType() == "♚") {
                isKingtrapped(b.getY()-1, 10,(Pawn)Board[b.getY()][b.getX()]);
            }
            else if (!Board[b.getY() - 2][b.getX()].getType().equals(Board[b.getY() - 1][b.getX()].getType())) {
                ((Pawn) Board[b.getY()][b.getX()]).kill(Board[b.getY() - 1][b.getX()]);
                Board[b.getY()- 1][b.getX() ] = null;

            }
        }
        // Checking if opponent is on the left side
        if(Board[b.getY() + 2][b.getX()]!= null && Board[b.getY()+1][b.getX()] != null) {
            if (Board[b.getY()+1][b.getX()].getType() == "♚") {
                isKingtrapped(b.getY()+1, 0,(Pawn)Board[b.getY()][b.getX()]);
            }
            if (Board[b.getY()+1][b.getX()].getType() == "♚") {
                isKingtrapped(b.getY()+1, 10,(Pawn)Board[b.getY()][b.getX()]);
            }
            else if (!Board[b.getY() + 2][b.getX()].getType().equals(Board[b.getY() + 1][b.getX()].getType())) {
                ((Pawn) Board[b.getY()][b.getX()]).kill(Board[b.getY()+ 1][b.getX()]);
                Board[b.getY() + 1][b.getX()] = null;

            }
        }
    }

}
    }
    /**
     * Checks and handles specific conditions when a piece is moved to trap an opponent's piece.
     *
     * This method is called after a piece is moved to a new position b to check for trapping conditions.
     * It examines the surroundings of the target position and performs actions based on the game rules to trap opponent pieces.
     * This method also collects statistics for kills.
     *
     * @param b The target Position where a piece has been moved.
     *
     * Notes:
     *   - The method checks if the piece type at the target position is not a king ('♚').
     *   - Examines the surrounding positions based on the target position.
     *   - Performs actions to trap opponent pieces based on specific conditions.
     *   - Calls the 'isKingTrapped' method if a king is present in a trapped position.
     *   - Executes actions such as capturing opponent pieces based on certain conditions.
     *   - Updates the board based on the actions performed.
     *   - The 'isKingTrapped' method is invoked to handle specific conditions related to king.
     *   - This method is typically called after a successful move to handle trapping conditions.
     */
    private void isEatenTrapped(Position b) {
        if(Board[b.getY()][b.getX()].getType() != "♚") {
            if (b.getX() < 9 && b.getX() > 1 && b.getY() < 9 && b.getY() > 1) {
                //left is enemy - the player comes from the right side
                if (Board[b.getY()][b.getX() - 2] != null && Board[b.getY()][b.getX() - 1] != null) {
                    if (Board[b.getY()][b.getX() - 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() - 1,(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY()][b.getX() - 2].getColor()!=(Board[b.getY()][b.getX() - 1].getColor()) && Board[b.getY()][b.getX() - 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() - 1]);
                        Board[b.getY()][b.getX() - 1] = null;
                    }
                }
                //right is enemy - the player comes from the left side
                if (Board[b.getY()][b.getX() + 2] != null && Board[b.getY()][b.getX() + 1] != null) {
                    if (Board[b.getY()][b.getX() + 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() + 1,(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY()][b.getX() + 2].getColor()!= (Board[b.getY()][b.getX() + 1].getColor()) && Board[b.getY()][b.getX() + 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() + 1]);
                        Board[b.getY()][b.getX() + 1] = null;
                    }
                }
                //up is enemy - the player comes from the bottom side
                if (Board[b.getY() + 2][b.getX()] != null && Board[b.getY() + 1][b.getX()] != null) {
                    if (Board[b.getY() + 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() + 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() + 2][b.getX()].getColor()!=(Board[b.getY() + 1][b.getX()].getColor()) && Board[b.getY() + 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() + 1][b.getX()]);
                        Board[b.getY() + 1][b.getX()] = null;
                    }
                }
                //down is enemy - the player comes from the upper side
                if (Board[b.getY() - 2][b.getX()] != null && Board[b.getY() - 1][b.getX()] != null) {
                    if (Board[b.getY() - 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() - 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() - 2][b.getX()].getColor()!=(Board[b.getY() - 1][b.getX()].getColor()) && Board[b.getY() - 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() - 1][b.getX()]);
                        Board[b.getY() - 1][b.getX()] = null;
                    }
                }
            }
            // Checking for spacial conditions
            if (b.getY() == 1) {
                if (Board[b.getY() + 2][b.getX()] != null && Board[b.getY() + 1][b.getX()] != null) {
                    if (Board[b.getY() + 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() + 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() + 2][b.getX()].getColor()!=(Board[b.getY() + 1][b.getX()].getColor()) && Board[b.getY() + 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() + 1][b.getX()]);
                        Board[b.getY() + 1][b.getX()] = null;
                    }
                }
                if (b.getX() < 9 && Board[b.getY()][b.getX() + 2] != null && Board[b.getY()][b.getX() + 1] != null) {
                    if (Board[b.getY()][b.getX() + 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() + 1,(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY()][b.getX() + 2].getColor()!=(Board[b.getY()][b.getX() + 1].getColor()) && Board[b.getY()][b.getX() + 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() + 1]);
                        Board[b.getY()][b.getX() + 1] = null;
                    }
                }
                if (b.getX() > 1 && Board[b.getY()][b.getX() - 2] != null && Board[b.getY()][b.getX() - 1] != null) {
                    if (Board[b.getY()][b.getX() - 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() - 1,(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY()][b.getX() - 2].getColor()!= (Board[b.getY()][b.getX() - 1].getColor()) && Board[b.getY()][b.getX() - 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() - 1]);
                        Board[b.getY()][b.getX() - 1] = null;
                    }
                }
            }
            if (b.getY() == 9) {
                if (Board[b.getY() - 2][b.getX()] != null && Board[b.getY() - 1][b.getX()] != null) {
                    if (Board[b.getY() - 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() - 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() - 2][b.getX()].getColor()!=(Board[b.getY() - 1][b.getX()].getColor()) && Board[b.getY() - 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() - 1][b.getX()]);
                        Board[b.getY() - 1][b.getX()] = null;
                    }
                }
                if ( b.getX() < 9 && Board[b.getY()][b.getX() + 2] != null && Board[b.getY()][b.getX() + 1] != null) {
                    if (Board[b.getY()][b.getX() + 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() + 1,(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY()][b.getX() + 2].getColor()!= (Board[b.getY()][b.getX() + 1].getColor()) && Board[b.getY()][b.getX() + 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() + 1]);
                        Board[b.getY()][b.getX() + 1] = null;
                    }
                }
                if (b.getX()>1 && Board[b.getY()][b.getX() - 2] != null && Board[b.getY()][b.getX() - 1] != null) {
                    if (Board[b.getY()][b.getX() - 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() - 1,(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY()][b.getX() - 2].getColor()!=(Board[b.getY()][b.getX() - 1].getColor()) && Board[b.getY()][b.getX() - 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() - 1]);
                        Board[b.getY()][b.getX() - 1] = null;
                    }
                }
            }
            if (b.getX() == 1) {
                if (Board[b.getY()][b.getX() + 2] != null && Board[b.getY()][b.getX() + 1] != null) {
                    if (Board[b.getY()][b.getX() + 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() + 1,(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY()][b.getX() + 2].getColor()!=Board[b.getY()][b.getX() + 1].getColor() && Board[b.getY()][b.getX() + 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() + 1]);
                        Board[b.getY()][b.getX() + 1] = null;
                    }
                }
                if (b.getY() < 9 && Board[b.getY() + 2][b.getX()] != null && Board[b.getY() + 1][b.getX()] != null) {
                    if (Board[b.getY() + 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() + 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() + 2][b.getX()].getColor()!=(Board[b.getY() + 1][b.getX()].getColor()) && Board[b.getY() + 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() + 1][b.getX()]);
                        Board[b.getY() + 1][b.getX()] = null;
                    }
                }
                if (b.getY() > 1 && Board[b.getY() - 2][b.getX()] != null && Board[b.getY() - 1][b.getX()] != null) {
                    if (Board[b.getY() - 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() - 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() - 2][b.getX()].getColor()!= Board[b.getY() - 1][b.getX()].getColor() && Board[b.getY() - 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() - 1][b.getX()]);
                        Board[b.getY() - 1][b.getX()] = null;
                    }
                }
            }
            if (b.getX() == 9) {
                if (Board[b.getY()][b.getX() - 2] != null && Board[b.getY()][b.getX() - 1] != null) {
                    if (Board[b.getY()][b.getX() - 1].getType() == "♚") {
                        isKingtrapped(b.getY(), b.getX() - 1,(Pawn)Board[b.getY()][b.getX()]);
                    }
                    if (Board[b.getY()][b.getX() - 2].getColor()!=(Board[b.getY()][b.getX() - 1].getColor()) && Board[b.getY()][b.getX() - 2].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY()][b.getX() - 1]);
                        Board[b.getY()][b.getX() - 1] = null;
                    }
                }
                if (b.getY() < 9 && Board[b.getY() + 2][b.getX()] != null && Board[b.getY() + 1][b.getX()] != null) {
                    if (Board[b.getY() + 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() + 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() + 2][b.getX()].getColor()!=Board[b.getY() + 1][b.getX()].getColor() && Board[b.getY() + 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() + 1][b.getX()]);
                        Board[b.getY() + 1][b.getX()] = null;
                    }
                }
                if (b.getY() > 1 && Board[b.getY() - 2][b.getX()] != null && Board[b.getY() - 1][b.getX()] != null) {
                    if (Board[b.getY() - 1][b.getX()].getType() == "♚") {
                        isKingtrapped(b.getY() - 1, b.getX(),(Pawn)Board[b.getY()][b.getX()]);
                    } else if (Board[b.getY() - 2][b.getX()].getColor()!=Board[b.getY() - 1][b.getX()].getColor() && Board[b.getY() - 2][b.getX()].getColor() == player.isPlayerOne()) {
                        ((Pawn)Board[b.getY()][b.getX()]).kill(Board[b.getY() - 1][b.getX()]);
                        Board[b.getY() - 1][b.getX()] = null;
                    }
                }
            }
        }

    }
    /**
     * Checks if the pawn has trapped the king, resulting in a victory for Player 2.
     *
     * This method examines specific conditions around the red pawns position to check if the king
     * is surrounded, leading to a victory for Player 2. The method considers different scenarios based on
     * the red pawns position at the edges or corners of the board.
     * This method also collects statistics for kills.
     *
     * @param pawn The pawn that has made a move.
     * @param x The x-coordinate of king position on the board.
     * @param y The y-coordinate of the king position on the board.
     * @return True if the king is trapped, resulting in a victory for Player 2; otherwise, false.
     *
     * Notes:
     *   - The method checks specific conditions based on the pawn's position at the edges or corners of the board.
     *   - Different scenarios are considered for positions where 'y' is 0, 10, and 'x' is 0, 10.
     *   - The opponent's king is considered trapped if it is surrounded by enemies.
     *   - If the king is trapped, the method sets victory conditions for Player 2, updates game state, and returns true.
     *   - The 'isPlayer2Won' flag is set to true, indicating that Player 2 has won the game.
     *   - The '_isGameIsFinished' flag is set to true, indicating that the game has finished.
     *   - Returns false if the king is not trapped based on the examined conditions.
     */
    private boolean isKingtrapped(int y, int x, Pawn pawn) {
        // Check if the king is at the top edge of the board
        if(y == 0) {
            if (Board[0][x - 1] != null && Board[0][x + 1] != null && Board[1][x] != null) {
                if ((Board[0][x - 1].getColor() != Board[y][x].getColor()) && (Board[0][x + 1].getColor() != Board[y][x].getColor()) && Board[1][x].getColor() != Board[y][x].getColor() ){
                    pawn.kill(Board[y][x]);
                    _isGameIsFinished =true;
                    isPlayer2won = true;
                    player2.set_numberOfWins();
                    return true;
                }
            }
        }
        // Check if the king is at the bottom edge of the board
        if(y == 10) {
            if (Board[10][x - 1] != null && Board[10][x + 1] != null && Board[9][x] != null) {
                if ((Board[10][x - 1].getColor() != Board[y][x].getColor()) && (Board[10][x + 1].getColor() != Board[y][x].getColor()) && Board[9][x].getColor() != Board[y][x].getColor() ){
                    pawn.kill(Board[y][x]);
                    isPlayer2won = true;
                    player2.set_numberOfWins();
                    _isGameIsFinished =true;
                    return true;
                }
            }
        }
        // Check if the king is at the left edge of the board
        if(x == 0){
            if (Board[y+1][x] != null && Board[y-1][x] != null && Board[y][x+1] != null) {
                if ((Board[y+1][x].getColor() != Board[y][x].getColor()) && (Board[y-1][x].getColor() != Board[y][x].getColor()) && Board[y][x+1].getColor() != Board[y][x].getColor() ){
                    pawn.kill(Board[y][x]);
                    isPlayer2won = true;
                    player2.set_numberOfWins();
                    _isGameIsFinished =true;
                    return true;
                }
            }
        }
        // Check if the king is at the right edge of the board
        if(x == 10){
            if (Board[y+1][x] != null && Board[y-1][x] != null && Board[y][x-1] != null) {
                if ((Board[y+1][x].getColor() != Board[y][x].getColor()) && (Board[y-1][x].getColor() != Board[y][x].getColor()) && Board[y][x-1].getColor() != Board[y][x].getColor() ){
                    pawn.kill(Board[y][x]);
                    isPlayer2won = true;
                    player2.set_numberOfWins();
                    _isGameIsFinished =true;
                    return true;
                }
            }
        }
        // Check if the king is surrounded by enemies in all directions
        else if((x>0 && x<10 && y>0 && y<10)){
            if(Board[y+1][x] != null && Board[y-1][x] != null && Board[y][x-1] != null && Board[y][x+1] != null){
                if ((Board[y+1][x].getColor() != Board[y][x].getColor()) && (Board[y-1][x].getColor() != Board[y][x].getColor()) && Board[y][x-1].getColor() != Board[y][x].getColor() && Board[y][x+1].getColor() != Board[y][x].getColor()  ){
                    pawn.kill(Board[y][x]);
                    isPlayer2won = true;
                    player2.set_numberOfWins();
                    _isGameIsFinished =true;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if a king is present on any of the four corners of the board.
     *
     * This method examines the four corners of the board (0,0), (0,10), (10,0), and (10,10).
     * If a king is found on any of these corners, it declares Player 1 as the winner,
     * updates the number of wins for Player 1, and sets the '_isGameIsFinished' flag to true.
     *
     * Notes:
     *   - This method is typically called during the game to check if a king has reached any of the corners.
     *   - If a king is found on a corner, the game is considered finished, and Player 1 is declared the winner.
     */

    private void isKingOnSIde() {
        if (Board[0][0] != null){
            isPlayer1won = true;
            player1.set_numberOfWins();
            _isGameIsFinished = true;

        }
        if (Board[10][0] != null){
            isPlayer1won = true;
            player1.set_numberOfWins();
            _isGameIsFinished = true;

        }
        if (Board[0][10] != null) {
            isPlayer1won = true;
            player1.set_numberOfWins();
            _isGameIsFinished = true;

        }
        if (Board[10][10] != null) {
            isPlayer1won = true;
            player1.set_numberOfWins();
            _isGameIsFinished = true;
        }
    }

    /**
     *  If the game has not started, this method initializes the game board by calling 'setGame'.
     *  he 'GameStarted' flag is used to determine if the game has already started.
     */
    @Override
    public Piece getPieceAtPosition(Position position) {
        if(isGameStarted == false) {
            setGame(Board);
        }
        return Board[position.getY()][position.getX()];
    }


    @Override
    public Player getFirstPlayer() {
        return this.player1;
    }

    @Override
    public Player getSecondPlayer() {
        return this.player2;
    }

    /**
     * This method determines whether the chess game has finished by checking the '_isGameIsFinished' flag.
     * Notes:
     *   - If the game has finished, this method updates statistics using the 'statistics' method.
     *   - The 'isPlayer1won' and 'isPlayer2won' flags are reset to false for subsequent game evaluations.
     */

    @Override
    public boolean isGameFinished() {
        if(_isGameIsFinished){
            statistics();
        }
        isPlayer1won = false;
        isPlayer2won = false;
        return _isGameIsFinished;
    }



    @Override
    public boolean isSecondPlayerTurn() {
        if(!player.isPlayerOne()) {
            return true;
        }else{
            return false;
        }
    }

    /**
     *  Resetting all of the game fields
     */
    @Override
    public void reset() {
            this.Board = new ConcretePiece[11][11];
            this.isPlayer1 = false;
            this.player = new ConcretePlayer(isPlayer1);
            this.isGameStarted = false;
            positions.clear();
            pd.clear();
            pa.clear();
            _isGameIsFinished=false;
            setGame(Board);

    }

    @Override
    public void undoLastMove() {
        }

    /**
     * Displays statistical information about the game, including steps taken by each piece, kills, distances,
     * and the number of pieces on each relevant position.
     *
     * This method prints information to the console.
     *
     * Notes:
     *   - The 'stars()' method is called to provide visual separation between different sections of statistics.
     *
     * Console Output:
     *   - Steps taken by each piece with more than one step.
     *   - Kills performed by each pawn with nonzero kill counts.
     *   - Distances traveled by each pawn with positive distance values.
     *   - Number of pieces on each position with more than one piece.
     *
     * @see #stars() Method called for visual separation in the console output.
     */

    private void statistics() {
        ArrayList<Pawn> steps = sortSteps(pd,pa);
        // Display steps taken by each piece with more than one step
        for (int i = 0; i < steps.size(); i++) {
            ConcretePiece p = steps.get(i);
            if(p.getSteps().size()>1) {
                System.out.println(steps.get(i).getPieceString() + ": " + p.getSteps());
            }
        }
        stars();
        ArrayList<Pawn> kills = sortedKills(pd,pa);
        // Display kills performed by each pawn with nonzero kill counts
        for (int i = 0; i < kills.size(); i++) {
            Pawn pawn = kills.get(i);
            if(pawn.getkills() != 0){
                System.out.println(kills.get(i).getPieceString() + ": " + pawn.getkills() + " kills");
            }
        }
        stars();
        ArrayList<Pawn> sorted =sortedDistances(pd,pa);
        // Display distances traveled by each pawn with positive distance values
        for (int i = 0; i < sorted.size(); i++) {
            if(sorted.get(i).getDistance()>0) {
                System.out.println(sorted.get(i).getPieceString() + ": " + sorted.get(i).getDistance() + " sqares");
                }
            }
            stars();

        sortpositions();
        // Display the number of pieces on each position with more than one piece
        for (int i = 0; i < positions.size(); i++) {
            if(positions.get(i).numOfPieces()>1) {
                System.out.println(positions.get(i).toString() + positions.get(i).numOfPieces()+" pieces");
            }
        }
    }

    /**
     * Sorts the distances of pawns.
     *
     * It creates an imposter king with the same position and distance as the actual king to include it in the sorting.
     * The pawns are sorted first by their indices and then by distances they moved.
     *
     * The final sorted list is ordered in descending order of distances.
     *
     * Notes:
     *   - The sorting is influenced by the outcome of the game (Player 1 or Player 2 victory).
     *   - The resulting list is ordered in descending order of distances.
     *
     * @return ArrayList<Pawn> sorted in descending order according to the distance they traveled during the game,
     *  if the distance is equal then it sorted by the tool number in ascending order, if the number is equal, sorted by The winning team first.
     */

    private ArrayList<Pawn> sortedDistances(ArrayList<Pawn> pd, ArrayList<Pawn> pa){
        ArrayList<Pawn> sortedDistances = new ArrayList<>();
        ArrayList<Pawn> distA = new ArrayList<>();
        ArrayList<Pawn> distD = new ArrayList<>();
        distA.addAll(pa);
        distD.addAll(pd);
        // Create an imposter king with the same position and distance as the actual king
        Pawn imposterKing = new Pawn(king.getPosition(),new ConcretePlayer(true));
        imposterKing.setDistance(king.getDistance());
        imposterKing.setStringStatistics("K7");
        distD.add(imposterKing);
        // Comparator for sorting pawns based on their indices
        Comparator<Pawn> comparindex= new Comparator<Pawn>() {
            @Override
            public int compare(Pawn o1, Pawn o2) {
                return Integer.compare(o1.getIndex(),o2.getIndex());
            }
        };
        // Comparator for sorting pawns based on their distances.
        Comparator<ConcretePiece> comperDistances = new Comparator<ConcretePiece>() {
            @Override
            public int compare(ConcretePiece o1, ConcretePiece o2) {
                return Integer.compare(o1.getDistance(), o2.getDistance());
            }
        };
        distD.sort(comparindex);
        distA.sort(comparindex);
        if(isPlayer1won){
            // If Player 1 won, add attacking pawns first then defending pawns.
            sortedDistances.addAll(distD);
            sortedDistances.addAll(distA);
        }
        if(isPlayer2won){
            // If Player 2 won, add attacking pawns first then defending pawns.
            sortedDistances.addAll(distA);
            sortedDistances.addAll(distD);
        }
        // Sort the final list in descending order of distances
        sortedDistances.sort(comperDistances.reversed());


        return sortedDistances;
    }

    /**
     * Sorts pawns based on the number of steps they took.
     *
     * It creates an imposter king with the same position and steps as the actual king to include it in the sorting.
     * Pawns with no available steps are removed from the lists.
     *
     * The pawns are sorted first by their indices and then by the number of steps they took.
     *
     * If Player 1 has won the game, the defending pawns are sorted first by the number of steps (ascending),
     * followed by the attacking pawns also sorted by the number of steps (ascending).
     *
     * Notes:
     *   - This method is used to determine the order of pawns based on their indices and the number of steps they took.
     *   - Pawns with no available steps are removed from the list before sorting.
     *   - The sorting is influenced by the outcome of the game (Player 1 or Player 2 victory).
     *
     * @return ArrayList<Pawn> sorted history of moves for each tool on the board sorted in ascending order
     * According to the number of steps the tool took. First is the winning side and then the losing side
     */
    private ArrayList<Pawn> sortSteps(ArrayList<Pawn> pd, ArrayList<Pawn> pa) {
        ArrayList<Pawn> steps = new ArrayList<>();
        ArrayList<Pawn> stepA = new ArrayList<>();
        ArrayList<Pawn> stepD = new ArrayList<>();
        stepA.addAll(pa);
        stepD.addAll(pd);
        // Remove pawns with no available steps
        for(int i = 0; i<stepD.size(); i++){
            if(stepD.get(i).getSteps().size()<1){
                stepD.remove(i);
            }
        }
        for(int i = 0; i<stepA.size(); i++){
            if(stepA.get(i).getSteps().size()<1){
                stepA.remove(i);
            }
        }
        // Create an imposter king with the same position and steps as the actual king
        Pawn imposterKing = new Pawn(king.getPosition(),new ConcretePlayer(true));
        imposterKing.setSteps(king.getSteps());
        imposterKing.setStringStatistics("K7");
        stepD.add(imposterKing);
        // Comparator for sorting pawns based on their indices
        Comparator<Pawn> comparindex= new Comparator<Pawn>() {
            @Override
            public int compare(Pawn o1, Pawn o2) {
                return Integer.compare(o1.getIndex(),o2.getIndex());
            }
        };
        // Comparator for sorting pawns based on the number of steps
        Comparator<ConcretePiece> comparNumSteps= new Comparator<ConcretePiece>() {
            @Override
            public int compare(ConcretePiece o1, ConcretePiece o2) {
                return Integer.compare(o1.getNumOfSteps(),o2.getNumOfSteps());
            }
        };
        // Sort defending and attacking pawns by indices
        stepA.sort(comparindex);
        stepD.sort(comparindex);
        // If Player 1 won, sort defending pawns first by the number of steps (ascending), then attacking pawns
        if(isPlayer1won){
            stepD.sort(comparNumSteps);
            steps.addAll(stepD);
            stepA.sort(comparNumSteps);
            steps.addAll(stepA);
        }
        // If Player 2 won, sort attacking pawns first by the number of steps (ascending), then defending pawns
        if(isPlayer2won){
            stepA.sort(comparNumSteps);
            steps.addAll(stepA);
            stepD.sort(comparNumSteps);
            steps.addAll(stepD);
        }
        return steps;
    }

    /**
     * Sorts pawns based on the number of kills they had.
     *
     * If Player 1 has won the game, the defending pawns are sorted first by the number of kills (descending),
     * followed by the attacking pawns also sorted by the number of kills (descending).
     *
     * Notes:
     *   - This method is used to determine the order of pawns based on their indices and the number of kills they had.
     *   - The sorting is influenced by the outcome of the game (Player 1 or Player 2 victory).
     *
     * @return ArrayList<Pawn> sorted tools in descending order according to the amount of kills, if the amount is equal,
     * sorted by indices in ascending order, if the number is equal, sort according to the winning team first
     */
    private ArrayList<Pawn> sortedKills(ArrayList<Pawn> pd, ArrayList<Pawn> pa){
        ArrayList<Pawn> kills = new ArrayList<>();
        ArrayList<Pawn> killsA = new ArrayList<>();
        ArrayList<Pawn> killsD = new ArrayList<>();
        killsA.addAll(pa);
        killsD.addAll(pd);
        // Comparator for sorting pawns based on their indices
        Comparator<Pawn> comparindex= new Comparator<Pawn>() {
            @Override
            public int compare(Pawn o1, Pawn o2) {
                return Integer.compare(o1.getIndex(),o2.getIndex());
            }
        };
        // Comparator for sorting pawns based on their kills
        Comparator<Pawn> comparKills= new Comparator<Pawn>() {
            @Override
            public int compare(Pawn o1, Pawn o2) {
                return Integer.compare(o1.getkills(),o2.getkills());
            }
        };
        // Sort defending and attacking pawns by indices
        killsA.sort(comparindex);
        killsD.sort(comparindex);

        if(isPlayer1won){
            killsD.sort(comparKills);
            kills.addAll(killsD);
            killsA.sort(comparKills);
            kills.addAll(killsA);
        }
        if(isPlayer2won){
            killsA.sort(comparKills);
            kills.addAll(killsA);
            killsD.sort(comparKills);
            kills.addAll(killsD);
        }
        kills.sort(comparKills.reversed());
        return kills;
    }

    /**
     * Sorts a list of positions based on the number of different pieces they contain.
     *
     * Notes:
     *   - If two positions have the same number of pieces they contain, then sorted by the X-coordinate in
     *     ascending order (positions with more pieces come first).
     *
     * @return ArrayList<Pawn> of sorted positions in ascending order according to the amount of different tools stepped on them,
     *  if the amount is equal then it sorted  by the X of the slot, if this is also equal, sorted by the Y.
     */

    private ArrayList<Position> sortpositions() {

        // Comparator for sorting positions based on the number of pieces (in descending order)
        Comparator<Position> comparNumOfPieces = new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                return Integer.compare(o1.numOfPieces(), o2.numOfPieces());
            }
        };
        // Comparator for sorting positions based on X-coordinates (in ascending order)
        Comparator<Position> comparXpos= new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                return Integer.compare(o1.getX(), o2.getX());
            }
        };
        positions.sort(comparXpos);
        positions.sort(comparNumOfPieces);
        return positions;
    }

    /**
     * Prints 75 stars for the statistic function
     */
    private void stars(){
        for(int i = 0; i<74; i++){
            System.out.print("*");
        }
        System.out.println();
    }


    @Override
    public int getBoardSize() {
        return 11;
    }
}
