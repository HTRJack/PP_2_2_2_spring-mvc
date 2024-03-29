package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static List<Car> cars;

    public static List<Car> getNCars(int count) {

        if (cars == null) {
            initCarList();
        }

        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }

    private static void initCarList() {
        cars = new ArrayList<>();
        cars.add(new Car("VW", "Polo", 69));
        cars.add(new Car("Bugatti", "Veyron", 407));
        cars.add(new Car("Lada", "Vesta", 13));
        cars.add(new Car("Vedro", "Plast", 666));
        cars.add(new Car("Porsche", "911", 300));
    }
}
