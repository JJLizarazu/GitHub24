package Movie;
import java.util.*;
public class Movie {
    String nameMovie, director;
    enum type {Acción, Comedia, Drama, Suspenso};
    type gender;
    int durationMovie, year;
    double rating;

    Movie(String nameMovie, String director, type gender, int durationMovie, int year, double rating){
        this.nameMovie = nameMovie;
        this.director = director;
        this.gender = gender;
        this.durationMovie = durationMovie;
        this.year = year;
        this.rating = rating;
    }

    public String getNameMovie(){
        return nameMovie;
    }
    private void setNameMovie(String nameMovie){
        this.nameMovie = nameMovie;
    }

    public String getDirector(){
        return director;
    }
    private void setDirector(String director){
        this.director = director;
    }

    public type getGender() {
        return gender;
    }
    private void setGender(type gender){
        this.gender = gender;
    }

    public int getDurationMovie(){
        return durationMovie;
    }
    private void setDurationMovie(int durationMovie){
        this.durationMovie = durationMovie;
    }

    public int getYear(){
        return year;
    }
    private void setYear(int year){
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    private void setRating(double rating){
        this.rating = rating;
    }

    public void dataPrint(){
        System.out.println("Nombre Película: " + nameMovie);
        System.out.println("Director: " + director);
        System.out.println("Género: " + gender);
        System.out.println("Duración: " + durationMovie);
        System.out.println("Año de Salida: " + year);
        System.out.println("Calificación: " + rating);
    }

    public boolean isEpicMovie(){
        if (durationMovie >= 180){
            return true;
        } else {
            return false;
        }
    }

    private String calculateRating(){
        if (rating >= 0 && rating <= 2){
            return "Muy Mala";
        } else if (rating > 2 && rating <= 5){
            return "Mala";
        } else if (rating > 5 && rating <= 7){
            return "Regular";
        } else if (rating > 7 && rating <= 8){
            return "Buena";
        } else if (rating > 8 && rating <= 10){
            return "Épica";
        } else {
            return "No tiene vcaloración alguna";
        }
    }

    public boolean equalsMovies(Movie movie){
        if (movie.gender == gender && movie.calculateRating().equals(calculateRating())){
            return true;
        } else {
            return false;
        }
    }

    public static void resourcesMovie(){
        System.out.println("");
        System.out.println("==================================");
        System.out.println("");
    }

    public void showMovie(){
        System.out.println("   ---- " + nameMovie + " ----");
        System.out.println("         " + rating);
        System.out.println("         " + year);
        System.out.println("        " + gender);
        System.out.println("    " + director);

    }
}

class mainMovie{
    public static void main(String[] args) {
        Movie movie_1 = new Movie("Gandhi", "Richard Attenborough", Movie.type.Drama, 191, 1982, 8.1);
        Movie movie_2 = new Movie("Thor", "Kenneth Branagh", Movie.type.Acción, 115, 2011, 7.0);
        Movie.resourcesMovie();
        movie_1.dataPrint();
        Movie.resourcesMovie();
        movie_2.dataPrint();
        Movie.resourcesMovie();
        System.out.println("La película " + movie_1.getNameMovie() + " es épica: " + movie_1.isEpicMovie());
        System.out.println("La película " + movie_2.getNameMovie() + " es épica: " + movie_2.isEpicMovie());
        System.out.println("La película " + movie_1.getNameMovie() + " y " + movie_2.getNameMovie() + " son similares = " + movie_1.equalsMovies(movie_2));
        Movie.resourcesMovie();
        movie_1.showMovie();
        Movie.resourcesMovie();
        movie_2.showMovie();
        Movie.resourcesMovie();
    }
}
