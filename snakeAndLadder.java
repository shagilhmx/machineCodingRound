import java.util.*;
import java.io.*;

class SnakeAndLadder extends helper {
    public static void main(String[] args) throws IOException {
        int noOfSnakes, noOfLadders, noOfPlayers;

        Scanner sc = new Scanner(System.in);

        noOfSnakes = sc.nextInt();

        ArrayList head = new ArrayList<>();
        ArrayList tail = new ArrayList<>();

        for (int index = 0; index < noOfSnakes; index++) {
            head.add(sc.nextInt());
            tail.add(sc.nextInt());
        }

        noOfLadders = sc.nextInt();

        ArrayList start = new ArrayList<>();
        ArrayList end = new ArrayList<>();

        for (int index = 0; index < noOfLadders; index++) {
            start.add(sc.nextInt());
            end.add(sc.nextInt());
        }

        noOfPlayers = sc.nextInt();

        ArrayList name = new ArrayList<>();

        for (int index = 0; index < noOfPlayers; index++) {
            name.add(sc.nextLine());
        }
    }
}