# Laboratorium nr 10

Implementacja aplikacji webowej.

1. Zapoznaj się z dokumentacją biblioteki Spark dostępnej pod adresem: 
   http://sparkjava.com/documentation.html
2. Opracuj aplikację webową, która będzie posiadała następujące cechy:
  * po wejściu na stronę startową aplikacja powinna pytać użytkownika o imię i zapisywać je w cookie
  * po podaniu imienia użytkownika powinna wyświetlać się lista dostępnych kanałów
  * użytkownik klikając na nazwę kanału dołącza do konwersacji prowadzonej na tym kanale
  * pod listą kanałów powinien być dostępny guzik "Utwórz nowy kanał"
  * utworzenie nowego kanału powoduje, że dany kanał staje się dostępny dla innych
    (wyświetla się na liście dostępnych kanałów - po wejściu na główną stronę aplikacji)
  * dołączenie do kanału umożliwia wysyłanie wiadomości - wiadomość ta jest dostarczana 
    do wszystkich osób, które są na danym kanale
  * na kanale powinien być guzik pozwalający na opuszczenie kanału
  * aplikacja powinna również posiadać wbudowany kanał "chatbot"
  * chatbot powinien udzielać odpowiedzi na następujące pytania:
    - Która godzina?
    - Jaki dziś dzień tygodnia?
    - Jaka jest pogoda w Krakowie?
3. Realizacja chatu powinna opierać się o mechanizm WebSocketów.
4. Restart serwera powinien wymazywać listę wszystkich kanałów. Tzn. kanały i wiadomości
   _nie mają być_ zapisywane w żadnej bazie danych.
5. Implementując aplikację można oprzeć się na przewodniku:
   https://sparktutorials.github.io/2015/11/08/spark-websocket-chat.html
