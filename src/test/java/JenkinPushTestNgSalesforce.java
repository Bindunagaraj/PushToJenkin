import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinPushTestNgSalesforce {

    @Test
    public void method1()
    {
        System.out.println("Method 1");
    }

    @Test
    public void method2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://qa-tekarch.firebaseapp.com");
        driver.close();
        System.out.println("Method 2");
    }

    @Test
    public void method3()
    {
        System.out.println("Method 3");
    }

    @Test
    public void method4()
    {
        System.out.println("Method 4");
    }
}

