Feature: TestMembers_Deneme
 @deneme1
  Scenario: Deneme01

    Given Kullanıcı Test-Members.RexvenURL'sine gider
    Then email ve password butonlarını gerçek bilgiler girerek doldurur ve giriş yap butonuna basar
    Then Ana sayfayı aşagı kaydırır ve sayfayı gözden geçirir
    And tekrar sayfayı yukarı kaydırır
    Then Menü sekmesinden Kullanıcı bilgileri butonuna tıklar
    Then AD, SOYAD butonlarını  gerekli şekilde doldurur ve onayla butonuna basar