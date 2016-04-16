import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FibonacciTest extends TestCase {

Fibonacci fibonacci=new Fibonacci();
	
	//hihihihi
	@Test(timeout = 100)
	public void testGenerateFebbInputNegative() {
		List<Integer> results = fibonacci.generateFebb(-3);
		Assert.assertNotNull(results);
		Assert.assertEquals("Mismatch in values", 0, results.size());
	}
	
	@Test
	public void testGenerateFebbInputZero() {
		List<Integer> results = fibonacci.generateFebb(0);
		Assert.assertNotNull(results);
		Assert.assertEquals("Mismatch in values", 0, results.size());
	
	}

	@Test
	public void testGenerateFebbInputIsOne() {
		List<Integer> results = fibonacci.generateFebb(1);
		Assert.assertNotNull(results);
		Assert.assertEquals("Mismatch in values", 1, results.size());
		Assert.assertEquals(new Integer(0), results.get(0));
	}

	@Test
	public void testGenerateFebbInputIsTw0() {
		List<Integer> results = fibonacci.generateFebb(2);
		Assert.assertNotNull(results);
		Assert.assertEquals("Mismatch in values", 2, results.size());
		Assert.assertEquals(new Integer(0), results.get(0));
		Assert.assertEquals(new Integer(1), results.get(1));
	}
	
	

	@Test
	public void testGenerateFebb() {
		List<Integer> results = fibonacci.generateFebb(5);
		Assert.assertNotNull(results);
		Assert.assertEquals("Mismatch in values", 5, results.size());
		Assert.assertEquals(new Integer(0), results.get(0));
		Assert.assertEquals(new Integer(1), results.get(1));
		Assert.assertEquals(new Integer(1), results.get(2));
		Assert.assertEquals(new Integer(2), results.get(3));
		Assert.assertEquals(new Integer(3), results.get(4));
	}

}
