# OOP23GolfiMang
2023 Objektorienteeritud programeerimise rühmatöö
autorid:      
Max Sebastian Segerkrantz ja Mihkel Kritsmann

Projektiks tegime golfimängu, kus kasutaja sisestab oma Händikäpi ning seejärel hakkab golfimäng pihta. 
Händikäpi alusel arvutab programm, mis võimalusega tuleb hea löök ja mis võimalusega läheb löök metsa.
Raja lõppedes väljastab programm mitme löögiga läbisid raja ja mis oli raja PAR ehk löökide arv, millega peaks läbima 0-händkäpiga mängija selle raja.
Kui kõik rajad on läbitud, väljastab programm mitme löögiga läbis mängija raja ja mis oli raja PAR.

KASUTAJAJUHEND:
1. panna käima Golfimäng.java
2. sisestada oma Händikäp ehk HCP
3. vaatada failist golfikepp.txt golfikeppide pikkuseid ja nimesid, formaat on järgnev: hea pikkus ülemine piir, hea pikkus alumine piir, kepinimi
4. sisestada kepinimi, millega soovite lüüa
5. mängida seni, kuni kõik üheksa rada on läbitud.


Klasside eesmärgid:

Golfikepp.java
- väärtustab tekstifailist saadud infole golfikepi hea pikkuse ülemise ja alumise piiri ning golfikepi nime
Mängija.java
- väärtustab mängijale golfikeppide listi, sisestatud HCP ja kui kasutaja sisestab golfikepi, tagastab ta kõigepealt tõeväärtuse kas selline golfikepp eksisteerib ja kui eksisteerib, siis tagastab mis pikkused sellel kepil on
Golfimäng.java
- peameetod, mille abil loetakse golfikepid listi ning tehakse valmis golfirajad.
- Samuti luuakse mängija sisestatud HCP abil ja alustatakse mängu golfiväljakul
Golfiväljak.java
- Programm läbib ükshaaval golfiradade listis olevaid golfiradasid ja seni, kuni golfiauguni ei ole alla 3 (meetri), küsib kasutajalt golfikeppi ja juhuslikult arvutab võimaluse, kas löök läheb hästi või mitte.
- Kui löök läheb hästi, võtab programm golfikepi hea ülemise ja hea alumise pikkuse vahelt juhusliku arvu ja lahutab  rajapikkusest löögipikkuse.
- Kui löök läheb halvasti, võtab programm golfikepi hea ülemise ja hea alumise pikkuse ning jagab selle kahega ning võtab sellest vahemikust juhusliku arvu ja lahutab rajapikkusest selle arvu.
- Kui tehtud löök on 3 meetri täpsusega, on löök justkui täpne ja pall läheb auku.


Protsess:
- Projekti etapid võib jaotada järgmiseks
  - algne projekt, programm küsis kasutajalt kepichari, mis olid programmisiseselt Listis, lahutas rajapikkusest löögipikkuse ja kui see oli alla 5m, luges raja läbinuks - protsessi tegi Max
  - projekti esimesed bug fixid, tegime juurde ka halvad löögipikkused ning kuna löök võis olla pikem kui rajapikkus, rakendasime Math.Absi igal protsessil - tegi max
  - golfikeppide lugemine tekstifailist, tegime programmi selliseks, et golfikeppe loetakse tekstifailist - Tegi Mihkel
  - Golfikeppide kepichari asemel kepiString, tegime programmi mugevamaks, ehk kasutaja sisestab golfikepi nime, mitte Chari, see vähendab segadust, mis kepiga on tegu, näiteks Pitchinwedge algab sama tähega mis Putter - tegi Mihkel
  - Viimased bug fixid, parandasime ära kasutaja väljastused ning tegime tekstifaili loetavamaks - tegi Max
  - ReadME ehk kirjelduse tegemine - tegi Max

Rühmaliikmete panus:
- Panus oli jaotatud võrdselt
- Mihkel tegi oma tööd umbes 3h ja Max tegi oma tööd umbes 5h

Hinnang töö lõpptulemusele:
- Töö on hästi tehtud, kuid mängu saaks teha veel põnevamaks.
- Rühmatöö teises faasis oleks plaan lisada ka veetakistused, ehk mingil kindlal vahemaal rajal on hoopis veetakistus ja sinna lüües tuleb võtta +1 löögitrahv.
- Samuti on praeg Mängija.java failis scorecard olemas, kuid seda programm praeguses faasis ei kasuta.

Programmi testimine:
- Testimine oli lihtne, pidi lihtsalt mängu käima panema ja jälgima, kas kõik töötab. Kui midagi väljastati valesti, oli suureks abiks DeBugger.

https://github.com/maxsebastianS/OOP23GolfiMang
