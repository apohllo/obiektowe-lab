# Laboratorium nr 8 

Zamiana tekstu na formę obiektową.

1. Zapoznaj się z plikami konstytucja.txt oraz uokik.txt dołączonymi do niniejszego repozytorium.
2. Opracuj zestaw klas oraz zaimplementuj odpowiednie algorytmy tak by opracowany program:
   1. wczytywał wskazane pliki,
   2. zamieniał postać tekstową plików na formę obiektową,
   3. umożliwiał wyświetlanie treści artykułu o określonym numerze lub zakresu artykułów,
   4. umożliwiał wyświetlanie specyficznych elementów składowych artykułu, takich jak (przykłady z pliku uokik.txt):
      1. ustępy -- Art. 1., ust. 1: "Ustawa określa warunki...", 
      2. punkty -- Art. 2, ust. 2., pkt 1): "umów, w szczególności licencji..." ), 
      3. litery -- Art. 2, ust. 2., pkt 2), lit. a): "informacji technicznych lub technologicznych,"
   5. umożliwiał wyświetlanie treści rozdziału o określonym numerze (w tym treści wszystkich artykułów znajdujących się w
      tym rozdziale),
   6. umożliwiał wyświetlanie spisu treści całej ustawy, z podziałem na działy (jeśli istnieją), rozdziały i tytuły,
   7. jeżeli tekst jest podzielony na działy, umożliwiał wyświetlanie spisu treści działu o określonym numerze,
   8. usuwał z końca linii znaki przeniesienia do nowej linii (-) i łączył słowa w całość,
   9. usuwał z tekstu zbędne elementy takie jak linie "Kancelaria Sejmu" oraz data,
   10. zachowywał oryginalna strukturę tekstu, tzn. elementy takie jak punkty (patrz art. 10 w pliku konstytucja) 
       nie powinny być wyświetlane w jednej linii.
3. Program powinien akceptować argumenty: lokalizację pliku wejściowego, tryb działania (wyświetlanie treści, bądź spisu treści) 
  oraz jeden z elementów:
   1. numer lub zakres artykułów,
   2. określenie specyficznych elementów składowych artykułu, np. "art. 1, ust. 1",
   3. numer rozdziału,
   4. numer działu.
