package online.tekwillacademy.managers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class ScrollManager {
    public static void scrollToElement(WebElement webElement) throws InterruptedException {

        // This section will scroll down to the button we want to click privacyToogle
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) DriverManager.getInstance().getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(false);", webElement);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
