/**
 * 
 */
package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jcblomquist
 *
 */
public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}

	/**
	 * Test method for {@link edu.csbsju.ntc.NewTelephoneCompany#computeCharge()}.
	 */
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart1() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart4() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart6() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart7() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration1() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration2() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration3() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	@Test
	public void testComputeChargeDiscountedStartAndDuration() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double expResult = 1768.00;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(759);
		ntc.setDuration(61);
		expResult = 1078.48;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		expResult = 1078.48;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		expResult = 1149.20;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
	}
	
	@Test
	public void testComputeChargeDiscountedStart() { 
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double expResult = 1248.00;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(400);
		ntc.setDuration(59);
		expResult = 1227.20;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(759);
		ntc.setDuration(1);
		expResult = 20.80;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		expResult = 208.80;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		expResult = 208.80;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		expResult = 208.80;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
	}
	
	@Test
	public void testComputeChargeDiscountedDuration() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double expResult = 2298.40;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(900);
		ntc.setDuration(61);
		expResult = 2156.96;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
	}
	
	@Test
	public void testComputeChargeNoDiscounts() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double expResult = 1664.00;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(800);
		ntc.setDuration(1);
		expResult = 41.60;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(801);
		ntc.setDuration(59);
		expResult = 2454.40;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		expResult = 2496.00;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
	}

	@Test
	public void testGetHours() {
        int expResult = 0;
        int result = ntc.getStartTime();
        assertEquals("Hours is " + expResult,expResult, result);
	}

	@Test
	public void testSetHours() {
        int expResult = 40;
        ntc.setStartTime(expResult);
        int result = ntc.getStartTime();
        assertEquals("Hours is now " + expResult,expResult, result);
	}

	@Test
	public void testGetDuration() {
        int expResult = 0;
        int result = ntc.getDuration();
        assertEquals("Length is" + expResult,expResult, result);
	}

	@Test
	public void testSetDuration() {
        int expResult = 40;
        ntc.setDuration(expResult);
        int result = ntc.getDuration();
        assertEquals("Length is now " + expResult,expResult, result);
	}
}
