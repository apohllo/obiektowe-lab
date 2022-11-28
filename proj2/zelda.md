# Zelda
Projekt polega na napisaniu gry bazującej na oryginalnej The Legend of Zelda.

## Punkty 4
## Osoby:
- ## 1 - wersja ze skokowym przemieszczaniem się
- ## 2 - wersja z płynnym przemieszczaniem się
# Cel gry
Przejść do ostatniego etapu i pokonać jego przeciwnika.
# Opis gry
Po odpaleniu, gra pokazuje menu startowe proszące o naciśnięcie dowolnego przycisku, po naciśnięciu postać gracza pojawia się na mapie. Gracz ma możliwość poruszania się w czterech kierunkach mapy, krótkie naciśnięcie przycisku obraca postać, dłuższe przesuwa ją na następną pozycję (a także wcześniej obraca jeśli odwrócona ona nie była, ruch odbywa się skokowo). Mapa gry jest podzielona na plansze, dojście do granicy jednej przenosi na sąsiednią, na każdej poza początkową znajdują się ustaleni z góry przeciwnicy, poruszają się oni po mapie według ustalonej ścieżki zapętlającej się, regularnie atakując w kierunku gracza gdy spełnione są warunki do tego a następnie kontynuują ruch, przeciwnicy nie mogą przemieszczać się pomiędzy planszami mapy. Jeśli gracz znajdzie się w tym samym momencie na polu z atakiem przeciwnika otrzymuje on obrażenia zależne od typu przeciwnika. Gracz może atakować w czterech kierunkach, naciśnięcie klawisza odpowiedzialnego za atak sprawia że następuje on przed graczem, jest więc on zależy od kierunku w który gracz jest skierowany, jeśli przeciwnik znajdzie się w sprite-ie ataku to otrzymuje on obrażenia, jeśli jego życie spadnie do 0 lub niżej to znika on z mapy i zostawia po sobie pieniądze lub jeden z przedmiotów. Jeśli aktualny poziom życia gracza jest jego maksymalnym poziomem to może on atakować dystansowo na niedużą odległość strzelając swoim mieczem. Gra kończy się gdy pokonamy ostatniego specjalnego przeciwnika na ostatniej planszy. Jeśli poziom życia gracza spadnie do zera, to gra kończy się napisem Game Over.

# Wymagania
Implementacja ekranu startowego i co najmniej dziewięciu niedużych plansz składających się w mapę, w tym startowy bezpieczny obszar, co najmniej jeden obszar składający się w części z niedostępnej dla gracza wody  i ostatni zawierający potężniejszego przeciwnika którego pokonanie kończy grę. Gracz i przeciwnicy muszą mieć możliwość przemieszczania się po “pustych” obszarach planszy i kolidować z niedostępnymi obszarami (drzewa góry etc), muszą mieć też możliwość zadawania sobie nawzajem obrażeń które w przypadku gracza będą widoczne na pasku nad planszą w postaci wypełnionych lub nie serc.

Każdy typ przeciwnika zadaje obrażenia kontaktowe, a także:

- Typ przeciwnika strzelającego w stronę gracza jeśli znajdzie się na tej samej osi X lub Y co gracz i jest w jego stronę odwrócony
- Typ przeciwnika nie atakującego ale skaczącego po mapie
- Typ przeciwnika nie atakującego, poruszającego się tylko po osi X który po zaatakowaniu z lewej bądź prawej strony jest odpychany w przeciwną o parę pól
- Typ przeciwnika znajdującego się pod wodą, przemieszcza się od pod nią niewidoczny, pojawia się dopiero jak się wyłania, w tym stanie może strzelić w gracza w dowolną stronę
- Ostatni przeciwnik posiadający dużo życia z możliwością atakowania na dystans oraz z bliska

Przeciwnicy mogą zadawać obrażenia zabierające pół serca, tzn. każde całe serce to 2 pkt życia. Każdy lądowy przeciwnik po swojej śmierci może zostawić na ziemi pewną ilość pieniędzy lub jeden z przedmiotów opisanych w dalszej części.

Implementacja paska zawierającego informację o aktualnie posiadanym ekwipunku, ilości pieniędzy i ilości życia.

Każda plansza poza ostatnią może zawierać wejście do jaskini, może być ono widoczne lub ukryte pod obszarem wywołującym kolizję jako sekret który należy odkryć detonując przy nim bombę, jest ona osobną mini mapą zawierającą w sobie darmowy przedmiot lub sklep pozwalający wydać zdobyte pieniądze na jeden z trzech przedmiotów wchodząc w niego. Pierwsza mapa zawiera jaskinię w której znajduje się stary mędrzec oferujący graczowi drewniany miecz mówiąc “It’s dangerous to go alone! Take this.”, gracz zaczyna grę z tarczą ale przed uzyskaniem miecza nie może atakować. Wejścia do jaskiń mogą być ukryte pod drzewami lub górami, można je odkryć wysadzając przy danym miejscu bombę.

Plansze nie powinny być liniowe, powinna istnieć pewna możliwość przejścia plansz w różnej kolejności, do ostatniej natomiast wejście powinno być jedno, ma ona być areną dla walki z ostatnim przeciwnikiem.
## Dostępne Przedmioty
- Drewniany miecz - słaba broń pozwalająca na atakowanie
- Biały miecz - potężniejszy miecz zadający większe obrażenia
- Drewniana tarcza - pozwala na blokowanie (nie otrzymanie obrażeń) ataków dystansowych jeśli gracz jest zwrócony w ich stronę
- Bomby - pozwalają na otwieranie sekretnych przejść jeśli zdetonowane są one obok ściany kryjącej w sobie wejście do sekretu oraz zadawania obrażeń przeciwnikom, wybuchają chwilę po postawieniu
- Serce - odnawia jedno serce postaci gracza
- Eliksir życia - odnawia pełne życie gracza
- Duże serce - dostępne tylko jako sekret bądź do kupienia w sklepie, zwiększa maksymalny poziom życia o 1 całe serce

Każdy przedmiot poza sercem po wejściu na niego zostaje zebrany i dodany do ekwipunku gracza, miecz i tarcza mają swoje sloty (lepszy miecz nadpisuje gorszy), jest także licznik aktualnie posiadanych bomb i eliksirów życia które można wykorzystać przypisanymi im klawiszami

## Wersja dla dwóch osób
Wersja ta różni się implementacją przemieszczania się postaci po mapie, w oryginalnej wersji jest ona skokowa, dla dwóch osób istnieje wymóg żeby była ona płynna i pozwalała na przemieszczanie się o małe odległości bez “teleportacji”

Oczywiście wszelkie dodatkowe modyfikacje i urozmaicenia są mile widziane :)
## Pomocne linki
Materiał zawierający gameplay z gry na której bazuje się ten projekt

https://www.youtube.com/watch?v=6g2vk8Gudqs

Przykładowa strona zawierająca sprite-y wykorzystywane w oryginalnej grze

https://www.spriters-resource.com/nes/legendofzelda/sheet/8366/
## Przykładowa implementacja
https://www.youtube.com/watch?v=vB7B-D-T7kg


