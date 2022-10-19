package JavaArchitectHW2.Characters;

import JavaArchitectHW2.Equipments.Armor;
import JavaArchitectHW2.Equipments.Weapon;

public abstract class Character {
    protected String name;
    protected int hp;
    protected Weapon weapon;
    protected Armor armor;

    public Character(String name, int hp, Weapon weapon, Armor armor) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.armor = armor;
    }
}
