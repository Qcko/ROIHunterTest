import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TMobileHelpPage {
    /**handles operations on help page**/
    public static void goToLink(WebDriver driver, String s) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement link = driver.findElement(By.partialLinkText(s));
        wait.until(ExpectedConditions.elementToBeClickable(link));
        link.click();
    }
}
