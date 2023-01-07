# TOWER DEFENCE
### Notka od autorów
Projekt powstał z myślą o wykonaniu go w 2 osoby, lecz podstawowa wersja została okrojona celem dostosowania pracy do 1 osoby. Zapisana punktacja nie przewiduje ściśle równego podziału punktów, lecz umożliwia luźniejszy podział, z uwagą na maksymalnie 8 pkt dla każdego; np. robię projekt z kolegą, ja chcę 8 pkt, ale on potrzebuje tylko 4: robimy razem wersję rozszerzoną z tylko z jedną mapą (max 12 pkt), on odpowiada tylko za dobry kod dla wrogów (2+2) a ja za resztę. Jeśli obie strony są usatysfakcjonowane, a podział pracy równomierny do podziału punktowego, wszyscy powinni być zadowoleni.
### Cel gry
Obrona zamku przed wrogami zanim straci cały pasek zdrowia.
### Opis gry
Na środku mapy stoi nasz zamek, który zniszczyć będą starali się wrogowie nadciągający ze wszystkich stron prosto na zamek. Wrogowie zadają obrażenia po dojściu do celu, a pozbywać się ich możemy stawiając wieżyczki, które strzelają do wrogów, którzy podejdą na sprecyzowaną odległość. Wieżyczki możemy stawiać za pieniądze, które otrzymamy za zabijanie wrogów. Liczba wrogów zwiększa się z czasem, a gra kończy się, gdy pasek zdrowia (zmniejszany przez obrażenia od wrogów) zejdzie do 0. Obrazki poglądowe pochodzą z gry „Clash of clans”, projekt oczywiście nie wymaga grafiki wyglądającej jak na poglądowych obrazkach, mają jedynie doprecyzować mechanizm działania.
## WERSJA PODSTAWOWA (1 osoba, 8pkt)
### (2 pkt) Mapa
Mapa to zwykła połać ziemi, na której środku stoi zamek. 
![image](https://user-images.githubusercontent.com/94977771/211173476-27ff5ea9-9dbb-42ef-8faf-3999a59fced6.png)
Zamek oraz stawiane wieżyczki nie mogą na siebie nachodzić, ale mogą się ze sobą stykać. 
![image](https://user-images.githubusercontent.com/94977771/211173495-d14d831b-6330-4f46-9e64-2391398ab039.png)
Na każdym polu mapy może się znajdować nieograniczona ilość wrogów, ale wrogowie nie mogą wchodzić na wieżyczki/zamek.

### (2 pkt) Przeciwnicy
Przeciwnicy są 1 rodzaju, generowani losowo na krawędziach mapy, lecz ze wzrastającą częstotliwością w miarę trwania rozgrywki. Wróg może zadać obrażenia tylko zamkowi i tylko jak stoi na polu obok zamku. Po otrzymaniu określonych obrażeń (niekoniecznie za jednym razem) umiera.
### Rozmiary obiektów
Zamek musi zajmować zdecydowanie najwięcej miejsca, tak, aby przeciwnicy mogli go bez problemu zaatakować, np. 10x10. Wieżyczki powinny mieć preferowany rozmiar 3x3, a wrogowie 1x1.
### (2 pkt)  Działające GUI
Gra nie musi posiadać animacji poruszania się wrogów ani strzelania wieżyczek, ale wszystkie obiekty powinny być przedstawione w postaci grafik, z paskiem zdrowia (warto pamiętać o dokładniejszym i większym niż w przypadku jednostek pasku zdrowia dla zamku).
![image](https://user-images.githubusercontent.com/94977771/211173517-f169aa7d-1f9b-41c8-ad2d-277e1db8bd99.png)
### (+1/2 pkt) Mury
Wprowadzenie drugiego typu ochrony zamku: mury. 
![image](https://user-images.githubusercontent.com/94977771/211173511-d2af3f7d-78b5-46f9-be9b-a1beca310432.png)
Mury mają określoną długość, są stawiane z założenia na drodze wroga na zamek i zmuszają go do podjęcia jednej z 2 aktywności:
#### -(wersja 1 pkt) Wrogowie po napotkaniu muru od razu zaczynają go niszczyć (stoi na ich drodze)
#### -(wersja 2 pkt) Wrogowie po napotkaniu muru obierają inną, sensowną drogę dojścia do zamku. W przypadku braku możliwości dojścia (np. zamek ogrodzony ze wszystkich stron przez mury) zamiast obchodzić, zaczynają niszczyć mur.
## WERSJA ROZSZERZONA (2 osoby, 8+5pkt)
### (1 pkt) Mapa
Powinny być dostępne min.3 mapy, w tym przynajmniej jedna poprzedzielana przeszkodami, nie do przejścia przez wrogów, które wymagają obejścia (mur/rzeka).
### (2 pkt) Przeciwnicy
Przeciwnicy są min. 3 rodzajów różniących się np. zdrowiem/szybkością ataku/przemieszczania się/targetem(np. niektóre jednostki mogą atakować a inne omijać wieżyczki obronne), w tym min. jeden typ strzelający na więcej niż 1 kratkę.
### (2 pkt) Wieżyczki
Wieżyczki mogą być możliwe do zaatakowania przez wrogów, a co się z tym wiąże mieć pasek zdrowia skutecznie zmniejszający się w miarę otrzymywania obrażeń. Potrzebujemy min. 3 rodzajów wieżyczek różniących się zajmowaną przestrzenią/życiem/szybkością strzału/zadawanymi obrażeniami.
## ROZSZERZENIA (+max 3pkt)
Zaproponowaną grę można rozszerzać praktycznie w nieskończoność: większa różnorodność wieżyczek, więcej różnych wrogów (np. latający), budowanie kopalni złota żeby szybciej mieć surowce na nowe wieżyczki etc.. Chcemy dać wam dowolność w tworzeniu swojego wyobrażenia gry z której będziecie zadowoleni, dlatego poniżej proponujemy parę rozszerzeń. Jeśli wymyślicie coś ciekawego sami, pozostawiamy przydzielenie dodatkowych punktów do życzliwości prowadzących i pozytywnego wrażenia wywartego na nich. Zrobienie rozszerzeń za więcej niż 3 punkty nie może spowodować otrzymania więcej niż 8 pkt za projekt, ale może zadrobić braki w poprzednich stadiach projektu (pod warunkiem że całość działa, np. nie mamy 3 map tylko jedną albo 1 rodzaj wrogów).
### (+2 pkt) Animacje
Zdając sobie sprawę z trudności zrealizowania animacji chodzenia/atakowania/umierania wrogów i strzelania/zniszczenia wieżyczek nie jest to obowiązkowy punkt gry, ale godzien 2 dodatkowych punktów.
### (+1 pkt) Sprzedawanie wieżyczek
Umożliwienie grającemu sprzedaży postawionej wcześniej wieżyczki/murku za połowę kosztu kupna
### (+1 pkt) Ulepszanie wieżyczek
Postawione wieżyczki można ulepszyć za określoną kwotę tak, żeby miały więcej wytrzymałości, zadawały większe obrażenia itp.
### (+1 pkt) Zachowanie wrogów
Wróg zawsze wybiera najkrótszą drogę dostania się do zamku: jeśli trafi na przeszkodę/zbiór przeszkód to obierze najkrótszą z możliwych drogę dojścia, np. jeśli stworzymy mapę labiryntu z zamkiem w środku, wrogowie znajdą i obiorą najkrótszą drogę do środka.
### (+1 pkt) Fale wrogów
Podzielenie rozgrywki na zorganizowane fale wrogów zwiększające się razem z upływającym czasem oraz dodanie raz na czas celowego skupienia przeciwników w większe grupy, z którymi ciężej jest się uporać.
