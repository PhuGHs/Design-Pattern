***Bridge*** is a structural design pattern that divides business logic or huge class into separate class hierarchies that can be developed independently.

***
**USAGE**

The Bridge pattern is especially useful when dealing with cross-platform apps, supporting multiple types of database servers or working with several API providers of a certain kind (for example, cloud platform, social networks, etc.)

**IDENTIFICATION**

Bridge can be recognized by a clear distinction between some controlling entity and several 

**ELEMENTS**

![Bridge design pattern](https://refactoring.guru/images/patterns/diagrams/bridge/structure-en.png "Adapter dp")

1. The **Abstraction** provides high-level control logic. It relies on the implementation object to do the actual low-level work.
2. The **Implementation** declares the interface that's common for all concrete implementations. An abstraction can only communicate with an implementation object via methods that are declared here. The abstraction may list the same methods as the implementation, but usually the abstraction declares some complex behaviors that rely on a wide variety of primitive operations declared by the implementation.
3. **Concrete implementations** contain platform-specific code.
4. **Refined abstractions** provide variants of control logic. Like their parent, they work with different implementations via the general implementation interface.
5. Usually, the **Client** is only interested in working with the abstraction. However, it's the client's job to link the abstraction object with one of the implementation objects.