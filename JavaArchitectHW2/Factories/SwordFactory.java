package JavaArchitectHW2.Factories;

import JavaArchitectHW2.Equipments.EpicSword;
import JavaArchitectHW2.Equipments.SimpleSword;
import JavaArchitectHW2.Equipments.Weapon;

public class SwordFactory extends WeaponFactory{

    @Override
    public Weapon createWeapon(String weaponType) {
        if (weaponType.equalsIgnoreCase("SimpleSword")) {return new SimpleSword("Wooden Sword", 1);}
        if (weaponType.equalsIgnoreCase("EpicSword")) {return new EpicSword("Mithril Sword", 3);}
        
        //ToDo если не получилось создать ни одного лука, вернуть exception неправильный weaponType
        return null;
    }
    
}
