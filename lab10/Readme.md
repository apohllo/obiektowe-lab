# Git - rozproszony system zarządzania kodem źródłowym

Ćwiczenie ma zapoznać studentów z jednym z najbardziej popularnych systemów do zarządzania kodem źródłowym - Gitem
oraz hostingiem do projektów Githubem.

## Wstęp

Git jest rozproszonym systemem pracy z kodem źródłowym. Jego najważniejsze cechy to:

* możliwość zapisywania stanu kodu źródłowego w określonym momencie
* możliwość przywracania starych wersji kodu źródłowego
* możliwość pracy w gałęziach ("branchach")
* brak centralnego repozytorium kodu (repozytorium rozproszone)

## Przydatne informacje

### Polecenia do wykonania za pierwszym razem (jeśli projekt nie jest w żadnym repozytorium)

W celu przygotowania kodu źródłowego do bracy z gitem należy wykonać następujące polecenia

1. `git init` (zainicjowanie plików Gita, w głównym katalogu naszej aplikacji, tworzony jest katalog `.git`, który
   zawiera repozytorium kodu źródłowego)
2. `echo 'out' > .gitignore` (dodanie katalogu `bin` do listy ingorowanych plików/katalogów)
3. `git add .` (dodanie wszystkich plików, poza ignorowanymi, do *indeksu* Gita)
4. `git status` (sprawdzenie aktualnego statusu kodu źródłowego, polecenie wykonowyane bardzo często)
5. `git commit -m 'Initial commit'` (*zatwierdzenie* (zacommitowanie) zmian w historii Gita)
6. `git remote add origin https://github.com/<login>/<repozytorium>.git` (dodanie zdalnego repozytorium z Githuba)
7. `git push origin master` (wysłanie zmian do zdalnego repozytorium)

### Odtworzenie repozytorium

1. `git clone https://github.com/<login>/<repozytorium>.git` - *sklonowanie* zdalnego repozytorium

Alternatywnie

1. IntelliJ -> Import from Git

### Zatwierdzenie zmian na koniec pracy

1. `git add .` (dodanie zmian w aktualnym katalogu do *indeksu*)
2. `git commit -m 'Opis zmian'` (*zatwierdzenie* zmian znajdujących się w indeksie)
3. `git push origin master` (wysłanie zmian do zdalnego repozytorium)


### Aktualizowanie się względem zdalnej gałęzi `master`

1. `git add remote nazwa-repozytorium adres-repozytorium` (dodanie zdalnego repozytorium).
2. `git checkout master` (przełączenie się lokalnej gałęzi master).
3. `git pull nazwa-repozytorium master` (pobranie do lokalnej gałęzi `master` zmian z oficjalnej gałęzi `master`)
4. `git checkout feature-branch` (przełączenie się do gałęzi na której pracowaliśmy).
5. `git rebase master` (ribejs względem lokalnej gałęzi `master`).
6. Rozwiązanie konfliktów, ewentualne wprowadzenie zmian.
7. `git push origin feature-branch -f` (wysłanie zaktualizowanej wersji do zdalnej gałęzi `feature-branch w naszym
   repozytorium).


## Zadania do wykonania

1. Zarejestruj się na Githubie.
2. Zrób fork repozytorium https://github.com/apohllo/git-lab.
3. Sklonuj *własne* repozytorium na komputer lokalny.
3. Przejdź do katalogu `git-lab`.
3. Utwórz nową gałąź `new-feature-xxx` gdzie `xxx` to Twój pseudonim.
4. W pliku `list.txt` w katalogu głównym dodaj swój pseudonim.
5. Dodaj plik do indeksu i zatwierdź zmiany.
6. Wyślij zmiany do swojego repozytorium.
7. Uwtórz pull-request do repozytorium https://github.com/apohllo/git-lab
7. Jeśli nie można zmergować gałęzi wykonaj kolejne punkty.
5. Dodaj oficjalne repozytorium `https://github.com/apohllo/git-lab` jako drugie repozytorium (np. `apohllo`, `git add remote ...`)
5. Przełącz się na gałąź `master` (`git checkout ...`)
5. Pobierz zmiany z repozytorium `apohllo` (`git pull ...`).
5. Przełącz się na gałąź `new-feature-xxx` (`git checkout ...`).
5. Wykonaj rebase względem gałęzi `master` (`git rebase master`).
5. Rozwiąż konflikty.
9. Po zmergowaniu pierwszego pull-request wykonaj drugi pull-request, w którym dopisujesz **kolejne** zdanie z Pana
   Tadeusza.
10. Aktualizuj pull-requesty, aż twój pull-request zostanie zmergowany.


## Przydatne odnośniki

* https://git-scm.com/book/pl/v2 - oficjanlny podręcznik Gita, częściowo przetłumaczony na język polski
* https://guides.github.com/introduction/git-handbook/ - wprowadzenie do Gita, wyjaśnienie najważniejszych koncepcji
* https://www.atlassian.com/git/tutorials/learn-git-with-bitbucket-cloud - inne wprowadzenie do Gita, zawiera dużo
  ilustracji
* http://gitexercises.fracz.com/ - zaawansowany, zgrywalizowany samouczek do Gita, autorstwa dr inż. Wojtka Frącza (absolwenta
  Katedry Informatyki)
