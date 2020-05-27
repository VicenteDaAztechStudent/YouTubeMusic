package morning.playlist.tracks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Make sure you take a look at the 'lib' folder so you can see the needed jars and versions
 * to run this application.(Chrome.Driver, Gecko.Driver, Selenium-Server-Standalone,
 *  Selenium-Client-Combined) 
 */

import morning.playlist.skipAdds.SkippingTools;

public class TrackPlaylist{

	static String webApp;
	static WebDriver webSurfer; 
	
	public static void getWebApp(String WebAppChoice){
		webApp = WebAppChoice;
		
		if(webApp.contains("Chrome")){
			System.setProperty("webdriver.chrome.driver", 
					/*
					 * Configure the file path below to match where the file exists in your OS directory path
					 * Latest Chrome Driver works for Google Chrome Version 83.0.4103.61 (Official Build) (32-bit)
					 * 																				^
					 * 																				|
					 * 																				|
					 */																				
					 "C:\\Users\\vicente.cruz\\Documents\\workspace-spring-tool-suite-4-4.3.1.RELEASE\\YouTubeMusic\\lib\\Chrome\\chromedriver.exe");
			webSurfer = new ChromeDriver();
		}
		
		if(webApp.contains("Firefox")){
			System.setProperty("webdriver.gecko.driver", 
					/*
					 * Configure the file path below to match where the file exists in your OS directory path
					 * Gecko Driver below is compatible with Firefox Version 76.0.1 (64-bit
					 */
					"C:\\Users\\vicente.cruz\\Documents\\workspace-spring-tool-suite-4-4.3.1.RELEASE\\YouTubeMusic\\lib\\Firefox\\geckodriver.exe");
			webSurfer = new FirefoxDriver();
		}
	}// getWebApp(String WebAppChoice)
	

	
	public static void  playSongOne(long to) throws InterruptedException {
		
		/*
		 * Play first song: 
		 * Counting Stars
		 * By- One Republic 
		 */
		
		webSurfer.get("https://www.youtube.com/");
		
		
		SkippingTools.waitForLoad(webSurfer, 
			webSurfer.findElement(By.name("search_query")), 10).sendKeys("Counting Stars");
		SkippingTools.waitToClick(webSurfer, 
			webSurfer.findElement(By.id("search-icon-legacy")), 10).click();
		
		Thread.sleep(2000);
		SkippingTools.waitForLoad(webSurfer, 
			webSurfer.findElement(By.xpath("//a[@id='thumbnail' and @href='/watch?v=Yim4--J44gk']")), 10).click();
		
	    Thread.sleep(2000);
	    SkippingTools.waitForLoad(webSurfer, 
	    	webSurfer.findElement(By.xpath("//button[@title='Full screen (f)']")), 20).click();
	    
	    Thread.sleep(10000);
	    SkippingTools.waitForLoad(webSurfer,
	    	webSurfer.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")), 20).click();
		

	}// playSongOne(long to) throws InterruptedException 
	
	public static void  playSongTwo(long to) throws InterruptedException {
		
		/*
		 * Play first song: 
		 * I Can 
		 * By- NAS
		 */
		
		webSurfer.get("https://www.youtube.com/");
		
		/*
		 * Finds Search Box and key strokes 'I can nas' in it 
		 * Then it clicks the Magnifying logo to search for criteria 
		 */
		SkippingTools.waitForLoad(webSurfer, 
			webSurfer.findElement(By.name("search_query")), 10).sendKeys("I can nas");
		SkippingTools.waitToClick(webSurfer,
			webSurfer.findElement(By.id("search-icon-legacy")), 10).click();
		

		/*
		 * Finds the specific music video out of all the results provided
		 */
	    Thread.sleep(2000);
		SkippingTools.waitForLoad(webSurfer, 
			webSurfer.findElement(By.xpath("//a[@title='Nas - I Can (Official Video)']")), 10).click();
		
		/*
		 * Makes video FUll Screen
		 */
	    Thread.sleep(2000);
	    SkippingTools.waitForLoad(webSurfer,
	    	webSurfer.findElement(By.xpath("//button[@title='Full screen (f)']")), 20).click();
	    
	    /*
	     * Skips Ads
	     */
	    Thread.sleep(10000);
	    SkippingTools.waitForLoad(webSurfer,
	    	webSurfer.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")), 20).click();
		

	}// playSongTwo(long to) throws InterruptedException 
	
	public static void  learnAutomation(long to) throws InterruptedException {
		
		/*
		 * Play educational video: 
		 * 'Selenium Beginner Tutorial 5 - How to write first Selenium script (java) - 5 Easy Steps' 
		 * By- Raghav Pal
		 */
		
		webSurfer.get("https://www.youtube.com/");
		
		/*
		 * Finds Search Box and key strokes 'Selenium Beginner Tutorial 5 - How to write first Selenium script (java) - 5 Easy Steps' in it 
		 * Then it clicks the Magnifying logo to search for criteria 
		 */
		SkippingTools.waitForLoad(webSurfer, 
			webSurfer.findElement(By.name("search_query")), 10).sendKeys("Selenium Beginner 5 - How to write first Selenium script (java) - 5 Easy Steps");
		SkippingTools.waitToClick(webSurfer, 
			webSurfer.findElement(By.id("search-icon-legacy")), 10).click();
		

		/*
		 * Finds the specific music video out of all the results provided
		 */
	    Thread.sleep(2000);
		SkippingTools.waitForLoad(webSurfer, 
			webSurfer.findElement(By.xpath("//a[@id='video-title' and @title='Selenium Beginner Tutorial 5 - How to write first Selenium script (java) - 5 Easy Steps' ]")), 10).click();
		
		/*
		 * Makes video FUll Screen
		 */
	    Thread.sleep(2000);
	    SkippingTools.waitForLoad(webSurfer, 
	    	webSurfer.findElement(By.xpath("//button[@title='Full screen (f)']")), 20).click();
	    
	    /*
	     * Skips Ads
	     */
	    Thread.sleep(10000);
	    SkippingTools.waitForLoad(webSurfer,
	    	webSurfer.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")), 20).click();
		

	}// learnAutomation(long to) throws InterruptedException 
			
	
	
	
	public static void main(String[] args) throws InterruptedException{
	
		/*
		 * Uncomment getWebApp("Chrome"); to run automated test script with Google Drive, and comment out
		 * getWebApp("Firefox"); if you dont want to use Gecko Drive for Firefox
		 * Make sure to uncomment the playSong() method as well with the getWebApp() method
		 */
		
		getWebApp("Chrome");  // Run Automated Test Script with Chrome.Driver
		//getWebApp("Firefox"); // Run Automated Test Script with Gecko.Driver
		
		//playSongOne(0);
		//playSongTwo(0);
		learnAutomation(0);

		
		

	}

}
