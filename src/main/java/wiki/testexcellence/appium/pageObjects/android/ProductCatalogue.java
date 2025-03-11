package wiki.testexcellence.appium.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import wiki.testexcellence.appium.pageObjects.android.CartPage;
import wiki.testexcellence.appium.utils.AndroidActions;

import java.util.List;

public class ProductCatalogue extends AndroidActions {

	AndroidDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='ADD TO CART']")
	private List<WebElement> addToCart;
	//driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']"))
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cart;
	

	
	public ProductCatalogue(AndroidDriver driver)
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	public void addItemToCartByIndex(int index)
	{
		addToCart.get(index).click();
	
	}
	public wiki.testexcellence.appium.pageObjects.android.CartPage goToCartPage() throws InterruptedException
	{
		cart.click();
		Thread.sleep(2000);
		return new CartPage(driver);
		
		
		
	}
	
}
