package com.Ylighting.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
/*****************************************************
* CREATED BY: Dawood Shaik
* CREATED DATE: 17-05-2021
* APPLICATION NAME: YLighting
******************************************************/
public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	/**************** Login Page and Home Page WebElements **************/
	
	@FindBy(xpath = "//input[@id='dwfrm_login_username']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='dwfrm_login_password']")
	WebElement Password;
	
	@FindBy(xpath = "//span[contains(text(),'Sign In')]")
	WebElement LoginButton;
	
	@FindBy(className = "ltkpopup-close")
	WebElement ClosePopup;
	
	@FindBy(xpath = "//header/div[2]/div[4]/ul[1]/li[2]/div[1]/button[1]/span[1]")
	WebElement Account;
	
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	WebElement Account1;
	
	@FindBy(xpath = "//header/div[2]/div[4]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement SignIn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	WebElement SignOut;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
	WebElement Track;
	
	@FindBy(xpath = "//header/div[2]/div[2]/a[1]")
	WebElement Logo;
	
	@FindBy(xpath = "//input[@id='searchinput']")
	WebElement Search;
	
	@FindBy(xpath = "//button[@id='simplesearchbtn']")
	WebElement Searchbtn;
	
	@FindBy(xpath = "//span[contains(@title,'ceiling')]") 
	WebElement CEILING;
    @FindBy(xpath = "//a[contains(.,'All Chandeliers')]") 
    WebElement AllChandeliers;
    @FindBy(xpath = "//img[contains(@alt,'Chandeliers Globe Chandeliers')]") 
    WebElement  Globechandeliers;
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='main']/div[5]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]") 
    WebElement Product;  
    @FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
    WebElement Filter;
    @FindBy(xpath = "(//button[@id='add-to-cart'])[1]") 
    WebElement Addcart;
    @FindBy(xpath = "//body/div[@id='global-wrapper']/div[@id='wrapper']/div[@id='modalList']/div[@id='atcModal']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]") 
    WebElement Checkout;
    @FindBy(xpath = "//button[@value='Remove']") 
    WebElement Remove;
    @FindBy(name = "dwfrm_cart_couponCode") 
    WebElement Coupon;
    @FindBy(xpath = "//span[contains(text(),'Apply')]") 
    WebElement Apply;
    @FindBy(xpath = "//tbody/tr[4]/td[1]/div[1]/input[1]") 
    WebElement ZIPCode;
    @FindBy(xpath = "//tbody/tr[4]/td[1]/div[1]/input[2]") 
    WebElement Go;
    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/span[2]") 
    WebElement Quantity;
    
    @FindBy(xpath = "//div[contains(text(),\"Live Chat\")]") 
    WebElement LiveChat;
    @FindBy(xpath = "//input[@id='txt_4167837']") 
    WebElement LiveChat_Name;
    @FindBy(xpath = "//input[@id='txt_4167838']") 
    WebElement LiveChat_Email;
    @FindBy(xpath = "//button[contains(text(),'Submit')]") 
    WebElement LiveChat_Submit;
    
    
    
    
	/**************** Login Page and Home Page Actions **************/
	
	public void setEmail(String uname) throws Exception
	{
		Thread.sleep(3000);
		//WebElement Email =new WebDriverWait(ldriver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dwfrm_login_username")));
		Email.sendKeys(uname);
		
	}
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void Account() throws Exception {
		Thread.sleep(3000);
		Actions actions = new Actions(ldriver);
		actions.moveToElement(Account).perform();
		
	}
	
	public void SignIn() {
		SignIn.click();		
	}
	public void LoginButton() throws Exception {
		LoginButton.click();
		Thread.sleep(3000);
		//LoginButton.sendKeys(Keys.ENTER);
		//WebElement LoginButton =new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/div[2]/button[2]/span[1]")));
		//JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		//jse.executeScript("arguments[0].click()", LoginButton);
		//Actions actions = new Actions(ldriver);
		//actions.moveToElement(LoginButton).click().build().perform();
	}
	public void ClosePopup()
	{
		ClosePopup.click();
	}
	public void Track() throws Exception  {
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Track);
		Thread.sleep(3000);
		
	}
	public void Logo() {
		boolean logoPresent = ldriver.findElement(By.xpath("//header/div[2]/div[2]/a[1]")).isDisplayed();
		System.out.println(logoPresent);
	}
	
	public void SignOut() throws Exception
	{
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", SignOut);
		//SignOut.click();
		Thread.sleep(3000);
	}
	public void Account1() throws Exception {
		Thread.sleep(3000);
		Actions actions = new Actions(ldriver);
		actions.moveToElement(Account1).perform();
}
	public void Search() throws Exception
	{		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Search);	
		Search.sendKeys("Fans");		
	}
	public void Searchbtn()
	{		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Searchbtn);
	}
	public void Scrolldown() {
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void Scrollup() {
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("window.scrollBy(0,-250)");
	}
	public void CEILING()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", CEILING);
	}
	public void AllChandeliers()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", AllChandeliers);
	}
	public void Globechandeliers()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Globechandeliers);
	}
	public void Filter()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Filter);
	}
	public void Product()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Product);
	}
	public void Addcart()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Addcart);
	}
	public void Checkout()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Checkout);
	}
	public void Remove() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Remove);
	}
	public void Coupon(){
		Coupon.sendKeys("123456");
	}
	public void Apply(){
		Apply.click();
	}
	public void ZIPCode(){
		ZIPCode.sendKeys("0000123");
	}
	public void Go(){
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Go);
	}
	public void Quantity(){
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", Quantity);
	}
	public void LiveChat() throws Exception{
		Thread.sleep(8000);
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()", LiveChat);
		
	}
	public void LiveChat_Name() throws Exception{
		//Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(ldriver,60) ;
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txt_4167837']")));
		LiveChat_Name.sendKeys("TEST");
	}
	public void LiveChat_Email(){
		LiveChat_Email.sendKeys("Test123456@gmail.com");
	}
	public void LiveChat_Email2(){
		LiveChat_Email.sendKeys("Test123456");
	}
	public void LiveChat_Submit() throws Exception{
		LiveChat_Submit.click();;
		Thread.sleep(8000);
	}
	
}