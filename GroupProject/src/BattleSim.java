import java.util.Random;
import java.util.Scanner;
public class BattleSim
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner kbd = new Scanner(System.in);

        // ===== PLAYER 1 =====
        System.out.println("Enter Player 1 name:");
        String name1 = kbd.nextLine();
        System.out.println("Enter Player 1 strength (1-4):");
        int strength1 = kbd.nextInt();
        System.out.println("Enter Player 1 speed (must add to 5 with strength):");
        int speed1 = kbd.nextInt();

        Character player1 = new Character(name1, strength1, speed1);
        
        System.out.println("Welcome to the battle, " + name1 + "!");
        System.out.println("Your stats are: " + player1.getHealth() + " Health, " + player1.getStrength() + " Attack, and " + player1.getSpeed() + " Speed.");
        
        
        // ===== PLAYER 2 =====
        System.out.println("Enter Player 2 name:");
        String name1 = kbd.nextLine();
        System.out.println("Enter Player 2 strength (1-4):");
        int strength1 = kbd.nextInt();
        System.out.println("Enter Player 2 speed (must add to 5 with strength):");
        int speed1 = kbd.nextInt();

        Character player2 = new Character(name2, strength2, speed2);
        
        System.out.println("Welcome to the battle, " + name2 + "!");
        System.out.println("Your stats are: " + player2.getHealth() + " Health, " + player2.getStrength() + " Attack, and " + player2.getSpeed() + " Speed.");



    }
}