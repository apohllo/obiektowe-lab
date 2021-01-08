# Piłkarzyki na kartce

## Liczba punktów: 2

"Piłkarzyki na kartce", czy "Paper Soccer" to strategiczno-taktyczna gra dwu-osobowa. Jak nazwa wskazuje, w tradycyjnej formie rozgrywana na kartce papieru.
Projekt polega na stworzeniu komputerowej wersji tejże gry.

## Zasady gry

Rozgrywka odbywa się na prostokątnym boisku tradycyjnie o wymiarach 8x10 wraz z dwoma wypustkami symbolizującymi bramki. W celu skrócenia, bądź wydłużenia czasu rozgrywki stosuje się także rozmiary 6x8 lub 10x12.

![Standardowe_boisko_do_pilkarzykow.svg](https://user-images.githubusercontent.com/76654418/103179853-601dfa80-4890-11eb-9e0e-e271dbdfb8d8.png)

Mecz rozpoczyna się z centralnego punktu boiska.
Gracze wykonują ruchy naprzemiennie, tworząc kreski symbolizujące ruchy i tym samym przesuwając piłkę.

Ruchy mogą być wykonywane pionowo, poziomo oraz na skos, ale piłka nie może poruszać się po kreskach, w których była już wcześniej prowadzona ani po krawędziach boiska.

![ruchy.png](https://user-images.githubusercontent.com/76654418/103179855-6613db80-4890-11eb-9c40-eaf99a51fc17.png)

Jeżeli gracz kończy ruch na krawędzi boiska lub w miejscu, w którym przechodzi wcześniej narysowana kreska(obojętnie którego gracza), to otrzymuje dodatkowy ruch.

![ruchy%20%E2%80%94%20kopia2.png](https://user-images.githubusercontent.com/76654418/103179858-6ad88f80-4890-11eb-968e-5a8714de6bf1.png)

Mecz kończy się w momencie, w którym piłka zostaje umieszczona w bramce, bądź gdy którys z graczy nie może wykonać ruchu, wówczas mecz przegrywa gracz, który został zablokowany.

## Szczegółowe wymagania

1. Program umożliwia wizualizację rozgrywki w środowisku graficznym, bądź tekstowym. Ślady ruchów graczy muszą się różnić wizualnie.

2. Sterowanie odbywa się za pomocą klawiatury numerycznej.

![ruchy%20%E2%80%94%20kopia.png](https://user-images.githubusercontent.com/76654418/103179860-6e6c1680-4890-11eb-99b3-7c771c96eb24.png)

3. Program umożliwia wybór rozmiaru boiska: małe(6x8), klasyczne(8x10) lub duże(10x12).

4. Jeśli wykonanie ruchu nie kończy tury bieżącego gracza, to może on cofnąć ruch. Cofanie powinno odbywać się za pomocą wybranego klawisza lub kombinacji klawiszy na klawiaturze.

5. Po zakończonym meczu, piłka zostaje umieszczona na środku boiska.

6. Program powinien przechowywać i umożliwiać resetowanie wyniku rozgrywki, czyli ilość wygranych meczy przez graczy.
