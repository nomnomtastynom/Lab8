package lab8;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest
{

    @Test
    public void testShapetoString()
    {
        
        Assert.assertEquals ( "Shape to String incorrect.","Thimble" , Shape.THIMBLE.toString());
        Assert.assertEquals ( "Shape to String incorrect.","BOOT" , Shape.BOOT.toString());
        Assert.assertEquals ( "Shape to String incorrect.","RACECAR" , Shape.RACECAR.toString());
    }

    

}
