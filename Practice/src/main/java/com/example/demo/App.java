import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://hospital.neohire.io/");

String pageTitle = driver.getTitle();
System.out.println("Page Title: " + pageTitle);

if (pageTitle.equals("Hospital Management System")) {
    System.out.println("Page title validation passed");
} else {
    System.out.println("Page title validation failed");
}

WebElement usernameInput = driver.findElement(By.id("username"));
WebElement passwordInput = driver.findElement(By.id("password"));
WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

usernameInput.sendKeys("admin");
passwordInput.sendKeys("Test@12345");
loginButton.click();


WebElement addDoctorButton = driver.findElement(By.xpath("//button[@id='add-doctor']"));
addDoctorButton.click();


WebElement addSpecializationButton = driver.findElement(By.xpath("//button[@id='add-specialization']"));
addSpecializationButton.click();


WebElement deleteDoctorButton = driver.findElement(By.xpath("//button[@id='delete-doctor']"));
deleteDoctorButton.click();


WebElement editDoctorButton = driver.findElement(By.xpath("//button[@id='edit-doctor']"));
editDoctorButton.click();


WebElement patientDetails = driver.findElement(By.xpath("//div[@class='patient-details']"));
System.out.println("Patient Details: " + patientDetails.getText());

WebElement appointmentHistoryButton = driver.findElement(By.xpath("//button[@id='appointment-history']"));
appointmentHistoryButton.click();


WebElement fromDateInput = driver.findElement(By.xpath("//input[@id='from-date']"));
WebElement toDateInput = driver.findElement(By.xpath("//input[@id='to-date']"));
WebElement viewReportsButton = driver.findElement(By.xpath("//button[@id='view-reports']"));

fromDateInput.sendKeys("2023-01-01");
toDateInput.sendKeys("2023-06-01");
viewReportsButton.click();


WebElement patientSearchInput = driver.findElement(By.xpath("//input[@id='patient-search']"));
WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-button']"));

patientSearchInput.sendKeys("John Doe");
searchButton.click();


WebElement logoutButton = driver.findElement(By.xpath("//button[@id='logout']"));
logoutButton.click();
    }
}