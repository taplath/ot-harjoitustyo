# Vaatimusmäärittely

## Sovelluksen tarkoitus
Sovellus on seikkailupeli NetHackin ja Spurguxin hengessä. Pelissä pelaajan on tarkoitus saada COVID-rokotus, jotta läpäisee pelin.

## Pelin yleiskuva ja perustoiminnallisuuksia
- Peli on *roguelike*
- Ennalta määritellyt peliruudut eli tasot, joihin pelaaja etenee taso kerrallaan
- [x] Peli piirtää ensimmäisen tason ja ruudun josta voi siirtyä seuraavalle tasolle - tehty
- [x] Pelissä voi liikuttaa pelaajahahmoa - tehty
- [ ] Pelissä voi siirtyä seuraavalle tasolle
- Useita erilaisia "hirviöitä", jotka voivat auttaa tai haitata pelaajan etenemistä pelissä
- Pelissä ei taistella fyysisesti 
   - Pelaajan kestopisteiden sijaan pelaajalla on kriisinsietokykypisteet (KSKP)
- Pelin voi voittaa saamalla COVID-rokotuksen viimeisellä tasolla
   - Pelin häviää, jos kriisinsietokykypisteet (KSKP) laskevat nollaan
- Peli tulee sisältämään huonoa, mutta painokelpoista huumoria

## Pelin jatkokehityssuunnitelmia
- Peliruutujen proseduraalinen generointi
- Erikoistasot ja "alaluolastot"
- Tehtävät ja palkinnot
