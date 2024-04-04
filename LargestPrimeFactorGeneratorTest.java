package tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LargestPrimeFactorGeneratorTest {

	 LargestPrimeFactorGenerator generator = new LargestPrimeFactorGenerator();
	    
	    @Test
	    public void testGetLargestPrimeFactor() {
	        assertEquals(3, generator.getLargestPrimeFactor(6));
	        assertEquals(5, generator.getLargestPrimeFactor(15));
	    }
	    
}
