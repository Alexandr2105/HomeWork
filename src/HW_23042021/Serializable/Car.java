package HW_23042021.Serializable;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    int speed;
    int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }
}
