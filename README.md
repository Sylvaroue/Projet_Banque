# ProjetBanque

This project aims to provide bank users a tool to help managing their budget.
The whole concept is to simulate the evolution of an account's balance when operations (incomes, spendings) are applied.

The application's features are the following :
* login with a user's profile and change its properties
* access the list of accounts after login

  after selecting an account :
* get automatically the balance at the end of the month and the end of the year
* add or delete an operation
* add an operation repeated each month at the same date

This repository contains the Backend part of the project. The associated Frontend can be found in the repository : "Projet_Banque_Angular".

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development purposes.


### Prerequisites

To install and run this project you need as requirements:

* [Java JDK and JRE](https://www.java.com/fr/download/) - Java 8 or a Higher version
* [Maven](https://maven.apache.org/) - Maven 2 or a Higher version


### Setting up

To download the project, clone it from github using the next command:

```
$ git clone https://github.com/Sylvaroue/Projet_Banque.git
```


## Running the tests

Navigate to the project directory and use the next command:

```
$ mvn test 
```

## Installing

To install the project use the next command:

```
$ mvn install
```

## Running

To run the project use the next command:

```
$ mvn spring-boot:run
```

## Technologies

* [Java EE](https://www.oracle.com/technetwork/java/javaee/overview/index.html) - The web framework used
* [Spring Boot](https://spring.io/projects/spring-boot) - The framework used for Microservice Architecture
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - The framework used in the persistence Layer
* [Spring WebService](https://spring.io/projects/spring-ws) - The framework used in the Rest Controller Layer
* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

* **Rouet Sylvain** - https://github.com/Sylvaroue/
* **Horlaville David**
