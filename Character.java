/**
 * 
 */

public class Character {
    
    private String name;
    private int health;
    private int attack;
    private int speed;

    private Boolean type;//true is warrior, false is archer, null is mage
    private final Attack[] attacks;
    private int level;
    private int experienceBar;

    public Character(String n,int hp,int atk, int spd,Boolean t)
    {
        name = n;
        health = hp;
        attack = atk;
        speed = hp;
        type = t;
        level = 0;
        experienceBar = 0;
        attacks = new Attack[6];
    }



    class Attack{

        private String title;
        private int dmg;
    }
}
