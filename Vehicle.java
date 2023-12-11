
public class Vehicle {
    String Brand;
    String Model;
    String Year;
    String Weight;
    String Wheels;
    public void Accelerate() {
        System.out.println("I'm putting the pedal to the metal");
    }
    public void Brake() {
        System.out.println("Woah! Slow down boy!");
    }
    public void Describe() {
        System.out.println(Brand);
        System.out.println(Model);
        System.out.println(Year);
        System.out.println(Weight);
        System.out.println(Wheels);
    }
    public Vehicle(String brand, String model, String year, String weight, String wheels) {
        Brand = brand;
        Model = model;
        Year = year;
        Weight = weight;
        Wheels = wheels;
    }
}

