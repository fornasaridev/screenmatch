import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Series;

public class Main {
    public static void main(String[] args) {

        Series lost = new Series();
        lost.setName("Lost");
        lost.setLaunchYear(2000);
        lost.exibeFichaTecnica();
        lost.setSeasons(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration in minutes: " + lost.getDuracaoMinutos());
    }
}