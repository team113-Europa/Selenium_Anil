package Selenium02TestCases;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase04 extends TestBase {
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
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    3 - Delete butonu’nun gorunur oldugunu test edin
    4- Delete tusuna basin
    5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
     */
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

    }
    @Test
    public void test02(){
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }
    @Test
    public void test03(){
        WebElement deleteButton = driver.findElement(By.cssSelector("[class='added-manually']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Passed");
        }else {
            System.out.println("FAILED");
        }

//        Assert.assertTrue(addButton.isDisplayed());
    }
    @Test
    public void test04(){
        WebElement deleteButton = driver.findElement(By.cssSelector("[class='added-manually']"));
        deleteButton.click();
    }
    @Test
    public void test05(){
        WebElement font = driver.findElement(By.tagName("h3"));
        if (font.isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
    }


}
