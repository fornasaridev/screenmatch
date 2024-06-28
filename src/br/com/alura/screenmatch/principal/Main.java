package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Film godfather = new Film("The Godfather", 1970);
        godfather.setNome("The Godfather");
        godfather.setDuracaoEmMinutos(120);



        Series got = new Series("Game of Thrones", 2010);
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

        var filmedoPaulo = new Film("Dogville", 2003);
        filmedoPaulo.setDuracaoEmMinutos(200);
        filmedoPaulo.avalia(10);

        ArrayList<Film> listadefilmes = new ArrayList<>();
        listadefilmes.add(filmedoPaulo);
        listadefilmes.add(godfather);
        System.out.println("Tamanho da Lista: " + listadefilmes.size());
        System.out.println("Nome do filme: " + listadefilmes.get(0).getNome());
        System.out.println("toString: " + listadefilmes.get(0).toString());
        System.out.println(listadefilmes.toString());





    }
}