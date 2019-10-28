package tommaso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test(){
        App app = new App();
        assertFalse(App.ControlloArray(new int[]{121,144,19},new int[]{12,1}));
    }



    ;
    }

