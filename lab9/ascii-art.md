# ASCII Art

Projekt polega na napisania programu, który na wejściu dostaje wejściu
zdjęcie i przetwarza je w odpowiedniu sposób.

### Opis działania
Każdy pixel w zdjęciu ma 4 wartości kanałów kolorów (Red, Green, Blue, Alpha).
Możemy wykorzystać ten fakt mapując wybrane przedziały kanałów do określonych znaków ASCII.

### Przykładowy rezultat
![ascii-img](https://www.google.com/search?q=ascii+art&sxsrf=ACYBGNQ6zPEgmzkou4elI32crCbM5qaqmA:1575911615752&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjXnregiKnmAhVriYsKHeJwAKoQ_AUoAXoECBEQAw&biw=1920&bih=937#imgrc=st0vu62IXORtCM:)

### Możliwe rozbudowania
- Nasze zdjęcie zostało przetwarzone do dwuwymiarowej tablicy znaków. 
Można zatem zrobić eksperymentalną animację na takim tworze np:
    - Iść jak fala od środka do brzegu 
    - Przy przechodzeniu przez komórki robić "flipa" znaków.   