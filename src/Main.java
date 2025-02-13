import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberOfDice;
        int total = 0;
        System.out.print("Enter the number of dice:  ");
        numberOfDice = sc.nextInt();
        int dice;

        if (numberOfDice > 0) {
            for (int i = 0; i < numberOfDice; i++) {
                dice = rand.nextInt(1,7);
                total += dice;
                System.out.println(" dice number "+(i+1)+": "+dice);
                printDice(dice);
            }
            System.out.println("The total dice is " + total);
        }
        else {
            System.out.println("number must be > 0");
        }
    }

    static void printDice(int dice) {
        switch (dice){
            case 1:
                String dice1 = """
                         ----------
                        |          |
                        |          |
                        |    ●     |
                        |          |
                        |          |
                         ----------
                        """;
                System.out.println(dice1);
                break;
            case 2:
                String dice2 = """
                         ----------
                        | ●        |
                        |          |
                        |          |
                        |          |
                        |        ● |
                         ----------
                        """;
                System.out.println(dice2);
                break;
            case 3:
                String dice3 = """
                         ----------
                        | ●        |
                        |          |
                        |    ●     |
                        |          |
                        |       ●  |
                         ----------
                        """;
                System.out.println(dice3);
                break;
            case 4:
                String dice4 = """
                         ----------
                        | ●      ● |
                        |          |
                        |          |
                        |          |
                        | ●      ● |
                         ----------
                        """;
                System.out.println(dice4);
                break;
            case 5:
                String dice5 = """
                         ----------
                        | ●      ● |
                        |          |
                        |     ●    |
                        |          |
                        | ●      ● |
                         ----------
                        """;
                System.out.println(dice5);
                break;
            case 6:
                String dice6 = """
                         ----------
                        | ●      ● |
                        |          |
                        | ●      ● |
                        |          |
                        | ●      ● |
                         ----------
                        """;
                System.out.println(dice6);
                break;
        }
    }
}
