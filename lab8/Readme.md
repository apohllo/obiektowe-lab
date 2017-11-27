# Laboratorium nr 8 

Zamiana tekstu na formę obiektową.

1. Zapoznaj się z plikami konstytucja.txt oraz uokik.txt dołączonymi do niniejszego repozytorium.
2. Opracuj zestaw klas oraz zaimplementuj odpowiednie algorytmy tak by opracowany program:
  * wczytywał wskazane pliki,
  * zamieniał postać tekstową plików na formę obiektową,
  * umożliwiał wyświetlanie treści artykułu o określonym numerze lub zakresu artykułów,
  * umożliwiał wyświetlanie specyficznych elementów składowych artykułu, takich jak (przykłady z pliku uokik.txt):
    * punkty -- Art. 1., pkt 1: "Ustawa określa warunki...", 
    * podpunkty -- Art. 2, pkt 2., ppkt 1): "umów, w szczególności licencji..." ), 
    * litery -- Art. 2, pkt 2., ppkt 2), lit. a): "informacji technicznych i technologicznych,"
  * umożliwiał wyświetlanie treści rozdziału o określonym numerze (w tym treści wszystkich artykułów znajdujących się w
    tym rozdziale),
  * umożliwiał wyświetlanie spisu treści całej ustawy, z podziałem na działy (jeśli istnieją), rozdziały i tytuły,
  * jeżeli tekst jest podzielony na działy, umożliwiał wyświetlanie spisu treści działu o określonym numerze,
  * usuwał z końca linii znaki przeniesienia do nowej linii (-) i łączył słowa w całość,
  * usuwał z tekstu zbędne elementy takie jak linie "Kancelaria Sejmu" oraz data,
  * zachowywał oryginalna strukturę tekstu, tzn. elementy takie jak punkty (patrz art. 10 w pliku konstytucja) 
    nie powinny być wyświetlane w jednej linii.
3. Program powinien akceptować argumenty: lokalizację pliku wejściowego, tryb działania (wyświetlanie treści, bądź spisu treści) 
  oraz jeden z elementów:
  * numer lub zakres artykułów,
  * określenie specyficznych elementów składowych artykułu, np. "art. 1, pkt 1",
  * numer rozdziału,
  * numer działu.
