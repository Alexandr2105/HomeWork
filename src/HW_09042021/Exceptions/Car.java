package HW_09042021.Exceptions;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void start() throws CustomException{
        int a=(int)(Math.random()*21);
        if(a%2!=0){
            System.out.println("Автомобиль марки "+getBrand()+" завёлся!");
        }
        else{
            throw new CustomException("Автомобиль марки "+getBrand()+" не завёлся!");
        }
    }
}
