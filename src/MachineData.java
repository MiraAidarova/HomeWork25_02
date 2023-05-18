public class MachineData {

    private String yearOfTheVehicle;
    private String theModelOfCar;
    private int price;
    private String color;

    public MachineData() {

    }

    public MachineData(String yearOfTheVehicle, String theModelOfCar, int price, String color) {
        this.yearOfTheVehicle = yearOfTheVehicle;
        this.theModelOfCar = theModelOfCar;
        this.price = price;
        this.color = color;
    }

    public String getYearOfTheVehicle() {
        return yearOfTheVehicle;
    }

    public void setYearOfTheVehicle(String yearOfTheVehicle) {
        this.yearOfTheVehicle = yearOfTheVehicle;
    }

    public String getTheModelOfCar() {
        return theModelOfCar;
    }

    public void setTheModelOfCar(String theModelOfCar) {
        this.theModelOfCar = theModelOfCar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MachineData{" +
                "yearOfTheVehicle='" + yearOfTheVehicle + '\'' +
                ", theModelOfCar='" + theModelOfCar + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
