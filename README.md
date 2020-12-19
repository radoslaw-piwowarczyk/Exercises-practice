It is an app to practice creating filters. On the main page there is a form with one text field for a password. Form will
be sent to an address /secret, which will be operated on by a servlet. Purpose of the servlet is to display the secret
message.

There will be 2 filters:

AuthenticationFilter - responsible for verification of the password sent through the form. If it were different from 
"h@rdPass", then code 403 Forbidden will be sent. 
SecurityLoggingFilter - filter to logg IP address and user-agent of every request.