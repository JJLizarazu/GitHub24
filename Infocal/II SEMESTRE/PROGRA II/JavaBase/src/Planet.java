public class Planet{
    String name;
    int satelliteQuantity, diameter, sunDistance;
    double mass, volume;
    enum type {GASEOSO, TERRESTRE, ENANO};
    type planetType;
    boolean isObservable = false;

    Planet(String namePlanet, int satelliteQuantity, double massPlanet, double volumePlanet,
                int diameterPlanet, int sunDistance, type planetType, boolean isObservable){
        this.name = namePlanet;
        this.satelliteQuantity = satelliteQuantity;
        this.mass = massPlanet;
        this.volume = volumePlanet;
        this.diameter = diameterPlanet;
        this.sunDistance = sunDistance;
        this.planetType = planetType;
        this.isObservable = isObservable;
    }

    void dataprint(){
        System.out.println("Nombre del Planeta: " + name);
        System.out.println("Cantidad de satélites: " + satelliteQuantity);
        System.out.println("Masa del planeta: " + mass);
        System.out.println("Volumen del planeta: " + volume);
        System.out.println("Diámetro del planeta: " + diameter);
        System.out.println("Distancia al sol: " + sunDistance);
        System.out.println("Tipo de planeta: " + planetType);
        System.out.println("Es Observable: " + isObservable);
    }

    double densityCalculator(){
        return mass/volume;
    }

    boolean isOuterPlanet(){
        float limit = (float) (149597870 * 3.4);
        if (sunDistance > limit){
            return true;
        } else {
           return false;
        }
    }

    public static void separators(){
        System.out.println("====================");
    }

}
