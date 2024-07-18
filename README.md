# Principais Tecnologias

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **OpenAPI (Swagger)**
- **Railway**

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Card card
        -Feature[] features
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limit
    }

    class Card {
        -String number
        -double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class News {
        -String icon
        -String description
    }

    User "1" *-- "1"Account
    User "1" *-- "1" Card
    User "1" *-- "N" Feature
    User "1" *-- "N" News

````
