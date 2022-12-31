# Wiedźmin Gigabajt

## Punktacja
8 punktów za wersję podstawową

po 6 punktów dla dwóch osób za wersję podstawową

po 8 punktów dla dwóch osób za wersję z przynajmniej jednym rozszerzeniem

## Cel projektu
Stworzenie systemu pomagającego Wiedźminowi Gigabajtowi na monitorowanie wybranych metryk

## Opis projektu

```
"- Zło to zło, Stregoborze - rzekł poważnie wiedźmin wstając. - Mniejsze, większe, średnie, wszystko jedno, proporcje są umowne a granice zatarte. 
Nie jestem świątobliwym pustelnikiem, nie samo dobro czyniłem w życiu. 
Ale jeżeli mam wybierać pomiędzy jednym złem a drugim, to wolę nie wybierać wcale"
```

Wiedźmin Gigabajt strudzony licznymi wyborami, jakich musiał dokonać na swoim szlaku, postanowił odejść na zasłużoną emeryturę. 
Nasz Wiedźmin jednak, aby na emeryturze nie zajmować się tylko zbieraniem ziół na eliksiry i oleje, postanowił w wolnym czasie nadzorować kilka Wiedźmińskich serwerów discordowych, kanałów na Twitterze oraz stron internetowych. 
Szybko okazało się jednak, że pozornie proste zadania nie były pozbawione konieczności dokonywania trudnych decyzji o tym, jakie posty powinny się tam znajdować. 
Gigabajt w przeciwieństwie do króla Redani, Radosł... tzn. Radowida[ * ](#dodatkowe-objaśnienia), poza kierowaniem się własnymi przekonaniami oraz wiedźmińskim instynktem, stara się brać pod uwagę fakty, analizując pewne metryki.
Niestety, Gigabaj przez brak dobrego systemu informatycznego w Kaer Morhen jest zmuszony do ręcznego zbierania danych, co utrudnia ocenę podjętych przez siebie wyborów oraz sprawia, że przy wielu z nich ciężko jest określić czy wypływ podjętej decyzji był pozytywny, czy też nie.
<br>

Ty, czyli Jaskier, po latach bezsensownego zabawiania gawiedzi (czytaj: klepania projektów na studia pod wymagania prowadzących, w których uczysz się jeść zupę widelcem), postanowiłeś zrobić coś przydatnego dla świata.
Za cel obrałeś sobie utworzenie dla Gigabajta systemu, który pokazywałby na tablicy ogłoszeń (czyli Grafanowym dashboardzie) statystyki z dowolnego portalu prowadzonego przez Wiedźmina. 
Jako bliski przyjaciel Gigabajta wiesz jednak, że używa on wszystkich dostępnych portali, stron itp., więc możesz prawie dowolnie wybrać źródło swoich danych (podobnie jak to miałeś w zwyczaju robić w swoich opowieściach). 
Informacje pokazywane na tablicy ogłoszeń powinieneś pozyskiwać od Talara, Jarmulaka, Sigismunda Dijkstry lub innego szpiega (czyli z zapytania do dowolnego REST API). 
<br>

Wyświetlane informacje powinny mieć charakter szeregów czasowych (np. ilość odwiedzających danego dnia, czas pobytu na stronie, liczba wysłanych wiadomości itp.). 
W celu zapewnienia ciągłego dostępu do tych informacji Gigabajtowi postanowiłeś zapisywać je w wiedźmińskim dzienniku (czyli dowolnej, bazie TSDB (time series database) open-source, np. InfluxDB).
Dane w dzienniku aktualizowane są cyklicznie (np. co godzinę), dzięki czemu Wiedźmin ma do nich stały dostęp (możesz to wykonać np. poprzez konfigurację wykonywania Jenkins-owego lub cronowego joba uruchamiającego twój program aktualizujący dane).

![witcher image](./assets/wiedzmin_gigabajt/witcher.jpeg)
[Credits: Image from "RX"](https://www.artstation.com/artwork/aRJ6dR)

## Wymagania podstawowe:
1. Stworzenie programu zapisującego dane do dziennika (TSDB) oraz przynajmniej 5 wykresów na tablicy ogłoszeń (dashboardzie Grafanowym).
2. Dane powinny być pobierane od szpiegów (poprzez zapytania do dowonlego REST API)
3. Przed zapisaniem danych należy je przetworzyć.

### Wymagania dodatkowe:
1. Raz na wiedźmiński rok, co 2137 dzień od pierwszej próby traw, Wiedźmini z jednego cechu spotykają się, aby omówić nowe strategie na walkę z potworami, nowe przepisy na sporządzanie eliksirów i olejów oraz nowe zaklęcia. Zdarza się jednak, że na takowym zebraniu część uczestników zaczyna cytować fraszki, pływać łódkami, przebierać się w ubrania Yennefer czy też wdzwaniać się do loży czarodziejek.
<br>
Pomimo przejścia na emeryturę Gigabajt nadal chce odwiedzać starych znajomych, jednak nie może zostawić prowadzonych przez niego portali bez opieki, a spodziewa się, że na spotkaniu z Lambertem przez dłuższy okres może nie być w stanie kontrolować na bieżąco statystyk.
<br>
Aby mu pomóc, możesz wybrać jedno z poniższych:
- Zaimplementować system powiadomień, który informuje Wiedźmina o nietypowych zachowaniach na stronach (np. liczba postów na serwerze jest różna od średniej o co najmniej dwa odchylenia standardowe z całego analizowanego okresu)
- Zaimplementować proste przewidywanie szeregów czasowych dowolną popularną metodą np. dowolny model ARMA (możesz użyć bibliotek oraz zintegrować podsystem napisany w innym języku)
2. Dodanie danych z przynajmniej dwóch źródeł.
3. Dodanie danych innego typu, trzymanych w innej sekcji wiedźmińskiego dziennika (innej bazie danych np. MongoDB) (np. dane o pochodzeniu użytkowników odwiedzających strony)
4. Zaimplementuj własny system wyświetlania metryk, nieoparty na Grafanie.

## Dodatkowe objaśnienia
(*) - Królem Redani nadal jest Radowid, bo Gigabajtowi nawet przez myśl nie przeszło, aby zdradzić swojego przyjaciela Veronona Roche'a i pozwolić Dijkstrze dokończyć swój plan.
### Słownik starszej mowy:
- tablica ogłoszeń - dashboard w Grafanie
- szpieg - REST API
- wiedźmiński dziennik - baza danych

## Autor
[Wojciech Barczyński](https://github.com/WojciechBarczynski) ~ student debil