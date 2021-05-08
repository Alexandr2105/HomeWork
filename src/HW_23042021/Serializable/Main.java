package HW_23042021.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\Serializable\\car.dat"));
            Car car1 = new Car("Toyota", 150, 16000);
            objectOutputStream.writeObject(car1);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\TeachMeSkills\\MyFirstJavaProject\\src\\HW_23042021\\Serializable\\car.dat"));
            Car car2 = (Car) objectInputStream.readObject();
            System.out.printf("Model-%s, speed-%d, price-%d", car2.getModel(), car2.getSpeed(), car2.getPrice());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
