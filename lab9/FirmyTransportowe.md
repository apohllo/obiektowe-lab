# FirmyTransportowe

## Krótki opis 

Zadanie polega na wykonaniu symulacji, w której na wprowadzonej mapie miasta poruszają się samochody osobowe jak i samochody ciężarowe. Samochody ciężarowe będą otrzymywały zlecenia polegające na przewieźieniu towaru z miejsca na miejsce i w ten sposób firma będąca ich właścicielem będzie się bogacić.

## Mapa 

Mapa składa się z dwóch rejonów:
- centrum gdzie jest większe zagęszczenie skrzyżowań i potęcjalnie większe korki
- obrzeża gdzie znajduje się zdecydowanie ruch jest mniejszy ale za to wszędzie jest zdecydowanie dalej. Znajdują się tutaj także drogi wylotowe.

Na mapie znajdują się:
- siedziby firm transportowych
- magazyny
- sklepy do których ciężarówki dostarczają towar

Każde ze skrzyżowań ma określony porządek w jakim samochody wjeżdżający na nie mają się poruszać. Można zastosować tutaj zasady ruchu drogowego i skrzyżowania podzielić na te z pierszeństwem przejazdu i skrzyżowania równożędne.

Możemy założyć ze prędkość wszystkich pojazdów jest stała.

## Samochody osobowe

Rolą samochodów osobowych w symulacji jest tylko i wyłącznie zwiększanie natężenia ruchu na drogach. Wjeżdzają one jednym z wlotów do miasta, kierują się do centrum a gdy już do centrum dojadą kierują się do losowego wylotu i są usuwane z symulacji. Nowe samochody pojawiają sie w określonych odstępach czasu.

## Firmy transportowe

Firma jest właścicielem kilku samochodów ciężarowych. Zleca ona swoim ciężarówką kursy co jest dla niej źródłem dochodu. Każda firma ma również wydadki, większe im więcej przejechały ich ciężaówki. Firmy kierują się różnymi zasadami. Jedne preferują by ich ciężarówki jeździły po obrzeżach, a drugie preferują najkrótrze trasy. 

Kurs ciężarówki zaczyna się w bazie firmy transportowej. Następnie ciężarówka udaje się do magazynu i z tamtąd kieruje się do miejsca wyładunku.

Gdy firma nie ma pieniędzy na aktualne wydadki może sprzedać jedną ze swoich ciężarówek. Wartość cięzarówek spada wraz z ilością przejechanych kilometrów. Jeśli firmie dobrze sie powodzi może pokusić się o dokupienie nowej ciężarówki.

## Zlecenia

Sklepy zgłaszają zapotrzebowanie na towar z danego magazynu i oferują za ten transport określoną kwotę. Może się okazać że ich zlecenie nie zostane podjęte, wtedy wynagrodzenie za nie zostaje zwiększane. Sklep może mieć aktywnych kilka zleceń ponieważ może potrzebować towarów z różnych magazynów, ale do jednego magazynu jeden sklep może mieć tylko jedno zlecenie.

Najbogatsze firmy mają pierszeństwo w wyboże zleceń. Każda firma nie może wziąć więcej zleceń niż ma cięzarówek i bieże kolejne zlecenie gdy jedna z jej ciężarówek zakończy kurs.

## Wymagania 

- Stworzenie wizualizacji miasta wraz z poruszającymi się samochodami 
- Zbieranie statystyk dla każdej z firm takich jak:
  - posiadane samochody
  - wykonane zlecenia
  - wartość firmy (aktualne posiadane przez firmę pieniądzę  dodając kwota którą uzyskalibysmy sprzedając wszystkie cięzarówki ) 







