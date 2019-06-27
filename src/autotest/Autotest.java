package autotest;

//*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author Amimu
 */

public class Autotest {
    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws InterruptedException {
       
// Create a new instance of the Firefox driver
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
WebDriver driver;
driver = new ChromeDriver();
//Launch the some site
driver.get("https://portal.aait.edu.et/");

        driver.findElement(By.name("UserName")).sendKeys ("Atr/1495/09");
        driver.findElement(By.name("Password")).sendKeys ("8910");
        driver.findElement(By.className("btn-success")).click();
        driver.navigate().to("https://portal.aait.edu.et/Grade/GradeReport/");
        driver.get("https://portal.aait.edu.et/Grade/GradeReport/");
        String GradeReport = driver.findElement(By.className("table")).getText();
        try
        {
            FileWriter fw =new FileWriter(".\\src\\GradeReport.txt");
            fw.write(GradeReport);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Success...");    
     }    

}
   
    


