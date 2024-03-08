import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CodingPractice1 {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\aleem\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\\\Users\\\\aleem\\\\Downloads\\\\chrome-win64\\\\chrome-win64\\\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.snapchat.com");
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();
    }
}
