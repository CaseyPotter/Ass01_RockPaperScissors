import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playerOne = "";
        String playerTwo = "";
        String more = "y";
        Scanner in = new Scanner(System.in);
//
        while (more.equalsIgnoreCase("y")) {
            System.out.println("Player One enter, your move: [R P S] ");
            playerOne = in.next();

            System.out.println("Player Two, enter your move: [R P S] ");
            playerTwo = in.next();

            if (playerOne.equalsIgnoreCase("R")) {
                if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock, Player Two wins! ");
                }
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("Tie game! ");
                }
                if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks scissors! Player One wins! ");
                }
            }
            if (playerOne.equalsIgnoreCase("P")) {
                if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("Tie game! ");
                }
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("Paper cover rock, Player One wins! ");
                }
                if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cur paper! Player Two wins! ");
                }
            }
            if (playerOne.equalsIgnoreCase("S")) {
                if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper! Player One wins! ");
                }
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks scissors! PLayer Two wins! ");
                }
                if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("Tie Game! ");

                }
                else
                {
                    System.out.println("Improper inputs!");
                }
            }
            System.out.println("Do you want to continue? [Y / N] ");
            more = in.next();

        }
    }
}