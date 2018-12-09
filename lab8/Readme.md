# Laboratorium nr 8 

Zamiana tekstu na formę obiektową.

1. Masz do dyspozycji zbiór orzeczeń w formacie<sup id="a1">[1](#f1), [2](#f2)</sup> JSON:

```json
{
  "id": 205374,
  "courtType": "CONSTITUTIONAL_TRIBUNAL",
  "courtCases": [
    {
      "caseNumber": "U 3/86"
    }
  ],
  "judgmentType": "SENTENCE",
  "judges": [
    {
      "name": "Andrzej Kabat",
      "function": null,
      "specialRoles": [
        "REPORTING_JUDGE"
      ]
    },
    {
      "name": "Kazimierz Buchała",
      "function": null,
      "specialRoles": [
        "PRESIDING_JUDGE"
      ]
    },
    {
      "name": "Stanisław Pawela",
      "function": null,
      "specialRoles": [

      ]
    }
  ],
  "source": {
    "code": "CONSTITUTIONAL_TRIBUNAL",
    "judgmentUrl": "http://otk.trybunal.gov.pl/orzeczenia/teksty/otk/1986/U_03_86.doc",
    "judgmentId": "c9fd6921a25bf3b0911191e1ad06d1cb",
    "publisher": null,
    "reviser": null,
    "publicationDate": ""
  },
  "courtReporters": [
    "Jerzy Adam Porowski"
  ],
  "decision": null,
  "summary": null,
  "textContent": "Orzeczenie\nz dnia 16 czerwca 1986 r.\n/U 3/86 r./\n\n\nTrybunał Konstytucyjny w składzie: \n\nPrzewodniczący: \tSędzia TK Kazimierz Buchała \n\nSędziowie TK: \tAndrzej Kabat (sprawozdawca) \nStanisław Pawela \n\nProtokolant: \tJerzy Adam Porowski \n\n\npo rozpatrzeniu w dniu 16 czerwca 1986 r. na rozprawie, z udziałem uczestników postępowania umocowanych przedstawicieli: Rady Ministrów, Ministra Handlu Wewnętrznego i Usług oraz Prokuratora Generalnego PRL, sprawy z wniosku Komitetu Wykonawczego Rady Krajowej Patriotycznego Ruchu Odrodzenia Narodowego o wydanie orzeczenia stwierdzającego niezgodność: \n\n1) przepisu § 2 ust. 2 rozporządzenia Rady Ministrów z dnia 28 października 1983 r. ...",
  "legalBases": [

  ],
  "referencedRegulations": [
    {
      "journalTitle": "Rozporządzenie Rady Ministrów z dnia 28 października 1983 r. w sprawie określenia liczby punktów sprzedaży napojów alkoholowych.",
      "journalNo": 60,
      "journalYear": 1983,
      "journalEntry": 273,
      "text": "Rozporządzenie Rady Ministrów z dnia 28 października 1983 r. w sprawie określenia liczby punktów sprzedaży napojów alkoholowych (Dz. U. z 1983 r. Nr 60 poz. 273 - § 1, § 2 ust. 2)"
    },
    {
      "journalTitle": "Ustawa z dnia 26 października 1982 r. o wychowaniu w trzeźwości i przeciwdziałaniu alkoholizmowi",
      "journalNo": 35,
      "journalYear": 1982,
      "journalEntry": 230,
      "text": "Ustawa z dnia 26 października 1982 r. o wychowaniu w trzeźwości i przeciwdziałaniu alkoholizmowi (Dz. U. z 1982 r. Nr 35 poz. 230 - art. 3 ust. 1, art. 3 ust. 2, art. 12 ust. 1)"
    },
    {
      "journalTitle": "Uchwała Sejmu Polskiej Rzeczypospolitej Ludowej z dnia 31 lipca 1985 r. w sprawie szczegółowego trybu postępowania przed Trybunałem Konstytucyjnym.",
      "journalNo": 39,
      "journalYear": 1985,
      "journalEntry": 184,
      "text": "Uchwała Sejmu Polskiej Rzeczypospolitej Ludowej z dnia 31 lipca 1985 r. w sprawie szczegółowego trybu postępowania przed Trybunałem Konstytucyjnym (Dz. U. z 1985 r. Nr 39 poz. 184 - art. 42 ust. 1 pkt 6)"
    }
  ],
  "keywords": [

  ],
  "referencedCourtCases": [

  ],
  "receiptDate": "",
  "meansOfAppeal": null,
  "judgmentResult": null,
  "lowerCourtJudgments": [

  ],
  "dissentingOpinions": [

  ],
  "judgmentDate": "1986-06-16"
}
```

2. Pod adresem [http://apohllo.pl/texts/cbosa.tar.gz](http://apohllo.pl/texts/cbosa.tar.gz) masz również do dyspozycji zbiór orzeczeń w formacie HTML jak na ilustracji poniżej:
   <img src="cbosa.jpg" />

2. Opracuj zestaw klas oraz zaimplementuj odpowiednie algorytmy tak by opracowany program:
   1. wczytywał pliki z katalogu wskazanego przy uruchamianiu programu (w formatach JSON i HTML),
   3. umożliwiał wyświetlanie metryki (rubrum) orzeczenia o wybranej sygnaturze; metryka powinna zawierać:
      1. sygnaturę orzeczenia
      2. datę wydania orzeczenia
      3. rodzaj sądu (sąd powszechny, Trybunał Konstytucyjny, Sąd Najwyższy, ...)
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
         `courtCases`)
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

<b id="f1">1</b> Lista orzeczeń w danym pliku dostępna jest pod kluczem `"items"`. Zbiór wszystkich plików stanowi
pełną bazę orzeczeń. Nie należy się ograniczać do pojedynczego pliku! [↩](#a1)

<b id="f2">2</b> Dokumentacja formatu dostępna jest w [API SAOS](https://www.saos.org.pl/help/index.php/dokumentacja-api/api-pobierania-danych). [↩](#a1)

