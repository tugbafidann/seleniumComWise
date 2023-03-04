import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverNavigateMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // amazon anasayfasina gidin
        driver.get("https://www.amazon.com");
        // wisequarter anasayfasina gidin
        driver.get("https://wisequarter.com/");

        // yeniden amazona gidin
        driver.navigate().back();

        // wisequarter anasayfaya donun
        driver.navigate().forward();

        // navigate.to() , driver.get() ile ayni islemi yapar
        driver.navigate().to("https://youtube.com");

        driver.navigate().refresh();
    }
}
