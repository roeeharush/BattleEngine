public abstract class BaseCharacter
{
    private int maxHealth;
    private int health;
    String name;
    private int strength;

    public BaseCharacter(int health, String name, int strength)
    {
        this.health = health;
        this.name = name;
        this.strength = strength;
        this.maxHealth = health;

    }

    void takeDamage(int damage)
    {
        if(this.health - damage <= 0)
            this.health = 0;
        else
            this.health -= damage;
    }

    public abstract void attack(BaseCharacter c);

}
