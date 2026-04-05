public class Character{
    private String Name;
    private int Health;
    private int Strength;
    private int RegenSpeed;
    private int CritChance;
    
    public Character(String name, int health, int regenspeed, int strength, int critchance)
        {
            Name = name;
            Strength = strength;
            Health = health;
            RegenSpeed = regenspeed;
            CritChance = critchance;
        }

    public Character()
        {
            Name = "Adventurer";
            Health = 100;
            Strength = 5;
            RegenSpeed = 4;
            CritChance = 10;
        }

    public String toString() {
        return ("Name: "+Name+" | Health: "+Health+" | Strength: "+Strength+" | Regen Speed: "+RegenSpeed+" | Crit Chance: "+CritChance);
    }

    public String getName() {
        return Name;
    }

    public int getHealth() {
        return Health;
    }

    public int getRegenSpeed() {
        return RegenSpeed;
    }

    public int getCrit() {
        return CritChance;
    }
}
