# questostoreapi

REST API for our previous project - Questo Store - written in Spring Boot framework, with basic security layer. 
We used Swagger for frontend and deployed it on Heroku. 
Project can be seen here
https://questo-store-api.herokuapp.com/swagger-ui.html#/
API allows to send requests after login as one of two defined user types: user (login: "user", password: "password") or admin (login: "admin", password: "password"). User has limited acces to send only GET requests, admin can also send POST, PUT and DELETE requests. 
After 15 minuts of beeing unused aplication resets database and itself.
