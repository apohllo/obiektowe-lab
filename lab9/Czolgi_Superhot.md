# Czołgi x Superhot

Projekt polega na napisaniu gry w czołgi w stylu gry superhot.

## Punkty 3 (bez power-upów), 4 (z power-upami)

# Cel gry
Zdobyć jak najwyższy wynik :)

# Opis gry
Czołg gracza pojawia się na środku kwadratowej mapy o konfigurowalnych wymiarach, na początku pustej. W każdej turze gracz może się obracać do woli (co 45 stopni), jednakże może wykonać tylko jeden ruch do przodu lub do tyłu w jednym z 4 kierunków (góra, dół, lewo, prawo), albo wystrzelić jeden pocisk (w jednym z ośmiu kierunków, razem ze skosami). Po ruchu gracza, wrogie czołgi także wykonują jedną z tych akcji. W zależności od konfigurowalnego poziomu trudności oraz innych parametrów, na mapie mogą pojawiać się trzy obiekty: 
 - Wrogie czołgi
 - Przeszkody
 - Power-Upy 
 
 Za każde zniszczenie wrogiego czołgu gracz dostaje punkt. Niszczenie przeszkód oraz zbieranie Power-Upów nie daje bezpośrednio żadnych punktów, lecz może pomóc w ich zdobywaniu.

# Wymagania
Pojawianie się nowych obiektów na mapie jest dozwolone tylko na pustych miejscach (niezajętych przez żaden z obiektów). Obiekty pojawiają się na mapie w losowych miejscach i w losowych odstępach czasu, jednakże każdy obiekt ma skojarzony ze sobą parametr wejściowy, np. X, który oznacza, że kolejny obiekt danego typu pojawi się najpóźniej po X turach od poprzedniego. Dodatkowo:
 - Czołgi mogą wjeżdżać tylko na puste miejca. W każdej turze wybierają z prawdopodobieństwem 1/2 czy wystrzelić pocisk w kierunku gracza czy zmniejszyć dystans (jeżeli gracz i wrogi czołg nie są na tej samej współrzędnej X bądź Y to kierunek strzału powinien być jak najbardziej zbliżony do gracza). Dodatkowo, po wybraniu odpowiedniej opcji, czołgi mogą pojawiać się z zestawem losowych Power-Upów (oprócz nieśmiertelności). Przeciwnicy nie mogą pojawiać się w kwadracie 5x5 wyśrodkowanym na graczu. Na mapie musi zawsze istnieć przynajmniej jeden wrogi czołg.
 - Pociski, podobnie jak czołgi, także poruszają się tylko o jedno pole na turę. Przy trafieniu wrogiego czołgu jest on niszczony, przy trafieniu gracza traci on życie, przy trafieniu przeszkody także traci ona życie (ma dwa), natomiast przez Power-Upy pocisk przenika. Po kolizji pocisk znika.

## Dostępne Power-Upy
 - Dwa ruchy na turę
 - Pociski poruszają się dwa pola na turę
 - Pociski przebijające: powodują dwukrotnie większe obrażenia i nie znikają po napotkaniu obiektu
 - Pociski odbijające się od ścian (odbijają się od ścian i przeszkód, zadając obrażenia, po kontakcie z wrogim czołgiem, lub naszym :), znikają)
 - Nieśmiertelność
 - Dodatkowe życie
 
Każdy Power-Up ma określoną ilość tur działania. Po zebraniu danego Power-Upa, możemy go aktywować za pomoca klawiszy numerycznych w dowolnym momencie bez straty tury (oprócz dodatkowego życia, to jest używane automatycznie).

Oczywiście wszelkie dodatkowe modyfikacje i urozmajcenia są mile widziane :)
