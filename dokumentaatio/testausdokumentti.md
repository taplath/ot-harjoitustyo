# Testausdokumentti

## Yksikkö- ja integraatiotestaus

Sovelluksessa on neljä automaattitestiluokkaa:
- GameTest. Integraatiotesti, joka testaa laajasti uuden pelin alustamiseen liittyvät toiminnot, sekä yksittäiseen pelivuoroon liittyvät toiminnallisuudet (pelaajan ja hirviöiden liike). Testi ei yritäkään testata yksityiskohtaisesti kaikkia mahdollisia haaroja.
- LevelTest. Testaa yksityiskohtaisemmin pelaajan liikkumista kartalla ja hirviöiden liikkumiseen liittyvää logiikka.
- CoordinateTest. Yksikkötesti, mikä testaa kartan koordinaatistoon ja suuntiin liittyvää perustoiminnallisuutta.
- LevelLoaderTest. Testaa tasojen luomiseen liittyvää logiikkaa. Validoi, että luodut tasot täyttävät vähimmäisvaatimukset.

Rivikattavuus 85%, haarautumakattavuus 66%.

## Järjestelmätestaus

Järjestelmätestausta on tehty erityisesti pelin käyttöliittymästä käsin, jolla on varmistettu pelin toimivuus käytännössä. Testauksessa on pyritty etsimään kaikki mahdolliset virhetilanteet pelitapahtumissa. Sovelluksessa ei ole muita käyttäjäsyötteitä, kuin hahmon liikuttaminen neljään ilmansuuntaan, joten mahdollisia virhetilanteita ei ole kovinkaan paljoa.

## Sovellukseen jääneet ongelmat

- Jos kaksi hirviötä kävelee toisiaan päin (sattumalta), toinen niistä katoaa
- Koronarokotuksen saaminen on täysin kosmeettista. Peli läpäistään yksinkertaisesti kävelemällä viimeisen tason portaikkoon.
