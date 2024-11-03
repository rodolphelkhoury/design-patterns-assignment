Design Patterns Assignment

Adapter Pattern (PrintAdapter)
Goal:
- The Adapter pattern makes incompatible interfaces work together.
How It Works Here: 
- We have a MessagePrinter class with a method called showMessage(), but we need it to work with a print() method. So, we use PrintAdapter to bridge the gap.
Key Classes:
- PrintTarget (the target interface)
- MessagePrinter (existing class with the method we want to adapt)
- PrintAdapter (connects MessagePrinter to PrintTarget)

Bridge Pattern (Shape)
Goal:
- The Bridge pattern separates an abstraction from its implementation so they can change independently.
How It Works Here:
- We create a Shape class that uses a DrawingAPI interface. Then, we have a Circle that can draw using different DrawingAPI implementations.
Key Classes:
- Shape (abstract class)
- DrawingAPI (interface for drawing)
- Circle (concrete shape that uses DrawingAPI)
- DrawingAPI1 and DrawingAPI2 (two different drawing implementations)

Decorator Pattern (Beverage)
Goal:
- The Decorator pattern lets you add extra features to an object without changing its structure.
How It Works Here:
- We start with a basic Beverage (like Coffee) and then wrap it with decorators (like Milk and Sugar) that add more details.
Key Classes:
- Beverage (interface for all drinks)
- Coffee (basic drink)
- BeverageDecorator (base decorator)
- Milk, Sugar, and Honey (concrete decorators that add features)