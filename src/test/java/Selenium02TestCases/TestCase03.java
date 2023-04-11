package Selenium02TestCases;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class TestCase03 extends TestBase {
    /*
    Inheritance yaptigimdan dolayi extra her class'da before ve after testlerini yazmadim.
    @BeforeClass
    public  static void SetUp(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
     */
    /*
    1.Yeni bir class olusturalim (Homework)
    2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
    3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
    4.https://www.walmart.com/ sayfasina gidin.
    5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
     6. Tekrar “facebook” sayfasina donun
    7. Sayfayi yenileyin
    8. Sayfayi tam sayfa (maximize) yapin
    9.Browser’i kapatin
     */

    @Test
    public void test02(){
        driver.get("https://de-de.facebook.com/");
        String actualResult = driver.getTitle();
        String expectedResult = "facebook";

        if (actualResult.equals(expectedResult)){
            System.out.println("Passed");
        }else {
            System.out.println(actualResult);
        }
    }
    @Test
    public void test03(){
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "facebook";

        if (actualResult.contains(expectedResult)){
            System.out.println("Passed");
        }else {
            System.out.println(actualResult);
        }
    }
    @Test
    public void test04(){
        driver.navigate().to("https://www.walmart.com/");

    }
    @Test
    public void test05(){
        String actualResult = driver.getTitle();
        String expectedResult = "Walmart.com";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void test06(){
        driver.navigate().back();
    }
    @Test
    public void test07(){
        driver.navigate().refresh();
    }
    @Test
    public void test08(){
        driver.manage().window().maximize();
    }

}
