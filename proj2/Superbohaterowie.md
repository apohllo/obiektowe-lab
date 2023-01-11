# Superbohaterowie

## Autorzy:

-   [Marek Żuwała](https://github.com/marek-02)
-   [Jakub Szaredko](https://github.com/Szaroslav)
-   [Filip Krupa](https://github.com/Krupsonn2022)

## Punktacja

Za wykonanie projektu można otrzymać **8 punktów**.

## Cel gry

Celem gry jest zarządanie grupą superbohaterów, tak, żeby rozwiązywać pojawiające się w mieście problemy.

## Opis gry

Podczas gry wcielamy się w menadżera superbohaterów, którzy zostali wynajęci przez burmistrza pewnego miasta na okres 60 dni (tur). W mieście pojawią się problemy, a naszym zadaniem jest wysyłanie superbohaterów do ich zwalczania. Na początku naszej współpracy otrzymujemy od burmistrza kredyt zaufania w postaci 3 punktów ufności. Gdy nie rozwiążemy danego problemu na czas, tracimy odpowiednią liczbę punktów ufności. Raz na grę będzie możliwość zdobycia dodatkowego punktu zaufania od burmistrza, biorąc udział w specjalnym wydarzeniu. Jeśli po 60 dniach burmistrz miasta będzie nam dalej ufał, otrzymamy wynagrodzenie (wygramy grę), natomiast wyczerpanie kredytu zaufania (strata wszystkich punktów ufności) skutkuje wyrzuceniem z miasta (przegrywamy grę).

### Miasto

Miasto to kwadrat o rozmiarach 16 x 16 przez które przepływa rzeka i w którym znajdują się różne obszary specjalne.

#### Rzeka

Rzeka płynie góra-dół, zaczyna się i kończy na polach o współrzędnych x ∈ [4, 11]. W pewnym miejscu rzeka zmienia swój kierunek na lewo-prawo, po czym po kilku polach wraca do pierwotnego kierunku. Przez rzekę przechodzą 4 mosty, które umożliwiają przejście na drugą stronę (nie można przejść po ukosie). Bohaterowie nie mogą przejść przez rzekę.

#### Przeszkody

W mieście znajduje się 16 obszarów, przez które nie można przejść i 8 które spowalniają superbohaterów (ich koszt ruchu wynosi 2).

#### Budynki specjalne

W mieście znajduje się ratusz. Niepowstrzymanie problemu w jego polu rozwścieczy burmistrza, czego konsekwencją będzie utrata 2 punktów ufności.

W mieście znajduje się także nasza siedziba. Niepowstrzymanie problemu w jej polu spowoduje od razu przegranie gry.

### Wydarzenia

W mieście zmagamy się z 4 rodzajami problemów, które generują się losowo na start i co określoną liczbę dni na pojedynczym polu. Żeby rozwiązać problem 1 bohater musi udać się w to miejsce i spędzić określoną liczbę dni (czas rozwiązywania). Jeśli problem nie zostanie rozwiązany po pewnej liczbie dni (czas destrukcji), tracimy punkty ufności.

#### Rodzaje problemów

Problemy można podzielić na 2 grupy.

Problemy standardowe:

-   Pożar
-   Zagadka kryminalna
-   Problem techniczny

Czas ich rozwiązywania wynosi od 3 do 5 dni (losowo).  
Czas destrukcji wynosi `3 * czas rozwiązywania`.  
Szansa na wystąpienie problemu z tej grupy wynosi 85 %.

Problem krytyczny:

-   Pojawienie się superzłoczyńcy

Czas jego rozwiązywania wynosi od 5 do 7 dni (losowo).  
Czas destrukcji wynosi `2 * czas rozwiązywania`.  
Szansa na wystąpienie problemu z tej grupy wynosi 15 %.

#### Pojawianie się problemów

Na początek gry pojawiają się 3 problemy, a później każdy kolejny pojawia się losowo co [max(X - 1, 1), X + 1], gdzie X = 5 - ([NUMER_TURY] div 15)
`div` - dzielenie całkowitoliczbowe

#### Wydarzenie specjalne

Ktoś zdobył niekorzystne zdjęcia burmistrza i go nimi szantażuje. Burmistrz chciałby załatwić tę sprawę dyskretnie i prosi nas o pomoc, podając adres szantażysty. Jest to dodatkowe zadanie, wykraczające poza nasz ustalony zakres obowiązków, więc niewykonanie go nie spowoduje utraty punktów ufności, ale jeśli uda się nam go zrobić zyskamy 1 dodatkowy punkt ufności (możemy ich mieć w sumie 4). Czas na jego rozwiązanie wynosi 3 dni, a czas destrukcji 6. Wydarzenie to pojawia się w losowym dniu naszej rozgrywki.

### System superbohaterów

Na początku wszyscy bohaterowie znajdują się w siedzibie superbohaterów. Codziennie możemy wykonać ruch każdym naszym superbohaterem. Jeśli bohater chce rozwiązywać dany problem musi stać na jego polu (bohater stojący na polu problemu jest w trakcie jego rozwiązywania). Przerwanie rozwiązywania problemu resetuje licznik czasu rozwiązywania. Po kliknięciu w danego bohatera, powinniśmy zobaczyć widok z statystykami:

-   czy jest w trakcie rozwiązywania problemu, jeśli tak to ile dni już nad nim pracuje
-   ile ma dostępnych punktów ruchu
-   jego charakterystykę (patrz poniżej)
    Dodatkowo po kliknięciu w bohatera pola na które możemy się poruszyć powinny być wyróżnione. Nad jednym problemem może pracować 1 bohater, ale na polu bez problemu może znajdować się kilku bohaterów.

#### Charakterystyka superbohaterów

1. Super Wojownik

    - maksymalny dystans do przejścia w ciągu dnia: 6
    - superzłoczyńcę pokonuje w 2 dni
    - zagadkę kryminalną rozwiązuje o 2 dni dłużej

2. Super Policjant

    - maksymalny dystans do przejścia w ciągu dnia: 4
    - zagadki kryminalne rozwiązuje o 3 dni krócej
    - superzłoczyńce pokonuje o 1 dzień krócej
    - problemy techniczne o 2 dni dłużej

3. Super Strażak

    - maksymalny dystans do przejścia w ciągu dnia: 4
    - jako jedyny może przechodzić przez rzekę w dowolnym punkcie
    - pożary gasi o 2 dni krócej

4. Super Informatyk
    - maksymalny dystans do przejścia w ciągu dnia: 3
    - problemy techniczne rozwiązuje w 1 dzień
    - zagadki kryminalne rozwiązuje o 1 dzień krócej
    - pożar gasi o 1 dzień dłużej
    - superzłończycę pokonuje o 2 dni dłużej

#### Helikopter

Dodatkowo mamy jeszcze do dyspozycji 1 helikopter. Możemy go wysłać do któregokolwiek z superbohaterów. Gdy to zrobimy bohater musi przez 2 dni stać w jednym miejscu (może w tym czasie rozwiązywać jakiś problem), a po tym czasie zostaje przeniesiony za pomocą helikoptera do naszej siedziby.

_Wszystkie wymienione parametry są wyłącznie propozycją i można je dowolnie modyfikować._
