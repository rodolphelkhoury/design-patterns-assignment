# Design Patterns Assignment

## Introduction

This project implements three design patterns: Adapter, Bridge, and Decorator, as discussed in class. Each pattern is demonstrated with a specific use case.

## Table of Contents
- [Adapter Pattern (PrintAdapter)](#adapter-pattern-printadapter)
- [Bridge Pattern (Shape)](#bridge-pattern-shape)
- [Decorator Pattern (Beverage)](#decorator-pattern-beverage)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [License](#license)

## Adapter Pattern (PrintAdapter)

### Goal:
The Adapter pattern makes incompatible interfaces work together.

### How It Works:
We have a `MessagePrinter` class with a method called `showMessage()`, but we need it to work with a `print()` method. So, we use `PrintAdapter` to bridge the gap.

### Key Classes:
- **PrintTarget**: The target interface.
- **MessagePrinter**: Existing class with the method we want to adapt.
- **PrintAdapter**: Connects `MessagePrinter` to `PrintTarget`.

## Bridge Pattern (Shape)

### Goal:
The Bridge pattern separates an abstraction from its implementation so they can change independently.

### How It Works:
We create a `Shape` class that uses a `DrawingAPI` interface. Then, we have a `Circle` that can draw using different `DrawingAPI` implementations.

### Key Classes:
- **Shape**: Abstract class for shapes.
- **DrawingAPI**: Interface for drawing.
- **Circle**: Concrete shape that uses `DrawingAPI`.
- **DrawingAPI1** and **DrawingAPI2**: Two different drawing implementations.

### Additional Features:
- A new shape and/or a new drawing API can be added to demonstrate the flexibility of the Bridge pattern.

## Decorator Pattern (Beverage)

### Goal:
The Decorator pattern lets you add extra features to an object without changing its structure.

### How It Works:
We start with a basic `Beverage` (like Coffee) and then wrap it with decorators (like Milk and Sugar) that add more details.

### Key Classes:
- **Beverage**: Interface for all drinks.
- **Coffee**: Basic drink implementation.
- **BeverageDecorator**: Base decorator class.
- **Milk**, **Sugar**, and **Honey**: Concrete decorators that add features.

### Additional Features:
- New types of beverages and decorators can be added to further illustrate the flexibility of the Decorator pattern.

## Usage

To run the program, execute the `Main.java` file. Ensure you have Java installed on your machine. You can compile and run the code using the following commands:

```bash
javac *.java
java Main
