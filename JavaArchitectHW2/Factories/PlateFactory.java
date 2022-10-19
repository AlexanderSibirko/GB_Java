package JavaArchitectHW2.Factories;

import JavaArchitectHW2.Equipments.Armor;
import JavaArchitectHW2.Equipments.Platemail;

/**
 * PlateFactory
 */
public class PlateFactory extends ArmorFactory{

    @Override
    public Armor createArmor(String armorType) {
        if (armorType.equalsIgnoreCase("Basic")) {return new Platemail("Plate armor", 3);}

        //ToDo return not null if wrong armorType requested?
        return null;
    }

    
}