# Traffic Run

### Punktacja
6 punktów za wersję podstawową
8 punktów za wersję pełną

---
## Cel gry
Celem gry jest przechodzenie kolejnych etapów i zdobywanie nowych aut.

---
## Opis gry
Podstawową czynnością w grze jest jazda samochodem. Auto może jechać tylko w jednym, ustalonym przez projektującego kierunku (kierunek ten może się jednak zmieniać w trakcie rozgrywki). Celem w pojedynczym poziomie jest dotarcie do mety. Po drodze tor ruchu auta mogą przecinać prostopadle inne auta. Jeżeli dojdzie do zderzenia, auto zostaje przeniesione na start i poziom należy powtórzyć. Na trasie mogą się pojawiać sekwencje monet, które gracz może zbierać wjeżdżając w nie.
Przed rozpoczęciem każdego poziomu gracz może zmienić auto. Każde z aut ma (nieznacznie) różne paramatry: prędkość, długość, droga hamowania. 

---
## Wymagania podstawowe
### Wizualizacja
Widok podczas gry powinien być ustawiony z lotu ptaka, wszystkie modele i grafiki mogą być dwuwymiarowe. Tor ruchu powinien być wizualnie wyróżniony (np asfalt) od tła (np trawa). Auta przeszkadzające powinny się poruszać po powierzchni takiej jak tor ruchu. 

### Auta
Dostępne co najmniej 3 auta do wyboru, z czego pierwsze jest odblokowane od początku. Pozostałe powinny być odblokowywane za ustaloną cenę (np 100) w następujący sposób:
- po kliknięciu przycisku "zakup" pobierana jest ustalona kwota z monet gracza i losowane jest jedno z niedostępnych aut. Auto to zostaje odblokowane i udostępnione do rozgrywki
- ustalona kwota jest zwiększana o pewną stawkę (np 50) po zakupie każdego auta (każde kolejne auto jest droższe od poprzedniego)
- jeżeli gracz nie posiada odpowiedniej liczby monet lub wykupił wszystkie auta, przycisk "zakup" jest nieaktywny

### Poziomy
Podczas każdego poziomu auto gracza powinno napotkać co najmniej jedną przeszkodę, czyli auto jadące ze stałą prędkością po torze prostopadłym lub równoległym do toru ruchu gracza. Podczas każdego poziomu na torze ruchu gracza powinny być ułożone monety (mogą się poruszać za samochodami przeszkadzającymi, lub po prostu leżeć na fragmentach trasy, po której rusza się tylko gracz). Po zebraniu, monety trafiają do gracza i znikają z mapy. Każdy poziom powinien posiadać pasek długości toru, który stopniowo się zapełnia wraz z tym jak gracz przejeżdża dalej. Po zakończeniu poziomu pasek powinien być pełen, a przy rozpoczęciu kolejnego poziomu - powinien być pusty. Auto gracza może jechać do przodu po torze prostym lub skośnym. Tylko w tym drugim przypadku auta przeszkadzające mogą jechać po torze ruchu gracza. Należy zaprojektować co najmniej 5 poziomów, każdy kolejny trochę dłuższy od poprzedniego.

---
## Rozszerzenia
1. Generator poziomów - mapy do kolejnych poziomów generują się automatycznie i gra trwa w nieskończoność. Warunek o tym, że każdy kolejny poziom ma być dłuższy od poprzedniego przestaje obowiązywać.
2. Dodanie ramp do skakania - możliwość przeskoczenia nad niektórymi elementami mapy, jeśli pojawi się rampa. Powinno to zostać odpowiednio zaznaczone wizualnie. 
3. Dodanie rond - auta przeszkadzające wjeżdżają na rondo z lewej lub prawej strony i poruszają się w ustalonym kierunku po rondzie. Auto gracza jedzie po rondzie zgodnie z kierunkiem poruszających się na nim aut.
4. Dodanie licznika punktów - punkty naliczają się za każdy przebyty fragment trasy. Gracz otrzymuje dodatkową premię punktową za zbliżenie się do innego auta na bardzo niewielką odległość, ale nie dotknięcie go ("near miss"). Punkty zerują się po rozpoczęciu poziomu od nowa, jednak przy przechodzeniu na kolejne poziomy - kumulują się. Dodanie hall of fame.
5. Dodanie pociągów - pociągi jeżdżą prostopadle do gracza lub po tym samym torze, gdy gracz jedzie na skos. Pociągi są bardzo szybkie i długie, za to ich przybycie jest za każdym razem poprzedzone miganiem sygnalizatora. Należy umieścić sygnalizator przy każdym z torów.

---
## Inne
Gra, którą inspirował się autor README:

https://www.gry.pl/gra/traffic-run