package lab8;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest
{

    @Test
    public void testGamePiece()
    {
        GamePiece gp = null;
        
       //RED_RACER
        gp = GamePiece.RED_RACER;
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getColor(), Color.RED);
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getShape(), Shape.RACECAR);
        //BLUE_RACER
        gp = GamePiece.BLUE_RACER;
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getColor(), Color.BLUE);
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getShape(), Shape.RACECAR);
        //Magenta_Racer
        gp = GamePiece.MAGENTA_RACER;
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getColor(), Color.MAGENTA);
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getShape(), Shape.RACECAR);
        //Red_Thimble
        gp = GamePiece.RED_THIMBLE;
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getColor(), Color.RED);
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getShape(), Shape.THIMBLE);
        //Blue_Boot
        gp = GamePiece.BLUE_BOOT;
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getColor(), Color.BLUE);
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getShape(), Shape.BOOT);
        //Green Boot
        gp = GamePiece.GREEN_BOOT;
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getColor(), Color.GREEN);
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getShape(), Shape.BOOT);
        //yellow boot
        gp = GamePiece.YELLOW_BOOT;
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getColor(), Color.YELLOW);
        Assert.assertEquals ( "The gamepiece is incorrect " + gp.toString(), gp.getShape(), Shape.BOOT);
        
        
    }

}
