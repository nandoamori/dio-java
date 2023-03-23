package test;

import dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 2018), new Car("Red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Red"));

        System.out.println(greenCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return  filteredList;
    }
}

