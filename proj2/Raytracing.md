# Raytracing

Projekt jednoosobowy.

## Punktacja

4pkt - wymagaia podstawowe

6pkt - wymagaia podstawowe + 2 zaawansowane

8pkt - wymagaia podstawowe + 4 zaawansowane

## Opis

Celem projektu jest zaimplementowanie silnika graficznego opartego na bazie raytracingu. Silnik ten powinien umożliwiać utworzenie sceny,
dodawanie do niej elementów, określanie materiału, z jakiego zostały wykonane, zapisywanie oraz odczytywanie elementów sceny z pliku itp. Program powinien być oparty na klasie
wektora 3 lub 4 wymiarowego oraz macierzy 3x3, lub 4x4. Co prawda nie jest to wymagane, jednak znacznie ułatwi pisanie programu, który głównie opierać się
będzie na mnożeniu wektorów i macierzy.
![photo](https://raytracing.github.io/images/img-1.21-book1-final.jpg)
Zdjęcie z [Ray Tracing in One Weekend](https://raytracing.github.io/books/RayTracingInOneWeekend.html).

## Wymaganie podstawowe

### Obiekty

1. Utworzenie abstrakcyjnej klasy obiektów przechowującej takie właściwości jak kolor i współczynnik rozpraszania światła.
2. Utworzenie podstawowych klas obiektów należących do świata, których powierzchnia opisywalna jest w postaci parametrycznej. Wymagane obiekty to kula i płaszczyzna.
3. Utworzenie klasy trójkąta, dzięki czemu możliwe będzie dodawanie innych obiektów do sceny takich jak prostopadłościan, czy inne bryły utworzone z wielokątów.
4. Utworzenie kilku przykładowych materiałów o różnych współczynnikach rozpraszania światła.
5. Dodanie materiału, przez którego światło przechodzi z zadanym współczynnikiem refrakcji np. szkło czy woda.
6. Dodanie obiektu będącego źródłem światła.

### Tworzenie sceny

1. Wczytywanie obiektów z pliku json/txt.
2. GUI umożliwiające dodawanie figur do sceny wraz z odpowiednimi parametrami-dla kuli współrzędne środka i promień, dla płaszczyzny-punkt należący do płaszczyzny i wektor normalny. GUI powinno także pozwalać na zadanie parametrów symulacji, takich jak głębokość rekurencji promieni, ilość promieni na piksel, wielkość pixela.

### Wizualizacja

1. Okno z zadaną przez GUI wielkością, wizualizujące renderowanie kolejnych pikseli.
2. Zapisanie końcowego renderu do pliku.

### Właściwości symulacji

1. Cienie.
2. Rekurencyjne odbicia.
3. Refrakcja.

## Wymagania zaawansowane

1. Tworzenie animacji (np. jako image sequence), podczas której będzie możliwe wybranie zadanego ruchu kamery.
2. Wczytywanie obiektów złożonych z trójkątów z pliku [.obj](https://en.wikipedia.org/wiki/Wavefront_.obj_file).
3. Dodanie tekstur do zaimplementowanych obiektów.
4. Umożliwienie dodania tła (skyboxa) np. przy użyciu [Equirectangular projection](https://en.wikipedia.org/wiki/Equirectangular_projection).
5. Prarelizacja kodu, dzięki czemu możliwy będzie rendering w czasie rzeczywistym w małej rozdzielczości, lub z wyłączonymi/ograniczonymi pewnymi funkcjami.

## Przydatne materiały

- [Ray Tracing in One Weekend](https://raytracing.github.io/books/RayTracingInOneWeekend.html) - tutorial czym właściwie jest raytracing oraz rozbudowana implementacja wraz z dokładnym opisem co i jak w c++.
- [YouTube](https://www.youtube.com/watch?v=A61S_2swwAc) - filmik o raytracingu, co prawda w czasie rzeczywistym oraz napisany w c++ i OpenGL.
- [YouTube](https://www.youtube.com/watch?v=gfW1Fhd9u9Q&list=PLlrATfBNZ98edc5GshdBtREv5asFW3yXl) - seria o raytracingu też w c++.
