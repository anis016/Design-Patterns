# Strategy Design Patterns

The `Strategy Design Patterns` defines a `family of algorithms` `encapsulates each one` 
and `makes them interchangeable`.

**Note: Identify the parts of your program that vary and separate them from what stays the same.**

* Problem with `Inheritance`
    * Hard to gain knowledge of all the behavior of a Class
    * Sub-classes can have different behavior
        * Adding new behavior in the parent-class can unintentionally affect other sub-Classes
    * Sub-class can have same behavior
        * Code duplicate
    * Forces introducing new sub-classes when new requirements arise
* Problem with `Interface`
    * No code re-use, hence all the required sub-classes needs to be updated when a behavior needs to modified    

<p align="center">
  <img src="https://raw.githubusercontent.com/anis016/Design-Patterns/master/resource/Strategy_Design_Pattern_UML.jpg?raw=true"/>
  <br>
    <em>UML class. Image Source: <a href="https://en.wikipedia.org/wiki/Strategy_pattern">Wikipedia: Strategy pattern</a></em>
</p>

In the above diagram, `Context` class `has-a` relationship with `Strategy` interface rather than `is-a` (inheritance) relationship.
The `Strategy` interface is implemented by two class - `Strategy1` and `Strategy2`. Both the class implements (`encapsulated`) `algorithm()`.
Hence `Context` class is independent of how the algorithm is called.

# Resource
* [Head First Design Patterns](https://learning.oreilly.com/library/view/head-first-design/0596007124/)
* [Strategy Pattern - Design Patterns (ep 1)](https://www.youtube.com/watch?v=v9ejT8FO-7I)
* [The strategy pattern explained using java](https://www.freecodecamp.org/news/the-strategy-pattern-explained-using-java-bc30542204e0)