Tel’abib

Story of Chaos and Gods

Wieki temu na Ziemię spadły tajemnicze przedmioty. Każdy, kto choć raz miał
w ręku jeden z ów przedmiotów, opowiadał później o niezwykłej mocy płynącej z
ich wnętrza. Ludzie zaczęli więc zwać je Artefaktami. Jednak, aby równowaga
wszechświata została zachowana, na Ziemię zstąpiło jedyne w swoim rodzaju zło.
Najstarszy z Annunakich, przez swoich zwany Tel’abib, przez ludzi natomiast –
Chaosem. Gdy Chaos przejął wszystkie Artefakty, zaczął panować nad ludźmi
żelazną ręką. Przez Klątwę Babel ludzie nie mieli szans, aby zjednoczyć się, gdy
jeszcze był czas. Dlatego właśnie nad ludzkością zapadł czas mroku, czas cienia.
Czas Chaosu.

Aż pewnego dnia nie pojawiłeś się Ty. Z pozoru zwykły człowiek, który, jak inni,
cierpiał pod jarzmem Chaosu. Jednak pewnego dnia pod Twoimi drzwiami pojawiło
się coś, czego nigdy wcześniej nie widziałeś. Niebieski lew. Po chwili rozmowy
okazało się, że jest to nikt inny, a Annunaki Światła, zwany przez swoich
Jalidem. Rozwój wydarzeń sprawił, że jesteś jedynym człowiekiem, który posiada
Artefakt – ostatni ocalony przed łapami Chaosu.

Razem z Jalidem rozwiązuj zagadki, przejdź przez odmęty Wieży Babel, zbierając
kolejne Artefakty, aby na końcu podróży stanąć twarzą w twarz z Tel’abibem –
panem Chaosu. Pamiętaj, że jesteś jedyną osobą, która może wyzwolić ludzkość
spod jego jarzma!

Cel Projektu

Tworzymy grę! Głównie polega ona na tym, że Twój bohater chodzi po prostokątnych
pokojach (mapach), zbierając po drodze różne przedmioty – Artefakty. Po zebraniu
wszystkich Artefaktów bohater może wejść do ostatniego pokoju, gdzie czeka go
walka z bossem – Tel’abibem. W zależności od tego, jak bardzo czujesz się
zaawansowany w technikach Javy, możesz albo zaimplementować faktyczną walkę z
bossem (nie zapomnij wtedy, że to sam Chaos, walka z nim nie będzie prosta),
albo uznać, że sama moc Artefaktów połączona z mocą Jalida wystarczą, aby
odesłać Chaos z naszego świata.

Pokoje i pułapki

Brzmi prosto? Cóż… wcale takie nie jest. Każdy pokój bowiem ma klika pól pułapek
– stanięcie na takim polu powoduje natychmiastową śmierć. Śmierć bohatera polega
na odesłaniu go do początkowego pokoju z brakiem Artefaktów – musi je zbierać
jeszcze raz. Nie możemy jednak tracić nadziei – po wejściu do każdego pokoju
wyświetlić się ma wskazówka odnośnie tego, na jakich polach stawać nie można.
Wskazówki mogą być różne – to od Ciebie zależy, jak trudne będzie przejście
Twojej mapy.

Jeśli chcesz, możesz także zaimplementować pokoje pułapki. Są to pokoje, do
których nie powinno się wchodzić. Wypełnione trującym gazem, bez podłogi, lub
cokolwiek chcesz – po wejściu do tego pokoju bohater automatycznie umiera.

Zbieranie Artefaktów

Ten punkt jest akurat dziecinnie prosty. Bohater zyskuje Artefakt wtedy, gdy
wejdzie na jego pole. Zakładamy, że raczej nie robimy pułapek z przynętą w
postaci Artefaktu – pole, na którym znajduje się Artefakt jest całkowicie wolne
od pułapek.

Przemieszczenie się z pokoju do pokoju

W każdym pokoju powinno być choć jedno pole, które „przenosi” bohatera do innego
pokoju. Coś w rodzaju portalu, bo nie mamy fizycznego korytarza. Oczywiście im
więcej pokoi bocznych, tym trudniejsze będzie przejście Twojej gry. Najlepiej by
było, gdyby pola te znajdowały się przy granicach pokoju, ale kto wie, jaką
technologią dysponowali starożytni…

Mapa

Gra może wydawać się prosta, jeśli masz dostęp do wszystkich możliwych pokoi.
Jednak naprawiamy to poprzez fakt, że widzimy tylko pokój, w którym się
znajdujemy (pola przejścia zaznaczone są jakimś innym kolorem/literką ‘P’).
Oczywiście możesz dodać do swojej gry Artefakt, który jest mapą (taką
papierową). Jednak wtedy widoczne będą tylko pokoje, które zostały odwiedzone
przez bohatera i oczywiście nie mogą być tam zaznaczone pułapki (chyba, że
zaimplementowałeś Detektor Pułapek, a Twój bohater go znalazł – choć wtedy gra
po części traci sens).

Easter Egg

Niezależnie od zawodu, wszyscy od czasu do czasu lubimy zrobić komuś kawał.
Załóżmy, że nasz projekt kiedyś faktycznie znajdzie się w rękach fizycznych
graczy, niemających dostępu do naszego kodu. Możemy wtedy zaimplementować małego
Easter Egga. Po odnalezieniu sekretnego pokoju, w którym nie będzie pułapek,
możemy umieścić jedno pole, które ma specjalne znaczenie. Po postawieniu na nim
bohatera, na świat zstępuje kolejny Annunaki. Apohllo, znany Annunaki Liryki,
daje Ci moc, dzięki której znosisz Klątwę Babel. Ludzkość jednoczy się i własną
mocą wypędza Chaos z naszego świata. Gratulacje! Misja wypełniona!

Oczywiście jest to funkcja całkowicie opcjonalna, w końcu nie wszyscy muszą
lubić kawały.

God Mode

Aby testowanie było trochę lepsze, aniżeli umieranie za każdym razem, gdy nie
rozwiążesz wskazówek, możesz rozważyć zaimplementowanie God Moda – jesteś
niezniszczalny, nie umierasz, zbierasz Artefakty i idziesz do bossa. Oczywiście
można by było go włączyć i wyłączyć (może specjalną kombinacją klawiszy?).

Grafika

Wszyscy mamy różne stopnie zaawansowania w technikach Javy. Jeśli chodzi
o podstawową wersję grafiki, możliwe, że wystarczy MapVisualizer (oczywiście
zmieniony na nasze potrzeby). Trochę lepszym, także nieskomplikowanym
rozwiązaniem, może być prosty kwadracik reprezentujący bohatera oraz szachownica
reprezentująca pokój. Jeśli w grafice czujesz się jak ryba w wodzie, to
oczywiście możesz zastosować widok kamery z pierwszej osoby. Wtedy mógłbym nawet
zaproponować nie pułapki, a labirynt w każdym pokoju, choć kto wie, jak będziesz
chciał to zrobić.

Powodzenia!
