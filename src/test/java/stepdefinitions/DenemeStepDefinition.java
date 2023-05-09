package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.RexvenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

import static utilities.Driver.driver;

public class DenemeStepDefinition {

    @Given("Kullanıcı Test-Members.RexvenURL'sine gider")
    public void kullanıcıTestMembersRexvenURLSineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("Test-Members.RexvenURL"));

    }
    @Then("email ve password butonlarını gerçek bilgiler girerek doldurur ve giriş yap butonuna basar")
    public void email_ve_password_butonlarını_gerçek_bilgiler_girerek_doldurur_ve_giriş_yap_butonuna_basar() throws InterruptedException {
        WebElement emailbutton=driver.findElement(By.xpath("//input[@id='email']"));
        emailbutton.sendKeys("tugrul121463@gmail.com");
        Thread.sleep(2000);

        WebElement passwordbutton=driver.findElement(By.xpath("//input[@id='password']"));
        passwordbutton.sendKeys("Ersoy210417");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);


    }
    @Then("Ana sayfayı aşagı kaydırır ve sayfayı gözden geçirir")
    public void ana_sayfayı_aşagı_kaydırır_ve_sayfayı_gözden_geçirir() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
    }
    @Then("tekrar sayfayı yukarı kaydırır")
    public void tekrar_sayfayı_yukarı_kaydırır() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
    }
    @Then("Menü sekmesinden Kullanıcı bilgileri butonuna tıklar")
    public void menü_sekmesinden_kullanıcı_bilgileri_butonuna_tıklar() throws InterruptedException {
        WebElement KullnıcıBilgileri=driver.findElement(By.xpath("//a[.='Kullanıcı Bilgileri']"));
        KullnıcıBilgileri.click();
        Thread.sleep(2500);
    }
    @Then("AD, SOYAD butonlarını  gerekli şekilde doldurur ve onayla butonuna basar")
    public void ad_soyad_butonlarını_gerekli_şekilde_doldurur_ve_onayla_butonuna_basar() throws InterruptedException {
        WebElement isimButonu= driver.findElement(By.xpath("//input[@id='firstName']"));
        isimButonu.clear();
        Thread.sleep(2000);
        isimButonu.sendKeys("Test Members");

        WebElement soyisimButonu=driver.findElement(By.xpath("//input[@id='lastName']"));
        soyisimButonu.clear();
        soyisimButonu.sendKeys("Rexven Deneme");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2500);

        driver.close();

    }




}
