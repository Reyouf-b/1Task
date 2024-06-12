package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class checks extends PageBase
{

	public checks(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/div/div[2]/strong")
	WebElement typeksa ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/b")
	WebElement priceksa ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/i")
	WebElement currencyksa ;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div[1]/span")
	WebElement country ;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/a[3]/div/img")
	WebElement countrykwt ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/div/div[2]/strong")
	WebElement typekwt ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/b")
	WebElement pricekwt ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/i")
	WebElement currencykwt ;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/a[1]/div/img")
	WebElement countryBHRN ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/div/div[2]/strong")
	WebElement typeBHRN ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/b")
	WebElement priceBHRN ;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/i")
	WebElement currencyBHRN ;
	
	
	public void packagesksa( ) throws InterruptedException 
	{
		
		System.out.println(typeksa.getText());
		System.out.println(priceksa.getText());
		System.out.println(currencyksa.getText());
		
		assertEquals("CLASSIC", typeksa.getText());
		assertEquals("25", priceksa.getText());
		assertEquals("SAR/month", currencyksa.getText());
		Thread.sleep(2000);
	}
		
	public void packageskWT( ) throws InterruptedException 
	{
		country.click();
		countrykwt.click();
		Thread.sleep(2000);
		System.out.println(typekwt.getText());
		System.out.println(pricekwt.getText());
		System.out.println(currencykwt.getText());
		Thread.sleep(2000);
		assertEquals("CLASSIC", typekwt.getText());
		assertEquals("2.5", pricekwt.getText());
		assertEquals("KWD/month", currencykwt.getText());
		Thread.sleep(2000);
	}
	
	public void packagesBHRN( ) throws InterruptedException 
	{
		country.click();
		countryBHRN.click();
		Thread.sleep(2000);
		System.out.println(typeBHRN.getText());
		System.out.println(priceBHRN.getText());
		System.out.println(currencyBHRN.getText());
		Thread.sleep(2000);
		assertEquals("CLASSIC", typeBHRN.getText());
		assertEquals("3", priceBHRN.getText());
		assertEquals("BHD/month", currencyBHRN.getText());
		
		
	}

}
