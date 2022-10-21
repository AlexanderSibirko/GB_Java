package JavaArchitectHW2.Factories.ArmorFactories;
import JavaArchitectHW2.Equipments.Armors.Armor;

/**
 * ArmorFactory
 */
public abstract class  ArmorFactory {
    public abstract Armor createArmor(String armorType);
}