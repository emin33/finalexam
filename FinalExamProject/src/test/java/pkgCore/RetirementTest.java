package pkgCore;

import org.junit.Test;
import static org.junit.Assert.*;

public class RetirementTest {
	@Test
	public void Retirement_Test() {
		Retirement r1 = new Retirement(40, 7, 20, 2, 10000, 2642);
		assertEquals(554.13, r1.AmountToSave());
		assertEquals(1,454,485.55, r1.TotalAmountSaved());
	}
}
