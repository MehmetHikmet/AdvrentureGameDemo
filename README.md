# Metin tabanlı macera oyunu
- Oyunun amacı ölmeden 3 bölgede yer alan düşmanları alt edip ödülleri kazanarak güvenli eve dönebilmektir.
- Ödülleri kazanmak için mekanlardaki bütün düşmanları alt etmeniz gerekir.
- Her mekanda farklı düşmanlar ve farklı adette düşmanlar vardır.
- Savaş esnasında oyuncu veya düşmanın hangisinin ilk vuraca %50 ihtimali vardır.

# Karakterler
| Karakterler | ID | Sağlık | Hasar | Para |
|:-----------:|:--:|:-------:|:-------:|:------:|
| Samuray     |  1 |     21 | 5     | 15   |
| Okçu        |  2 |     18 | 17    | 20   |
| Şövalye     |  3 |     24 | 8     | 5    |

# Düşmanlar
| Düşmanlar | ID | Sağlık | Hasar | Para |
|:---------:|:--:|:------:|:-----:|:----:|
| Zombi     |  1 |   10   |   3   |   4  |
| Vampir    |  2 |   14   |   4   |   7  |
| Ayı       |  3 |   20   |   7   |  12  |
| Yılan     |  4 |   12   | 3 - 6 |   0  |

# Silahlar
| Silahlar | ID | Hasar | Para |
|:--------:|:--:|:-----:|:----:|
| Tabanca  |  1 |   2   |  25  |
| Kılıç    |  2 |   3   |  35  |
| Tüfek    |  3 |   7   |  45  |

# Zırhlar
| Silahlar | ID | Hasar | Para |
|:--------:|:--:|:-----:|:----:|
| Tabanca  |  1 |   2   |  25  |
| Kılıç    |  2 |   3   |  35  |
| Tüfek    |  3 |   7   |  45  |

# Mekanlar
1. Güvenli ev 
- Bu mekana gidildiğinde can yenilenir.

2. Dükkan
- Bu mekanda karakterimizi geliştirebilecek zırh veya silah alabilirsin.

3. Bilgi merkezi
- Oyun hakkında bilgilerin yer aldığı mekan.

4. Mağara
- 1 ila 3 adet arası ZOMBİ vardır. Her zombide para ödülü var.
- Bütün zombileri alt edersiniz bölüm ödülü YEMEK kazanırsınız.
- Ödülü kazandıktan sonra bu mekana girilemez

5. Orman
- 1 ila 3 adet arası VAMPİR vardır. Her vampirde para ödülü vardır.
- Bütün vampirleri alt ederseniz bölüm ödülü ODUN kazanırsınız.
- Ödülü kazandıktan sonra bu mekana girilemez

6. Nehir
- 1 ila 3 adet arası AYI vardır. Her ayıda para ödülü vardır.
- Bütün vampirleri alt ederseniz bölüm ödülü SU kazanırsınız.
- Ödülü kazandıktan sonra bu mekana girilemez

7. Maden
- 1 ila 5 adet arası YILAN vardır. Her yılanda rastgele para - zırh - silah ödülleri varıdr.
    - Ödüller
    - Silah kazanma ihtimali: %15
        - Tüfek kazanma ihtimali: %20
        - Kılıç kazanma ihtimali: %30
        - Tabanca kazanma ihtimali: %50
    - Zırh kazanma ihtimali: %15
        - Ağır zırh kazanma ihtimali: %20
        - Orta zırh kazanma ihtimali: %30
        - Hafif zırh kazanma ihtimali: %50
    - Silah kazanma ihtimali: %25
        - 10 adet para kazanma ihtimali: %20
        - 5 adet para kazanma ihtimali: %30
        - 1 adet para kazanma ihtimali: %50
    - Hiç birşey kazanamama ihtimali: %45
