# Snake simulation
## Krótki opis
Symulacja opiera się na klasycznej grze Snake. Rywalizować będą dwa zespoły węży, których celem jest przeżycie i wygranie "meczu". Drużyna wygra, gdy wszystkie węże z przeciwnej drużyny umrą. Na mapie będą jabłka, które po zjedzeniu dodają wężowi energii.

## Opis węża
Każdy wąż będzie miał energię, która będzie mówiła ile zostało mu dni zanim umrze (w przypadku gdy nic nie zje lub któs go nie zje :)) Każdy wąż posiada parametry strachu i węchu, które mogą zmieniać się w zależności od sytuacji. Np. gdy będzie głodny, jego odwaga zwiększy się. 

### Parametry
* Odwaga: określa styl gry weża. Im mniejsza tym wąż będzie uciekał od wrógów. Im większa tym wąż będzie atakował węże z większą chęcią
* Węch: określa jak daleko wąż może wyczuć przeciwnika

### Wygląd zwierzęcia
Wąż będzie składał się z kwadracików, tak jak w klasycznym snake'u. Dalej będziemy nazywać pierwszą część węża głową, a pozostałą część ogonem. Długość węża reprezentuje jak dużo ma energii. Można przyjąć, że jeden kwadracik to 5 energii.

## Ruch zwierzęcia
Podczas danej tury każdy wąż będzie mógł się poruszyć do przodu, w lewo lub w prawo. Jego wybór będzie zależał od  wyżej podanych parametrów

## Atakowanie 
Gdy głowa węża trafi na ogon przeciwnika, to przeciwnik traci połowę energii.

## Konsumpcja
Na początku mapa będzie zawierać pare jabłek. Gdy wąż zje jedno, to dostaje bonusową energie i losowane jest nowe jabłko na mapie.