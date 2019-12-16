Color Squares
=====

### Opis projektu

Color Squares to aplikacja/gra, która polega na zajęciu jak największej ilości pól - większej niż pozostali przeciwnicy.


### Reguły gry
* na mapie w kształcie kwadratu (ewentualnie prostokąta) o rozmiarach N x N znajdują się przeszkody oraz przeciwnicy na
wylosowanych losowo polach
* gracz ma za zadanie wybrać pole, które chce zająć na początku gry
* po wybraniu pola startowego, gracz klikając na przycisk `start` rozpoczyna daną grę
* przebieg gry polega na tym, że w każdej kolejnej fazie losowana jest kolejność wykonywania ruchów przez graczy (tj.
przeciwników oraz nas), następnie każdy z graczy zajmuje 4 pola w głównych kierunkach świata względem każdego wcześniej 
zajętego pola, o ile jest to możliwe (tzn. niewystępuje tam przeszkoda ani pole nie jest zajęte przez przeciwnika)
* gra kończy się w momencie, gdy zostanie zajęte każde możliwe pole na mapie
* wygrywa ten gracz, któremu uda się zająć jak największą powierzchnię


### Szczegóły implementacyjne
* rozmiar mapy powinien być mozliwy do ustawienia podczas uruchamiania aplikacji
* przeszkdoy mogą przyjmować dowolny kształt - pojedyncze pole lub więcej (np. 4 pola w kształcie litery L)
* przeszkody powinny być za każdym razem losowane lub powinny być stworzone gotowe mapy do rozgrywki - np. zapisana mapa
wraz z ustawionymi przeszkodami w formacie `*.json` lub innym preferowanym
* zajęcie danego pola może zostać wyświetlone poprzez pokolorowanie danego pola kolorem przypisanym do przeciwnika
* zarówno przeciwny jak i gracz nie mogą mieć ustawionego pola startowego poza mapą jak i na przeszkodzie
* po zakończonej grze powinna być możliwość zrestartowania gry - poprzez np. przycisk `spróbuj ponownie`
* pod koniec rundy powinno zostać wyświetlone podsumowanie gry - ile każdy z graczy zajął pól oraz który z nich wygrał


### Możliwe modyfikacje gry (opcjonalne)
* w każdej fazie gry można zaimplementować, aby dla każdego zajętego wcześniej pola przez gracz było losowane czy w danym
kierunku świata zostanie zajęte kolejne pole - sprawi to, że gra będzie o wiele mniej przewidywalna i ciekawsza


### Przykładowy gameplay

![alt text](https://agh.mzlnk.pl/po/colorsquares/assets/pictures/example-gameplay.gif)