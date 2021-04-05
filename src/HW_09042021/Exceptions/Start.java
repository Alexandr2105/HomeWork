package HW_09042021.Exceptions;

public class Start {
    public static void main(String[] args) {
        Car car1=new Car("Audy",250,67000);
        Car car2=new Car("BMW",320,73000);
        Car car3=new Car("Toyota",280,70000);
        try {
            car1.start();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try {
            car2.start();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try {
            car3.start();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
