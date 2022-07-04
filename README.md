# About this repo

This repo represents my learning around REST API creation using Java and Spring Boot.

# Structure of this repo

There are three pieces to the project.

1. The `employee` sub-packages, ie `controller.employee` and `repository.employee`
    1. The code that lives here was created following along with the
       tutorial [How to Create REST APIs with Java and Spring Boot](https://www.twilio.com/blog/create-rest-apis-java-spring-boot)
       by Nida Khan, published by Twilio
2. The `restaurant` sub-packages ie `model.restaurant` and `repository.restaurant`
    1. This code was created following along with
       the [Building a JSON:API Backend with Crnk](https://howtojsonapi.com/spring.html)
3. The `pokemon` sub-packages ie `model.pokemon`
    1. This code represents my own attempts to explore REST and JSON:API using the publicly
       accessible [Pokemon API](https://pokeapi.co/docs/v2#info)

# More about the `restaurant` code and JSON:API

## JSON:API

After I completed the Twilio tutorial (linked above) I wanted to explore adding more structure to my API requests and
responses.

I have some testing experience with the [JSON:API spec](https://jsonapi.org/), and have seen the value of structuring
JSON req/res data in this way.

To illustrate the difference, here is my GET request to my /employees endpoint, which does not use JSON:API structuring:

```json
[
  {
    "id": 1,
    "firstName": "Nida",
    "lastName": "Khan",
    "emailId": "example1@gmail.com"
  },
  {
    "id": 2,
    "firstName": "Andie",
    "lastName": "Johnson",
    "emailId": "abc1@gmail.com"
  }
]
```

VS my request to the /restaurant endpoing, which does use JSON:API:

```json
{
  "data": {
    "id": "3",
    "type": "pokemon",
    "links": {
      "self": "http://localhost:8080/pokemon/3"
    },
    "attributes": {
      "name": "Bulbasaur",
      "pokeTypeOne": "Grass",
      "pokeTypeTwo": "Poison",
      "total": 318,
      "hp": 45,
      "attack": 49,
      "defense": 49,
      "special_attack": 65,
      "special_defense": 65,
      "speed": 45,
      "generation": 1,
      "legendary": false
    }
  },
  "links": {
    "self": "http://localhost:8080/pokemon/3"
  }
}

```

## CRNK

After searching for a tutorial for creating REST calls according to JSON:API spec I
found [Building a JSON:API Backend with Crnk](https://howtojsonapi.com/spring.html) and followed along with it to create
the `restaurant` subpackages - with quite a few changes.

## Changes I had to make to this tutorial

1. Dependency management
    1. The tutorial instructs you to specify `jcenter()` as the dependency repository rather than `mavenCentral()`,
       but `jcenter()` is deprecated with Gradle 7, and this project uses 7.4
    2. Rather than downgrade Gradle (which would have arguably been simpler), I found the dependencies in mavenCentral,
       the main difference there being that I had to specify the version number to get it to resolve appropriately.
2. Replace in-memory database with MySql database
    1. The tutorial code saves data you create with this service in-memory in a hashmap.
    2. To save the data instead to a MySQL schema, I had to (as in the other projects) use the JpaRepository interface
       in addition to the ResourceRepositoryBase class that I extend (in my RestaurantService class)

# More about the Pokemon code

The goals for this set of code were:

1. To use the public Pokemon API
2. To explore the possibilities and limitations of the CRNK library to make an API

## Issues and questions

1. Trying to use an ENUM as a field in my Pokemon model class
    1. In the `model.pokemon` package you will find an ENUM called `PokeType` which I wanted to use in the typeOne and
       typeTwo fields on the class
    2. In trying to POST data to the endpoint I got the
       error `java.lang.AssertionError: Can not construct instance of java.lang.Enum`
    3. Persisting enums should be relatively straightforward a la this
       article: (https://dzone.com/articles/mapping-enums-done-right)
    4. You can find my PokemonConverter and the commented-out code that I tried to implement in the Pokemon entity class
       and Converter class in the `model.pokemon` package
