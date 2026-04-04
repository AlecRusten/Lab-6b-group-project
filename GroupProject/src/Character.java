public class Character{
    private String Name;
    private int Health;
    private int Strength;
    private int Speed;
    private int CritChance = 10;

    private static final int IN_HP = 100;
    private static final int IN_ATK = 5;
    private static final int IN_HEAL = 4;
    
    public Character(String name, int health, int regenspeed)
        {
            Name = name;
            Health = health;
            Speed = regenspeed;
        }

        public String getName() {
            return Name;
        }

        public int getHealth() {
            return Health;
        }

        public int getSpeed() {
            return Speed;
        }

        public int getCrit() {
            return CritChance;
        }
        
}
