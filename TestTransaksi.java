package ewallet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTransaksi {
    
    public TestTransaksi() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
        @Test
    public void testTopup() {
        System.out.println("Topup: ");
        
        Ewallet s = new Ewallet();
        s.Topup(5);
        s.Display();
        s.Enter();
   
        Float expectedResult = 105f;
        assertEquals((Float) expectedResult, (Float) s.balance);
    }

    @Test
    public void testPayment() {
        System.out.println("Transaction: ");
        
        Ewallet s = new Ewallet();
        s.Payment(20);
        s.Display();

        Float expectedResult = 80f;
        assertEquals((Float) expectedResult, (Float) s.balance);
    } 
}

