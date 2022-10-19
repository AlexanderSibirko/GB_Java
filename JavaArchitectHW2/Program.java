package JavaArchitectHW2;

import JavaArchitectHW2.Factories.BowFactory;
import JavaArchitectHW2.Factories.SwordFactory;
import JavaArchitectHW2.Factories.WeaponFactory;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        WeaponFactory bowFactory = new BowFactory();
        WeaponFactory swordFactory = new SwordFactory();

        Character Me = new Archer("Alexander the Greate", 20, bowFactory.createWeapon("EpicBow"),);

    }
}