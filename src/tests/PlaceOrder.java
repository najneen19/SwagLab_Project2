package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pageElements.CartPage;
import pageElements.CheckOutCompletePage;
import pageElements.CheckOutInfoPage;
import pageElements.CheckOutOverviewPage;
import pageElements.HomePage;
import pageElements.LandingPage;
import pageElements.ProductDetailPage;
import utilities.BaseTest;

public class PlaceOrder extends BaseTest{
	
	LandingPage lp;
	HomePage hp;
	CartPage cp;
	CheckOutInfoPage checkoutinfo;
	CheckOutOverviewPage checkoutoverview;
	ProductDetailPage productdetailpage;
	CheckOutCompletePage checkoutcomplete;
	
	@Test
	public void PurchaseProduct() throws IOException, InterruptedException {
		
		lp =LaunchApplication();			
				
		hp = lp.Login();
		hp.VerifyHomePage();
		productdetailpage = hp.GoToProductDetailPage();
		productdetailpage.VerifyProductDetails();
		hp.AddProductToCart();
		hp.AddMoreProductsAndCheckCount();
		cp = hp.GoToCart();
		checkoutinfo = cp.ClickOnCheckoutButton();
		checkoutoverview = checkoutinfo.FillInfo();
		checkoutcomplete = checkoutoverview.ClickOnFinishButton();
		checkoutcomplete.ClickBackHomeButton();
		
		hp.SortProduct();
		hp.Logout();
		
		lp.LoginWithIncorrectCredentials();
		
		
	}
	
}
		
	
	
	
	
	


