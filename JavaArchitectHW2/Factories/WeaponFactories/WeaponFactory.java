package JavaArchitectHW2.Factories.WeaponFactories;

import JavaArchitectHW2.Equipments.Weapons.Weapon;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon(String weaponType);
}
