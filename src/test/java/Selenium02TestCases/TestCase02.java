package Selenium02TestCases;

import Utilities.ReusableMethods;
import Utilities.TestBase;
import org.junit.Test;

public class TestCase02 extends TestBase {
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
    Yeni bir Class olusturalim.C05_NavigationMethods
    Youtube ana sayfasina gidelim . https://www.youtube.com/
    3. Amazon soyfasina gidelim. https://www.amazon.com/
    Tekrar YouTube’sayfasina donelim
    Yeniden Amazon sayfasina gidelim
    Sayfayi Refresh(yenile) yapalim
    Sayfayi kapatalim / Tum sayfalari kapatalim
     */
    @Test
    public void test01(){
        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com/");
        ReusableMethods.waiting(2);
    }
    @Test
    public void test02(){
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        ReusableMethods.waiting(2);

    }
    @Test
    public void test03(){
        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        ReusableMethods.waiting(2);
    }
    @Test
    public void test04(){
        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        ReusableMethods.waiting(2);
    }
    @Test
    public void test05(){
        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
    }

}
