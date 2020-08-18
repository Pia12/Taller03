package sesionManager;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class SesionManager {

    private static SesionManager sesionManager = null;
    private WebDriver driver;
    private SesionManager(){
        driver = FactoryBrowser.make("owasp").create();
    }

    public static SesionManager getInstance(){
        if (sesionManager == null)
            sesionManager = new SesionManager();
        return  sesionManager;
    }

    public WebDriver getDriver(){
        return driver;
    }
    public  void close(){
        driver.close();
        sesionManager=null;
    }

}
