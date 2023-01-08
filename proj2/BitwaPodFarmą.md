# Projekt 02 [bitwa pod farmą Cryslera - historia prawdziwa]
Treść niniejszego projektu została wymyślona i napisana podczas burzliwej dyskusji na zajęciach
programowania obiektowego.
## Opis gry
Celem projektu jest storzenie niewielkiej gry dla dwóch graczy, która będzie przybliżonym odtworzeniem sławnej bitwy pod farmą Cryslera. Naszym celem jednak będzie  ukazanie, jak ta bitwa przebiegała naprawdę :)).

Światem naszej gry będzie prostokątna mapa, zawierająca różne obiekty wykorzystywane do stoczenia bitwy.
## Przebieg gry
1. Faza pierwsza - przygotowanie pola bitwy:

    Pierwsza część gry polega na przygotowaniu odpowiedniego pola bitwy. Prostokątna mapa jest
    podzielona na symetryczne połowy. Każdy z graczy koknroluje swojego herosa, który ma możliwość
    poruszania się w czterech różnych kierunkach (góra, lewo, dół, prawo). Sterowanie ma odbywać się za
    pomocą uprzednio ustalonych klawiszy. Podczas tej fazy, na mapie gracz ma do wyboru dwie możliwe
    akcje. Może zebrać występujące na mapie surowce, może też z zebranych zasobów zbudować różne
    umocnienia potrzebne do przeprowadzenia bitwy. Zasady działania surowców opisane w sekcji poniżej.
    Po upływie ustalonego wcześniej czasu, rozgrywka przechodzi do fazy drugiej.
2. Faza druga - bitwa:

    Drugą częścią gry jest bitwa. Istniejąca do tej pory przeszkoda po środku mapy znika, a gracze w
    miejsce bohatera otrzymują do konroli, stojący do tej pory po środku swojej mapy, czołg. Sterowanie
    czołgiem jest proste. Gracz może obrócić swój czołg o jedną jednostkę w lewo bądź prawo (czołg może
    być obrócony w jednym z 8 podstawowych kierunków) wykorzystując klawiaturę, może zrobić ruch do
    przodu oraz wypuścić pocisk, lecący w lini prostej zależnej od aktualnej orientacji. Ta część kończy się
    zwycięstwem jednego z graczy w momencie gdy uda mu się wyeliminować czołg drugiego gracza.
## Mapa
Mapa gry jest prostokątem o wymiarach x, y. Składa się ona z pól, na których mogą występować różne
obiekty. Na jednym polu, może występować maksymalnie jeden obiekt.
Możliwe obiekty występujące na polu mapy:
1. Część kamiennego umocnienia (ściany)
2. Część drewnianego umocnienia (ściany)
3. Surowce do zebrania w trakcie pierwszej fazy gry
Gracz może przemieszczać się na pola zajęte przez surowce, nie może jednak wejść na polę zajęte przez
umocnienia.
## Surowce
Gracz podczas pierwszej fazy rozgrywki ma możliwość zebrania surowców, wykorzystywanych do budowania
umocnień. Zbieranie surowców odbywa się przez stanie przez określoną ilość czasu na polu, na którym
występuje dany surowiec.
Surowce występujące w tym uniwersum:
1. Drewno - zbierane przez 3 sekundy, ma 2 punkty wytrzymałości.
2. Kamień - zbierany przez 10 sekund, ma 5 punktów wytrzymałości.
3. Ulepszony proch strzelniczy - zbierany przez 5 sekund, dający ulepszony nabój, zabierający 2 punkty
wytrzymałości (zwykły nabój zabiera 1 punkt wytrzymałości)
4. Metal - zbierany 10 sekund. Po zebraniu 5 metali istnieje możliwość rozbudowy czołgu do drugiego
poziomu

Zebrane drewno i kamień można wykorzystać w pierwszej fazie gry stając na wybranym polu i wciskając
odpowiedni klawisz na klawiaturze. "Budowanie" trwa 2 sekundy.
## Czołg
Czołg może wykonywać ruch do przodu, obracać się w 8 kireunkach (N, NW, W, SW, S, SE, E, NE) a także
wypuszczać pociski zwykłe albo ulepszone, lecące w lini prostej zależącej od aktualnej orientacji.
Czołg można ulepszyć do drugiego poziomu, zbierając 5 jednostek metalu i stojąc na pozycji zajętej przez
czołg przez 5 sekund. Pociski czołgu drugiego poziomu zadają dwa razy więcej punktów wytrzymałości.
Pocisk wytrzelony z czołgu leci w lini prostej i zatrzymuje się na pierwszej napotkanej przeszkodzie (lub końcu
mapy). Pocisk zabiera określoną ilość punktów wytrzymałości i zostaje usunięty z rozgrywki.
## Gracz
Gracz w pierwszej fazie gry kontroluje swojego herosa, może przemieszczać się na mapie, zbierać surowce,
budować umocnienia jeśli posiada odpowiednie surowce. Raz postawione umocnienia nie mogą zostać
zniszczone w tej fazie gry.
W drugiej fazie kontroluje czołg, może się przemieszczać na mapie, strzelać zwykłymi pociskami i pociaskami
ulepszonymi, jeżeli takie posiada.
## Początek rozgrywki
Gracze na początku wybierają ustawienia początkowe, takie jak:
1. Wymiary x, y mapy
2. Długość pierwszej fazy gry
3. Przygotowaną wcześniej mapę
4. Początkową wytrzymałość czołgu
5. Ewentualnie: długość drugiej fazy rozgrywki
Można przygotować nową mapę, wybierając pozycję na których będą rozmieszczone konretne surowce i
zapisać ją do późniejszego wykorzystania.
## Wymagania aplikacji
1. Aplikacja ma posiadać co najmniej prosty interfejs graficzny
2. Uruchomienie aplikacji powinno wyświetlić okno wyboru ustawień rozgrywki z możliwością rozpoczęcia
gry.
3. Program powinien umożliwić śledzenie atkualnego ekwipunku graczy oraz punkty wytrzymałości
(graczy i zabudowań, Za pomocą pasku zdrowia lub odpowiedniej reprezentacji graficznej) w
późniejszej fazie gry
4. Program powinien odliczać i wyświetliać czas pozostały do zakończenia pierwszej fazy gry.
5. Aplikacja powinna być możliwa do zbudowania i uruchomienia z wykorzystaniem Gradle'a

## Punktacja

Wariant jednoosobowy - 8pkt
Wariant dwuosobowy - 6pkt

## FAQ
Jeżeli któraś część powyższego projektu wydaje się nie do końca zrozumiała, autorzy pozostawiają miejsce do samodzielnej interpretacji treści.