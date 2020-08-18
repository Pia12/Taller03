package factoryBrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Owasp implements IBrowser{
    @Override
    public WebDriver create() {
        String rutaDriver="D:\\Taller02\\JBRepositorio\\JBRepositorio\\src\\test\\java\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",rutaDriver);

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("127.0.0.1:8888");
        proxy.setSslProxy("127.0.0.1:8888");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy", proxy);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-memory-info");
        options.addArguments("--no-sandbox");
        options.addArguments("allow-file-access-from-files");
        options.addArguments("use-fake-device-for-media-stream");
        options.addArguments("use-fake-ui-for-media-stream");
        options.addArguments("ignore-certificate-errors");
        options.addArguments("ignore-certificate-errors");
        options.setExperimentalOption("prefs", prefs);

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
