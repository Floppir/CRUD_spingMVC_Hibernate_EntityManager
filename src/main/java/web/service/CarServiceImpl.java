package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCarsByQuantity(List<Car> cars, int quantity) {
        return cars.stream().limit(quantity).collect(Collectors.toList());
    }

    @Override
    public List<Car> getNewListCarsForTest() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, 10000));
        cars.add(new Car("model2", 2, 20000));
        cars.add(new Car("model3", 3, 30000));
        cars.add(new Car("model4", 4, 40000));
        cars.add(new Car("model5", 5, 50000));
        return cars;
    }

}
