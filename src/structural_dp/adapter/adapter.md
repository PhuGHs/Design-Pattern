It will have **4 elements** in Adapter design patterns

1. ***Client***: is a class that contains the existing business logic of a program
2. ***Client interface***: describes a protocol that other classes must follow to be able to collaborate with the client code.
3. ***Service***: is some useful classes (usually 3 party or legacy). The **client can't use** them directly because it has an incompatible interface.
4. ***Adapter***: is a class that's able to work along with both the client and the service. It implements the client interface, while wrapping the service object. The adapter receives calls from the client via the client interface and translates them into calls to the wrapped service object in a format it can understand.

***
The client code doesn't get coupled to the concrete adapter class as long as it works with the adapter via the client interface. Thanks to this, you can introduce new types of adapters into the program without breaking the existing client code. This can be useful when the interface of the service class gets changed or replaced: you can just create new adapter class without changing the client code.
***

![Adapter design pattern](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png "Adapter dp")