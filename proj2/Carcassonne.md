# Carcassonne - wersja Java
Jedna osoba 6 punktów 

# Opis i cel gry
Najważniejszym elementem Carcassonne są płytki terenu. Gra zawiera 72 płytki przedstawiające drogi, miasta i klasztory. Większość płytek zawiera również większy lub mniejszy fragment pola. "W pudełku" znajduj się również siedmiu podwładnych w 8 kolorach ( po jednym dla każdego gracza)

Jeden po drugim gracze będą umieszczać wylosowane płytki. W ten sposób, płytka po płytce, powstanie i będzie rozwijany krajobraz dróg, miast, klasztorów i pól. Gracz może umieszczać swoich podwładnych na płytkach, w ten sposób staną
się oni zbójcami, rycerzami i mnichami, a tym samym pozwolą na zdobycie możliwie jak największej liczby punktów. Punkty są zdobywane nie tylko w trakcie rozgrywki, ale też na samym jej końcu. Po punktacji końcowej gracz z najwyższą liczbą punktów zostaje zwycięzcą. Teraz - znając opis i cel gry, jesteś gotowy, aby zacząć!

## Przebieg gry
Rozpoczynając od pierwszego gracza, aktywny gracz wykonuje akcje, we wskazanym poniżej porządku, po czym rozpoczyna się tura kolejnego gracza i tak dalej.

**Akcje w grze:**
1. Ułożenie płytki - Gracz musi dobrać 1 płytkę terenu z zakrytych stosów i umieścić ją awersem ku górze, tak aby zachować ciągłość krajobrazu.
2. Umieszczenie podwładnego - Gracz może umieścić podwładnego ze swojej rezerwy na płytce, którą właśnie umieścił w grze.
3. Punktacja za obszar - Gracz musi podliczyć punkty za każdy ukończony przez ułożenie płytki obszar.

Umieszczenie podwładnego na dołączanej przez gracza drodze lub zamku jest tylko możliwe kiedy na danym fragmencie nie stoi podwładny przeciwnika.




## Płytki w grze
![Kafelki](https://i.imgur.com/18kV1oI.png)

Standardowa wersja gry zawiera 72 płytki (płytka startowa - _D_). Opis płytek może być przechowywany w pliku tekstowym (każda płytka ma 4 krawędzie zakończone drogą, murem, zamkiem, trawą)

[Pełne zasady](https://gralnia.org/wp-content/uploads/2019/11/Carcassonne-Big-Box-Instrukcja.pdf) są opisane pod tym linkiem na stronach od 1 do 7. Znajdują się tam również przykłady rozgrywki.

[Filmik tłumaczący zasady](https://www.youtube.com/watch?v=Pw0rHnvCGn0)

Do wykonania zadania wymagana jest jedynie implementacja podstawowej wersji gry czyli tylko drogi, zamki i klasztory. Nie trzeba implementować chłopów, świń, mostów itd...