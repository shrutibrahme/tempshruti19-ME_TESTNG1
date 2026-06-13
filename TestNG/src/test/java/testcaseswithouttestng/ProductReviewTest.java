package testcaseswithouttestng;

import pages.ProductReviewPage;

import org.testng.annotations.Test;

public class ProductReviewTest extends BaseTest{

	@Test(description = "Verify adding review to the purchase product", priority = 2, groups = {"P2"})
	public void verifyAddingReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.addProductReview("Good");
	}

	@Test(description = "Verify editing review for purchase product", priority = 2, groups = {"P2"})
	public void verifyEditReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.editProductReview("Excellent");
	}
}