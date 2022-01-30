package snakeAndLadder;

public class Dice {
    private int numberOfDice;

    Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    // for generating the random number from 1 to 6.
    int rollDice() {
        return ((int) (Math.random() * (6 * numberOfDice - 1 * numberOfDice))) + 1;
    }
}
