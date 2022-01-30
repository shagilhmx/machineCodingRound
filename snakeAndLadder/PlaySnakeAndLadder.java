package snakeAndLadder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) throws FileNotFoundException {

        // initilization for no of snakes, no of ladders and no of players.
        int noOfSnakes, noOfLadders, noOfPlayers;

        // boardSize which can be varied according to the game requirement.
        int boardSize = 100;

        // number of dice which can be varied according to the game requirement.
        Dice dice = new Dice(1);

        // file reader for reading input from the file(no of snakes and its start point
        // and end point vice versa).
        Scanner sc = new Scanner(new FileReader("snakeAndLadder/txtInput.txt"));
        noOfSnakes = sc.nextInt();
        List<Jumper> snakes = new ArrayList<>();
        for (int i = 0; i < noOfSnakes; i++) {
            int startPoint = sc.nextInt();
            int endPoint = sc.nextInt();
            Jumper snake = new Jumper(startPoint, endPoint);
            snakes.add(snake);
        }

        noOfLadders = sc.nextInt();
        List<Jumper> ladders = new ArrayList<>();
        for (int i = 0; i < noOfLadders; i++) {
            int startPoint = sc.nextInt();
            int endPoint = sc.nextInt();
            Jumper ladder = new Jumper(startPoint, endPoint);
            ladders.add(ladder);
        }

        Map<String, Integer> playersCurrentPosition = new HashMap<>();
        noOfPlayers = sc.nextInt();
        Queue<Player> allPlayers = new LinkedList<>();
        for (int i = 0; i < noOfPlayers; i++) {
            String name = sc.next();
            Player playerName = new Player(name, i + 1);
            allPlayers.offer(playerName);

            playersCurrentPosition.put(name, 0);
        }

        // for starting the game.
        GameBoard gb = new GameBoard(dice, allPlayers, snakes, ladders, playersCurrentPosition, boardSize);
        gb.StartGame();
        sc.close();
    }
}
