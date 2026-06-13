package testcaseswithouttestng;

import pages.OrderTrackingPage;

import org.testng.annotations.Test;

public class OrderTrackingTest extends BaseTest{

	@Test(description = "Verify the order tracking functionality ", priority = 1, groups = {"P1"})
	public void verifyOrderTracking() {
		OrderTrackingPage orderTrackingPage = new OrderTrackingPage();
		orderTrackingPage.trackOrder("order_987684");
	}
}
