# Ticket-app
## List of content
- [Brief description](#brief-description-)
- [Features](#features)
- [Stack of technologies](#stack-of-technologies)
- [Installing](#installing)
- [Getting started](#getting-started)
- [Authors](#authors)

## Brief description
```
Hello everyone!
It is my web-application of ticket-app. 
Where you can authenticate like user of the app and review all sessions. 
Also you can add ticket on something sessions to your user.
You can add tickets for some number of sessions (support multy sessions).
The application support CRUD operations.
Main focusing on back-end in Java.

Project implements MVC pattern, ACID, REST and have 3-tier arhitecture:
- Data tier - MySQL DB and DAO's;
- Application Tier - business logic in Java services;
- Presentation Tier - Servlet Controllers, JSP pages;
```
## Features
### For all
- registration __"/register"__
### For Admin and User
- get information about cinema halls __"/cinema-halls"__
- get all list of movies __"/movies"__
- get available sessions __"/movie-sessions/available"__
### Admin
- add new cinema hall __"/cinema-halls"__
- add new movie __"/movies"__
- add new session __"/movie-sessions"__
- update parameters of session __"/movie-sessions/{id}"__
- delete the session __"/movie-sessions/{id}"__
- get information about User by email __"/users/by-email"__
### User
- get history all the user orders __"/orders"__
- complete order for user __"/orders/complete"__
- add session to cart of User __"/shopping-carts/movie-sessions"__
- get information about cart of User __"/shopping-carts/by-user"__

## Stack of technologies
- Java 17
- MySQL 8.0
- Servlet 4.0.1
- Maven 4.0
- Tomcat 10.1.8
- Hibernate 5.6.14
- Spring 5.3.20
- Spring security 5.6.10

## Installing
1. Download project from this repository and add to IDE as Maven project;
   (copy SSH link and in IDE will create clone : File -> New -> Project from Version Control..., add link to field of URL)
2. Install and configure Tomcat;
   (Edit configurations -> "+" -> Tomcat server(local) : push on "Fix" button and choose "tax-service war exploded")
   __Pay attention:__ in the "Application context" field have to only "/"
3. Install and configure MySQL;
4. Make sure all dependencies from pom.xml are loaded;

## Getting started
First of all, you should edit the file __"db.properties"__ which you can find in "resources" folder.
Add your parameters instead "YOUR DRIVER", "YOUR_URL", "YOUR_USERNAME" and "YOUR_PASSWORD".
Run project with using Tomcat (__pay attention:__ the program has class __"DataInitializer"__ which create roles "ADMIN" and "USER" by default and one User like "ADMIN").
After that you can begin your familiarity with the program.

## Authors
[Vitalii Romanyuk](https://github.com/vromanyuk)