## Spostrzegawczość i refleks
Celem projektu jest napisanie gry, która bada rekleks i spostrzegawczość gracza.

Na ekranie użytkownika będzie wyświetlać się okno, które zawiera figury o różnych kształtach i kolorach.
Wsród wyświetlanych elementów będzie jeden element (bez duplikatów), który gracz musi znaleźć w jak najszybszym czasie.

### Modyfikacje projektu:
#### 1. Użytkownik gra sam.

Jako dane wejściowe wprowadzamy:
- ilośc wyświetlanych elementów,
- czas, podczas którego gracz musi dokonać pierwszego wyboru.
- dopuszczalna ilość złych wyborów lub braku wyboru.

Z każdą rundą czas na wybór elementu maleje o określony czas.

Na bieżąco powinien być wyświetlany średni czas rekacji gracza (do średniego czasu rekacji nie wliczają się rundy, w których gracz niedokonał wyboru lub dokonał złego).

Gra kończy się w momencie, gdy użytkownik osiągnie dopuszczalną ilość nietrafień. 


Program powienien na bieżąco umożliwać uzyskanie statystyk czasu reakcji w każdej rundzie w formie pliku tekstowego.

#### 2. Użytkownik gra z komputerem.
Jedna gra składa się z 10 rund.

Jako dane wejściowe wprowadzamy:
- Szanse na zwyciectwo komputera w rundzie np. 70% ,
- Czas na dokonanie wyboru,
- Czas po jakim komputer dokona wyboru,
- Ilość wyświetlonych elementów.

Jeżeli komputer / użytkownik:
- dokona dobrego wyboru to zyskuje 1 punkt, 
- dokona złego wyboru to traci 1 punkt, 
- nie dokona wyboru lub przeciwnik dokona wyboru pierwszy to jego ilośc punktów nie ulega zmianie.

Na bieżąco powinne być wyświetlane statystki takie jak:
- ilość punktów obu zawodników 
- średni czas reakcji gracza.

Wygrywa zawodnik, który po 10 rundach zdobędzie więcej punktów.

