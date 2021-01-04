# Górnik

## Opis

Celem projektu jest stworzenie gry z interfejsem graficznym. Gracz kontroluje górnika poszukującego klejnotów w ciemnej jaskini, musi znaleźć ich jak najwięcej do czasu, gdy górnikowi zabraknie paliwa w lampie.

## Plansza

Gra odbywa się na planszy zbudowanej z prostokątnych pól. Domyślnie górnik może poruszać się pomiędzy sąsiadującymi z nim polami.

Na polach planszy mogą się też znajdować szczególne przedmioty:
- klejnoty, które zwiększają licznik punktów gdy "zbierze" je górnik (wchodząc na dane pole),
- skała/ściana, która sprawia, że górnik nie może wejść na dane pole planszy,
- kanister paliwa, zwiększający ilośc paliwa do lampy górnika.

## Lampa i paliwo

Górnik ma lampę, która rzuca światło wokół górnika. Pola oddalone bardziej niż zasięg światła z lampy nie są widoczne.

Ponadto, górnik ma ograniczoną ilość paliwa, a lampa ciągle zużywa paliwo. Światło lampy jest tym słabsze, im mniej paliwa ma górnik. Gra kończy się, gdy górnik nie ma już paliwa.

## Rozszerzenia

Ten projekt jest szkieletem gry, który może oczywiście być rozszerzony na wiele sposobów. Niektóre takie rozszerzenia to np.:
- wprowadzenie nowych przedmiotów, np. kolce, które kończą grę gdy na nie wejdzie górnik,
- dodanie innych źródeł światła, np. stacjonarnych pochodni, przy których górnik może wyłączyć lampę by nie zużywała paliwa,
- proceduralne generowanie planszy.