package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class maventest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter reporters=new ExtentHtmlReporter("report.html");
		ExtentReports reports= new ExtentReports();
		reports.attachReporter(reporters);
		ExtentTest test=reports.createTest("whatsup dude");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");;
		driver.findElement(By.name("q")).sendKeys("whatsup dude");
		driver.findElement(By.name("q")).submit();
		test.pass("test passed");
		reports.flush();
		driver.quit();

	}

}
