package ReflectionAPI.tasks;
@Table(name = "car")
public class CarAPI {
    @Column(name = "brand")
    private String brand;
    @Column (name = "model")
    private String model;

    public CarAPI(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "CarAPI{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
