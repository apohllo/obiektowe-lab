# Productivity tracker

## Wstęp

Założeniem projektu jest stworzenie prostego trackera zapisującego informacje ile czasu użytkownik spędza nad konkretnymi aplikacjami. Ponadto na żądanie aplikacja ma generować różnego rodzaju wykresy lub tabele przedstawiające ile czasu spędziliśmy nad poszczególnymi aplikacjami w przeciągu dnia, tygodnia czy miesiąca. Tą podstawową funkcjonalność można rozszerzyć o definiowanie grup aplikacji (np. Visual Studio Code i IntelliJ zaliczamy do grupy aplikacji "programowanie") oraz ustawianie sobie celów dziennych/tygodniowych/miesięcznych - np. dziennie spędzę maksymalnie dwie godziny nad aplikacjami z grupy "gry".

## Pozyskiwanie danych

Zasadniczo najbardziej problematyczna część projektu nie jest bezpośrednio związana z programowaniem obiektowym. Jest nią pozyskiwanie danych o tym jaka aplikacja jest przez ile czasu używana. Nie wystarczy nam informacja o tym jak długo jest uruchomiony dany proces (jakiś program może być uruchomiony przez kilka godzin, ale nie wiadomo jaką część z tego czasu aktywnie go używaliśmy). Bardziej wiarygodna będzie zatem informacja jak długo okno danej aplikacji miało focus. To jest rzecz bardzo zależna od systemu na którym pracujemy. W systemie Ubuntu można to zrobić przez zainstalowanie programu xdotool i wykonanie następującej komendy:

    xdotool getwindowpid `xdotool getactivewindow`

Uzyskujemy wtedy PID aktualnie aktywnego okna, na podstawie którego możemy łatwo określić nazwę uruchomionej aplikacji. To polecenie można z poziomu Javy wywoływać co sekundę (najlepiej na osobnym wątku) i zapisywać jaka aplikacja jest aktualnie otwarta.

## Funkcjonalności

Poniższe funkcjonalności to tylko ogólne wytyczne, można je zmieniać, dodawać lub usuwać wedle uznania.

- zapisywanie informacji o aktualnie sfocusowanym oknie w czasie rzeczywistym
- generowanie na żądanie użytkownika raportów z określonego przedziału czasu
    - przedziały mogą być sztywno ustalone w aplikacji (np. ostatni dzień, tydzień, miesiąc)
    - mogą też być definiowane przez użytkownika (np. przedział dat, ostatnie N dni) 
- raport może być w formie wykresu lub tabelki - powinny się tam znaleźć nazwy aplikacji, ilość godzin ich aktywnego użytkowania oraz procentowy udział w całości użytkowania komputera
- definiowanie grup aplikacji
    - możliwość powiązania aplikacji z jedną lub kilkoma grupami
    - konfiguracja grup powinna być zapisywana w osobnym JSONowym pliku
    - dodatkowe raporty - przedstawiające rozkład spędzonego czasu na aplikacje z poszczególnych grup
- ustalanie celów
    - możliwość definiowania celów na określony przedział czasu (przykładowo - dziennie przynajmniej 2 h będę programował w IntelliJ, a maksymalnie 3 h na graniu)
    - możliwość śledzenia celów (na przykład jako ekran z paskami postępu)
    - powiadomienia dla celów typu "maksymalnie N h" - kiedy zdefiniowany czas będzie zbliżał się ku końcowi, użytkownik powinien otrzymać powiadomienie
    - powiadomienia dla celów typu "przynajmniej N h" - bardziej skomplikowana sprawa, można ustalić np. że o 20:00 jeśli nie jest zrealizowane przynajmniej 50% celu to pojawi się powiadomienie