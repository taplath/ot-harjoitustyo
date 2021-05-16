# COVIDHack21

Sovellus on (keskeneräinen) _roguelike_ -peli, jossa pelaajan on tarkoitus hankkia COVID-rokotus läpäistäkseen pelin. 

### Toteutuksen tila

Pelin käynnistyessä peli avaa (keskeneräisen) _main menun_, jossa nappia painamalla voi aloittaa uuden pelin. Peli piirtää ruudulle kartan, pelaajan ja portaat seuraavalle tasolle.

## Dokumentaatio

[Käyttöohje](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/kayttoohje.md)

[Testausdokumentti](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/testausdokumentti.md)

[Vaatimusmäärittely](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/taplath/ot-harjoitustyo/blob/master/dokumentaatio/arkkitehtuuri.md)

## Releaset

[Final Release](https://github.com/taplath/ot-harjoitustyo/releases/tag/v1.0)

[Viikko 5](https://github.com/taplath/ot-harjoitustyo/releases/tag/viikko5)

[Viikko 6](https://github.com/taplath/ot-harjoitustyo/releases/tag/viikko6)

## Komentorivitoiminnot

### Ohjelman ajaminen komentoriviltä

Ohjelma ajetaan komentoriviltä komennolla

> mvn compile exec:java -Dexec.mainClass=com.tplathan.covidhack21.Main

### Suoritettavan JAR-tiedoston luominen

Komennolla

> mvn package

luodaan hakemistoon _COVIDHack21_ jar-tiedosto _covidhack21-1.0-SNAPSHOT.jar_

---

JAR-tiedosto ajetaan komennolla 

> _java -jar covidhack21-1.0-SNAPSHOT.jar_

!!!HUOM!!! Komento tulee ajaa kansiossa *COVIDHack21*, EI kansiossa *target*

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

### JavaDoc

JavaDoc generoidaan komennolla

> mvn javadoc:javadoc
