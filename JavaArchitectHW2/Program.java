package JavaArchitectHW2;

import JavaArchitectHW2.Characters.Heroes;
import JavaArchitectHW2.Characters.Knight;
import JavaArchitectHW2.Characters.Archer;
import JavaArchitectHW2.Factories.ArmorFactories.ArmorFactory;
import JavaArchitectHW2.Factories.ArmorFactories.MailFactory;
import JavaArchitectHW2.Factories.ArmorFactories.PlateFactory;
import JavaArchitectHW2.Factories.Character_Factories_Abstact.ArcherFactory;
import JavaArchitectHW2.Factories.Character_Factories_Abstact.KnightFactory;
import JavaArchitectHW2.Factories.WeaponFactories.BowFactory;
import JavaArchitectHW2.Factories.WeaponFactories.SwordFactory;
import JavaArchitectHW2.Factories.WeaponFactories.WeaponFactory;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        WeaponFactory bowFactory = BowFactory.getFactory();
        WeaponFactory swordFactory = SwordFactory.getFactory();
        ArmorFactory mailFactory = MailFactory.getFactory();
        ArmorFactory plateFactory = PlateFactory.getFactory();

        Heroes Archer = new Archer("Archy", 20, bowFactory.createWeapon("EpicBow"), mailFactory.createArmor("Basic"));
        Heroes Knight = new Knight("Knity", 50, swordFactory.createWeapon("SimpleSword"), plateFactory.createArmor("Basic"));

        System.out.println(Archer.getCharInfoString());
        System.out.println("");
        System.out.println(Knight.getCharInfoString());

        System.out.println("-------------------");


        //characters Abstact factory method
        Heroes Archer2 = ArcherFactory.getFactory().CreateCharater("Mikle", "SimpleBow", "Non exiting armor name");
        Heroes Knight2 = KnightFactory.getFactory().CreateCharater("WIlliam", "EpicSword", "Basic");
        
        System.out.println(Archer2.getCharInfoString());
        System.out.println("");
        System.out.println(Knight2.getCharInfoString());
    }
}
