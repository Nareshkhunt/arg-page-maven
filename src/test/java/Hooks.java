import com.vedant2.selenium.traning.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        driverManager.runOnLocalHost();
       // driverManager.runOnRemoteHost();
        driverManager.navigateTo("https://www.argos.co.uk");
        driverManager.maxBrowser();
        driverManager.applyImplicit();
        driverManager.handleCookies();
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}


