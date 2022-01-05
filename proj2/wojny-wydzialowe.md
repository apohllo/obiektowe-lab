# Gra Wojny Wydziałowe (klon gry z serii Civilization)
Tworzymy grę będącą kopią znanej i lubianej Cywilizacji!
W rolę cywilizacji wcielą się wydziały Akademii Górniczo-Hutniczej, a w kopalniach i na polach pracować będą studenci tych wydziałów!

## Liczba punktów: 
Wariant prostszy: <b>6pkt</b> (<b>po 3pkt</b> dla każdej z dwóch osób)<br />
Wariant truniejszy: <b>8pkt</b> (<b>po 4pkt</b> dla każdej z dwóch osób)

## Cel gry
Celem gry jest pokonanie pozostałych cywilizacji lub zdobycie największej liczby prestiżu(punktów) w określoną liczbę (np. 100) tur.

## Przebieg rozgrywki
Gracze wykonują ruchy w swoich turach (jeden po drugim po kolei). Podczas tury gracz może wykonać dowolną ilość następujących czynności:
- Poruszanie jednostkami, które mają jeszcze dostępne punkty ruchu
- Ustawianie produkcji w miastach
- Przegladanie mapy, by ocenić poczynania rywali
Po wykonaniu ruchów, gracz kończy turę i rozpoczyna ją kolejny gracz.

## Menu startowe 
Gra posiada proste menu startowe, które pozwala na:
- wybranie ustawień początkowych (rozmiar mapy, liczba graczy i ich cywilizacje/wydziały)
- wyjście z gry
- <b>(opcjonalnie)</b> wczytanie zapisanej gry z pliku (będzie wymagało zrealizowania systemu zapisu stanu gry)

## Cywilizacje
- kazdy z graczy (jeden gracz ludzki i komputery lub <b>(opcjonalnie)</b> kilku graczy ludzkich w tzw. trybie hot-seat) wciela się w jedną z cywilizacji/wydziałów
- każda cywilizacja posiada swoje miasta i jednostki
- każda cywilizacja posiada zasoby: złota i prestiżu(punkty)

## Mapa/plansza: 
- Mapa jest prostokątem o wymiarach zależnych od ustawień gracza składającym się z kwadratowych<b>(opcjonalnie - hexagonalnych)</b> pól
- Na każdym polu może znajdować się miasto, jednostka <b>(lub opcjonalnie ulepszenie)</b>
- Mapa powinna zawierać generowane losowo różne formy terenu (pola symbolizujące wodę/równinę/las/wzgórza/góry), które mogę wpływać na poruszanie się i walkę jednostek (przykładowo - piechur nie może wejść na pole zawierające wodę lub góry i porusza się wolniej na polu zawierającym las i wzgórza, które zapewniają jednocześnie premię do obrony)
- <b>(opcjonalnie)</b> surowce służące do budowy ulepszeń (np. żelazo, kamień pozwalają zbudować kopalnię, dzikie zwierzęta pozwalają zbudować pastwiska)


## Miasta:
- Miasta należą jednoznacznie do któregoś z graczy
- Każde miasto posiada 3 paramtery: ilość wytwarzanego jedzenia, ilość wytwarzanych punktów produkcji (tzw. młotki) i ilość mieszkańców (tudzież studentów)
- Jedzenie wpływa na przyrost populacji w mieście (np. jeśli potrzebujemy 10 jedzenia, a produkujemy 2 na turę, to po 5 turach w naszym mieście urodzi się nowy student). Im większa populacja tym wiecej potrzeba jedzenia by ją powiększyć. Ilość mieszkańców przekłada się na efektywność produkcji jedzenia i młotków.
- Każde miasto może produkować nowe jednostki lub budynki. Budynki mogą zwiększać produkcję jedzenia, młotków lub wywoływać inne unikalne efekty (można samodzielnie jakieś wymyślić). Produkcja budynku lub jednostki kosztuje określoną liczbę młotków(punktów produkcji), którą miasto może zbierać przez kilka tur

## Jednostki
- Jednostki mogą poruszać się po mapie o konkretną ilość pól co turę (np. piechur - 1 pole, kawaleria - 2 pola).
- Jednostki posiadają siłę wykorzystywaną w walce i punkty życia. Na siłę może wpływać rodzaj terenu na którym znajduje się/na który wchodzi jednostka. Walka rozpoczyna się gdy jednostka chce wejsć na pole zajęte przez wrogą jednostkę. Można dodać jakiś losowy czynnik w walce.
- Istenieje specjalny rodzaj jednostki - osadnik. Powinien posiadać on specjalną umiejętność - założenie miasta. Użycie tej umiejętności usuwa te jednostkę i zakłada nowe miasto w meijscu w którym stała. Nowe miasto nie może zostać założone w bezpośrednim sąsiedztwie innego miasta. Nowe miasto ma 1 mieszkańca
- Jeśli jednostka spróbuje wejsć na pole zajęte przez wrogie miasto, to przebiega normalna walka (miasto powinno być odpowiednio silniejsze). Jeśli życie jednostki lub miasta spadnie poniżej 0, to ta jednostka/miasto znika.
-  <b>(opcjonalnie)</b> Kolejny specjalny rodzaj jednostki - robotnik. Zakłada, że na planszy istnieją specjalne zasoby (patrz opcjonalne w punkcie Mapa/Plansza). Na tych specjalnych zasobach robotnik może zbudować ulepszenia które zwiększają parametry pobliskich miast.
