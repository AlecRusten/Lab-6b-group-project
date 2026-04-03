import java.util.Random;
import java.util.Scanner;
public class BattleSim
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        String name = kbd.nextLine();
        System.out.println("Welcome to the battle, " + name + "!");
        character player = new character(name);
        System.out.println("Your stats are: " + player.getHealth() + " Health, " + player.getStrength() + " Attack, and " + player.getSpeed() + " Speed.");
        

    }
}