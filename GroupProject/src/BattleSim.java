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

        while (strength1 + speed1 != 5)
        {
            System.out.println("Strength and speed must add up to 5. Try again.");

            System.out.println("Enter Player 1 strength (1-4):");
            strength1 = kbd.nextInt();

            System.out.println("Enter Player 1 speed (must add to 5 with strength):");
            speed1 = kbd.nextInt();
        }

        Character player1 = new Character(name1, strength1, speed1);
        
        System.out.println("Welcome to the battle, " + name1 + "!");
        System.out.println("Your stats are: " + player1.getHealth() + " Health, " + player1.getStrength() + " Attack, and " + player1.getSpeed() + " Speed.");
        kbd.nextLine();
        
        // ===== PLAYER 2 =====
        System.out.println("Enter Player 2 name:");
        String name2 = kbd.nextLine();
        System.out.println("Enter Player 2 strength (1-4):");
        int strength2 = kbd.nextInt();
        System.out.println("Enter Player 2 speed (must add to 5 with strength):");
        int speed2 = kbd.nextInt();

        while (strength2 + speed2 != 5)
        {
            System.out.println("Strength and speed must add up to 5. Try again.");

            System.out.println("Enter Player 2 strength (1-4):");
            strength2 = kbd.nextInt();

            System.out.println("Enter Player 2 speed (must add to 5 with strength):");
            speed2 = kbd.nextInt();
        }

        Character player2 = new Character(name2, strength2, speed2);
        
        //battle starts:
        System.out.println("Welcome to the battle, " + name2 + "!");
        System.out.println("Your stats are: " + player2.getHealth() + " Health, " + player2.getStrength() + " Attack, and " + player2.getSpeed() + " Speed.");


        //When both players are alive, they will roll to either attack the other or heal themselves.
        while (player1.getHealth() > 0 || player2.getHealth() > 0)
        {
            int choice1 = rnd.nextInt(10);
            if (choice1 < 7)
            {
                int dmg = player1.attack(player2);
                System.out.println(player1.getName()+ " attacks for " + dmg + " damage.");
            }
            else
            {
                int heal = player1.heal();
                System.out.println(player1.getName() + " heals for " + heal + ".");
            }

            int choice2 = rnd.nextInt(10);
            if (choice2 < 7) 
            {
                int dmg = player2.attack(player1);
                System.out.println(player2.getName()+ " attacks for " + dmg + " damage.");
            }
            else
            {
                int heal = player2.heal();
                System.out.println(player2.getName()+ " heals for " + heal + ".");
            }

            System.out.println("Status:");
            System.out.println(player1.getName()+ " Health: " +player1.getHealth());
            System.out.println(player2.getName()+ " Health: " +player2.getHealth());
            System.out.println("--------------------------------");
        }

        if (player1.getHealth() <= 0 && player2.getHealth() <= 0)
        {
            System.out.println("It's a draw!");
        }
        else if (player1.getHealth() <= 0)
        {
            System.out.println(player2.getName() + " wins!");
        }
        else
        {
            System.out.println(player1.getName() + " wins!");
        }

       
    }
}