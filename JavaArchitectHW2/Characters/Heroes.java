package JavaArchitectHW2.Characters;

import JavaArchitectHW2.Equipments.Armor;
import JavaArchitectHW2.Equipments.Weapon;

public abstract class Heroes {
    protected String name;
    protected int hp;
    protected Weapon weapon;
    protected Armor armor;

    public Heroes(String name, int hp, Weapon weapon, Armor armor) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.armor = armor;
    }
}
