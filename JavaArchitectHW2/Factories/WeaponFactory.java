package JavaArchitectHW2.Factories;

import JavaArchitectHW2.Equipments.Weapon;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon(String weaponType);
}
