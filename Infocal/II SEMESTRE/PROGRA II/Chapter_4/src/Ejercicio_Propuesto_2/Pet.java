package Ejercicio_Propuesto_2;

public class Pet {
    // Perros y Gatos
    protected String name; protected int age; protected String color;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

class Dog extends Pet{
    protected float weight; protected boolean bite;
    public Dog(String name, int age, String color, float weight, boolean bite){
        super(name, age, color);
        this.weight = weight;
        this.bite = bite;
    }
    public static void soundDog(){
        System.out.println("LOS PERROS LADRAN WOOF WOOF LEITO LADRA WAU WAU");
    }
}

class Cat extends Pet{
    protected float heightJump; protected float longJump;
    public Cat(String name, int age, String color, float heightJump, float longJump) {
        super(name, age, color);
        this.heightJump = heightJump;
        this.longJump = longJump;
    }

    public static void catSound(){
        System.out.println("LOS GATOS COMO EL MARVIN MAÚLLAN Y RONRONEAN COMO EL RAFITA");
    }
}

class BigDog extends Dog {
    enum raceDog{PASTOR_ALEMAN, DOBERMAN, ROTWEILLER} protected raceDog racesBigDog;
    public BigDog(String name, int age, String color, float weight, boolean bite, raceDog racesBigDog) {
        super(name, age, color, weight, bite);
        this.racesBigDog = racesBigDog;
    }
}

class MediumDog extends Dog {
    enum raceDog{COLLIE, DALMARA, BULLDOG, GALGO, SABUESO} protected raceDog racesMediumDog;
    public MediumDog(String name, int age, String color, float weight, boolean bite, raceDog racesMediumDog) {
        super(name, age, color, weight, bite);
        this.racesMediumDog = racesMediumDog;
    }
}

class SmallDog extends Dog {
    enum raceDog{CANICHE, YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA} protected raceDog racesSmallDog;
    public SmallDog(String name, int age, String color, float weight, boolean bite, raceDog racesSmallDog) {
        super(name, age, color, weight, bite);
        this.racesSmallDog = racesSmallDog;
    }
}

class ShortHair extends Cat{
    enum raceCat{AZUL_RUSO, BRITANICO, MANX, DEVON_REX} protected raceCat raceShortHairCat;

    public ShortHair(String name, int age, String color, float heightJump, float longJump, raceCat raceShortHairCat) {
        super(name, age, color, heightJump, longJump);
        this.raceShortHairCat = raceShortHairCat;
    }
}

class WithoutHair extends Cat{
    enum raceCat{ESFINGE, ELFO, DONSKOY} protected raceCat raceWithoutHairCat;

    public WithoutHair(String name, int age, String color, float heightJump, float longJump, raceCat raceWithoutHairCat) {
        super(name, age, color, heightJump, longJump);
        this.raceWithoutHairCat = raceWithoutHairCat;
    }
}

class LongHair extends Cat{
    enum raceCat{ANGORA, HIMALAYO, BALINPES, SOMALÍ} protected raceCat raceLongHairCat;
    public LongHair(String name, int age, String color, float heightJump, float longJump, raceCat raceLongHairCat) {
        super(name, age, color, heightJump, longJump);
        this.raceLongHairCat = raceLongHairCat;
    }
}

class TestPet{
    public static void main(String[] args) {
        BigDog bigDog_1 = new BigDog("Lukas", 13, "Blanco", 30, false, BigDog.raceDog.PASTOR_ALEMAN);
        MediumDog mediumDog_1 = new MediumDog("Pedro", 12, "Negro", 20, false, MediumDog.raceDog.SABUESO);
        SmallDog smallDog_1 = new SmallDog("Juana", 14, "Amarillo", 10, true, SmallDog.raceDog.CHIHUAHUA);
        BigDog.soundDog();
        MediumDog.soundDog();
        SmallDog.soundDog();
        ShortHair catShortHair_1 = new ShortHair("Perla",10,"BLANCO",15,13, ShortHair.raceCat.AZUL_RUSO);
        WithoutHair catWithoutHair_1 = new WithoutHair("Juan",12,"NEGRO",10,13, WithoutHair.raceCat.ESFINGE);
        LongHair catLongHair_1 = new LongHair("Jose",9,"AMARILLO",30,20, LongHair.raceCat.ANGORA);
        ShortHair.catSound();
        WithoutHair.catSound();
        LongHair.catSound();
    }
}