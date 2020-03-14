package com.pruebaalexa.decoratorpattern;


public class Marine implements IMarine{
    
    private int damage;
    private int armor;

    public Marine(int damage, int armor) {
        this.damage = damage;
        this.armor = armor;
    }
    

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public void setDamage(int value) {
        this.damage=value;
   }

    @Override
    public int getArmor() {
        return this.armor;
   }

    @Override
    public void setArmor(int value) {
        this.armor=value;
   }
    
    
}
