# FirmyTransportowe

## Liczba punktów: 4

## Krótki opis 

Zadanie polega na wykonaniu symulacji, w której na wprowadzonej mapie miasta poruszają się samochody osobowe i samochody ciężarowe. Samochody ciężarowe będą otrzymywały zlecenia polegające na przewiezieniu towaru z miejsca na miejsce i w ten sposób firma będąca ich właścicielem będzie się bogacić.

## Mapa 

Mapa składa się z dwóch rejonów:
- centrum gdzie jest większe zagęszczenie skrzyżowań i potencjalnie większe korki,
- obrzeża gdzie znajduje się zdecydowanie ruch jest mniejszy ale za to wszędzie jest zdecydowanie dalej. Znajdują się tutaj także drogi wylotowe.

Na mapie znajdują się:
- siedziby firm transportowych,
- magazyny,
- sklepy do których ciężarówki dostarczają towar.

Każde ze skrzyżowań ma określony porządek, w jakim samochody wjeżdżający na nie mają się poruszać. Można zastosować tutaj zasady ruchu drogowego i skrzyżowania podzielić na te z pierwszeństwem przejazdu i skrzyżowania równorzędne.

Możemy założyć ze prędkość wszystkich pojazdów jest stała.

## Samochody osobowe

Rolą samochodów osobowych w symulacji jest tylko i wyłącznie zwiększanie natężenia ruchu na drogach. Wjeżdżają one jednym z wlotów do miasta, kierują się do centrum, a gdy już do centrum dojadą, kierują się do losowego wylotu i są usuwane z symulacji. Nowe samochody pojawiają sie w określonych odstępach czasu.

## Firmy transportowe

Firma jest właścicielem kilku samochodów ciężarowych. Zleca ona swoim ciężarówką kursy, co jest dla niej źródłem dochodu. Każda firma ma również wydatki, większe im więcej przejechały ich ciężarówki. Firmy kierują się różnymi zasadami. Jedne preferują by ich ciężarówki jeździły po obrzeżach miasta, a drugie preferują najkrótsze  trasy. 

Kurs ciężarówki zaczyna się w bazie firmy transportowej. Następnie ciężarówka udaje się do magazynu i stamtąd  kieruje się do miejsca wyładunku, poczym wraca do bazy firmy.

Gdy firma nie ma pieniędzy na aktualne wydatki może sprzedać jedną ze swoich ciężarówek. Wartość ciężarówek  spada wraz z ilością przejechanych kilometrów. Gdy firma musi sprzedać ostatnią ciężarówkę to bankrutuje. Jeśli firmie dobrze sie powodzi może pokusić się o dokupienie nowej ciężarówki.

## Zlecenia

Sklepy zgłaszają zapotrzebowanie na towar z danego magazynu i oferują za ten transport określoną kwotę. Może się okazać że ich zlecenie nie zostanie podjęte, wtedy wynagrodzenie za nie zostaje zwiększane. Sklep może mieć aktywnych kilka zleceń ponieważ może potrzebować towarów z różnych magazynów, ale do jednego magazynu jeden sklep może mieć tylko jedno zlecenie.

Najbogatsze firmy mają pierwszeństwo w wyborze zleceń. Każda firma nie może wziąć więcej zleceń niż ma ciężarówek i bierze  kolejne zlecenie gdy jedna z jej ciężarówek zakończy kurs.

## Wymagania 

- Stworzenie wizualizacji miasta wraz z poruszającymi się samochodami 
- Zbieranie statystyk dla każdej z firm takich jak:
  - posiadane samochody
  - wykonane zlecenia
  - wartość firmy (aktualne posiadane przez firmę pieniądze dodając kwota którą uzyskalibyśmy sprzedając wszystkie ciężarówki ) 







