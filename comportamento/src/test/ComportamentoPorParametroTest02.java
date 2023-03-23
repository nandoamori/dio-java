package test;

import dominio.Car;
import interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 2018), new Car("Red", 2019));
    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Red"));

        System.out.println(greenCars);
    }
    private static  List<Car> filter(List<Car> cars, Predicate<Car> carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filteredCars.add(car);
            }
        }
    return  filteredCars;
    }

}

