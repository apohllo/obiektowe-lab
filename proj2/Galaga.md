# Galaga

## Punktacja

- Wersja podstawowa - 6 punktów
- Wersja rozszerzona - 8 punktów, lub 6 punktów w przypadku pisania projketu w parze


## Opis Gry

Projekt zainspirowany jest grą arcade "Galaga" w której kierujemy statkiem kosmicznym i pokonujemy kolejne fale przeciwników. Gracz ma możliwość poruszania się statkiem wyłącznie na boki oraz strzelania. Jego statek posiada 3 życia. Po utraceniu wszystkich, przegrywa. 

## Cel gry

Gra może posiadać dwa warianty:
- Story mode - gracz musi przejść przez wcześniej przygotowane 5 poziomów. Kolejne poziomy to fale przeciwników którzy będą się pojawiać
- Survival mode - gracz pokonuje kolejne fale przeciwników. Za zniszczenie każdego z nich otrzymuje punkty. Fale są generowane w sposób losowy. Początkowo mają one być proste a z czasem stawać się coraz trudniejsze (większa liczba przeciwników, przeciwnicy szybciej atakują)

## Wymagania podstawowe
- Tryb survival z tablicą wyników dla poszczególnych graczy lokalnych
- Losowe generowanie fal przeciwników
- Aktualny wynik podczas gry
- Przynajmniej 3 typy przeciwników

## Wymagania dodatkowe

- Dodatkowe bonusy wypadające z przeciwników, które wzmacniają nasz statek (zwiększona prędkość poruszania się, ulepszenie wystrzeliwanych pocisków, zwiększenie prędkości pocisków, odzyskanie jednego życia, itp.) 
- Story mode:
 - przygotowane wcześniej min. 5 poziomów, wyglądających za każdym razem tak samo
 - po każdym poziomie resetują się życia, jednak każda utrata życia skutkuje utratą pewnej ilości punktów
 - na koniec 5 poziomu na gracza czeka walka z bossem - potężniejszym przeciwnikiem, do tego obok bossa pojawiają się mniejszy przeciwnicy


## Dodatkowe informacje

- Przeciwnicy - są 3 podstawowe typy przeciwników. 1. który nas nie atakuje, 2. który ma możliwość strzelania i 3. który strzela oraz szybciej się poruszają.
- Wszyscy przeciwnicy mają możliwość poruszania się w górę i w dół
- Przeciwnicy poruszają się z różną szybkością, w zależności od typu przeciwnika.
- W przypadku  zderzenia z przeciwnikiem przeciwnik zostaje zniszczony a gracz traci 1 życie.
- Gracz ma na wstępie 3 życia, traci je w przypadku trafienia przez pocisk przeciwnika, bądź zderzenia z nim
- Przeciwnicy po dotarciu do dolnej krawędzi mapy teleportują się na górną i ponownie lecą w dół

## Inspiracje

[Gameplay z oryginalnej gry](https://www.youtube.com/watch?v=dvjapcHsqXY)