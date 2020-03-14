
package com.kata.decoratorpattern;

public class MarineArmorUpgrade extends MarinerDecorator{
    
    public MarineArmorUpgrade(IMarine marine) {
        super(marine);
        add();
    }
    public void add (){
        marine.setArmor(marine.getArmor()+1);
    }
    
}
