## Java

Polymorphism: Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
Inheritance is tightly coupled by default.
Inheritance relationship between objects : IS A ....


Java Encapsulation: hide sensitive data from users.
    1. private instance variables with getter and setter methods

Java composition: 
Relationship between objects: HAS A ...


---

## SOLID

Single responsibility principle
Open only for extension (need additional functionality? use the decorator pattern / kotlin: extension methods)
Liskov substitution (a child class should be able to do whatever the parent class can)
Interface segregation principle (splitting up the interfaces in smaller ones)
Dependency inversion (high level modules should not depend on low level modules. They should both depend on an abstraction)

---

## CUPID

Composable: plays well with other
Unix philosophy: does one thing well
Predictable: does what you expect
Idiomatic: feels natural
Domain-based: the solution domain models the problem domain in language and structure

Source: https://dannorth.net/cupid-for-joyful-coding/