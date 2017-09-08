package test_ap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
public class test_ap {

       public static void main(String[] args) {
        // TODO Auto-generated method stub
   //     WebDriver driver = new FirefoxDriver();


      File file = new File("C:/Users/AMNABAEI/Desktop/IEDriverServer.exe");
      System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
      WebDriver driver = new InternetExplorerDriver();
      DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
      caps.setCapability(
      InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
          true);
      WebDriver driver = new InternetExplorerDriver(caps);

      driver.get("http://eso.bcldb.com/portal/welcome.htm");

       WebElement driver2 = driver.findElement(By.id("Select3")).selectByVisibleText("English");
                  ((Select) driver2).selectByVisibleText("English");

        new Select(driver.findElement(By.id("Select4"))).selectByVisibleText("Full Screen");
        new Select(driver.findElement(By.id("Select4"))).selectByVisibleText("Window");
        new Select(driver.findElement(By.id("Select4"))).selectByVisibleText("Full Screen");
        new Select(driver.findElement(By.id("Select4"))).selectByVisibleText("Window");

        driver.findElement(By.id("Select3"));
        driver.findElement(By.id("Select4"));
        WebElement click =  driver.findElement(By.id("imglogin"));
        click.click();
        List<WebElement> autoTestTemp = driver.findElements(By.cssSelector("form"));
        System.out.print("return size= "+autoTestTemp.size());

       autoTestTemp[0].click();
      System.out.print(autoTestTemp[0][0]);

      WebElement descriptionEle = autoTestTemp.findElement(By.tagName("Form"));
       driver.findElement(By.id("waCancel1"));
       driver.findElement(By.id("weMemberId")).sendKeys("amnabaei");
     WebElement myDynamicElement = (new WebDriverWait(driver, 1))
             .until(ExpectedConditions.presenceOfElementLocated(By.id("pwd")));

    driver.findElement(By.id("pwd")).sendKeys("motoG1362");
      ((WebElement) driver).sendKeys(Keys.TAB);
     driver.findElement(By.className("inputField"));
     WebElement autoTestTemp = driver.findElement(By.xpath("//form"));
     WebElement autoTestTemp =  driver.findElement(By.id("")).click();
     autoTestTemp.sendKeys(Keys.TAB);
     autoTestTemp.sendKeys("FDF");
     System.out.print(autoTestTemp);
     driver.findElement(By.id("waLogin")).click();
           driver.findElement(By.className("yellow-button")).click();
    driver.findElement(By.id("user")).sendKeys("autoTestTemp.nabaei@bcldb.com");
    driver.findElement(By.id("password")).sendKeys("Mahnazaz3");

         The name of the file to open.
     String fileName = "source4.txt";

      This will reference one line at a time
     String line = null;
       try {
           // FileReader reads text files in the default encoding.
           FileReader fileReader =
               new FileReader(fileName);

           // Always wrap FileReader in BufferedReader.
           BufferedReader bufferedReader =
               new BufferedReader(fileReader);

           driver.get("http://solo.test.bcldb.com/");
           driver.findElement(By.className("yellow-button")).click();
           while((line = bufferedReader.readLine()) != null) {
               driver.findElement(By.id("user")).sendKeys("autoTestTemp.nabaei@bcldb.com");
               driver.findElement(By.id("password")).sendKeys(line);
               driver.findElement(By.tagName("input")).submit();
           }
           // Always close files.
           bufferedReader.close();
       }
       catch(FileNotFoundException ex) {
           System.out.println(
               "Unable to open file '" +
               fileName + "'");
       }
       catch(IOException ex) {
           System.out.println(
               "Error reading file '"
               + fileName + "'");
       }

      driver.findElement(By.tagName("input")).submit();
      driver.findElement(By.linkText("GO TO MY APPLICATIONS")).click();
    }
}
