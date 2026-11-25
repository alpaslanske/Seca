# 🛡️ Seca Phone - CallScreeningService & Spam Protection Summary

## 1. ⚙️ How Does It Work? (CallScreeningService)
Android's `CallScreeningService` API operates at the system level **before the phone starts ringing (before any ringtone sounds)**:
* **Incoming Call Analysis:** The caller number is verified within milliseconds against contacts, blocklists, and telemarketing ranges.
* **Zero Battery Drain:** Does not run continuously in the background; it is only woken up by Android when an incoming call arrives.

---

## 2. 🎛️ Multi-Mode Blocking and Warning Structure
Three distinct blocking modes are available in the app settings:

1. 🔴 **Decline (`Decline`):** The phone does not ring; the call is automatically rejected and logged in history as blocked.
2. 🔕 **Silently (`Silently`):** The phone does not ring or vibrate; it displays silently on screen for you to take or leave.
3. ⚠️ **Warn (`Warn`):** The phone rings normally, but displays a **"⚠️ Suspected Spam Call"** warning on the screen and notification, leaving the decision to you.

---

## 3. 🌐 Multilingual Support
The feature is fully supported with localized warning labels and descriptions across 8 languages:
* 🇬🇧 **EN:** *"Warn"*, *"Suspected Spam Call"*, *"Telemarketing Call"*
* 🇹🇷 **TR:** *"Uyar"*, *"Şüpheli Spam Arama"*, *"Pazarlama Araması"*
* 🇫🇷 **FR:** *"Avertir"*, *"Appel indésirable suspecté"*, *"Appel démarchage"*
* 🇩🇪 **DE:** *"Warnen"*, *"Verdächtiger Spam-Anruf"*, *"Werbeanruf"*
* 🇪🇸 **ES:** *"Advertir"*, *"Llamada sospechosa de spam"*, *"Llamada comercial"*
* 🇵🇱 **PL:** *"Ostrzegaj"*, *"Podejrzany spam"*, *"Telemarketing"*
* 🇮🇷 **FA:** *"هشدار"*, *"تماس مشکوک به هرزنامه"*, *"تماس تبلیغاتی"*
* 🇨🇳 **ZH:** *"警告"*, *"疑似垃圾电话"*, *"推销电话"*

---

## 📍 Settings Navigation Path
1. Open the **Seca Phone** app.
2. Go to **Settings** ➜ **Call filtering**.
3. Tap **Blocked profiles** ➜ Select your preferred mode (*Decline / Silently / Warn*) under **When they call**.
---------------------------------------------------------------
# 🛡️ Seca Phone - CallScreeningService & Spam Koruması Özeti

## 1. ⚙️ Nasıl Çalışır? (CallScreeningService)
Android'in `CallScreeningService` API'si, arama geldiğinde **telefon henüz çalmaya başlamadan (zil sesi duyulmadan)** işletim sistemi seviyesinde devreye girer:
* **Gelen Arama Analizi:** Arayan numara milisaniyeler içinde rehber, karaliste ve telepazarlama veri tabanına göre kontrol edilir.
* **Sıfır Pil Tüketimi:** Arka planda sürekli çalışmaz; yalnızca arama geldiğinde Android tarafından uyarılır.

---

## 2. 🎛️ Çok Modlu Engelleme ve Uyarı Yapısı
Uygulama içinde 3 farklı engelleme modu mevcuttur:

1. 🔴 **Reddet (`Decline`):** Telefon hiç çalmaz, çağrı otomatik kapatılır ve geçmişte engellenen arama olarak kalır.
2. 🔕 **Sessizce (`Silently`):** Telefon çalmaz ve titreşmez; ekranda sessizce gösterilir.
3. ⚠️ **Uyar (`Warn`):** Telefon normal şekilde çalar; ancak ekranda ve bildirimde **"⚠️ Şüpheli Spam Arama"** uyarısı görüntülenerek karar kullanıcıya bırakılır.

---

## 3. 🌐 Çok Dilli (Multilingual) Destek
Özellik aşağıdaki 8 dilde tam uyarı metinleri ve etiketlerle desteklenmektedir:
* 🇹🇷 **TR:** *"Uyar"*, *"Şüpheli Spam Arama"*, *"Pazarlama Araması"*
* 🇬🇧 **EN:** *"Warn"*, *"Suspected Spam Call"*, *"Telemarketing Call"*
* 🇫🇷 **FR:** *"Avertir"*, *"Appel indésirable suspecté"*, *"Appel démarchage"*
* 🇩🇪 **DE:** *"Warnen"*, *"Verdächtiger Spam-Anruf"*, *"Werbeanruf"*
* 🇪🇸 **ES:** *"Advertir"*, *"Llamada sospechosa de spam"*, *"Llamada comercial"*
* 🇵🇱 **PL:** *"Ostrzegaj"*, *"Podejrzany spam"*, *"Telemarketing"*
* 🇮🇷 **FA:** *"هشدار"*, *"تماس مشکوک به هرزنامه"*, *"تماس تبلیغاتی"*
* 🇨🇳 **ZH:** *"警告"*, *"疑似垃圾电话"*, *"推销电话"*

---

## 📍 Ayarlara Ulaşma Yolu
1. **Seca Phone** uygulamasını açın.
2. **Ayarlar (Settings)** ➜ **Arama Filtreleme (Call filtering)** seçeneğine girin.
3. **Engellenen Profiller (Blocked profiles)** ➜ **Aradıklarında (When they call)** başlığı altından modunuzu (*Reddet / Sessizce / Uyar*) seçin.
