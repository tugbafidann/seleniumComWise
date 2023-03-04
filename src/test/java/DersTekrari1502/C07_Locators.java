package DersTekrari1502;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Locators {
    public static void main(String[] args) throws InterruptedException {
        //1. http://zero.webappsecurity.com sayfasina gidin
        //2. Signin buttonuna tiklayin
        //3. Login alanine  “username” yazdirin
        //4. Password alanine “password” yazdirin
        //5. Sign in buttonuna tiklayin
        //6. Pay Bills sayfasina gidin
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //8. tarih kismina “2020-09-10” yazdirin
        //9. Pay buttonuna tiklayin
        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin
    }
    //
    /*
    Web sitesine git https://testpages.herokuapp.com/styled/index.html
    ORİJİNAL içeriğin altında
    uyarılara tıklayın
    URL'yi yazdır
    geri git
    URL'yi yazdır
    Temel Ajax'a tıklayın
    URL'yi yazdır
            20 değerini girin ve girin
    ve sonra Gönderilen Değerlerin açık sayfada görüntülendiğini doğrulayın
    sürücüyü kapat
    */
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

}
