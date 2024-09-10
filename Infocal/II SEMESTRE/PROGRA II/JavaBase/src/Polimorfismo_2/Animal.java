package Polimorfismo_2;

public abstract class Animal {
    protected String sonido, alimento, habitat, nombreCientifico;
    public abstract String getNombreCientifico();
    public abstract String getAlimento();
    public abstract String getHabitat();
    public abstract String getSonido();
}

abstract class Canido extends Animal{
}

class Perro extends Canido{

    public String getSonido(){
        return "Woof Woof";
    }

    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }

    public String getAlimento() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Doméstico";
    }
}

class Lobo extends Canido{
    public String getSonido(){
        return "Auuuuuuuuuu";
    }

    public String getNombreCientifico() {
        return "Canis lupus";
    }

    public String getAlimento() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Bosque";
    }
}

abstract class Felino extends Animal{
}

class Leon extends Felino{
    public String getSonido(){
        return "Rugido";
    }

    public String getAlimento() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Praderas";
    }

    public String getNombreCientifico() {
        return "Panthera leo";
    }
}

class Gato extends Felino{
    public String getSonido(){
        return "Miaw";
    }

    public String getAlimento() {
        return "Ratones";
    }

    public String getHabitat() {
        return "Doméstico";
    }

    public String getNombreCientifico() {
        return "Felis silvestrys catus";
    }
}

class Test{
    public static void main(String[] args) {
     Animal[] animales = new Animal[4];
     animales[0] = new Gato();
     animales[1] = new Perro();
     animales[2] = new Lobo();
     animales[3] = new Leon();
     System.out.println("=========================================");
        for (int i = 0 ; i < animales.length; i++){
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonidi: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimento());
            System.out.println("Hábitat: " + animales[i].getHabitat());
            System.out.println("=========================================");
        }
    }
    
}