public class King extends ConcretePiece{

    private final String K = "K7";
    private Position position;

    private final ConcretePlayer Player = new ConcretePlayer(true);

    /**
     * Constructs a King object with a specified position and player.
     *
     * This constructor initializes a King object with the given position and player.
     * The King is a type of piece that belongs to the blue team.
     *
     */
    public King(Position p, ConcretePlayer player) {
        super(p, player);
        this.position = p;
    }

    public Position getPosition(){
        return position;
    }
    @Override
    public Player getOwner() {
        return Player;
    }

    @Override
    public String getType() {
        return "♚";
    }


}
