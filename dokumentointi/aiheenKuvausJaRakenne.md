#Aihe: TwitchChatSimulator2015
Peli, joka simuloi twitch.tv streamien (erityisesti Dota2/HearthStone/tjsp) chateissa tapahtuvaa toimintaa. Pelissä muut (ohjelmoidut) käyttäjät spammaavat twitchille geneerisiä viestejä, esimerkiksi Kappa -hymiöitä tai "ヽ༼ຈل͜ຈ༽ﾉ RIOT ヽ༼ຈل͜ຈ༽ﾉ", mikäli streamissa tapahtuu jotain hämmentävää.

Pelaajan tehtävänä on sulautua muiden käyttäjien joukkoon kirjoittamalla yleistilanteeseen vastaavia viestejä, joista saa pisteitä. Kuitenkin jos esimerkiksi muut käyttäjät spammaavat "Kappa", ja pelaaja kirjoittaakin vaikka "hello:)", saa pelaaja rikkeen. Kolmesta rikkeestä peli päättyy, eli pelaaja "saa bannit chatista".

#Ohje:
Valitse nimimerkki, jonka jälkeen spammaa massan mukana. Jos häviät tai muuten vaan tuntuu siltä, voit kirjoittaa "reboot" aloittaaksesi pelin uudestaan

#Rakennekuvaus:
Aloitusruutu -luokka luo varsinaisen käyttöliittymän (oikeastaan aloitusruudun actionlistenerit), joka puolestaan luo sekä pelilogiikan että bottilogiikan. Bottilogiikka tuntee pelin ja käyttöliittymässä sijaitsevan tekstikentän, jotka sille annetaan parametreina.
Bottilogiikka tuntee interfacea SpammerBot toteuttavia olioita. Bottilogiikka luo Nimimerkkitietokannan ja Pasterinotietokannan, joita botit käyttävät. Pelilogiikka tuntee pelaajan ja viestiseulan.

