# COVIDHack21

Sovellus on (keskeneräinen) _roguelike_ -peli, jossa pelaajan on tarkoitus hankkia COVID-rokotus läpäistäkseen pelin. 

### Toteutuksen tila

Pelin käynnistyessä peli piirtää kartan ruudulle.

## Dokumentaatio

[Vaatimusmäärittely](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/arkkitehtuuri.md)

## Komentorivitoiminnot

### Testaus

Testit suoritetaan komennolla

> mvn test

---

Testikattavuusraportti luodaan komennolla

> mvn jacoco:report

Kattavuusraportti voidaan tarkastella avaamalla tiedosto _target/site/jacoco/index.html_

---

Checkstyle-raportti luodaan komennolla

> mvn jxr:jxr checkstyle:checkstyle

Checkstyle-raportti voidaan tarkastella avaamalla tiedosto _target/site/checkstyle.html_
