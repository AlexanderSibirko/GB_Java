package JavaArchitectHW2.Factories;

import JavaArchitectHW2.Equipments.Armor;
import JavaArchitectHW2.Equipments.Chainmail;

/**
 * MailFactory
 */
public class MailFactory extends ArmorFactory{

    @Override
    public Armor createArmor(String armorType) {
        if (armorType.equalsIgnoreCase("Basic")) {return new Chainmail("Mail armor", 1);}
        // ToDo make exception if wrong armorType demanded&
        return null;
    }

    
}