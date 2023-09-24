package web.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private String model;

    private int series;

    private int price;

    public Car(String model, int series, int price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public Car() {
    }
}
