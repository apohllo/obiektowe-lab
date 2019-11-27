1. W jaki sposób rozmnażają się zwierzęta?
   1. Zwierzaki muszą spotkać się na tej samej komórce.
   2. Dziecko powstaje na losowej, pustej pozycji pozycji.
   3. Kierunek dziecka jest losowy.
   4. Jeżeli jest więcej niż dwoje zwierząt na jednej pozycji, to rozmnażają się te, które mają największą energię.
   5. Dziecko dostaje ćwierć energii od każdego z rodziców. Rodzice tracę tę energię.
   6. Może powstać tylko 1 dziecko. 
2. Ile zwierząt jest na początku?
   1. Ta wartość powinna być parametrem uruchomieniowym aplikacji. Prawdopodobnie potrzebna będzie większa ilość zwierząt
      niż 2, ponieważ jest mało prawdodpobone, że się spotkają.
3. Kto zjada roślinę, jeśli jest więcej zwierząt?
   1. Roślinę zjada ten kto ma największą energię.
   2. Jeśli > 1, który ma taką samą największą energię, to dzielą roślinę między siebie.
4. Następujące parametry są danymi wejściowymi do aplikacji:
   1. Rozmiar mapy (`width`, `height`)
   2. ilość energii początkowej zwierząt (`startEnergy`)
   3. ilość energii traconej w każdym dniu (`moveEnergy`)
   4. ilość energii zyskiwanej przy zjedzeniu rośliny (`plantEnergy`)
   4. proporcje dżungli do sawanny (`jugnleRatio`)
5. Dane wejściowe są ładowane z pliku `parameters.json` znajdującego się w katalogu, w których uruchmiana jest
   aplikacja.
6. Struktura pliku powinna być następująca:
```
{ 
  "width": 200,
  "height": 100,
  ...
}
```
      
