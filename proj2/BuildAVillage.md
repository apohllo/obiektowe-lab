# **Build a village**

## **Cel gry**

Twoja wioska musi przetrwać jak największą liczbę dni.

## Punktacja 

3 pkt.

## **Opis gry**
Grupa 5 koczowników staje przed wyzwaniem, aby zbudować wioskę, w której będą mogli przetrwać. Naturalnie do przeżycia potrzebują żywności, którą mogą uzyskać z pól, z hodowania zwierząt albo tworząc wypieki z mąki uzyskanej w młynie. Niezbędne są także schronienia - domki, które mogą pomieścić kilka osób. Każdego dnia liczba osób w wiosce się powiększa - mieszkańcy sąsiednich wiosek są zachwyceni szybkością rozwijania twojej wioski i osiedlają się tutaj z nadzieją na lepszą przyszłość, dlatego pamiętaj, aby zwiększać ilość zasobów potrzebnych do przetrwania. Aby ułatwić sobie pracę możesz wytwarzać narzędzia we wpierw zbudowanej kuźni, co przyspieszy proces budowania nowych budynków. Niestety zdarza się, że ulewa niszczy dzienne zbiory lub wilki zjadają owce z zagrody. 

Pamiętaj, nie pozwól swojej wiosce zginąć!

## **Szczegółowe wymagania**

### **Mapa**

W grze mamy ograniczoną, prostokątną mapę w rozmiarze 30x20, która nie zmienia swojej wielkości w czasie gry. Początkowo w grze mamy jeden dom i jedno pole. Żaden budynek (dom, kuźnia, młyn), pola i zagrody nie mogą na siebie nachodzić. Żeby umiejscowić je na mapie wybieramy miejsce (kratkę), w którym na się znajdować lewy dolny róg. Każdy obiekt ma swoją wielkość:

- dom - 1x1,
- blok - 1x1,
- spichlerz 2x1,
- kuźnia - 2x3,
 - młyn - 4x4,
- pole - 1x1,
- zagroda - 1x1.

### **Budowanie**

Każdego dnia można rozpocząć budowanie tylko jednego budynku albo jednego źródła pożywienia (pola lub zagrody). Każdy obiekt ma potrzebną ilość pracy do wykonania mierzoną w ilości dni pracy jednej osoby (im więcej osób w wiosce tym więcej osób będzie pracować).

- dom - 5 dni,
- blok - 25 dni,
- spichlerz - 50 dni,
- kuźnia - 100 dni,
- młyn - 200 dni,
- pole - 5 dni,
- zagroda - 8 dni.

Jeżeli jednocześnie budowany jest więcej niż jeden obiekt to każdego dnia równomiernie rozdzielamy mieszkańców do pracy (zaokrąglając na korzyść gracza, więc jeżeli mamy 17 mieszkańców i budujemy 3 zagrody, to przy każdej zagrodzie będzie po 6 pracowników).

### **Dom**

Jeden dom stanowi schronienie dla maksymalnie 5 osób.

### **Blok**

Jeden blok stanowi schronienie dla maksymalnie 10 osób.

### **Spichlerz**

Wybudowanie spichlerza pozwala przechowywać o 50 jednostek pożywienia więcej.

### **Kuźnia**

Co dwa dni w wybudowanej kuźni pojawiają się nowe 2 narzędzia, które skracają budowanie wybranej budowli o 2 dni.

### **Pożywienie**

Każdego dnia wyprodukowane jedzenie przeznaczane jest na przeżycie ludzi w wiosce. W przypadku gdy posiadamy mniej jedzenia niż jest mieszkańców umiera tylu ludzi, ilu nie dostanie pożywienia. Jeżeli wyprodukujemy za dużą ilość jedzenia to gromadzi się ono w zapasie, o ile mamy na to miejsce (początkowo 50 jednostek pożywienia). Jednego dnia pole oraz zagroda produkują takie ilości jedzenia, że może wyżywić:

- pole - 4 ludzi, 
- zagroda - 7 ludzi.

Dodatkowo wybudowanie młynu zwiększa na 10 polach plony trzykrotnie.

#### Uwaga!

Zbieranie plonów następuje po budowaniu, tak że jeżeli zbudujemy pole, to tego samego dnia możemy korzystać z racji żywieniowych, które wyprodukuje.

###Zwiększanie populacji

Każdego dnia do wioski przybywa 2 nowych mieszkańców. Jeżeli jednak nie będzie dla wszystkich schronienia, osoby nie osiedlą się.

### **Klęski**

Ulewa niszczy wszystkie plony uzyskane z pól z danego dnia, a prawdopodobieństwo jej wystąpienia to 1/3, natomiast wilk zjada wszystkie owieczki na ten dzień, a prawdopodobieństwa, że zaatakuje to 1/5. Może się zdarzyć, że któregoś dnia spotkają nas oba nieszczęścia.

## **Interfejs użytkownika**

Gracz ma możliwość podglądu, ilu ludzi pozostało w wiosce, jakie są zapasy jedzenia oraz ile maksymalnie zapasów możemy przechowywać. Istnieje możliwość kliknięcia na kratkę na mapie, aby móc umiejscowić na niej obiekt. Wszystko co użytkownik może wybudować jest widoczne (np. pod mapą) i może zostać wybrane poprzez kliknięcie. Gdy nie starczy pożywienia dla wszystkich mieszkańców użytkownik dostaje informację, ilu ludzi zginęło. 

## **UWAGA**

Jeśli gra okaże się niezbalansowana można zmienić parametry, podane wartości są tylko orientacyjne.

