# Vaatimusmäärittely

## Sovelluksen tarkoitus
Sovellus on seikkailupeli NetHackin ja Spurguxin hengessä. Pelissä pelaajan on tarkoitus saada COVID-rokotus, jolla ei kuitenkaan ole suoraa vaikutusta pelin läpäisemiseen.

## Pelin yleiskuva ja perustoiminnallisuuksia
- Peli on *roguelike*, ilman tasojen proseduraalista generointia
- Ennalta määritellyt peliruudut eli tasot, joihin pelaaja etenee taso kerrallaan
   - Pelaajan lyhyt matka alkaa Gurulasta, joka on ensimmäinen taso
- Useita erilaisia "hirviöitä", joista osa voi haitata pelaajan etenemistä pelissä
   - Kaikilla hirviöillä on vähintään yksi dialogiteksti (tai oikeastaan monologi, *roguepelien* hengessä)
- Pelissä ei taistella fyysisesti 
   - Pelaajan kestopisteiden sijaan pelaajalla on kriisinsietokestopisteet
   - Kriisinsietokestopisteet vähenevät, kun pelaaja liikkuu, ja palautuvat täyteen, kun pelaaja saavuttaa seuraavan tason
- Pelin voittaa läpäisemällä kaikki tasot, rokotetuksi tulemisesta voi kuitenkin saada hyvän mielen
   - Pelin häviää, jos kriisinsietokestopisteet laskevat nollaan, tai jos pelaaja jää bussin alle
- Peli sisältää huonoa, mutta painokelpoista huumoria

## Pelin jatkokehityssuunnitelmia
- Tasojen proseduraalinen generointi
- Erikoistasot ja "alaluolastot"
- Tehtävät ja palkinnot
- Esineet ja niiden käyttäminen
