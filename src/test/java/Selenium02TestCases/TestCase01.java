package Selenium02TestCases;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class TestCase01 extends TestBase {
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
    3. Amazon sayfasina gidelim. https://www.amazon.com/
    4. Sayfa basligini(title) yazdirin
    5. Sayfa basliginin “Amazon” icerdigini test edin
    6. Sayfa adresini(url) yazdirin
    7. Sayfa url’inin “Amazon” icerdigini test edin.
    8. Sayfa handle degerini yazdirin
    9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
    10. Sayfayi kapatin.
     */
    @Test
    public void test01(){
        //3
        driver.get("https://www.amazon.com/");
        //4
        String title = driver.getTitle();
        System.out.println(title);
        //5
        String expectedResult = "Amazon";
        String actualResult = title;

        Assert.assertTrue(actualResult.contains(expectedResult));

        //6
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //7
        Assert.assertTrue(url.contains(expectedResult));

        //8
        String handle  = driver.getWindowHandle();
        System.out.println(handle);

        //9
        String expected = "alisveris";
        String htmlCode = driver.getPageSource();

        Assert.assertTrue(htmlCode.contains(expected));



    }
}
