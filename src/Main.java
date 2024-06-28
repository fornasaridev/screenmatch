import br.com.alura.screenmacth.calculos.CalculadoraTempo;
import br.com.alura.screenmacth.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Series;


public class Main {
    public static void main(String[] args) {
        Film godfather = new Film();
        godfather.setNome("The Godfather");
        godfather.setDuracaoEmMinutos(120);


        Series got = new Series();
        got.setNome("Game of Thrones");
        got.setEpisodiosPorTemporada(10);
        got.setDuracaoEmMinutos(60);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(godfather);
        calculadora.inclui(got);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(godfather);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie("Got");
        episodio.setTotalVisualizacoes(400);
        filtro.filtra(episodio);


    }
}