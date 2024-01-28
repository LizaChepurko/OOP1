public class ConcretePlayer implements Player {

    private boolean isBLUE;

    private int _numberOfWins;

    public ConcretePlayer(boolean isBLUE) {
        this.isBLUE = isBLUE;
    }


    @Override
    public boolean isPlayerOne() {
        if (this.isBLUE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getWins() {
        return this._numberOfWins;
    }

    public void set_numberOfWins() {
        this._numberOfWins++;
    }
}
