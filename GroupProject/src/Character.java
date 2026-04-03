public class character{
    private String Name;
    private int Health;
    private int Strength;
    private int Speed;

    private static final int IN_HP = 100;
    private static final int IN_ATK = 5;
    private static final int IN_HEAL = 4;
    
    public Character(String name, int health, int regenspeed)
        {
            Name = name;
            Health = health;
            RegenSpeed = regenspeed;
        }
}
