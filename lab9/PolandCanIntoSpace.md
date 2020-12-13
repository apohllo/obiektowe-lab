
# Poland Can Into Space!
Or can it?
---
Jest rok 1961, wyścig kosmiczny trwa w najlepsze. 
Stany Zjednoczone oraz Związek Radziecki nie przebierają w środkach, każdy chce być pierwszy na księżycu. Oczy całego świata zwrócone są na te dwa kraje. Czy to jednak jedyni gracze? 

Otóż nie! Jedna jedyna separatystyczna grupa Polaków na emigracji również próbuje sprawić, aby to Polak był pierwszym człowiekiem na księżycu.

To właśnie do Ciebie zwracają się oni z prośbą o napisanie symulacji, która pomoże im rozplanować loty kosmiczne! 

### Co i jak?
Twoim zdaniem będzie implementacja gry przypominającej popularne gry flashowe, które polegały na jak najdalszym/najwyższym wyrzuceniu obiektu. W tym przypadku obiektem będzie rakieta Zunifikowanej Ultrakosmicznej Polskiej Agencji (ZUPA), która w najbliższym czasie powinna znaleźć się na księżycu.

### Od czego zacząć?

Nie od razu ~~Kraków~~ rakietę zbudowano. W grach tego typu największą frajdę zawsze dają ulepszenia, więc twoja rakieta powinna mieć możliwość ulepszania, np. za gotówkę. 
Załóżmy, że początkowo rakieta składa się z trzech części - kadłuba, lotek, silników oraz zbiorników paliwa (oczywiście to tylko przykład, im więcej ulepszeń, tym ciekawiej). Każdy z tych elementów będzie można ulepszyć. Zadbaj o to, aby ulepszeń było sporo, a także odpowiednio oblicz ich koszty tak, aby gra miała odpowiednią dynamikę. Wszystkie ulepszenia powinny być zaimplementowane tak, aby korzystać z paradygmatu obiektowego, np. powinny korzystać ze wspólnego interfejsu.

### Zarabianie

Głównym motywem gry mają być loty "próbne",, a więc wystrzeliwanie rakiety i zbieranie monet tak, aby przy następnym wystrzale móc użyć zakupionych za monety ulepszeń. Jednym słowem, rakieta nie ma znaleźć się na księżycu po jednym uruchomieniu. W założeniu każdy lot ma pozwolić graczowi zdobyć pewną ilość gotówki, za którą zakupi ulepszenia, poleci jeszcze wyżej zbierając jeszcze więcej pieniędzy itd, dopóki nie doleci do księżyca.


### Przeszkody, znajdźki

Na samym początku nasza rakieta będzie, mówiąc krótko, kiepska. Aby gra miała sens konieczne będzie zaimplementowanie "znajdziek", czyli np. latających kontenerów z paliwem, zwiększających zasoby paliwa, latającej gotówki dodawanej na konto gracza, platform wybijających rakietę wyżej, czy "turbodoładowań", które na krótki czas zwiększą prędkość rakiety.
Można się również pokusić o negatywne znajdźki, np. ptaki które uderzone zmniejszają prędkość rakiety.


### Sterowanie

W założenu rakietą można sterować - można jednak wyłączyć tę możliwość - np. u rakiety, która nie ma ulepszonych lotek. Sterowanie może używać paliwo bądź nie, przekręcać rakietę na boki i tak dalej.

### Świat przedstawiony

Świat można zaimplementować dowolnie, należy jednak zadbać o odpowiednie wypełnienie go znajdźkami tak, aby gra była po prostu ciekawa. Warto zwrócić uwagę na losowe generowanie przedmiotów w najbliższym otoczeniu rakiety, można również pokusić się o świat "zawijający" się wokół osi poziomej.


### Fizyka gry
Do wysłania rakiety w kosmos potrzeba w końcu trochę fizyki, prawda?

Cóż, nie w agencji ZUPA.  Rakieta może kierować się prostymi prawami, ważne jest jednak,
aby miała zdefiniowane przyspieszenie. Operowanie bezpośrednio na prędkości może się bowiem okazać trudne. Poza tym, nie ma przeszkód do zastosowania bardzo prostej fizyki.


### Podsumowanie

Twoim zadaniem będzie zaimplementowanie "gry-symulatora" wystrzeliwania rakiety w przestrzeń kosmiczną, rakietę można ulepszać po każdym wystrzeleniu przy użyciu zdobytych pieniędzy, można nią również sterować. W świecie gry mają się znaleźć róznego rodzaju "znajdźki", czyli obiekty, które zmieniają stan rakiety. 


### Przykład
Gra powinna być zbliżona do poniższych przykładów:
- Learn to Fly
- Potty Racers
- Hedgehog Launch
