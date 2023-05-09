Feature: Rexven Ödeme Butonları
@deneme3
  Scenario: Aylık_Yıllık_Ödeme_Planları

   Given Kullanıcı Rexven ana sayfaya gider
   Then Ana sayfada bulunan Topluluk Paketleri Sekmesine tıklar
  Then Yıllık butonuna tıklar
  And Tekrar aylık butonuna tıklar
  And sayfayı aşagı kaydırır
   Then Ekosisteme katıl sekmesine tıklar
  Then Yeni açılan sayfafa SSL GÜVENLİ ÖDEME  yazısını gördügünü dogrula.
   Then mail adresi girer
  And Ad, Soyad, Telefon girer
  And sayfayı aşagı kaydırır
  And  TC, Adres bir, Adres iki, girer
  And Şehir, Ülke, Posta Kodu, girer
   Then Ek Bilgi butonuna Not yazar
  And sayfayı aşagı kaydırır
   Then kupon kodu girer
  And sayfayı aşagı kaydırır
   Then ödeme yap butonuna tıklar
  #And tüm sayfanın ekran görüntüsünü alır ve sayfayı kapatır.


