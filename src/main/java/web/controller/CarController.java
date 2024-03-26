package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int howMuch, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VW", "Polo", 69));
        cars.add(new Car("Bugatti", "Veyron", 407));
        cars.add(new Car("Lada", "Vesta", 13));
        cars.add(new Car("Vedro", "Plast", 666));
        cars.add(new Car("Porsche", "911", 300));
        model.addAttribute("cars", CarService.getNCars(cars, howMuch));
        return "cars";
    }

}