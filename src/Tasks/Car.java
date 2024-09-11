package Tasks;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car ("Audi", "A6", 2018);
        car.displayCarInfo();


    }



}