import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Automovil car1 = new Automovil("Ford", 2018, 3, Automovil.fuelTypes.diesel,
        Automovil.carTypes.Ejecutivo, 5, 6, 250, Automovil.colorTypes.Negro);
        car1.dataPrint();
        car1.setActualVelocity(100);
        System.out.println("Velocidad actual: " + car1.actualVelocity);
        car1.speedUp(20);
        System.out.println("Velocidad Actual: " + car1.actualVelocity);
        car1.decelerate(50);
        System.out.println("Velocidad Actual: " + car1.actualVelocity);
        car1.curb();
        System.out.println("Velocidad Actual: " + car1.actualVelocity);
        car1.decelerate(20);
    }
}

public class Automovil {
    String brand;
    int model, motor, numberDoors, numberSeat, maxVelocity, actualVelocity;
    enum fuelTypes {Gasolina, bioetanol, diesel, biodiesel, Gas_Natural}
    fuelTypes typeFuel;
    enum carTypes {Ciudad, Subcompacto, Compacto, Familiar, Ejecutivo, Suv}
    carTypes typeCar;
    enum colorTypes {Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta}
    colorTypes typeColor;

    Automovil(String brandCar, int modelCar, int motorCar, fuelTypes typeFuelCar, carTypes typeCarA,
              int numberDoorsCar, int numberSeatCar, int maxVelocityCar, colorTypes typeColorCar){
        this.brand = brandCar;
        this.model = modelCar;
        this.motor = motorCar;
        this.typeFuel = typeFuelCar;
        this.typeCar = typeCarA;
        this.numberDoors = numberDoorsCar;
        this.numberSeat = numberSeatCar;
        this.maxVelocity = maxVelocityCar;
        this.typeColor = typeColorCar;
    }

    String getBrand(){
        return brand;
    }

    int getModel(){
        return model;
    }
    int getMotor(){
        return motor;
    }
    int getNumberDoors(){
        return model;
    }
    int getNumberSeat(){
        return model;
    }
    int getMaxVelocity(){
        return model;
    }
    int getActualVelocity(){
        return model;
    }
    fuelTypes getTypeFuel(){
        return typeFuel;
    }
    carTypes getTypeCar(){
        return typeCar;
    }
    colorTypes getTypeColor(){
        return typeColor;
    }
    void setBrand(String brandCar){
        this.brand = brandCar;
    }
    void setModel(int modelCar){
        this.model = modelCar;
    }
    void setMotor(int motorCar){
        this.motor = motorCar;
    }
    void setTypeFuel(fuelTypes typeFuelCar){
        this.typeFuel = typeFuelCar;
    }
    void setTypeCar(carTypes typeCar){
        this.typeCar = typeCar;
    }
    void setNumberDoors(int numberDoorsCar){
        this.numberDoors = numberDoorsCar;
    }
    void setNumberSeat(int numberSeatCar){
        this.numberSeat = numberSeatCar;
    }
    void setMaxVelocity(int maxVelocityCar){
        this.maxVelocity = maxVelocityCar;
    }
    void setTypeColor(colorTypes typeColorCar){
        this.typeColor = typeColorCar;
    }
    void setActualVelocity(int actualVelocityCar){
        this.actualVelocity = actualVelocityCar;
    }
    // =============================================
    void speedUp(int speedIncrease){
        if (actualVelocity + speedIncrease < maxVelocity){
            actualVelocity = actualVelocity + speedIncrease;
        } else {
            System.out.println("¡¡NO SE PUEDE IR MAS RÁPIDO!!");
        }
    }
    void decelerate(int speedDecelerate){
        if ((actualVelocity - speedDecelerate) > 0){
            actualVelocity = actualVelocity - speedDecelerate;
        } else {
            System.out.println("¡ESTAS QUIETO!");
        }
    }
    void curb(){
        actualVelocity = 0; // FRENAR
    }
    double calculateArriveTime(int distance){
        return (double) distance /actualVelocity; // DISTANCIA = VELOCIDAD * TIEMPO --> TIEMPO = DISTANCIA / VELOCIDAD
    }
    void dataPrint(){
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de Combustible: " + typeFuel);
        System.out.println("Tipo de Automóvil: " + typeCar);
        System.out.println("Color de Auto: " + typeColor);
        System.out.println("Número de Asientos: " + numberSeat);
        System.out.println("Número de Puertas: " + numberDoors);
        System.out.println("Velocidad máxima: " + maxVelocity);
    }
}