package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, 10000));
        cars.add(new Car("model2", 2, 20000));
        cars.add(new Car("model3", 3, 30000));
        cars.add(new Car("model4", 4, 40000));
        cars.add(new Car("model5", 5, 50000));

        List<Car> carList = carService.listCarsByQuantity(cars, allCars);

        model.addAttribute(carList);

        return "cars";
    }
}
