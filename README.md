W ramach przykładu stwórzmy aplikację, w której na stronie głównej wyświetlimy formularz z jednym polem tekstowym na
hasło. Formularz będzie wysłany pod adres /secret, które będzie obsługiwane przez serwlet, którego zadaniem będzie
wyświetlenie tajnej wiadomości.

Zdefiniujemy także dwa filtry:

AuthenticationFilter - będzie odpowiedzialny za weryfikację hasła z formularza. Jeżeli będzie ono inne niż "h@rdPass",
to wyślemy w odpowiedzi kod 403 Forbidden, SecurityLoggingFilter - filtr, który będzie logował adresy IP i user-agenta
każdego żądania, które będzie przetwarzane przez naszą aplikację.