package DersTekrari1502;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Category {
    //1- Bir test class’i olusturun ilgili ayarlari yapin
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
        driver.close();
    }

    @Test
    public void test01(){
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
        //3- Category bolumundeki elementleri locate edin

       /* WebElement womenElementi= driver.findElement(By.xpath("//a[@href='#Women']"));
        WebElement menElementi= driver.findElement(By.xpath("//a[@href='#Men']"));
        WebElement kidsElementi= driver.findElement(By.xpath("//a[@href='#Kids']"));*/
        List<WebElement> categoryElementi=driver.findElements(By.xpath("//div[@class='panel panel-default']"));
        //System.out.println("categoryElementi size = " + categoryElementi.size());


        //4- Category bolumunde 3 element oldugunu test edin
        int expectedCategory=3;
        int actualCategory=categoryElementi.size();
        Assert.assertTrue(actualCategory==expectedCategory);
        /*if (actualCategory==expectedCategory){
            System.out.println("Category Testi PASSED ");
        }else {
            System.out.println("Category Testi FAİLED");
        }*/

        //5- Category isimlerini yazdirin
        int elemetNo=1;
        for (WebElement each:categoryElementi
             ) {
            System.out.println(elemetNo+"- "+each.getText());
            elemetNo++;

        }
       // System.out.println(womenElementi.getText()+"\n"+menElementi.getText()+"\n"+kidsElementi.getText());
        //6- Sayfayi kapatin


    }









}
