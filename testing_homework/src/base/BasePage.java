package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

    public abstract class BasePage {
        protected WebDriver driver;
        protected WebDriverWait wait;

        public BasePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, 20);
            PageFactory.initElements(driver, this);
        }

        protected void waitForElementToBeVisible(WebElement element) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }

        protected void click(WebElement element) {
            waitForElementToBeVisible(element);
            element.click();
        }

        protected void type(WebElement element, String text) {
            waitForElementToBeVisible(element);
            element.clear();
            element.sendKeys(text);
        }
    }

