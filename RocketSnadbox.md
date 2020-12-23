# Cel gry
Celem gry jest zaprojektowanie rakiety kosmicznej, którą nastepnie bedzie można przetestować w symulacji "prawdziwej" płaskiej Ziemi.
---
## Opis gry
Pierwszym etapem będzie uproszczona budowa rakiety, polegająca na umieszczeniu wybranego modułu na dwuwymiarowym planie budowy.
Dostępne moduły: kokpit, zbiornik z paliwem, silnik oraz separator.

Po zatwierdzeniu projektu, rakieta może wystatrować. Jednak już chwile po starcie astronauci dostrzegają zagrożenie dla ich rakiety w postaci wielu
spadających asteroid, które należy unikać. Uniki gracz bedzie mógł wykonywać dzieki skrętą rakiety w prawo lub lewo. o do lotu to nasza rakieta przemieszcza 
sie po wąskim pasie pozwalającym na skuteczne omijanie asteroid. Pas ten ciągnie sie od Ziemi do nieskończoności. Gra sie kończy w przypadku braku paliwa
lub wleceniu w asteroide (lub na odwrót).

## Szczegóły i ograniczenia budowy rakiety
Budowa rakiety ma być możliwa tylko w wyznaczonej na to przestrzeni, ta przestrzeń składa sie z pustych kwadratów, które gracz może wypełnić. Moduły takie jak 
kokpit, zbiornik paliwa i silnik zajmują na planie tylko jeden jednostkowy kwadrat. Separator z koleji moze występować tylko pomiędzy takimi kwadratami.

Przestrzeń na budowe rakiety musi być stały, na przykład 7x10 pustych kwadratów.
Kokpit może być tylko jeden i jest on wymagany do startu. Może on być zafiksowany na stałe w jednym centralnym miejscu planu budowy.
Zbiorniki z paliwem można ustawiać jeden na drugim.
Silniki można umieścić tylko pod zbiornikiem z paliwem, dany silnik może pobierać paliwo tylko ze zbiorników znajdujacych sie bezpośrednio nad nim.
Separator pozwala na odzielenie segmentów bocznych rakiety przy czym nie jest możliwe zeby rakieta miała boczne segmenty nie połączone separatorem.

## Szczegóły dotyczące lotu
W trakcie lotu gracz ma mieć możliwość przemieszczenia swojej rakiety w prawo lub lewo aby unikać asteroid. Asteroidy mogą mieć różne rozmiary i zwroty predkości.
Za zderzenie można przyjąć moment kiedy środek danego modułu znajdzie sie w środku asteroidy, każda asteroida jest kulą. Silniki są uruchamiane (lub wyłaczne)
w przypadku klikniecia na nie oraz podobnie separatory rozdzielaja sie kiedy w nie klikniemy (oderwana część rakiety znika). Gracz może również strować
ciągiem uruchomionych silników.

## Prosta fizyka gry
Silniki nie uruchomione nie pobieraja paliwa, a zmniejszanie ciagu silników zmniejsza pobór paliwa. Grawitacyja uległa anomali i na każdej wysokości siła 
pola grawitacyjnego jest taka sama.

## Uwagi 
W skrajnych przypadkach zbyt duża masa rakiety moze uniemożliwic start rakiety. 
Należy dobrać tak parametry aby gra była grywalna. Zmiennymi sa masy modułów, ciag silnika oraz jego spalanie.

## Statystkyki
Gra wyświetla na bierząco wysokość i predkość rakiety.
