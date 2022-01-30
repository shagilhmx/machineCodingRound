package snakeAndLadder;

public class Player {
    private String playerName;
    private int id;

    // getter function
    public String getPlayerName() {
        return playerName;
    }

    Player(String playerName, int id) {
        this.playerName = playerName;
        this.id = id;
    }
}
