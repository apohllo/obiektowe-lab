# Heroes-battler (min dla 2os, w przypadku większej grupy spytaj swojego prowadzącego)

Projekt 2 OP inspirowany `Shakes & Fidget` i `Swords & sandals`

## Punktacja

2 osoby - 4 punkty

## Ogólny opis
Autobattler stworzonych przez użytkownika postaci, które mogą posiadać różne klasy postaci oraz statystyki.

## Cel gry 
Cel gry jest w sumie bliżej nieokreślony bo zakładając, że nie będzie max lvl postaci w grę można grać właściwie bez końca.

## Co powinien mieć nasz bohater ?

### Klasy
Każdy bohater ma jedną z 3 klas:
- `Mage`
- `Warrior`
- `Hunter`

Każda z tych klas ma swoją unikalną broń, kolejno:
- `MageStaff`
- `Sword`
- `Bow`
 
Dodatkowo w przypadku `Warrior`'a gdy blokuje cios używa `shield` która blokuje `shieldProtection` % obrażeń od ciosu przeciwnika (max 50%).
`Hunter` ma umiejętność `dodge`  (max 50%) , która daje mu % szans na uniknięcie otrzymania obrażeń od ciosu.
`Mage` nie posiada żadnych umiejętnosci tego typu :(

### Statystyki

Postać posiada kolejno:
`hp` - ilość "krwinek"
`exp` - ilość doświadczenia
`dmg` - obrażenia zadawane
`endurence` - wytrzymałość postaci, 1pkt wytrzymałości daje:
  - 10pkt do `hp` dla `Warriora`
  - 7pkt do `hp` dla `Huntera`
  - 5pkt do `hp` dla `Mage`
 
 `strength` - siła postaci, 1pkt siły daje:
 - każdemu daje 1pkt do odporności przeciwko `Warrior`
 - `Warrior` dostaje za 1pkt siły +10pkt do `dmg`
 
 `dexterity` - zręcznośc postaci, 1pkt zręczności daje:
 - każdemu daje 1pkt do odporności przeciwko `Hunter`
 - `Hunter` dostaje za 1pkt siły +12pkt do `dmg` oraz + 1% do `dodge` (max 50%)
 
 `intelligence` - inteligencja postaci, 1pkt inteligencji daje:
  - każdemu daje 1pkt do odporności przeciwko `Mage`
 - `Mage` dostaje za 1pkt inteligencji +20pkt do `dmg`
 
 `luck` - dla każdej postaci każdy pkt szczęścia dodaje 1% `dmg` przy ataku, (max 100pkt czyli 200% `dmg`) [więcej w sekcji walka]
 
## Walka
#### Jest mozliwa jeśli każdy z graczy ma min 1 sztukę złota
- Walka przebiega turowo, postać atakująca pierwsza jest losowana.
- Mamy dwóch wojowników `heroA` i `heroB` , załóżmy, że `heroA` zaczyna
- Poniższy cykl powtarza się, aż do "stracenia przytomności" jednego z nich, oczywiście bohaterowie atakują na zmianę

 1.`heroA` atakuje 
  - atakując za dmg pomiędzy `0` a `heroA.dmg*(100+heroA.luck)` 

 2.`heroB` używa:
  - `block` jeśli jego klasa to `Warrior`:
    - blokuje za `shieldProtection` czyli obrażenia otrzymywane to `dmgReceived*(1-shieldProtection)`
  - `dodge` jeśli klasa to `Hunter`
    - otrzymuje `dmgReceived` z prawdopodobieństwem `1-dodge`
  -  nic nie robi jeśli `Mage`

 - Po końcu walki przydzielane jest złoto:
   - [max((pomiędzy `1` a `25` % złota posiadanego przez gracza, który przegrał), 1 sztuka złota)]
   - złoto jest zabierane od gracza, który przegrał

 - Przydzielane jest też doświadczenie wynoszące:
   - pomiędzy `0.1 a 10 % exp` gracza, który przegrał, `gracz ten NIE traci exp`

 ## Poziomy
 Na początku dla każdej postaci:
 - `exp = 100` 
 - `lvl = 1` 
 - `expModifier = 1.2` - mnożnik skalujacy następne poziomy postaci
 - `expToNextLvl` - próg do osiągnięcia kolejnego poziomu (jesli `exp` postaci jest mu równy poziom zostaje "wbity")
   - dla przykładu do wbicia poziomu 2 potrzebne będzie `100*expModifier` pkt doświadczenia czyli `120` i `expModifier += 0.1` - mnoznik się zwiększa (następne poziomy trudniej "wbić")
   - na 3 poziom `expModifier = 1.3` więc pkt doświadczenia potrzebne będzie `expToPreviousLvl`(próg do poprzedniego poziomu) * `expModifier` i inkrementujemy `expModifier` (`expModifier += 0.1`)
 - dla kolejnych poziomów progi są generowane jak powyżej
 - każdy poziom daje `4pkt` do ulepszania postaci

 ## Ulepszanie postaci
 - gracz wybiera gdzie dodać pkt postaci, powinien widzieć wszystkie dostępne w gui
  - przydzielone pkt dają benefity określone w punkcie [Statystyki]
  - MOŻE być ich więcej niż 4 !!!

 ## Kreacja postaci
  - Wybór `nick`'a postaci
  - Bazowe statystyki postaci, które wybrały dane klasy:

  - `Warrior`
    - `strength = 6`
    - `dexterity = 2`
    - `luck = 3`
    - `intelligence = 1`
    - `endurance = 8`

  - `Hunter`
    - `strength = 1`
    - `dexterity = 7`
    - `luck = 4`
    - `intelligence = 2`
    - `endurance = 6`

  - `Mage`
    - `strength = 1`
    - `dexterity = 1`
    - `luck = 6`
    - `intelligence = 8`
    - `endurance = 4`

  - Doświadczenie `exp = 100`
  - Złoto `gold = 500`
  - Poziom `lvl = 1`
  - [uproszczenie] w przypadku `Warrior` każdy ma taką samą tarczę o `shieldProtection = 50` (czyli 50%)

  [Disclaimer] to tylko proponowane statystyki podstawowe, mogą okazać się zwyczajnie słabe ;)

  ## Zapisywanie danych do pliku:
  - Dane powinny być zapisywane do pliku (format pozostawiamy do wyboru) w taki sposób, aby po otworzeniu gry dało się korzystać z wcześniej utworzonych postaci
  
  ### [? Opcionalnie do zatwierdzenia ?] 
  - zapisywanie % wygranych walk:
    - `Warrior` vs `Mage`
    - `Warrior` vs `Hunter`
    - `Hunter` vs `Mage`
  - zapisywanie % wygranych walk dla każdej z klas
  - dane mają być wyświetlane na ekranie w formie WYKRESÓW KOŁOWYCH (najlepiej na osobnej karcie, lub tak, aby  nie przytłaczały widoku głównego)
   
   
 [Disclaimer] instrukcja może zawierać błędy językowe, oczywiście umieszczone celowo, aby zbadać czujność czytającego :)
 
 Autorzy
 -------
 Szymon @bielowka Bielówka & Piotr @Viciooo Witek
 
 
 
 
