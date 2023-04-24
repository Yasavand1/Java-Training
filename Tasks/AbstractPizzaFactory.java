package com.dal.designpattern;


//Employee class hierarchy
abstract class Pizzaa {
	protected String name;
	protected double cost;

	public Pizzaa(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public abstract void pizzaprice();
}

class DoubleCheesePizza extends Pizzaa {
	public DoubleCheesePizza(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of Double Cheese Margherita Pizza is " + cost);
	}
}

class PeppyPaneerPizza extends Pizzaa {
	public PeppyPaneerPizza(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of Peppy Paneer Pizza is " + cost);
	}
}

//Abstract factory interface
interface PizzaaFactory {
	public Pizzaa createPizza(String name, double cost);
}

//Concrete factory classes
class DoubleCheesePizzaFactory implements PizzaaFactory {
	public Pizzaa createPizza(String name, double cost) {
		return new DoubleCheesePizza(name, cost);
	}
}

class PeppyPaneerPizzaFactory implements PizzaaFactory {
	public Pizzaa createPizza(String name, double cost) {
		return new PeppyPaneerPizza(name, cost);
	}
}

//Client class
class PizzaPrice {
	private PizzaaFactory factory;

	public PizzaPrice(PizzaaFactory factory) {
		this.factory = factory;
	}

	public void pizzaprice(String name, double cost) {
		Pizzaa pizza = factory.createPizza(name, cost);
		pizza.pizzaprice();
	}
}

//Example usage
public class AbstractPizzaFactory {
	public static void main(String[] args) {
		PizzaaFactory DoubleCheeseMargheritafactory = new DoubleCheesePizzaFactory();
		PizzaaFactory PeppyPaneerfactory = new PeppyPaneerPizzaFactory();

		PizzaPrice doublecheesemargheritaprice = new PizzaPrice(DoubleCheeseMargheritafactory);
		doublecheesemargheritaprice.pizzaprice("Double Cheese Margherita", 1000.0);

		PizzaPrice peppypaneerprice = new PizzaPrice(PeppyPaneerfactory);
		peppypaneerprice.pizzaprice("Peppy Paneer", 500.0);
	}
}
