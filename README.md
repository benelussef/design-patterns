# design-patterns
1- Factory design pattern:
- The Factory design pattern is a creational pattern that provides an interface for creating objects without specifying their concrete classes. It allows you to delegate the responsibility of object instantiation to subclasses or other specialized classes
- This pattern is useful when you want to create objects that have a common interface but may be of different types or require different initialization logic. By using a factory, you can centralize the creation logic and avoid the need to directly instantiate objects using constructors.
- Use Cases:
    + When you want to create objects with a common interface but vary their types or configurations.
    + When you want to centralize object creation logic to avoid code duplication.
    + When you want to decouple the client code from the concrete classes it uses.
- first example : factory pattern
 ![Blank board](https://github.com/benelussef/design-patterns/assets/89108919/f804850f-d0db-407e-a0b6-ea95dcc988f9)
- second example : abstract factory pattern

2- Prototype design pattern:
The Prototype design pattern is a creational pattern in software development that allows you to create new objects by copying an existing object, known as the "prototype". This pattern is useful when the cost of creating an object from scratch is high, and you have an existing object that is similar to what you need
Example: for example in drawing applications the prototype pattern is very used (Ex: make a copy to a rectangle)
![prototype - Page 1](https://github.com/benelussef/design-patterns/assets/89108919/621861d4-2de1-437c-8578-3f574a2d8540)

