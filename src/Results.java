
import java.io.IOException;
import java.util.ArrayList;


import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Results {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().fullscreen();
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		//REPLACE THE BELOW USNs WITH YOUR CLASS USNs.
		
		al.add("1cr14is001");
		al.add("1cr14is002");
		al.add("1cr14is003");
		al.add("1cr14is004");
		al.add("1cr14is005");
		al.add("1cr14is006");
		al.add("1cr14is007");
		al.add("1cr14is008");
		al.add("1cr14is009");
		al.add("1cr14is010");
		al.add("1cr14is011");
		al.add("1cr14is012");
		al.add("1cr14is013");
		al.add("1cr14is014");
		al.add("1cr14is015");
		al.add("1cr14is016");
		al.add("1cr14is017");
		al.add("1cr14is018");
		al.add("1cr14is019");
		al.add("1cr14is020");
		al.add("1cr14is021");
		al.add("1cr14is022");
		al.add("1cr14is023");
		al.add("1cr14is024");
		al.add("1cr14is025");
		al.add("1cr14is026");
		al.add("1cr14is027");
		al.add("1cr14is028");
		al.add("1cr14is029");
		al.add("1cr14is030");
		al.add("1cr14is031");
		al.add("1cr14is032");
		al.add("1cr14is033");
		al.add("1cr14is034");
		al.add("1cr14is035");
		al.add("1cr14is036");
		al.add("1cr14is037");
		al.add("1cr14is038");
		al.add("1cr14is039");
		al.add("1cr14is040");
		al.add("1cr14is041");
		al.add("1cr14is042");
		al.add("1cr14is043");
		al.add("1cr14is044");
		al.add("1cr14is045");
		al.add("1cr14is046");
		al.add("1cr14is047");
		al.add("1cr14is048");
		al.add("1cr14is049");
		al.add("1cr14is050");
		al.add("1cr14is051");
		al.add("1cr14is052");
		al.add("1cr14is053");
		al.add("1cr14is054");
		al.add("1cr14is055");
		al.add("1cr14is056");
		al.add("1cr14is057");
		al.add("1cr14is058");
		al.add("1cr14is059");
		al.add("1cr14is060");
		al.add("1cr14is061");
		al.add("1cr14is062");
		al.add("1cr14is063");
		al.add("1cr14is064");
		al.add("1cr14is065");
		al.add("1cr14is066");
		al.add("1cr14is067");
		al.add("1cr14is068");
		al.add("1cr14is069");
		al.add("1cr14is070");
		al.add("1cr14is071");
		al.add("1cr14is072");
		al.add("1cr14is073");
		al.add("1cr14is074");
		al.add("1cr14is075");
		al.add("1cr14is076");
		al.add("1cr14is077");
		al.add("1cr14is078");
		al.add("1cr14is079");
		al.add("1cr14is080");
		al.add("1cr14is081");
		al.add("1cr14is082");
		al.add("1cr14is083");
		al.add("1cr14is084");
		al.add("1cr14is085");
		al.add("1cr14is086");
		al.add("1cr14is087");
		al.add("1cr14is088");
		al.add("1cr14is089");
		al.add("1cr14is090");
		al.add("1cr14is091");
		al.add("1cr14is092");
		al.add("1cr14is093");
		al.add("1cr14is094");
		al.add("1cr14is095");
		al.add("1cr14is096");
		al.add("1cr14is097");
		al.add("1cr14is098");
		al.add("1cr14is099");
		al.add("1cr14is100");
		al.add("1cr14is101");
		al.add("1cr14is102");
		al.add("1cr14is103");
		al.add("1cr14is104");
		al.add("1cr14is105");
		al.add("1cr14is106");
		al.add("1cr14is107");
		al.add("1cr14is108");
		al.add("1cr14is109");
		al.add("1cr14is110");
		al.add("1cr14is111");
		al.add("1cr14is112");
		al.add("1cr14is113");
		al.add("1cr14is114");
		al.add("1cr14is115");
		al.add("1cr14is116");
		al.add("1cr14is117");
		al.add("1cr14is118");
		al.add("1cr14is119");
		al.add("1cr13is044");
		al.add("1cr12is057");
		al.add("1cr13is031");
		al.add("1cr13is050");
		al.add("1cr13is001");
		al.add("1cr15is401");
		al.add("1cr15is402");
		al.add("1cr15is403");
		al.add("1cr15is404");
		al.add("1cr15is405");
		al.add("1cr15is406");
		al.add("1cr15is407");
		
		for(int i=0; i<al.size(); i++)
		{
			driver.get("http://results.vtu.ac.in/vitaviresultnoncbcs/index.php");
			//FOR CBCS Scheme results, Replace the above line with below line
			//driver.get("http://results.vtu.ac.in/vitaviresultcbcs/index.php");
			
			WebElement element = driver.findElement(By.xpath(".//*[@id='raj']/div[1]/div/input"));
			element.sendKeys(al.get(i));
			
			element = driver.findElement(By.id("submit"));
			element.click();
			
			try 
			{ 
				driver.switchTo().alert().dismiss();
			} 
			catch (NoAlertPresentException Ex) 
			{ 
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
				FileUtils.copyFile(src, new File(".\\Screenshots\\"+al.get(i)+".png"));
				}
				 
				catch (IOException e)
				 {
				  System.out.println(e.getMessage());
				 
				 }
			}
		}	
	    
	    driver.quit();
		

	}
	

}
