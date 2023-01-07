# Pokemony

## Punktacja

- po 6 punktów dla dwóch osób za wersję uproszczoną

- po 8 punktów dla dwóch osób za wersję pełną

## Cel gry

Celem gry jest zbieranie i trenowanie naszych pokemonów, aby pokonać bossa i zostać mistrzem pokemonów

## Opis gry

Podczas gry wcielamy się w początkującego trenera pokemonów, który marzy o zostaniu najlepszym trenerem pokemonów na świecie. Gra jest inspirowana starymi grami o Pokemonach. Podczas gry poruszamy się po mapie (min 25x25), na której znajdują się dzikie pokemony oraz boss(też pokemon, tylko wygląda groźnie).
Gdy podczas poruszania się natrafimy na pokemona, rozpoczyna się walka turowa, w której na zmianę z przeciwnikiem wybieramy jeden z ataków, które umie wykonać nasz pokemon lub próbujemy go złapać. Walka kończy się, gdy przeciwny pokemon zostanie złapane lub, gdy punkty życia któregoś pokemona spadną do 0.


### Pokemony

Każdy pokemon charakteryzuje się następującymi właściwościami:
- maksymalne punkty życia
- typ (wodny, ognisty itp.)
- lista trzech ataków, każdy z tych ataków zadaje określone obrażenia i również posiada typ, który wpływa na jego efektywność w zależności od typu odbiorcy
- unikalny wygląd
- poziom doświadczenia (min 1, pokemony nie umierają)

Poziom doświadczenia naszego pokemona rośnie w siłę za każdym razek, gry uczestniczy w wybranej walce lub maleje, gry przegra walkę.
Każdy poziom zwiększ siłę ataków pokemona i jego maksymalne punkty zdrowia o 20% jego bazowych statystyk.

Pokemony można wymyślić samemu lub wykorzystać istniejące np. za strony https://pokemondb.net/pokedex. Typy pokemonów i relacje między nimi rownież można stworzyć samemu lub wykorzystać istniejące.

### Kolekcja pokemonów (tylko pełna wersja)

Podczas poruszania się po mapie, mamy wgląd w swoją kolekcje pokemonów i możemy w dowolnym momencie zmienić aktywne pokemony (między 1 i 3), ktore będziemy mieli do wyboru na początku walki. 

### Mapa

Mapa to prostokąt o wymiarach minimum 25x25, na mapie znajduje się nasza postać, ktorą możemy porzuszać strzałkami, oraz losowo rozstawione pokemony, które przy każdym naszym ruchu mają 20% szansy, aby przemieścić się na losowe sąsiednie pole. Na mapie znajdują się również przeszkody, czyli pola, na które nie można wejść (np. płotek albo kamień itp.) oraz Pokemon Boss, który jest pokomonem sliniejszym, który nie zmienia swojej pozycji, po jego pokonaniu dostajemy komunikat o byciu super i wygraniu gry, ale możemy kontynuować rozgrywkę.

Po pokonaniu pokemona znika on z mapy i w losowym miejscu pojawia się nowy losowy pokemon.

Pokemonu na mapie również mają swój poziom, który jest ustalany w momencie ich pojawienia się na mapie i jest ustalany losowo w przedziale od 1 do (poziom naszego najsilniejszego pokemona + 2).

Poziomy dzikich pokemonów są widoczne na mapie.

### Walka

Walka odbywa się na osobnej scenie z widokiem na naszego i przeciwnego pokemona oraz punkty zdrowia.

(Tylko pełna wersja) Na początku walki jeśli posiadamy więcej niż jednego aktywnego pokemona, możemy wybrać który z nich będzie uczestniczył w walce.

Starcie polega na wykonywaniu przez obie strony ruchów na zmiane, do momentu gdy jeden z pokemonów polegnie lub zostanie złapany. Komputer losuje ataki drugiego pokemona, a my możemy za każdym razem wybrać, który atak wykonujemy (forma wyboru dowolna). 

(Tylko pełna wersja) Zawsze można wykonać ruch "złap pokemona", ale szansa na sukces jest równa 1 - % aktualnego życia przeciwnika

## Wersja uproszczona

- w wersji uproszczonej nie istnieje możliwość łapania pokemonów, cały czas jesteśmy jednym pokemonem, którym zaczęliśmy rozgrywkę
- w wersji uproszczonej wymagana jest implementacja tylko 3 rożnych typów pokemonów i ich ataków

## Wymagania minimalne
- rozmiar mapy: 25x25
- liczba rożnych pokemonów: 8
- liczba typów pokemonów: 4 dla wersji pełnej, 3 dla uproszczonej


#### Autorzy:
- [Tomasz Janik](https://github.com/Raklle)
- [Jakub Żywiecki](https://github.com/jzywiecki/)
