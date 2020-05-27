package morning.playlist.skipAdds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkippingTools {
	
	public static WebElement waitForLoad(WebDriver webSurfer, WebElement we, int sec){
		
		WebDriverWait stop = new WebDriverWait(webSurfer, sec );
		WebElement e = stop.until(ExpectedConditions.visibilityOf(we));
		
		return e;
	}
	
	
	public static WebElement waitToClick(WebDriver webSurfer, WebElement we, int sec) {
		
		WebDriverWait stop = new WebDriverWait(webSurfer, sec);
		WebElement e = stop.until(ExpectedConditions.elementToBeClickable(we));
		
		return e;
	}
}
 