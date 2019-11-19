# Projekt nr 1 - generator ewolucyjny

Niniejsza treść została zaadaptowana na podstawie opisu oraz ilustracji przygotowanych przez Wojciecha Kosiora.
Inspiracją dla niego był z kolei książki ,,Land of List'' Conrada Barskiego, który zaś zainspirował się artykułem w
,,Scientific American'' :-)

# Opis

Stwórzmy grę! Nie będzie to jednak gra, w którą my gramy. Zamiast tego będzie
to świat, który ewoluuje na naszych oczach! Stworzymy środowisko stepów
i dżungli ze zwierzętami, które biegają, buszują w zaroślach, jedzą i rozmnażają
się. A po kilka milionach lat zobaczymy, że wyewoluowały w różne gatunki!

<img src="zwierzak.jpg"/>

2. Opracuj zestaw klas oraz zaimplementuj odpowiednie algorytmy tak by opracowany program:
   1. wczytywał pliki z katalogu wskazanego przy uruchamianiu programu (w formatach JSON i HTML),
   3. umożliwiał wyświetlanie metryki (rubrum) orzeczenia o wybranej sygnaturze; metryka powinna zawierać:
      1. sygnaturę orzeczenia
      2. datę wydania orzeczenia
      3. rodzaj sądu (sąd powszechny, Trybunał Konstytucyjny, Sąd Najwyższy, Krajowa Izba Odwoławcza, Wojewódzki Sąd
         Administracyjny -- bez uwzględniania miasta, Naczelny Sąd Administracyjny)
      4. skład (listę sędziów z przypisanymi rolami)
   3. umożliwiał wyświetlanie uzasadnienia orzeczenia o określonej sygnaturze,
   4. umożliwiał wyświetlanie rubrum dla kilku podanych sygnatur,
   5. wyświetlał liczbę orzeczeń dla wybranego sędziego (tzn. liczbę wszystkich orzeczeń, w których dany sędzia jest w
     składzie orzekającym),
   6. określał 10 sędziów, którzy wydali największą liczbę orzeczeń,
   7. określał rozkład statystyczny wyroków ze względu na miesiąc (należy agregować wyroki z różnych lat),
   8. określał rozkład statystyczny wyroków ze względu na rodzaj sądu (sąd powszechny, TK, SN, etc.)
   9. określał 10 ustaw (z pominięciem szczegółowej kwalifikacji, tzn. bez
     artykułów, punktów, podpunktów, liter, etc.), które są najczęściej przywoływane (sekcja `referencedRegulations` lub "Powoływane przepisy") w orzeczeniach.
   10. określał rozkład statystyczny liczby sędziów przypadających na orzeczenie
   1. przy uruchamianiu programu akceptował opcjonalny argument ścieżki do pliku, w którym będą zapisywane wydawane
      komendy oraz ich wyniki (wyniki powinny również pojawiać się na ekranie)
   2. posiadał funkcję `help`, która wyświetla listę dostęnych komend:
      1. `rubrum` - wyświetlenie metryki jednego lub wielu orzeczeń, na podstawie sygnatury (pierwsza wartość w polu
         `courtCases` lub ciąg "II SA/OI 472/18" w przypadku orzeczeń sądów administracyjnych)
      2. `content` - wyświetlenie uzasadnienia (czyli treści pola `textContent` lub treść od słowa "UZASADNIENIE")
      3. `judge` - wyświetlał liczbę orzeczeń dla wybranego sędziego
      4. `judges` - wyświetla 10 sędziów, którzy wydali najwięcej orzeczeń
      5. `months` - wyświetlał liczbę orzeczeń w poszczególnych miesiącach (rozkład statystyczny)
      6. `courts` - wyświetlał liczbę orzeczeń ze względu na typ sądu (rozkład statystyczny)
      7. `regulations` - wyświetlał 10 najczęściej przywoływanych ustaw
      8. `jury` - wyświetlał liczbę spraw przypadających na określony skład sędziowski (określoną liczbę sędziów)
3. Program powinien działać w trybie interaktywnym, tzn. po uruchomieniu programu (ze wskazaniem miejsca składowania
   orzeczeń) powinna otwierać się konsola programu, w której można wydawać polecenia z punktu 2. 
4. Konsola powinna wspierać przeglądanie historii wcześniejszych poleceń oraz edycję poleceń (analogicznie jak konsola w
   systemie Linux).
5. Wydawanie kolejnych poleceń nie powinno prowadzić do wielokrotnego ładowania danych.
6. System ma posługiwać się obiektową reprezentacją danych, tzn. niedopuszczalne jest wykorzystywanie "surowych" 
   typów (np. JSONArray) zdefiniowanych w bibliotece do czytania formatu JSON.
7. Zadbaj o to by program był odporny na błędy użytkownika, a w przypadku wykrycia błędu informował na czym ten błąd
   polega i sugerował poprawną formę komendy.

<b id="f1">1</b> Lista orzeczeń w danym pliku dostępna jest pod kluczem `"items"`. Zbiór wszystkich plików stanowi
pełną bazę orzeczeń. Nie należy się ograniczać do pojedynczego pliku! [↩](#a1)

<b id="f2">2</b> Dokumentacja formatu dostępna jest w [API SAOS](https://www.saos.org.pl/help/index.php/dokumentacja-api/api-pobierania-danych). [↩](#a1)

