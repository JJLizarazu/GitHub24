package Ejercicio_7;
public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico; 
    public abstract String getnombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String gethabitat();
}

abstract class Canido extends Animal {
}

class Perro extends Canido {
    public String getSonido() {
        return "Ladrido";
    }
    public String getAlimentos() {
        return "Carnívoro";
    }
    public String gethabitat() {
        return "Doméstico";
    }
    public String getnombreCientifico() {
        return "Canis lupus familiaris";
    }
}

class Lobo extends Canido {
    public String getSonido() {
        return "Aullido";
    }
    
    public String getAlimentos() {
        return "Carnívoro";
    }
    
    public String gethabitat() {
        return "Bosque";
    }
    
    public String getnombreCientifico() {
        return "Canis lupus";
    }
}
abstract class Felino extends Animal {
}
class Leon extends Felino {
    public String getSonido() {
        return "Rugido";
    }
    public String getAlimentos() {
        return "Carnívoro";
    }

    public String gethabitat() {
        return "Praderas";
    }
    public String getnombreCientifico() {
        return "Panthera leo";
    }
}

class Gato extends Felino {
    
    public String getSonido() {
        return "Maullido";
    }
    
    public String getAlimentos() {
        return "Ratones";
    }
    
    public String gethabitat() {
        return "Doméstico";
    }
    
    public String getnombreCientifico() {
        return "Felis silvestris catus";
    }
}
class Prueba {
    
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getnombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("habitat: " + animales[i].gethabitat());
            System.out.println();
        }
    }
}