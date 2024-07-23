public class PlanetMain {
    public static void main(String[] args) {
        Planet planet1 = new Planet(
            "Tierra", 1, 5.9736E24, 1.08321E12, 12742,
            150000000, Planet.type.TERRESTRE, true);
        Planet.separators();
        planet1.dataprint();
        System.out.println("Densidad del planeta: " + planet1.densityCalculator());
        System.out.println("Es planeta exterior: " + planet1.isOuterPlanet());
        Planet.separators();
        System.out.println(" ");
        Planet planet2 = new Planet(
                "Júpiter", 79, 1.899E27, 1.4313E15, 139820,
                750000000, Planet.type.GASEOSO, true);
        Planet.separators();
        planet2.dataprint();
        System.out.println("Densidad del planeta: " + planet2.densityCalculator());
        System.out.println("Es planeta exterior: " + planet2.isOuterPlanet());
        Planet.separators();
    }
}
