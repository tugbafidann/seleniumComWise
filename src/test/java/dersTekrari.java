import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dersTekrari {
    public static void main(String[] args) throws InterruptedException {
      //1.Yeni bir class olusturalim (Homework)
        // 2.ChromeDriver kullanarak, facebook sayfasina gidin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
        // ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.

        String actualTitle=driver.getTitle();
        //System.out.println("wqTitle = " + wqTitle);
        //        boolean isTrue = wqTitle.contains("Quarter");
        boolean isTrue=actualTitle.equals("facebook");
        if (isTrue){
            System.out.println("Facebook title testi PASSED");
        }else {
            System.out.println("Facebook title testi FAİLED");
            System.out.println(driver.getTitle());
        }
        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl=driver.getCurrentUrl();
        //System.out.println("wqTitle = " + wqTitle);
        //        boolean isTrue = wqTitle.contains("Quarter");
        boolean urlisTrue=actualUrl.contains("facebook");
        if (urlisTrue){
            System.out.println("Facebook url testi PASSED");
        }else {
            System.out.println("Facebook url testi FAİLED");
            System.out.println(driver.getCurrentUrl());
        }
        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
        // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle= driver.getTitle();
        boolean walmartTitleIsTrue=actualWalmartTitle.contains("Walmart.com");
        if (walmartTitleIsTrue){
            System.out.println("Walmart title testi PASSED");
        }else {
            System.out.println("Walmart title testi FAİLED");
        }
        // 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        // 7. Sayfayi yenileyin
        driver.navigate().refresh();
        // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        // 9.Browser’i kapatin*/
        Thread.sleep(3000);
        driver.close();

    }

}
