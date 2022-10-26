package JavaArchitectHW2.Factories.WeaponFactories;

import JavaArchitectHW2.Equipments.Weapons.EpicSword;
import JavaArchitectHW2.Equipments.Weapons.SimpleSword;
import JavaArchitectHW2.Equipments.Weapons.Sword;

public class SwordFactory extends WeaponFactory{

    private static SwordFactory instance;

    private SwordFactory(){};

    public static SwordFactory getFactory(){
        return instance == null ? new SwordFactory() : instance;
    };

    @Override
    public Sword createWeapon(String weaponType) {
        if (weaponType.equalsIgnoreCase("SimpleSword")) {return new SimpleSword("Wooden Sword", 2);}
        if (weaponType.equalsIgnoreCase("EpicSword")) {return new EpicSword("Mithril Sword", 5);}
        
        //ToDo если не получилось создать ни одного лука, вернуть exception неправильный weaponType (либо сделать weaponType Enum)
        return null;
    }
    
}
