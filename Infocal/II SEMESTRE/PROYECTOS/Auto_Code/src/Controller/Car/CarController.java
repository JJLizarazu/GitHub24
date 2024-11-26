package Controller.Car;

import Model.Car.CarDAO;

import javax.swing.*;

public class CarController extends CarDAO {

    public CarController(String brand, String model, int year, int miles,String purpose, double price, String status, String image, int id_usuary) {
        super(brand, model, year, miles, purpose, price, status, image, id_usuary);
    }

    public static void setCar(JTextField brand, JTextField model, JTextField year, JTextField miles, JTextField price) {
        CarDAO.setBrand(brand.getText());
        CarDAO.setModel(model.getText());
        CarDAO.setMiles(Integer.parseInt(miles.getText()));
        CarDAO.setYear(Integer.parseInt(year.getText()));
        CarDAO.setPrice(Double.parseDouble(price.getText()));
        CarDAO.setStatus("Disponible");
    }

}
