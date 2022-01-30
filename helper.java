import java.util.*;

public class helper implements Computation, ShowAble, printAble {
    private String name;
    private int diceValue, inititalPosition, finalPosition;

    public void compute() {

    }

    public void show() {
        System.out
                .println(name + "rolled a " + diceValue + "and moved from " + inititalPosition + "to" + finalPosition);
    }

    public void print() {
        System.out.println(name + "wins the game");
    }
}
