package OCP.board_game.good;

public class Dice {
    private int faces;

    Dice(int faces) {
        this.faces = faces;
    }

    public Integer roll(){
        return (int) (Math.random() * faces);
    }

}
