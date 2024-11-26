package Model.Car;

public class Car {
    static String brand;
    static String model;
    static int year;
    static int miles;
    static double price;
    static String status;
    static String image;
    static String purpose;
    static int id_usuary;

    public Car(String brand, String model, int year, int miles,String purpose,double price, String status, String image, int id_usuary) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.miles = miles;
        this.purpose = purpose;
        this.price = price;
        this.status = status;
        this.image = image;
        this.id_usuary = id_usuary;
    }

    public static int getMiles() {
        return miles;
    }

    public static void setMiles(int miles) {
        Car.miles = miles;
    }

    public static int getId_usuary() {
        return id_usuary;
    }

    public static void setId_usuary(int id_usuary) {
        Car.id_usuary = id_usuary;
    }

    public static String getPurpose() {
        return purpose;
    }

    public static void setPurpose(String purpose) {
        Car.purpose = purpose;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Car.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Car.year = year;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Car.price = price;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        Car.status = status;
    }

    public static String getImage() {
        return image;
    }

    public static void setImage(String image) {
        Car.image = image;
    }

}
