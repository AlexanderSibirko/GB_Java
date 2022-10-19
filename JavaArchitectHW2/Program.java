package JavaArchitectHW2;

import JavaArchitectHW2.Characters.Heroes;
import JavaArchitectHW2.Characters.Archer;
import JavaArchitectHW2.Factories.ArmorFactory;
import JavaArchitectHW2.Factories.BowFactory;
import JavaArchitectHW2.Factories.MailFactory;
import JavaArchitectHW2.Factories.PlateFactory;
import JavaArchitectHW2.Factories.SwordFactory;
import JavaArchitectHW2.Factories.WeaponFactory;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        WeaponFactory bowFactory = new BowFactory();
        WeaponFactory swordFactory = new SwordFactory();
        ArmorFactory mailFactory = new MailFactory();
        ArmorFactory plateFactory = new PlateFactory();

        Heroes Me = new Archer("Alexander the Greate", 20, bowFactory.createWeapon("EpicBow"), mailFactory.createArmor("Basic"));

    }
}
