package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethods {

   public static void waiting(int number){
       try {
           Thread.sleep((1000L)*number);
       } catch (InterruptedException e) {

       }
   }
   public static WebDriverWait explicitylWait(WebDriver driver,int sayi){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sayi));
       return wait;
   }
}
