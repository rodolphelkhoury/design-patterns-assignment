interface Beverage {
    String getDescription();
    double cost();
}

class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}

abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}

class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }
}

public class DecoratorPattern {
    public static void run() {
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.cost());
    }
}
