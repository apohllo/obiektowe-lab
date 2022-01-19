# Tetris

## Liczba punktów
3

## Opis gry
Gra toczy się na prostokątnej planszy o wymiarze 10x20 (lub inny, definiowany parametrem). Jest ona początkowo pusta. Z góry spadają klocki, jeden poziom w dół na jednostkę czasu. Każdy z klocków złożony jest z czterech klocków jednostkowych.  Jeśli zapełnimy cały rząd, on znika. Zachowanie klocków Tempo stopniowo wzrasta. Klocki spadają w dół tak długo, jak tylko nie natrafią na inne klocki lub dolną krawędź.

## Interakcja gracza:
* Przesuwaniu klocka w poziomie np. strzałkami prawo/lewo
* Obracaniu klocka np. strzałka w górę
* Przyspieszeniu spadania klocka (opcjonalne) strzałka w górę/spacja
## Spadanie klocków
W grze były stosowane różne algorytmy spadania klocków. Originalny nie uwzględniał spadania resztek klocków po usunięciu linii, natomiast najbardziej popularny to uwzględnia, przy czym resztki są nadal połączone. Niektóre wersje używają takiej metody, gdzie klocki po upadku rozbijają się na pojedyncze klocki jednostkowe.
## Cel gry
Przetrwać jak najdłużej. Gra się kończy w momencie gdy na planszy nie można dodać kolejnego klocka.

## Wymagania
* Działająca gra
* Wyświetlanie obecnego wyniku
* Wyświetlanie maksymalnego wyniku
* Wyświetlanie czasu gry

## Dodatki
* Raz na jakiś czas jeden z klocków już leżących (klocek jednostkowy) zmienia się w bombę - po zniszczeniu rzędu w którym się znajduje, niszczy dodatkowo 3x3 lub 5x5 pól wokół siebie.
* Zrobić dodatkowo klocki o rozmiarze 5, jak trudniejszy tryb (wtedy spadają zarówno te o rozmiarze 4 i 5)
* W tle ma grać muzyka (Dowolna)
* Wizualizacja położenia miejsca gdzie spadnie klocek, jeśli go nie ruszymy (zaimplementowane w przykładowej grze)

## Dodatkowy opis
https://pl.wikipedia.org/wiki/Tetris
## Przykładowa gra
https://tetris.com/play-tetris

