import br.com.alura.screenmatch.modelos.Film;

public class Main {
    public static void main(String[] args) {

        Film film = new Film();
        film.setName("The Godfather");
        film.setLaunchYear(1972);
        film.setPlanIncluded(true);
        film.setSinopsis("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");

        film.avalia(9.5);
        film.avalia(5);
        film.avalia(10);
        film.avalia(10);
        film.exibeFichaTecnica();
        System.out.println(film.mediaAvaliacao());
    }
}