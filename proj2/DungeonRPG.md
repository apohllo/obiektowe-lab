# DungeonRPG

### Punktacja

8 punktów za wersję podstawową

po 6 punktów dla dwóch osób za wersję rozbudowaną

po 8 punktów dla dwóch osób za wersję "pełną"

---
## Cel gry
Celem gry jest pokonanie wszyskich bossów, po drodze do finalnego Bossa, który znajduje się w najniższym lochu.

---
## Opis gry
Po uruchomieniu, graczowi powinien ukazać się ekran startowy, na którym może wybrać broń. Nasza postać zaczyna podróż od wejścia do lochu/jaskini. Każdy poziom lochu ma postać sieci prostopadłych korytarzy. Miejscem spotkania takich korytarzy jest sala w kształcie kwadratu. Przyjmijmy, że nasz bohater "zajmuje" całą salę (nie może się po niej poruszać). W salach tych mogą znajdować się przeciwnicy, ale także różnego typu 'znajdźki' takie jak  przedmioty, które można dodać do ekwipunku. Po napotkaniu przeciwnika uruchamia się ekran walki, podobny do tego co w grach z serii Pokemon, gdzie gracz może użyć jednego ze swoich ataków, aby zaatakować przeciwnika. Żeby nie było tak kolorowo, przeciwnik również może atakować naszego bohatera. Walka kończy się, gdy przeciwnik lub bohater jest pokonany. W pierwszym przypadku bohater otrzymuje punkty doświadczenia za wygraną walkę oraz ewentualne przedmioty za zabicie potwora, np. miksturę leczniczą lub element wyposażenia. Z kolei w drugim przypadku, bohater ginie, a na ekranie wyświetla się komnunikat Game Over oraz Start Again. Na każdym poziomie lochu/jaskini znajdują się takie obiekty jak: sala z Bossem oraz sala z przejściem na niższy poziom (drabina/schody). Do sali z Bossem powinniśmy móc wejść, gdy mamy wystarczający poziom doświadczenia, a zejść na niższy poziom dopiero, gdy pokonamy Bossa. W najniższym lochu czeka najsilniejszy Boss, którego pokonanie skutkuje zakończeniem gry.

---
## Wymagania podstawowe
### Lochy
Jak powinien wyglądać nasz Dungeon:
1. Stworzony loch zawiera co najmniej 4 poziomy (mogą być predefiniowane lub generowane).
2. Każdy kolejny poziom powinien posiadać więcej korytarzy, sal, przeciwników oraz przedmiotów.
3. Na każdym kolejnym poziomie powinni pojawiać się nowi przeciwnicy, a przeciwnicy z poprzednich poziomów powinni być adekwatnie wzmocnieni. Przyjmijmy, że każdy poziom wprowadza dwóch nowych przecwników.
4. Przed wejściem do danego pomieszczenia, jeżeli znajduje się w nim przeciwnik, gra powinna poinformować gracza o tym, że czeka go pojedynek.
5. Jak wcześniej wspomniane przyjmnujemy konwencję, że bohater, przeciwnik, przedmiot zajmują całe pomieszczenie, bądź fragment korytarza. Zawsze przy wejściu bohatera do danej komórki gra powinna wyświetlać tekst z zapytaniem co gracz chce zrobić, bądź poinformować go na co natrafił.
6. Przeciwnicy nie poruszają się po lochu. Po pojawieniu się w wybranym miejscu zostają tam na zawsze.
7. Mapa powinna być odkrywana wraz z przemierzaniem lochu, a możliwe kierunki przejścia z sal obrazowane w zrozumiały sposób.


### Przeciwnicy
Przeciwnicy powinni mieć określone statystyki oraz szansę na "wypadnięcie" przedmiotu po ich pokonaniu. Każdy przeciwnik różnego typu, powinien posiadać również inny atak, tak aby się nie powtarzały. Rozróżnijmy dwa możliwe typy przeciwników, silniejszy i słabszy. Silniejszy pojawia się jedynie w salach i zostajemy poinformowani o jego obecności (z możliwością wycofania się z walki i powrotem na pierwotne pole), a słabszy atakuje jedynie na korytarzu, ale gracz nie otrzymuje infomacji, że może zostać zaatakowany. 

### Przedmioty
Na starcie gry gracz powinien mieć możliwość wyboru jednego z (przykładowo) 3 przedmiotów, które mogą służyć mu jako broń. Każda broń ma określone statystyki takie jak np. rozmiar, siła ataku czy szybkość. Gra nie przewiduje możliwości walki dystansowej więc powinny być to przedmioty typu: miecz, sztylet, kosa itd. Oczywiście w trakcie rozgrywki gracz może otrzymać jakieś elementy uzbrojenia jako nagroda za pokonanie przeciwnika. Jako nagroda za pokonanie Bossa gracz powinien otrzymać przedmiot o lepszych statystykach niż normalne przedmioty.
W trakcie rozgrywki można ponadto zdobyć mikstury, takie jak mikstura zdrowia. Jednym ze sposobów zdobycia takich mikstur jest pokonanie przeciwnika.

### Ekwipunek
Jak w każdej grze RPG przydałoby się miejsce na przedmioty, które zdobywamy w trakcie rozgrywki. W przypadku tej gry również będzie potrzebne. Ekwipunek powinien mieć jakąś ograniczoną pojemność i wyświetlać informacje o elementach, które się w nim znajdują (bronie, przedmioty). Powinna być również możliwość wyrzucenia elementu z ekwipunku.

### Statystyki
Każda postać (bohater lub przeciwnik) powinna mieć własny zestaw statystyk. Przykładowym zestawem statystyk może być atak, obrona, punkty życia, szansa na trafienie krytyczne, szansa na unik oraz szybkość.

### Punkty doświadczenia
Pokonanie każdego przeciwnika powinno skutkować przyznaniem naszemu bohaterowi punktów doświadczenia. Po osiągnięciu danej liczby punktów następuje wzrost poziomu bohatera, a gracz dostaje do przyznania punkt umiejętności, którym może podnieść wybraną przez siebie statystykę.

Można oczywiście rozważyć inne, równoważne, rozwiązania oraz dodać jakieś inne funkcjonalności.

---
## Rozszerzenia

Wersja rozbudowana (projekt dwuosobowy za 6 pkt.) powinna zawierać dwie, a wersja "pełna" (projekt dwuosobowy za 8 pkt.) cztery z poniższych funkcjonalności:

1. Na każdym piętrze lochu dodajmy sklep, w którym nasz bohater będzie mógł zaopatrywać się w nowe przedmioty. Płatności w takim sklepie odbywałyby się za pomocą waluty. Waluta ta mogłaby być zdobywana np. jako nagroda za pokonanie przeciwnika, w zależności od jego poziomu i typu.
2. Na początku gry, gracz ma możliwość wyboru klasy bohatera. W zależności od klasy bohater miałby inne ataki oraz statystyki początkowe. Możliwe jest również początkowe przydzielenie przedmiotów do klasy, czyli w zależności od wybranej klasy bohater dostaje konkretne początkowe przedmioty.
3. Dodanie większej ilości przedmiotów takich jak elementy pancerza czy talizmany. W przypadku dodania pancerza, powinnien być on również dodany do menu wyboru broni i (ewentualnie) klasy z punktu 2 na początku gry.
4. Rozwińmy system doświadczenia o uzbrojenie. Niech za każdego pokonanego przeciwnika broń również dostaje odpowiednią ilość punktów, którymi możemy rozwijać jej parametry.
5. Dodać większą ilość przeciwników, bądź zmodyfikować obecnych, tak aby wprowadzić mechanizm Damage over time (DoT), czyli obrażeń które bohater otrzymuje wraz z czasem, na przykład z każdym ruchem do następnej częsci korytarza lub sali. Można również dodać mikstury, które pozwalają pozbyć się tego efektu. Sam efekt oczywiście powinien wygasać po niedługim czasie, tak aby nasz bohater nie otrzymywał obrażeń do końca gry.
6. Dodajmy do gry skrzynie, jako mechanikę zdobywania wyposażenia. Aby otworzyć skrzynię potrzebny będzie klucz, możliwy do zdobycia w sklepie z punktu 1. lub poprzez pokonanie przeciwnika. W skrzyni mogą znajdować się dowolne przedmioty, od wyposażenia, przez mikstury, po walutę.
7. Wprowadźmy różnorodne skrzynie oraz dynamicznie pojawiających się przeciwników. Jeden, lepszy, typ skrzyni powinien pojawiać się jedynie w salach, a drugi słabszy, czyli z gorszej jakości łupami, pojawia się tylko na korytarzach. Do obu wciąż potrzebne są odpowiednie klucze. Ponadto, przed przejściem korytarzem, którym nasz bohater już szedł gra powinna sprawdzić czy nie pojawili się tam nowi przeciwnicy (rozważamy jedynie przeciwników na korytarzach).

## Inne
Gra podobna do opisywanej powyżej:

https://www.youtube.com/watch?v=J3t1h6HJIKA&list=PL_QPQmz5C6WVBIae3PM0I4ZX7X2MgHmLQ&index=1&t=1005s&ab_channel=RyiSnow
