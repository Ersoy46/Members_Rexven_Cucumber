package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RexvenPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.junit.Assert;


import java.io.File;
import java.io.IOException;
import java.util.Set;

import static utilities.Driver.driver;

public class RexvenStepDefinitions {
    RexvenPage rexvenPages = new RexvenPage();


    @Given("Kullanıcı Rexven ana sayfaya gider")
    public void kullanıcı_rexven_ana_sayfaya_gider() throws InterruptedException {
        Driver.getDriver().get("https://www.rexven.com");

        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(1000);


    }

    @Then("Ana sayfada bulunan Topluluk Paketleri Sekmesine tıklar")
    public void ana_sayfada_bulunan_topluluk_paketleri_sekmesine_tıklar() throws InterruptedException {
        WebElement toplulukPaketleriSekmesi = driver.findElement(By.xpath("//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[.='Topluluk Paketleri']"));
        toplulukPaketleriSekmesi.click();
        Thread.sleep(1000);


    }

    @Then("Yıllık butonuna tıklar")
    public void yıllık_butonuna_tıklar() throws InterruptedException {
        WebElement yillikButonu = driver.findElement(By.xpath("//label[@for='yearly-5579dc84']"));
        yillikButonu.click();
        Thread.sleep(1000);


    }

    @Then("Tekrar aylık butonuna tıklar")
    public void tekrar_aylık_butonuna_tıklar() throws InterruptedException {
        WebElement aylıkButonu = driver.findElement(By.xpath("//label[@for='monthly-5579dc84']"));
        aylıkButonu.click();
        Thread.sleep(1000);


    }

    @Then("sayfayı aşagı kaydırır")
    public void sayfayı_aşagı_kaydırır() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

    }

    @Then("Ekosisteme katıl sekmesine tıklar")
    public void ekosisteme_katıl_sekmesine_tıklar() throws InterruptedException {
        WebElement ekosistemeKatilSekmesi = driver.findElement(By.xpath("//a[@class='pricing-btn'][1]"));
        ekosistemeKatilSekmesi.click();
        Thread.sleep(1000);


        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(1000);


        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }


    }

    @Then("Yeni açılan sayfafa SSL GÜVENLİ ÖDEME  yazısını gördügünü dogrula.")
    public void yeni_açılan_sayfafa_ssl_güvenli_ödeme_yazısını_gördügünü_dogrula() throws InterruptedException {
        WebElement SSLGuvenliOdeme = driver.findElement(By.xpath("//span[text()='SSL Güvenli Ödeme']"));
        Assert.assertTrue(SSLGuvenliOdeme.isDisplayed());
        Thread.sleep(2000);
        
    }

    @Then("mail adresi girer")
    public void mail_adresi_girer() throws InterruptedException {
        WebElement emailAdresi = driver.findElement(By.cssSelector("input[type='email'][name='email']"));
        emailAdresi.sendKeys("ertugrulersoy@gmail.com");
        Thread.sleep(1000);
    }

    @And("Ad, Soyad, Telefon girer")
    public void adSoyadTelefonGirer() throws InterruptedException {
        WebElement ad = driver.findElement(By.xpath("//input[@id='firstName']"));
        ad.sendKeys("REXVEN");
        Thread.sleep(1000);
        WebElement soyad = driver.findElement(By.xpath("//input[@id='lastName']"));
        soyad.sendKeys("TEST OTOMASYON DENEME");
        Thread.sleep(1000);
        WebElement telefon = driver.findElement(By.xpath("//input[@name='gsmNumber']"));
        telefon.sendKeys("0542 542 42 42");

    }

    @And("TC, Adres bir, Adres iki, girer")
    public void tcAdresBirAdresIkiGirer() throws InterruptedException {
        WebElement tc = driver.findElement(By.xpath("//input[@name='identityNumber']"));
        tc.sendKeys("12345678901");
        Thread.sleep(1000);
        WebElement adres1 = driver.findElement(By.xpath("//input[@id='addressLine1']"));
        adres1.sendKeys("1071 PLAZA ÇUKURAMBAR");
        WebElement adres2 = driver.findElement(By.xpath("//input[@id='addressLine2']"));
        adres2.sendKeys("BATIKENT İKİNCİ OFİS");
        Thread.sleep(1000);

    }

    @And("Şehir, Ülke, Posta Kodu, girer")
    public void şehirÜlkePostaKoduGirer() throws InterruptedException {
        WebElement sehir = driver.findElement(By.xpath("//input[@id='city']"));
        sehir.sendKeys("ANKARA");
        WebElement ulke = driver.findElement(By.xpath("//input[@id='country']"));
        ulke.sendKeys("TÜRKİYE");
        Thread.sleep(1000);
        WebElement postaKodu = driver.findElement(By.xpath("//input[@id='zipCode']"));
        postaKodu.sendKeys("06600");
        Thread.sleep(1000);


    }


    @Then("Ek Bilgi butonuna Not yazar")
    public void ek_bilgi_butonuna_not_yazar () throws InterruptedException {
        WebElement ekBilgi = driver.findElement(By.xpath("//textarea[@placeholder='example text']"));
        ekBilgi.sendKeys("REXVEN TEST OTOMASYON DENEME DOGRU ÇALIŞIYOR");
        Thread.sleep(2000);


    }
    @Then("kupon kodu girer")
    public void kupon_kodu_girer () throws InterruptedException {
        WebElement kuponKodu = driver.findElement(By.xpath("//input[@id='couponCode']"));
        kuponKodu.sendKeys("TEST-COUPON-CODE");
        Thread.sleep(2000);
    }


    @Then("ödeme yap butonuna tıklar")
    public void ödeme_yap_butonuna_tıklar () throws InterruptedException {
        WebElement odemeYapButonu = driver.findElement(By.cssSelector("button[type='submit'].form_paymentButton__ZOf-P.form_buttonClicked__N8NQL"));
        odemeYapButonu.click();
        Thread.sleep(2000);
    }

    @And("tüm sayfanın ekran görüntüsünü alır ve sayfayı kapatır.")
    public void tümSayfanınEkranGörüntüsünüAlırVeSayfayıKapatır() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='40%';");

        Thread.sleep(1500);

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);

// Sayfayı kapat
        driver.quit();
    }
}






