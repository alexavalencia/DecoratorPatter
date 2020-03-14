package com.pruebaalexa.decoratorpattern;


public  class MarinerDecorator implements IMarine{
    
    public IMarine marine;

    public MarinerDecorator(IMarine marine) {
        this.marine = marine;
    }

    
    
    @Override
    public int getDamage() {
        return this.marine.getDamage();
    }

    @Override
    public void setDamage(int value) {
        this.marine.setDamage(value);
   }

    @Override
    public int getArmor() {
        return this.marine.getArmor();
   }

    @Override
    public void setArmor(int value) {
        this.marine.setArmor(value);
   }
}
