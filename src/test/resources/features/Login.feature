@login_sayfası
Feature: Login Test Senaryoları
  Testinium kullanıcısı olarak
  Testinium web sitesine giriş yapmak amacıyla
  Login sayfasını görüntülemek istiyorum

  @Geçersiz_kullanıcı_ile_uygulamaya__giriş_yapmaya_çalışma_scenario_outline
  Scenario Outline: Geçersiz kullanıcı ile uygulamaya giriş yapma scenario outline
    Given Testinium web sitesinde login butonuna tıklanır
    When Testinium web sitesine başarısız giriş için <email> ve <password> yazılır
    And Testinium web sitesinde sign-in butonuna tıklanır
    Then Testinium web sitesine giriş yapılamadığı kontrol edilir

    Examples:
      | email | password |
      | oktyuyar@gmail.com | 111111 |
      | oktay.uyar@sahabt.com | 1231 |


  @Geçersiz_kullanıcı_ile_uygulamaya_giriş_yapmaya_çalışma
  Scenario: Geçersiz kullanıcı ile uygulamaya giriş yapmaya çalışma
    Given Testinium web sitesinde login butonuna tıklanır
    When Testinium web sitesine başarısız giriş için "oktyuyar@gmail.com" ve "12345" yazılır
    And Testinium web sitesinde sign-in butonuna tıklanır
    Then Testinium web sitesine giriş yapılamadığı kontrol edilir

