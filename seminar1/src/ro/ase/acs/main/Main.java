package ro.ase.acs.main;

import ro.ase.acs.clase.Car;
import ro.ase.acs.clase.Vehicle;
import ro.ase.acs.interfaces.Taxable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw", 2001, 1500);
        Vehicle vehicle = car;
        System.out.println(vehicle.computerFinalPrice());
        Taxable t = car;
        System.out.println(t.compute());
    }
}