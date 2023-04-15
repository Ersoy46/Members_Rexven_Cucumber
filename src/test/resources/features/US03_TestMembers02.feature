Feature:Test03
 @deneme2
  Scenario: Test

    Given Kullanıcı Test-Members.RexvenURL'sine gider
    Then email ve password butonlarını gerçek bilgiler girerek doldurur ve giriş yap butonuna basar
    Then Eğitimler bölümüne tıklar
    And sayfayı aşagı dogru kaydırır ve 8 adet eğitim videosu oldugunu doğrular
    Then Ücretsiz İKAS eğitim videosuna tıklar ve tüm videolarının çalıştıgını kontrol eder.
