package testcaseswithouttestng;


import pages.AddressPage;

import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	
	@Test(description = "Verify adding delivery address functionality", priority = 1, groups = {"P1"})
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
	}
	
	@Test(description = "Verify editing existing delivery address functionality", priority = 2, groups = {"P2"})
	public void verifyEditingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.editAddress("Mumbai");
	}
	
}