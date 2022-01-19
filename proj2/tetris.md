# Projekt nr 2 - Tetris

## Liczba punktów: 2

## Krótki opis
Projekt opiera się na napisaniu klasycznej wersji gry Tetris, która polega na usuwaniu z planszy pojawiających się czterech kwadratowych klocków tych samych wymiarów połączonych ze sobą bokami. Usuwanie możemy osiągnąć poprzez ułożenie pełnej linii klocków.

## Opis mapy
Mapa jest prostokątem o szerokości wynoszącej 10 jednostek oraz wysokości równej 20 jednstek. Mapa składa się z siatki kwadratów o boku długości 1 jednostki.

## Ruch i wygląd spadających klocków
Każda seria spadających bloków, czyli połączonych krawędziami długości 1 czterech kwadratów, powinna być pokolorowana losowo, tzn. losujemy pewien kolor i kolorujemy nim dany blok. Kolejne bloki wyłaniają się spod górnej podstawy prostokąta oraz przesuwają się ku jego dolnej podstawie, przeskakując (każdy kwadrat z bloku!) co pewien stały okres czasu o jedną jednostkę w dół. Gracz powinien mieć możliwość obrotu spadających bloków o 90 stopni, sterowania blokami w kierunku poziomym (tak jednak, by jakaś część bloku nie "wyjechała" poza mapę) oraz przyspieszenia procesu opadania bloku przy pomocy klawiatury. Zakładamy także, że górne oraz dolne podstawy kwadratów tworzących dany spadający blok są równoległe do dolnej i górnej podstawy prostokąta tworzącego mapę. Ponadto konfiguracje pojawiających się bloków powinny być losowe, np. z równym prawdopodobieństwem może pojawić się na mapie większy kwadrat złożony z czterech kwadratów o boku 1, jak i "długi klocek" złożony z czterech kwadratów. Pojawianie się nowych bloków powinno następować tylko w tych miejsach, w których jest to możliwe.

## Sposób punktacji gry
1. Usunięcie jednej linii poziomej klocków (co jest równoważne ułożeniu jednej linii poziomej klocków) = 10 pkt.
2. Usunięcie dwóch linii poziomych klocków jednocześnie = 20 pkt, do tego zyskujemy mnożnik punktacji razy 2, który podwaja liczbę nowo zdobywanych punktów przez najbliższe 40 sekund.
3. Usunięcie trzech linii poziomych klocków jednocześnie = 30 pkt, do tego zyskujemy mnożnik punktacji razy 3, który mnoży przez 3 liczbę nowo zdobywanych punktów przez najbliższe 40 sekund.
4. Usunięcie czterech linii poziomych jednocześnie = 40 pkt, do tego zyskujemy mnożnik punktacji razy 4, który mnoży przez 4 liczbę nowo zdobywanych punktów przez najbliższe 40 sekund.
5. Punkty możemy także zdobywać, przyspieszając proces spadania bloku. Wówczas każda pokonana jednostka siatki mapy to +2pkt do całości.

## Przebieg i zakończenie gry
Gra rozpoczyna się przez naciśnięcie przycisku "Start", może być zatrzymana przyciskiem "Pause", możemy także wyjść z gry przy użyciu przycisku "Exit". Gra kończy się porażką gracza, gdy cztery kwadraty jednostkowe "dotkną" górnej podstawy mapy. Wówczas graczowi powinno wyświetlić się okno podsumowujące całą grę (wyświetlamy statystyki - patrz punkt niżej).

## Pozostałe wymagania
Obok mapy powinny wyświetlać się następujące statystyki:
1. Liczba usuniętych linii klocków.
2. Sumaryczna liczba uzyskanych punktów.
3. Liczba usuniętych poczwórnych linii klocków.
4. Poziom - zaczynamy z poziomem równym zeru. Następnie, aby osiągnąć poziom pierwszy, musimy uzyskać 200 pkt. Aby osiągnąć poziom drugi, musimy uzyskać 400 pkt. Aby osiągnąć poziom trzeci, musimy uzyskać 600 pkt itd.
5. Czas gry.

Po zakończeniu gry wszystkie statystyki muszą zostać zapisane do pliku, np. csv.

## Przykładowa implementacja części gry (niekoniecznie spełniająca opisane powyżej wymagania) wraz z wyjaśnieniem kodu krok po kroku.
https://www.youtube.com/watch?v=dgVh6S8X25k
