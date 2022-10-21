package JavaArchitectHW2.Factories.Character_Factories_Abstact;

import JavaArchitectHW2.Characters.Heroes;

/**
 * CharacterFactory
 */
public interface CharacterFactory <T extends Heroes> {
    public T CreateCharater(String name, String weaponName, String armorName);
}