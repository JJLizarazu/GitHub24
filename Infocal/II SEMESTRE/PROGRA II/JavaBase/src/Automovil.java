import java.util.*;
class mainCar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Automovil car1 = new Automovil("Ford", 2018, 3, Automovil.fuelTypes.diesel,
        Automovil.carTypes.Ejecutivo, 5, 6, 250, Automovil.colorTypes.Negro, "Automático", 0);
        car1.dataPrint();
        car1.setActualVelocity(100);
        Resources.dSeparators();
        System.out.println("Velocidad actual: " + car1.actualVelocity);
        Resources.dSeparators();
        car1.speedUp(160); // VELOCIDAD MÁXIMA 250
        car1.speedUp(160); // VELOCIDAD MÁXIMA 250
        System.out.println("Velocidad Actual: " + car1.actualVelocity);
        car1.decelerate(50);
        System.out.println("Velocidad Actual: " + car1.actualVelocity);
        car1.curb();
        System.out.println("Velocidad Actual: " + car1.actualVelocity);
        Resources.dSeparators();
        car1.decelerate(20);
        Automovil.finesCar(car1.fines);
    }
}

public class Automovil {
    String brand, transmission;
    int model, motor, numberDoors, numberSeat, maxVelocity, actualVelocity, fines;
    enum fuelTypes {Gasolina, bioetanol, diesel, biodiesel, Gas_Natural}
    fuelTypes typeFuel;
    enum carTypes {Ciudad, Subcompacto, Compacto, Familiar, Ejecutivo, Suv}
    carTypes typeCar;
    enum colorTypes {Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta}
    colorTypes typeColor;

    Automovil(String brandCar, int modelCar, int motorCar, fuelTypes typeFuelCar, carTypes typeCarA,
              int numberDoorsCar, int numberSeatCar, int maxVelocityCar, colorTypes typeColorCar, String transmissionCar, int finesCar){
        this.brand = brandCar;
        this.model = modelCar;
        this.motor = motorCar;
        this.typeFuel = typeFuelCar;
        this.typeCar = typeCarA;
        this.numberDoors = numberDoorsCar;
        this.numberSeat = numberSeatCar;
        this.maxVelocity = maxVelocityCar;
        this.typeColor = typeColorCar;
        this.transmission = transmissionCar;
        this.fines = finesCar;
    }

    String getBrand(){
        return brand;
    }
    String getTransmission(){return transmission;}
    int getFines(){return fines;}

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
    void setFines(int finesCar){this.fines = finesCar;}
    void setTransmission(String transmissionCar){this.transmission = transmissionCar;}
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
            System.out.println("¡NO PUEDES IR MAS RÁPIDO!");
            System.out.println("OBTUVISTE UNA MULTA ¡QUIETO!");
            fines++;
            finesCar(fines);
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

    static void finesCar(int fines){
        Resources.dSeparators();
        System.out.println("  ->> Multas: " + fines + " <<-");
        Resources.dSeparators();
    }
    void dataPrint(){
        Resources.dSeparators();
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de Combustible: " + typeFuel);
        System.out.println("Tipo de Automóvil: " + typeCar);
        System.out.println("Color de Auto: " + typeColor);
        System.out.println("Número de Asientos: " + numberSeat);
        System.out.println("Número de Puertas: " + numberDoors);
        System.out.println("Velocidad máxima: " + maxVelocity);
        System.out.println("Tipo de transmisión: " + transmission);
    }
}