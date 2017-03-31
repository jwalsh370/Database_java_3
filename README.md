# _hair-salon_

#### _hair-salon, 03-31-2017_

#### By _**Jahan Walsh**_

## Description
_This Java application allows a user to create Stylists and Clients for a hair salon. It also allows users to update and delte Stylists or Clients based on need._


## Specifications

| Behavior                   | Input Example     | Output Example    |
| -------------------------- | -----------------:| -----------------:|
|App adds Stylist|Name|Name|
|App gets Stylist Name|Stylist Name|John|
|App gets Stylist Client|Stylist Client 1|Client 1|
|App adds Stylist Client|Stylist Client 2 Add|Client1, Client2|
|App gets Client information|Stylist(John) Client1|John-Tom(Client1)|

## Technologies
#### _This webpage was made with several technologies.
#### * Java
#### * Gradle
#### * Github
#### * Atom
#### * Junit
#### * Spark
#### * Velocity Template Engine_

## Setup/Installation Requirements

*_open Terminal_
* _Clone the repository_
* Run psql
* Create Database hair-salon
* \c hair-salon
* CREATE TABLE stylists(id serial PRIMARY KEY, name varchar);
* CREATE TABLE clients(id serial PRIMARY KEY, name varchar);
*import hair_salon.sql
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_


### License

Copyright (c) 2017 **_Jahan Walsh_**

This software is licensed under the MIT license.
