# Projekt nr 2. - Cywilizacja
## Punktacja
Projekt jednoosobowy z wariantami
-   4 punkty
-   6 punktów
-   8 punktów

Poniższy opis zawiera ogólne informacje na temat projektu. Szczegóły wariantów znajdują się na końcu.

---

## Cel projektu
Projekt polega na symulacji rozwoju ludzkości od jej początków aż do współczesności.Prześledzimy bieg alternatywnej historii, w której nowe cywilizacje zmierzą się ze sobą na polu militarnym, religijnym oraz naukowym walcząc ze sobą o dominację nad światem. Pomysł częściowo wzorowany jest na znanej turowej grze komputerowej o tym samym tytule.

## Opis projektu
Forma symulacji przypomina generator ewolucyjny z pierwszego projektu, jednak miejsce zwierząt i roślin zajmą ludzie różnych profesji, oraz miasta przynależące do swoich cywilizacji. Mapę naszego świata będzie reprezętpował prostokąt o kwadratowych polach i to na nim stoczy się bój o dominację.

Cywilizacje rozpoczną swoją historię w małych wioskach, z których co pewien czas w świat wyruszać będą uczeni i wojownicy. Dzięki interakcjom między sobą, oraz z napotkanymi wrogami rozwój będzie postępował: na mapie powstaną i rozbudują się nowe miasta, dojdzie do bitew oraz rósł będzie postęp technologiczny. Symulacja zakończy działanie, kiedy jedna z cywilizacji zdominuje całkowicie świat unicestwiając wroga, bądź też, kiedy któraś z nich osiągnie najwyższy możliwy poziom technologiczny.

## Cywilizacja
### Charakterystyka
Cywilizacja jest społeczeństwem łączącym przynależących do niej ludzi.Charakteryzują ją rozwój naukowy oraz nastawienie:
-   Poziom rozwoju nauki - wartość liczbowa opisująca stopień zaawansowania danej cywilizacji. Ma wpływ na umiejętności wojowników, oraz po osiągnięciu pewnej wartości prowadzi do zwycięstwa. Oprócz rozwoju przez naukowców, wartość ta rośnie co roku o pewną niewielką stałą zadaną wartość.
-   Nastawienie cywilizacji - charakter rozwoju naszej cywilizacji - określa prawdopodobieństwo wyszkolenia nowego wojownika, bądź też uczonego. Te cywilizacjie, w których częściej rodzić się będą uczeni będą bardziej pokojowe od tych z większą ilością żołnierzy.

Każdy człowiek żyjący na świecie przynależy do jednej z cywilizacji.
### Zwycięstwo
Celem każdej cywilizacji jest dominacja nad światem. Można to osiągnąć na 2 sposoby: militarnie lub naukowo
-   zwycięstwo militarne - osiągane jest, kiedy żadna inna cywilizacja nie posiada już miast na mapie
-   zwycięstwo technologiczne - osiągane jest po zdobyciu odpowiedniej wartości rozwoju nauki.

## Człowiek
### Anatomia
Człowiek jest pod tym względem podobny do zwierzęcia z generatora ewolucyjnego. Opuszczając rodzinne miasto, porusza się w jednym roku (jednej turze) o jedną kratkę w jednym z 8 kierunków. Kierunek jego ruchu jest jednak wybierany całkowicie losowo.
Człowiek posiada także żywotność, czyli ilość tur jakie od urodzenia przeżyje.

W przypadku wojownika, posiada on jeszcze wartość walki, która rozstrzyga bitwy. Poziom rozwoju naukowego cywilizacji wpływa na tę wartość.

### Profesje
Tak jak napisano wyżej, stąpający po ziemi ludzie sprawują jedną z dwóch profesji: wojownika, bądź uczonego. Zadaniem wojownika jest ograniczenie wpływów wroga: zabijanie napotkanych przeciwników oraz niszczenie wrogich miast. Uczeni badają z kolei świat rozwijając naukę, zakładają nowe miasta i rozwijają te już istniejące. Rozwój historii następuje za sprawą interakcji pomiędzy nimi, którą opisano niżej.
W zależności od wybranego wariantu istnieje także pewna niewielka szansa, że urodzony naukowiec okaże się buntownikiem. Taki człowiek zakłada nowe miasto należące do zupełnie nowej cywilizacji.

### Interakcje
Do interakcji dochodzi kiedy jeden, lub więcej ludzi pod koniec tury spotka się na jednym polu. Rozstrzygane są następująco:
-   uczeni jednej cywilizacji - postęp technologiczny cywilizacji rośnie o pewną wartość (tylko dla jednej pary naukowców na polu) 
-   uczony i wojownik jednej cywilizacji - uczony podnosi siłę wojownika o pewną wartość. 
-   wojownicy jednej cywilizacji - wojownicy formują oddział. Od teraz poruszają się po mapie wspólnie sumując swoje siły ataku do czasu, aż któryś z nich umrze. W opisie interakcji oddział jest traktowany tak jak wojownik.
-   wojownicy przeciwnych cywilizacji - wojownicy walczą ze sobą na śmierć i życie. Zwycięża wojownik (oddział) o największej sile militarnej. W przypadku remisu decyduje postęp technologiczny, a w drugiej kolejności aktualna żywotność wojowników (czas jaki pozostał im do śmierci). W przypadku oddziałów przed żywotnością, remisy rozstrzyga liczność tego oddziału.
-   uczony i wojownik przeciwnych cywilizacji - wojownik natychmiast zabija uczonego.
-   uczeni przeciwnych cywilizacji - w takim przypadku cywilizacja o niższym zaawansowaniu technologicznym uczy się czegoś od drugiej. Słabsza cywilizacja otrzymuje pewną wartość punktów postępu technologicznego.

W przypadku, kiedy na polu znajdzie się więcej osób interakcja rozważana jest w następującej kolejności:
- Wojownicy wspolnych cywilizacji tworzą oddziały
- Dochodzi do walki wojowników. Po walce przegrana strona traci wszystkich ludzi, jacy znajdowali się na tym polu.

## Miasto
Miasto to pole na mapie, w którym co pare tur rodzi się człowiek, który rusza z niego w świat. Każde z miast posiada własny parametr żywotności rodzących się w nim ludzi, oraz poziom jego obrony.

### Interakcje z miastem
- wojownik tej samej cywilizacji - rośnie poziom obrony miasta
- uczony tej samej cywilizacji - poziom żywotnosci mieszkancow miasta wzrasta
- wrogi wojownik - porównywana jest siła wojownika (lub oddziału) z wartością obronności miasta. Miasto zostaje zniszczone, jeżeli strona atakująca miała większą siłę. W przeciwnym przypadku wojownicy znikają z mapy. Remisy wygrywa miasto.
- wrogi uczony - wrogi uczony kradnie technologię cywilizacji: poziom rozwoju naukowego wroga rośnie.


### Założenie nowego miasta
Każda cywilizacja niezależnie od swojego charakteru i rozwoju technologicznego posiada jednakową szansę na założenie nowego miasta. Po konkretnej ilości tur jeden z uczonych każdej z cywilizacji na mapie zamienia się na nowe miasto. Jeżeli cywilizacja nie posiada w tym czasie uczonych na mapie, na miasto zamienia się jeden z wojowników. Niezależnie więc od nastawienia cywilizacji, szanse założenia miasta są równe.


## Aplikacja
Aplikacja tak jak w przypadku generatora ewolucyjnego w pierwszej kolejności przyjmuje na wejściu pewne parametry, a następnie po uruchomieni wizualizuje bieg świata w oknie obok.
-  W oknie startowym powinna być możliwość modyfikacji niektórych parametrów. Wśród nich przede wszystkim:
    - Wymiary mapy  
    - Ilość startowych cywilizacji oraz położenie ich początkowych wiosek
    - Poziom nauki potrzebny do zwycięstwa itd.
-  Każdą z cwilizacji powinien charakteryzować unikalny kolor
-  Stopień zaawansowania cywilizacji powinien być obrazowany w jakiś sposób, np jeden z poniższych, lub oba:
   - Poprzez liczbowe wartości obok okna
   - Poprzez zmianę tekstur ludzi i miast na nowocześniejsze (z kolejnej epoki według uznania)
-  Obok mapy wyświetlać się mogą statystyki dotyczące minionych lat, stopnia zaawansowania cywilizacji, ilości konkretnych pofesji, miast i pokonanych wrogów

## Warianty
### Wariant podstawowy - 4 pkt
-   Na świecie są tylko dwa imperia. Pominięty jest wariant z możliwością powstania nowej cywilizacji.
-   Cywilizacje nie budują nowych miast. Symulacja kończy się natychmiast po zdobyciu początkowej wioski lub osiągnięcia pewnego poziomu nauki.
-   Szczegółowe statystyki nie są wymagane.

### Warianty do wyboru
Projekt posiada szereg dodatkowych opcji, których konkretna kombinacje są dodatkowo punktowane. Każdej z poniższych opcji przypisano wartość "małych punktów", których suma porównywana jest z progami opisanymi w kolejnym akapicie:
-   Buntownik (2 kpt) - Dla każdego miasta istnieje pewna niewielka szansa, że urodzony w nim naukowiec będzie buntownikiem. W takim przypadku po pewnej ilości tur uczony zamienia się na nowe miasto zupełnie obcej cywilizacji o startowych parametrach według uznania(np losowych). Taka cywilizacja powinna mieć nowy kolor oraz nowe miejsce w statystykach. 
-   Woda (1 pkt) - Na startowej mapie pojawiają się pola wody, które są wyłączone z użytku. Można zmodyfikować wariant tak, że dopiero po uzyskaniu penwgo poziomu nauki, ludzie będą mogli na nie wchodzić. 
-   Dodatkowe profesje (4 pkt) - autor projektu może wymyślić dodatkowe profesje ludzi na naszym świecie. Idzie za tym ciekawsza historia i większe zróżnicowanie cywilizacji. Przykładowa dodatkowe profesja: 
    - Prorok/kaznodzieja - postać która po napotkaniu wroga stara się narzucić mu własną kulturę/religię, a co za tym idzie przeciągnąc go na własną stronę. Alternatywnie może zmieniać jedynie jego religię, jeżeli zdecydowano się zainspirować niżej opisanym dodatkowym zwycięstwem religijnym.
-   Dodatkowe zwycięstwo (4 pkt) - autor może wymyślić także dodatkowy sposób na zwycięstwo na przykład dodając dodatkowy parametr,którego osiągnięcie pewnego poziomu prowadzi do dominacji. Może być to na przykład religia. Każdego człowieka może opisywać także dodatkowy parametr wyznawanej religii, którego zmianę będzie inicjowało spotkanie z wyżej opisanym kaznodzieją. Symulacja kończyłaby się, kiedy wszyscy, lub konkretny procent ludzi na ziemi będzie wierzył w religię zwycięskiej cywilizacji.
-   Wydarzenia losowe (2 pkt za jedno, 3 pkt za 2, 4 pkt za 3 i więcej) - ten wariant umożliwia wprowadzenie dodatkowych wydarzeń takich jak globalne katastrofy naturalne lub wydarzenia wewnątrz cywilizacji. W statystykach mogłaby znaleść się wtedy dodatkowo oś czasu, która chronologicznie spisywałaby historię tych zdarzeń. Przykładowe pomysły:
     - Epidemia - miasta w obszarze dotkniętym epidemią na pewien czas przestają rodzić nowych ludzi. Jest też szansa, że całkowicie wymrą.
     - Tornado - wszyscy ludzie, przez których pola przeszło tornado umierają. Miasta, które znalazły się w jego obszarze rodzą obywateli z niższą żywotnością na czas odbudowy strat.
     - Wojna domowa - przez pewną ilość tur, ludzie jednej cywilizacji traktują siebie jak wrogów (dochodzi do wyżej opisanych interakcji tak jak z wrogiem)
- Rozbudowa miasta (2pkt) - Kiedy naukowiec wchodzi do miasta zwiększając jego żywotność miasto dodatkowo rozrasta się o jedno pole w bok. Jeżeli wrogi wojownik stanie na tym polu, niszczy ten obszar miejski z powrotem obniżając żywitność w mieście o tę wartość.

### Progi punktowe
Po zsumnowaniu wartości "małych punktów" z wybranych wariantów należy tę wartość porównać z poniższymi progami:
-   5 małych punktów = 6 pkt
-   11 małych pubktów = 8 pkt
Oddając projekt autor powinien załączyć informacje o wybranych wariantach. 

---
## Sugestie
Aby uromaicić symulację można zasugerować się poniższymi pomysłami:
-   Można przygotować bazę możliwych początkowych cywilizacji o parametrach wcześniej zadanych i przetestowanych pod względem zrównoważenia. Można im także ponadaać nazwy i przypisać im osobne tekstury.
-   Rozwój technologiczny cywilizacji można obrazować zmieniając tekstury na mapie. Konkretne poziomy zaawansosania technologicznego mogą oznaczać nowe epoki a co za tym idzie nowy wygląd wojowników i miast.
-   Można przygotować gotową bazę map z gotowymi początkowymi startowymi pozycjami cywilizacji i zbiornikami wodnymi.





