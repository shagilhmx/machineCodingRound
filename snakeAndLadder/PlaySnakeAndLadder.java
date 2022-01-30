package snakeAndLadder;

import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        int noOfSnakes, noOfLadders, noOfPlayers;
        int boardSize = 100;

        Dice dice = new Dice(1);

        Scanner sc = new Scanner(System.in);

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
            String name = sc.nextLine();
            Player playerName = new Player(name, i + 1);
            allPlayers.offer(playerName);

            playersCurrentPosition.put(name, 0);
        }

        GameBoard gb = new GameBoard(dice, allPlayers, snakes, ladders, playersCurrentPosition, boardSize);
        gb.StartGame();
    }
}
