class Car {
private String make;
private String model;
public Car(String make, String model) {
this.make = make;
this.model = model;
}
public void start() {
System.out.println("Starting the car.");
}
}
public class Main {
public static void main(String[] args) {
Car car = new Car("Toyota", "Camry");
car.start();
}
}
/*there is no method car.stop() but that method is called so just remove the method car.stop() */