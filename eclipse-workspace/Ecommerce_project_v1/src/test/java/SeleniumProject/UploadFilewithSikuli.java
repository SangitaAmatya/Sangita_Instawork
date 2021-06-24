package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFilewithSikuli {

	public static void main(String args[]) throws InterruptedException, FindFailed {
		{
			System.setProperty("webdriver.chrome.driver", "/Users/adyanshpanigrahi/Downloads/chromedriver 2");
			WebDriver driver = new ChromeDriver(); // ChromeDriver driver=new ChromeDriver(); // Invokes the chrome
													// browser

			driver.get("http://opensource.demo.orangehrmlive.com/");

			driver.manage().window().maximize();
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");

			driver.findElement(By.name("txtPassword")).sendKeys("admin");

			driver.findElement(By.name("Submit")).click();
			WebElement PIM = driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b"));
			WebElement Employeelist = driver.findElement(By.id("menu_pim_viewEmployeeList"));

			WebElement addEployee = driver.findElement(By.xpath("//*[@id=\'menu_pim_addEmployee\']"));

			Actions act = new Actions(driver);
			act.moveToElement(PIM).moveToElement(Employeelist).moveToElement(addEployee).click().build().perform();

			driver.findElement(By.xpath("//*[@id=\'photofile\']")).click();

			String imagesFilepath = "C:\\SeleniumPractice\\orangescreens\\";
			String inputFilepath = "C:\\SeleniumPractice\\orangescreens\\inputfile\\";

		}

	}
}
