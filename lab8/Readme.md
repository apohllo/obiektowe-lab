# Laboratorium nr 8 

Zamiana tekstu na formę obiektową.

1. Zapoznaj się z plikami konstytucja.txt oraz uokik.txt dołączonymi do niniejszego repozytorium.
2. Opracuj zestaw klas oraz zaimplementuj odpowiednie algorytmy tak by opracowany program:
   a. wczytywał wskazane pliki,
   b. zamieniał postać tekstową plików na formę obiektową,
   c. umożliwiał wyświetlanie treści artykułu o określonym numerze lub zakresu artykułów,
   d. umożliwiał wyświetlanie specyficznych elementów składowych artykułu, takich jak (przykłady z pliku uokik.txt):
      i. ustępy -- Art. 1., ust. 1: "Ustawa określa warunki...", 
      ii. punkty -- Art. 2, ust. 2., pkt 1): "umów, w szczególności licencji..." ), 
      iii. litery -- Art. 2, ust. 2., pkt 2), lit. a): "informacji technicznych lub technologicznych,"
  e. umożliwiał wyświetlanie treści rozdziału o określonym numerze (w tym treści wszystkich artykułów znajdujących się w
     tym rozdziale),
  f. umożliwiał wyświetlanie spisu treści całej ustawy, z podziałem na działy (jeśli istnieją), rozdziały i tytuły,
  g. jeżeli tekst jest podzielony na działy, umożliwiał wyświetlanie spisu treści działu o określonym numerze,
  h. usuwał z końca linii znaki przeniesienia do nowej linii (-) i łączył słowa w całość,
  i. usuwał z tekstu zbędne elementy takie jak linie "Kancelaria Sejmu" oraz data,
  j. zachowywał oryginalna strukturę tekstu, tzn. elementy takie jak punkty (patrz art. 10 w pliku konstytucja) 
    nie powinny być wyświetlane w jednej linii.
3. Program powinien akceptować argumenty: lokalizację pliku wejściowego, tryb działania (wyświetlanie treści, bądź spisu treści) 
  oraz jeden z elementów:
   a. numer lub zakres artykułów,
   b. określenie specyficznych elementów składowych artykułu, np. "art. 1, ust. 1",
   c. numer rozdziału,
   d. numer działu.
