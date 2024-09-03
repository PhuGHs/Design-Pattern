**Decorator** is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

***
***Real-world Analogy***
![Adapter design pattern](https://refactoring.guru/images/patterns/content/decorator/decorator-comic-1.png "Adapter dp")

Wearing clothes is an example of using decorators. When you're cold, you wrap yourself in a sweater. If you're still in code, you could wear a jacket on top. If it's raining, you can put on a raincoat. All of these garments "extend" your basic behaviors but aren't part of you, and you can easily take off any piece of clothing whenever you don't need it.

***
***Structure***
![Adapter design pattern](https://refactoring.guru/images/patterns/diagrams/decorator/structure.png "Adapter dp")

1. The **Component** declares the common interface for both wrappers and wrapped objects.
2. **Concrete Component** is a class of objects being wrapped. It defines the basic behavior, which can be altered by decorators.
3. The **Base Decorator** class has a field for referencing a wrapped object. The field's type should be declared as the component interface so it can contain both concrete components and decorators. The base decorator delegates all operations to the wrapped object.
4. **Concrete Decorator** define extra behaviors that can be added to components dynamically. Concrete decorators override the base decorators and execute their behavior either before or after calling the parent method.
5. The **Client** can wrap components in multiple layers of decorators, as long as it works with all objects via the component interface.
