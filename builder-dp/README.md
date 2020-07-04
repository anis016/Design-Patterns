# Builder Design Patterns

A `Builder Design Patterns` can be used to construct `a complex object step-by-step` and finally returns the resulting 
constructed object.

&nbsp;&nbsp; The Builder pattern helps us in creating immutable classes with large set of state attributes.

Definition of the Builder pattern [[wiki][wiki]] 
> The intent of the Builder design pattern is to separate the construction of a complex object from its representation.
By doing so the same construction process can create different representations.

Consider we need to create an `User` object. The `User` object can have many dependencies like first name, last name, 
age, address, phone, and so on. Now, we need to create an `User` object with these dependencies.

One way of instantiating an object of `User` class is by passing different dependencies to the constructor.
We can have a bunch of different overloaded constructors with different combinations of parameters to create an object.
It could be possible that some parameters are necessary, but some are optional.

&nbsp;&nbsp; Another way could be to use an object that receives each initialization parameter step-by-step and then
returns the resulting constructed object at once. This could be done by utilizing the Builder pattern.
* `Encapsulate`, `create`, and `assemble` the parts of a complex object in a separate `Builder` object.
* Delegate the object creation to a `Builder` object instead of creating the objects directly.


# Resource
[wiki]: https://en.wikipedia.org/wiki/Builder_pattern
* https://dzone.com/articles/creational-design-patterns-builder-pattern
* https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
* https://stacktips.com/tutorials/design-patterns/builder-design-pattern-java
* https://en.wikipedia.org/wiki/Builder_pattern