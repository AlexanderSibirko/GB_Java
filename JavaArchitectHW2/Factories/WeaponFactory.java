package JavaArchitectHW2.Factories;

import JavaArchitectHW2.Equipments.Weapon;

public abstract interface EquipmentFactory {
    public Weapon createWeapon(String weaponType);
    public Armor createWeapon(String weaponType);
}
