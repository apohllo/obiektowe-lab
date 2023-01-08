## Gra w Monopol
* [Autorzy](#autorzy)
* [Punktacja](#punktacja)
* [Wersja](#wersja)
* [Cel projektu](#celprojektu)
* [Elementy gry](#elementygry)
* [Wymagania](#wymagania)
* [Przebieg tury](#przebiegtury)
* [Wariant podstawowy](#wariantpodstawowy)
* [Wariant rozszerzony](#wariantrozszerzony)

## Autorzy
Bogusz Laszczyk, Kornelia Susz

## Punktacja
6 pkt - wariant podstawowy, 8 pkt - wariant rozszerzony

## Wersja
1 – osobowa
	
## Cel projektu
Stworzenie programu implementującego grę w Monopol.
	
## Elementy gry
2 kostki, 6 pionków, 28 kart własności, 16 kart Szansa, 16 kart Kasa społeczna, domki i hotele, wartości liczbowe zamiast banknotów.

## Wymagania
Obowiązują oficjalne zasady gry ze strony http://www.zasadygry.pl/monopoly_31_1.htm.

Jednocześnie grać może od 2 do 6 graczy. Akcje wykonywać może tylko gracz, który rozgrywa daną turę (wyjątek stanowi licytacja i pobieranie czynszu w wersji rozszerzonej). Plansza składa się z 40 pól. Pola specjalne jak Start, Więzienie, Parking, Idź do więzienia, Stacje kolejowe, Szansa, Kasa społeczna oraz Podatki muszą znajdować się w tych samych miejscach co w oryginalnym Monopolu. Pola te jednak mogą różnić się nazwami i wyglądem. Efekt ich działania ma być podobny lub taki sam do tych znanych z gry.

![monopoly_board](https://www.kurnik.pl/netopol/img/m.gif)


Przykład: na powyższej grafice kolorowe pola to działki, środkowe pola z okręgami to stacje kolejowe, trójkąty to wodociągi i elektrownia, pola z symbolem $ to podatek, wykrzykniki oznaczają pola Szansy i Kasy społecznej.

## Przebieg tury
Gracz w swojej turzę ma możliwość wykonania kilku akcji:
- Przy wybraniu opcji handlu powinny się pojawić karty innych graczy. Po wybraniu tej, którą jest zainteresowany, rozpoczynają się między graczami negocjacje zgodnie z zasadami gry. 
- Po rzucie kostką pionek przesuwa się na odpowiednie pole i gracz rozpatruje jego efekt. Jeśli jest to pole specjalne, to obowiązują ich ustalone zasady. Jeli jest to wolna posesja, to gracz może ją zakupić lub wystawić na licytację. Gdy dane pole należy do innego gracza, w zależności od przyjętego wariantu gry, należy zapłacić właścicielowi czynsz.
- W przypadku wymiany i licytacji trzeba zadbać o to, jak powinny one działać w wariantach podstawowym i rozszerzonym.

## Wariant podstawowy
1. Wszyscy gracze grają na jednym urządzeniu.
2. Gracze dostają pionki przydzielone przez system. Plansza w jednej wersji graficznej.
3. Po wejściu na pole innego gracza pobierana jest odpowiednia opłata. 
4. Tura kończy się po kliknięciu przycisku Koniec Tury.


## Wariant rozszerzony
1. Gra sieciowa - każdy gracz na osobnym urządzeniu.
2. Gracze mogą wybrać swoje pionki oraz wersję gry w jaką gramy (Monopoli Kraków, Monopoli Gra o tron itp.). Należy przygotować przynajmniej 8 różnych pionków i 2 różne mapy do gry.
3. Po wejściu na działkę innego gracza owy gracz musi się upomnieć o opłatę albo jego strata. Trzeba więc zadbać o to, aby właściciel posesji miał opcję zgłoszenia obowiązku zapłaty jeszcze w tej turze.
4. Z powodu punktu 3 każda runda musi trwać ograniczoną ilość czasu, aby gracz nie kliknął natychmiastowo przycisku końca tury, zanim zdążyłby zapłacić. Czas na ruch powinien wynosić 60 sekund i jest liczony od momentu kliknięcia przycisku Rozpocznij Turę przez kolejnego gracza. Jeżeli czas się skończy zanim gracz wykona rzut kostką, to traci kolejkę, jeżeli w trakcie handlu lub kupowania działki czy domków, to żadna transakcja nie zostaje zatwierdzona.

