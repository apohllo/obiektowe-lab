# Projekt nr 1 - generator ewolucyjny

Niniejsza treść została zaadaptowana na podstawie opisu oraz ilustracji przygotowanych przez Wojciecha Kosiora.
Inspiracją dla niego była z kolei książka "Land of Lisp" Conrada Barskiego, który zaś zainspirował się artykułem w
"Scientific American" :-)

## Formularz z linkiem do repozytorium

https://forms.gle/wCFZecEAk81VAYTM8


## Termin oddania projektu

* 21.12.2020 godz. 23:59:59 CET - normalny termin oddania projektu
* 23.12.2020 godz. 23:59:59 CET - późny termin oddania projektu tzn. -2 krwinki

## Cel projektu

Stwórzmy grę! Nie będzie to jednak gra, w którą my gramy. Zamiast tego będzie
to świat, który ewoluuje na naszych oczach! Stworzymy środowisko stepów
i dżungli ze zwierzętami, które biegają, buszują w zaroślach, jedzą i rozmnażają
się. A po kilka milionach lat zobaczymy, że wyewoluowały w różne gatunki!

<img src="zwierzak.jpg"/>

Świat naszej gry jest niezmiernie prosty. Składa się ze zwykłej, prostokątnej
połaci, której brzegi zawijają się na drugą stronę. Większość świata pokrywają
stepy, na których rośnie niewiele roślin stanowiących pożywienie zwierząt. Na
środku świata znajduje się niewielka dżungla, gdzie rośliny rosną dużo szybciej. 

<img src="dzungla.jpg"/>

Nasze zwierzęta, które są roślinożercami, będą przemierzały ten świat w poszukiwaniu pożywienia. Każde zwierzę ma
określoną energię, która zmniejsza się co dnia. Znalezienie i zjedzenie rośliny zwiększa poziom energii o pewną wartość.

Rośliny będą wyrastały w losowych miejscach, ale ich koncentracja będzie większa w dżungli niż na stepie. Codziennie w
naszym świecie pojawią się dwie nowe rośliny – jedna w każdej ze stref.

## Anatomia zwierzęcia


<img src="zwierzak2.jpg"/>

Musimy śledzić kilka cech każdego zwierzęcia. Po pierwsze, zarówno w przypadku rośliny jak i tych, którzy je zjadają,
musimy znać koordynaty `x` i `y`. Wskazują nam one, gdzie dane zwierzę lub roślina jest na mapie.  Musimy także wiedzieć,
ile energii ma dane zwierzę. To Darwinowska gra o przetrwanie, więc jeśli zwierzątko nie zdoła zdobyć odpowiedniej ilości
pożywienia, będzie głodować i umrze. Atrybut "energia" mówi nam, ile dni zostało jeszcze danemu zwierzątku. Musi ono
koniecznie znaleźć więcej jedzenia, zanim zapas energii się wyczerpie.  Musimy także pamiętać, w którą stronę zwrócone
jest zwierzę. Jest to ważne, ponieważ będzie ono przechodzić na sąsiedni kwadracik na mapie świata każdego dnia. Jest
osiem różnych możliwych obrotów.

<img src="kierunki.jpg"/>

Obrót `0` oznacza, że zwierzę nie zmienia swojej orientacji, obrót `1` oznacza, że zwierzę obraca się o 45°, `2`, o 90°,
itd. Przykładowo, jeśli zwierzę było skierowane na północ i obrót wynosi `1`, to zwierzę skierowane jest na
północny wschód. 

Na koniec musimy także przechowywać geny zwierzaka. Każde zwierzę ma 32 geny składające się z jednej liczby w zakresie od 0 do 7.
Te geny reprezentują preferencje zwierzęcia względem określonego obrotu. Każdego dnia zwierzę zadecyduje czy dalej
podążać w tym samym kierunku, czy skręcić i zwrócić się w inną stronę. Zrobi to na podstawie tych genów i losowo
wybierze nowy kierunek. Szansa na wybranie odpowiedniego obrotu jest proporcjonalna do liczby genów reprezentujących
go. Weźmy jako przykład zwierzę z genami:
`0 0 0 0 0 0 0 0 1 1 2 2 2 2 2 2 3 3 4 4 4 4 4 4 5 5 6 6 7 7 7 7`

To zwierzę najbardziej preferuje brak obrotu (p=0.25), na drugim miejscu jest obrót w prawo (`2`) oraz obrót w tył (`4`)
(p=0.1875), następny w kolejności jest obrót o 315 stopni (p=0.125). Pozostałe obroty mają takie samo prawdopodobieństwo (p=0.0625).

## Konsumpcja i rozmnażanie

Jedzenie jest prostym procesem. Zakładamy, że zwierzę zjada roślinę, gdy stanie na jej polu, a jego energia wzrasta
wtedy o zdefiniowaną wartość.

Rozmnażanie jest zwykle najciekawszą częścią każdej symulacji ze zwierzętami. Zdrowe młode może mieć tylko zdrowa para
rodziców, dlatego nasze zwierzęta będą się rozmnażać tylko jeśli mają odpowiednią ilość energii. Przy reprodukcji
rodzice tracą na rzecz młodego jedną czwartą swojej energii. 


Urodzone zwierzę otrzymuje genotyp będący krzyżówką genotypów rodziców. Wszystkie geny dzielone są na 3 grupy w
losowo wybranych miejscach (na wybranych indeksach, przy czym oba genotypy dzielą się w tych samych miejscach).
Dziecko otrzymuje 2 grupy genów od jednego rodzica oraz 1 grupę
genów od drugiego rodzica. Wartości są porządkowane, a jeśli okazałoby się, że któryś kierunek (lub kierunki) zostały
wyeliminowane, to losowo wybrane geny przyjmują wartość brakujących obrotów. Innymi słowy zwierzę zawsze posiada co
najmniej jeden gen każdego obrotu.

## Symulacja

Symulacja każdego dnia składa się z kilku kolejnych akcji:
* usunięcie martwych zwierząt z mapy,
* skręt i przemieszczenie każdego zwierzęcia,
* jedzenie (roślina jest zjadana przez zwierzę posiadające najwięcej energii lub kilka najsilniejszych zwierząt, jeśli więcej niż jedno
  posiada taką samą, największą energię; w takim przypadku energia rośliny jest dzielona),
* rozmnażanie zwierząt (rozmnażają się zawsze dwa zwierzęta o najwyższej energii na danym polu; jeśli występuje więcej zwierząt o tej
  samej energii, wybór jest losowy),
* dodanie nowych roślin do mapy.

Oczywiście na początku symulacji na środku świata umieszczamy jedno lub kilka zwierząt (Adam/Ewa).

## Szczegółowe wymagania

1. Program ma wyświetlać animację pokazującą pozycję zwierząt, ich energię w dowolnej formie (np. koloru) oraz pozycje
   roślin.
2. Można użyć dowolnego sposobu wyświetlania animacji (również tekstowego), ale animacja nie może polegać na
   wyświetlaniu po sobie łańcuchów tekstu (można natomiast wyświetlać łańcuchy tekstu w tym samym miejscu, wymaga to
   jednak użycia odpowiedniej biblioteki).
3. Program musi umożliwiać zatrzymywanie oraz wznawianie animacji w dowolnym momencie (niezależnie dla każdej mapy -
   patrz niżej).
4. Program ma pozwalać na śledzenie następujących statystyk dla aktualnej sytuacji w symulacji:
   * liczby wszystkich zwierząt,
   * liczby wszystkich roślin,
   * dominujących genotypów,
   * średniego poziomu energii dla żyjących zwierząt,
   * średniej długości życia zwierząt dla martwych zwierząt,
   * średniej liczby dzieci dla żyjących zwierząt.
5. Po zatrzymaniu programu można:
   * wskazać pojedyncze zwierzę, co powoduje wyświetlenie jego genomu,
   * wskazać pojedyncze zwierzę, w celu śledzenia jego historii:
     * określenia liczby wszystkich dzieci, po n-epokach,
     * określenia liczby wszystkich potomków, po n-epokach,
     * określenia epoki, w której zmarło,
   * wskazać wszystkie zwierzęta z dominującym genomem.
6. Program ma umożliwić wyświetlenie symulacji jednocześnie na dwóch mapach, z identycznymi parametrami początkowymi,
   lecz niezależnie losowanymi decyzjami.
7. Program powinien umożliwiać uzyskanie statystyki (jak w punkcie 4) po określonej liczbie epok w formie pliku tekstowego.
   Statystyki powinny stanowić uśrednienie wartości z poszczególnych epok.

[Często zadawane pytania](faq.md)

# Przykładowe implementacje

Uwaga: przedstawione implementacje niekoniecznie spełniają wymaga przestawione w sekcji "Szczegółowe wymagania".

* https://www.youtube.com/watch?v=4FangGEpwe4
