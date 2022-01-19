# Gra w statki

Celem projektu jest stworzenie gry w statki. W grze dostępne będą 2 tryby, gra z komputerem oraz gra z drugim graczem.

## Opis

Gra ma posiadać dwie plansze 10x10 kratek. Gra rozpoczyna się od rozmieszczenia na planszach statków przez graczy (w przypdaku gry z komputerem jego statki rozmieszczane są losowo).

Statki dzielą się na 4 rodzaje w zależności od ich wymiarów oraz liczby jednostek umieszczanych na planszy:

| nazwa           | wymiary | ilość |
|:----------------|---------|-------|
| Czteromasztowiec| 4x1     | 1     |
| Trójmasztowiec  | 3x1     | 2     |
| Dwumasztowiec   | 2x1     | 3     |
| Jednomasztowiec | 1x1     | 4     |

Statki nie mogą na siebie nachodzić ani stykać się w żadnym punkcie (również na rogach). Gra powinna uniemożliwiać graczowi nielegalne ustawienie swoich statków.

Po rozstawieniu swoich statków zaczyna się właściwa rozgrywka, która polega na naprzemiennym wybieraniu przez graczy pola na planszy przeciwnika. Po wybraniu takiego pola na planszy powinien pojawić się symbol lub obrazek, symbolizujący jakie pole zostało trafione. 
Możliwe są trzy sytuacje: 
  - trafiono w puste pole
  - trafiono w pole na którym jest statek przeciwnika, ale nie został on zatopiony
  - trafiono w pola na którym jest statek i został on zatopiony
  
Statek zostaje zatopiony w momencie, gdy zostały trafione wszystkie pola na których się znajdował. Jeśli gracz trafi w pole na którym znajduje się statek, zyskuje dodatkowy ruch.
Celem gry jest zatopienie wszystkich statków przeciwnika.

Dodatkowym wymaganiem jest, aby na planszy przeciwnika oznaczane i dezaktywowane były nie tylko pola, które zostały już wcześniej wybrane, ale też takie na których nie może już być statku, bo pole to sąsiaduje z odkrytym wcześniej statkiem.

## Tryb dla 2 graczy

Własna plansza danego gracza powinna być w pełni wyświetlana tylko w trakcie jego tury. Na planszy przeciwnika są wtedy wyświetlane tylko odkryte pola.

Pomiędzy turami powinien wyświetlać się ekran przejściowy umożliwiający zakończenie i rozpoczęcie następnej tury, tak by gracze nie mogli podglądać planszy przeciwnika.
Opcjonalnie zamiast tego można napisać grę w wersji sieciowej z prostym serwerem obsługującym 2 graczy.

## Tryb gry z komputerem

W tym trybie zawsze wyświetlany jest tylko jeden widok. Zawiera on planszę gracza oraz planszę komputera, ale tylko z odkrytymi przez gracza polami.

Komputer powinien posiadać różne stopnie trudności. W trybie łatwym może on na przykład wybierać pola zupełnie losowo, natomiast w trudniejszych trybach powinien już wykorzystywać jakąś strategię zwiększającą szansę na trafienie w statek. Przykładową strategią jest obliczanie dla danego pola, na ile sposobów może się na nim znajdować okręt i wybieranie tych pól, na których ta liczba jest większa. Komputer powinien też mieć umiejętność "dobijania" statków, czyli gdy trafi w statek i nie zostanie on jeszcze zatopiony, to strzela w sąsiadujące pola do momentu aż go nie zatopi.

## Zasady gry

[https://pl.wikipedia.org/wiki/Okr%C4%99ty](https://pl.wikipedia.org/wiki/Okr%C4%99ty)

## Przykładowa implementacja gry

[http://pl.battleship-game.org/](http://pl.battleship-game.org/)
