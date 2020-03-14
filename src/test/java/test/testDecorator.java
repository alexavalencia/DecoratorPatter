package test;

import com.pruebaalexa.decoratorpattern.IMarine;
import com.pruebaalexa.decoratorpattern.Marine;
import com.pruebaalexa.decoratorpattern.MarineArmorUpgrade;
import com.pruebaalexa.decoratorpattern.MarinerWeaponUpgrade;
import org.junit.Test;
import org.junit.Assert;

public class testDecorator{
   
    @Test
    public void testDecoratoWeaponUpgrade1(){
        IMarine marinerDecorator= new MarinerWeaponUpgrade(new Marine(10,1));
        Assert.assertEquals(11,marinerDecorator.getDamage());
        
    }
    @Test
    public void testDecoratoWeaponUpgrade2(){
        IMarine marinerDecorator= new MarinerWeaponUpgrade(new Marine(10,1));
        marinerDecorator= new MarinerWeaponUpgrade(marinerDecorator);
        Assert.assertEquals(12,marinerDecorator.getDamage());
        
    }
    
    @Test
    public void testDecoratoArmorUpgrade1(){
        IMarine marinerDecorator= new MarineArmorUpgrade(new Marine(10,1));
        Assert.assertEquals(2,marinerDecorator.getArmor());
        
    }
  
}
