package JavaArchitectHW2.Factories;

import JavaArchitectHW2.Equipments.EpicBow;
import JavaArchitectHW2.Equipments.SimpleBow;
import JavaArchitectHW2.Equipments.Weapon;

public class BowFactory extends WeaponFactory{

    @Override
    public Weapon createWeapon(String weaponType) {
        if (weaponType.equalsIgnoreCase("SimpleBow")) {return new SimpleBow("Wooden Bow", 1, 3);}
        if (weaponType.equalsIgnoreCase("EpicBow")) {return new EpicBow("Elven Bow", 3, 4);}
        
        //ToDo если не получилось создать ни одного лука, вернуть exception неправильный weaponType
        return null;
    }
    
}
