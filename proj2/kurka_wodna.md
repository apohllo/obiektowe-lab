# Kurka Wodna - opis projektu
<br />

## Punktacja

2 lub 3 punkty

## Ogólny zarys

- Gra wzorowana jest na popularnej grze retro o tej samym tytule, której gameplay można zobaczyć na przykład tutaj <br />https://www.youtube.com/watch?v=rVdyk6l0i_Y&t=949s
- Gra to klasyczny przykład gry zręcznościowej, w której należy popisać się refleksem w strzelaniu do ruchomych celów. Ruchome cele to właśnie tytułowe "kurki" czyli kury, które przelatują nam po ekranie (a podobno kury to nieloty?)
- W grze wcielamy się w farmera, który broni swojego pola. Farmer ma do dyspozycji strzelbę. Należy dobrze wycelować i trafiać przelatujące kury. Za każde trafienie otrzymujemy punkty. Im trudniejszy cel do trafienia (szybszy przelot / mniejszy obiekt), tym więcej punktów powinniśmy otrzymać.
- Aby przejść do kolejnego etapu, należy zdobyć wymaganą ilość punktów. Ścigamy się z czasem, jak i z limitem dostępnych magazynków. Nasz strzelba może pomieścić X naboi (np. 5). Do dyspozycji mamy Y magazynków po X naboi każdy. Po każdym wystrzeleniu jednego magazynka przeładowanie zajmie nam Z sekund.
- Jeśli nie zdobędziemy wymaganej ilości punktów, przegrywamy. Zdobycie wymaganej ilości punktów premiowane jest awansem (UWAGA: Awans dokonuje się dopiero po zakończeniu czasu rundy lub utraceniu wszystkich naboi. Chcemy umożliwić graczom uzyskanie jak najwyższego wyniku)
- W grze dostępnych jest kilka rund (np. 4). Każda runda charakteryzuje się wyższym poziomem trudności (mniejsze obiekty do trafienia, szybszy lot przeciwników, mniejsza ilość naboi, mniej czasu na uzyskanie wymaganego wyniku)
- Gra kończy się po odpadnięciu lub ukończeniu wszystkich rund. Punkty gracza ze wszystkich rund sumują się i są zapisywane w rankingu.


## Wymagania na 2 punkty

- Implementacja kilku/ kilkunastu obiektów reprezentujących kury. Dodanie podstawowych animacji reprezentujących ruchy. Obiekty trudniejsze do trafienia mają być premiowane większą ilością punktów
- Dodanie co najmniej 3 rund rozgrywki, różniących się trudnością obiektów i mapą. Mapa może np. zawierać przeszkody, tzn. obiekt może wlecieć za przeszkodę i być nie do trafienia, by po chwili wylecieć z drugiej strony. Przeszkody mogą być przezroczyste (tzn. widzimy i przeszkodę, i zwierzaka za nią) lub nie, ale mają uniemożliwiać trafienie. 
- Przeszkody nieprzezroczyste mogą powodować zniekształcenie ruchu - to znaczy obiekt może wylecieć zza przeszkody w nieco innym miejscu, niż wydawałoby się to po początkowej trajektorii.
- Dodanie rankingów reprezentujących graczy


## Wymagania na 3 punkty
- Kury mogą być oporne na trafienia. Niektóre należy trafiać 2 razy inne 3 razy itp.
- Zaawansowane animacje, tj. nagłe przyspieszenia, zawrócenie w drugą stronę, wykonanie piruetu itp. Takie 'nieplanowane' zdarzenia mają być generowane losowo.
- Dodanie 'zrzutu zaopatrzenia'. Jest to paczka na spadochronie, której zestrzelenie daje bonusy, np + 20 sekund dodatkowego czasu, + 100 punktów lub dodatkowa broń.
- Należy udostępnić ~3 strzelby o różnej sile rażenia. To znaczy - 'zaopatrzeniowa' strzelba może uderzać np. z dwukrotną siłą normalnej strzelby lub zawsze neutralizować cel 1 strzałem itp.
- Mapa (tło) ma być przewijana w poziomie. Tzn. widzimy np. tylko 60% obszaru i dochodząc do krawędzi aktualnie wyświetlanego obszaru, możemy przewijać w lewo lub prawo, by dotrzeć do prawdziwej krawędzi mapy. Zwierzęta wychodzą z krawędzi mapy, a nie z krawędzi aktualnie widzianego obszaru (w wymaganiach za 2 punkty, mapa widziana = mapa rzeczywista) 
