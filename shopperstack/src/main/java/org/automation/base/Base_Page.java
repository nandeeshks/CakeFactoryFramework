package org.automation.base;

import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * Every Page class must and should extend Base Page
 * In this page you will find all common elements of the Web App
 * 
 * @author Nandeesh
 * 
 */
public abstract class Base_Page extends InitObjects {

	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	@FindBy(id="loginBtn") 
	private WebElement loginButton;
	
	@FindBy(id="home") 
	private WebElement logo;
	
	@FindBy(xpath ="//H3[normalize-space(.)='Welcome to ShoppersStack. Enjoy shopping with us.']") 
	private WebElement homeText;
	
	@FindBy(id="men")
	private WebElement menLink;
	
	@FindBy(id="women")
	private WebElement womenLink;
	
	@FindBy(id="kids")
	private WebElement kids;

	@FindBy(id="electronics")
	private WebElement elecronics;
	
	@FindBy(id="beautyProducts")
	private WebElement beauty;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getLogo() {
		return logo;
	}

	public void setLogo(WebElement logo) {
		this.logo = logo;
	}

	public WebElement getHomeText() {
		return homeText;
	}

	public void setHomeText(WebElement homeText) {
		this.homeText = homeText;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public void setMenLink(WebElement menLink) {
		this.menLink = menLink;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}

	public void setWomenLink(WebElement womenLink) {
		this.womenLink = womenLink;
	}

	public WebElement getKids() {
		return kids;
	}

	public void setKids(WebElement kids) {
		this.kids = kids;
	}

	public WebElement getElecronics() {
		return elecronics;
	}

	public void setElecronics(WebElement elecronics) {
		this.elecronics = elecronics;
	}

	public WebElement getBeauty() {
		return beauty;
	}

	public void setBeauty(WebElement beauty) {
		this.beauty = beauty;
	}
	
}
