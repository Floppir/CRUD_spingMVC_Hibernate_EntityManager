package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCarsByQuantity(List<Car> cars, int quantity) {
        return cars.stream().limit(quantity).collect(Collectors.toList());
    }
}
