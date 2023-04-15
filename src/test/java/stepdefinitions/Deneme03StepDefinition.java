package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static utilities.Driver.driver;

import static org.junit.Assert.assertEquals;
public class Deneme03StepDefinition {


    @Then("sayfayı aşagı dogru kaydırır ve {int} adet eğitim videosu oldugunu doğrular")
    public void sayfayı_aşagı_dogru_kaydırır_ve_adet_eğitim_videosu_oldugunu_doğrular(Integer int1) throws InterruptedException {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,500)");
       Thread.sleep(2000);
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js1.executeScript("window.scrollBy(0,500)");
       Thread.sleep(2000);
       JavascriptExecutor js2 = (JavascriptExecutor) driver;
       js2.executeScript("window.scrollBy(0,500)");
       JavascriptExecutor js3 = (JavascriptExecutor) driver;
       js3.executeScript("window.scrollTo(0, 0);");


    }
    @Then("Ücretsiz İKAS eğitim videosuna tıklar ve tüm videolarının çalıştıgını kontrol eder.")
    public void ücretsiz_ikas_eğitim_videosuna_tıklar_ve_tüm_videolarının_çalıştıgını_kontrol_eder() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("heading-course")));

        element.click();

        WebElement videoContainer = driver.findElement(By.className("plyr__video-wrapper"));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait1.until(ExpectedConditions.visibilityOfAllElements(videoContainer.findElements(By.tagName("video"))));

        List<WebElement> videoList = videoContainer.findElements(By.tagName("video"));
        for (WebElement video : videoList) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Boolean isVideoPlaying = (Boolean) js.executeScript("return arguments[0].paused", video);
            assertEquals(false, isVideoPlaying);
        }


    }

    @Then("Eğitimler bölümüne tıklar")
    public void eğitimlerBölümüneTıklar() throws InterruptedException {
        WebElement egitimlerLink = driver.findElement(By.xpath("//a[@href='/courses']"));
        egitimlerLink.click();
        Thread.sleep(2000);
    }
}
