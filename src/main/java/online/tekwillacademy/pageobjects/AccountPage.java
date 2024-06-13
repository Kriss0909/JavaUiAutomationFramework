package online.tekwillacademy.pageobjects;

import online.tekwillacademy.managers.ScrollManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Page{

   public AccountPage(WebDriver driver){
       super(driver);
   }

    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    private WebElement logoutBtn;

   public void clickOnLogoutButton(){
       try {
           ScrollManager.scrollToElement(logoutBtn);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       logoutBtn.click();
       System.out.println("The logout btn was clicked");
   }
}
