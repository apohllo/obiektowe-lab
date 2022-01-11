# Ultimate Tic Tac Toe

## Liczba punktów: ?

## Krótki opis 

Jest to rozszerzona i bardziej wymagająca wariancja na temat popularnej gry „Kółko i krzyżyk”. Gra jest przeznaczona dla dwóch graczy.

## Plansza:

Plansza jest złożona z 9 (3x3) dużych pól (dalej "DP"), z czego każde takie pole zawiera kolejne 9 (3x3) małych pól (dalej "MP").

![obraz](https://user-images.githubusercontent.com/49537639/147745108-36e48da6-0367-44a6-808b-20c3a86b4723.png)

## Rozgrywka
Dwójka graczy na zmianę umieszcza swój symbol (kółko lub krzyżyk) tak jak w klasycznym „KiK”, ale DP, w którym może wykonać ruch, jest zdefiniowane przez poprzedzający ruch przeciwnika (pierwszy ruch zaczynającego gracza jest dowolny).

Przykładowo:
1. Gracz A stawia krzyżyk w prawym górnym MP centralnego DP (Jak na obrazie)
2. Gracz B musi teraz postawić swój znak na którymś z MP prawego górnego DP (zaznaczony na obrazie kolorem)
3. Gracz A musi teraz postawić swój znak w DP, odpowiadającym MP wybranym przez gracza B.
4. itd.

![obraz](https://user-images.githubusercontent.com/49537639/147746113-bb8eb49f-c24c-4cdc-9d1e-1097784f56ef.png)


W momencie, gdy któryś z graczy, wymusi ruch drugiego gracza na DP już zakończone (gdy wszystkie MP są zajęte lub któremuś z graczy udało się wygrać to pole) drugi gracz może umieścić swój znak na dowolnym dostępnym polu na nie zakończonych DP. 

![obraz](https://user-images.githubusercontent.com/49537639/147746420-170119a1-4efb-483c-8d62-280619660712.png)

## Warunki zwycięstwa:
Wygrywa ten z graczy, któremu udało się zdobyć DP w sposób taki, jak w klasycznym „KiK” (ciągła linia prosta 3 znaków). W wypadku braku możliwych ruchów gra kończy się remisem. 

## Wymagania:
* Gra powinna wizualnie zaznaczać dostępne ruchy do wykonania 
* Śledzenie ruchów graczy, np. w spostaci listy
* Możliwość ustalenia czasu na wykonanie ruchu (opcjonalne)

## Przykład
https://ultimate-t3.herokuapp.com/
