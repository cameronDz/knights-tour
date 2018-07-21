# Knight's Tour Application

## Application Overview
Basic Java application that prompts a user for a position on a chess board, then calculates a Knight's Tour using Warnsdorff's simple algorithm.

## Application Development
Initial creation of application was simple command line implementation for a university computer science course final project.

## Setup, Building, and Deployment
Application utilizes Maven, and is run through a .jar file. In order to run the application, pull the project repository down from GitHub. Then, from a terminal in the root of the project, enter the following command:

```
mvn clean package 
```

To run the .jar file, executing the program, run the following comman in the same terminal after the Maven command builds the projects successfully:

```
java -jar target/kightsTourApp.jar
```

## Application TODO List
Below are a list of wish list/TODO items for updates to the application.

- [ ] Clean up technical package.
- [ ] Add exception handling.
- [ ] Add unit tests.

## Updates List

###### 21 July 2018
Initial commit to GitHub with cleaned up project.