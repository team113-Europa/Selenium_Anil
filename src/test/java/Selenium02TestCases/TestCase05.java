package Selenium02TestCases;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase05 extends TestBase {
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
    1- bir class olusturun
2- https://www.amazon.com/ adresine gidin
3- Browseri tam sayfa yapin
4- Sayfayi “refresh” yapin
5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
6- Gift Cards sekmesine basin
7- Birthday butonuna basin
8- Best Seller bolumunden ilk urunu tiklayin
9- Gift card details’den $25.00’i secin
10-Urun ucretinin 25$ oldugunu test edin
11-Sayfayi kapatin

     */
    @Test
    public void test01(){
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void test02(){
        driver.manage().window().fullscreen();
    }
    @Test
    public void test03(){
        driver.navigate().refresh();
    }
    @Test
    public void test04(){
        String actualResult = driver.getTitle();
        String expectedResult = "Spend less";

        if (actualResult.contains(expectedResult)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
    }
    @Test
    public void test05(){
        WebElement giftCard = driver.findElement(By.xpath("//a[text()='Gift Cards']"));

        giftCard.click();
    }
    @Test
    public void test06(){
        WebElement birthday = driver.findElement(By.xpath("//img[@alt='Birthday']"));
        birthday.click();
    }
    @Test
    public void test07(){
        WebElement firstItem = driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]"));
        firstItem.click();
    }
    @Test
    public void test08(){
        WebElement dollar25 = driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]"));
        dollar25.click();
    }
    @Test
    public void test09(){
        WebElement priceofItem = driver.findElement(By.xpath("(//span[text()='$25.00'])[1]"));
        String expectedResult ="$25.00";
        if (priceofItem.getText().equals(expectedResult)){
            System.out.println("Passed");
        }else {
            System.out.println("FAILED");
        }


    }


}
