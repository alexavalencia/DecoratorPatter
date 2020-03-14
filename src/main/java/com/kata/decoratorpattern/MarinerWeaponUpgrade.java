package com.kata.decoratorpattern;

public class MarinerWeaponUpgrade extends MarinerDecorator{
    
    public MarinerWeaponUpgrade(IMarine marine) {
        super(marine);
        add();
    }
    
    public void add (){
        marine.setDamage(marine.getDamage()+1);
    }
    
}
