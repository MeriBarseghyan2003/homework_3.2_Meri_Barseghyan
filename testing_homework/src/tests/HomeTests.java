package tests;
import base.BaseTest;
import org.testng.annotations.Test;
public class HomeTests  extends BaseTest{
    @Test
    public void testHomeNavigation() {
        HomePage homePage = new HomePage(driver);
        homePage.goToHome();
    }

}
