package JavaArchitectHW2.Factories.Character_Factories_Abstact;

import JavaArchitectHW2.Characters.Knight;
import JavaArchitectHW2.Equipments.Armors.Platemail;
import JavaArchitectHW2.Equipments.Weapons.Sword;
import JavaArchitectHW2.Factories.ArmorFactories.PlateFactory;
import JavaArchitectHW2.Factories.WeaponFactories.SwordFactory;

/**
 * KnightFactory (singleton) - to make only one factory ever exist, whenever some one want to get one
 */
public class KnightFactory implements CharacterFactory<Knight>{

    private static KnightFactory instance;

    private KnightFactory(){};

    public static KnightFactory getFactory(){
        return instance == null ? new KnightFactory() : instance;
    };

    @Override
    public Knight CreateCharater(String name,  String weaponName, String armorName) {
        return new Knight(name, 35, makeWeapon(weaponName), makeArmor(armorName));
    };

    private Platemail makeArmor(String armorName){
        return PlateFactory.getFactory().createArmor(armorName);
    };

    private Sword makeWeapon(String weaponName){
        return SwordFactory.getFactory().createWeapon(weaponName);
    }
}