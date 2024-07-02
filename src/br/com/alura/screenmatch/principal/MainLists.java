package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        Film godfather = new Film("The Godfather", 1970);
        godfather.avalia(10);
        Film avatar = new Film("Avatar", 2009);
        avatar.avalia(9.5);
        Series got = new Series("Game of Thrones", 2010);
        got.avalia(8);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(godfather);
        lista.add(avatar);
        lista.add(got);

        for (Title title : lista) {
            System.out.println(title.getNome());
            if (title instanceof Film) {
                Film filme = (Film) title;
                System.out.println("Classificação: " + filme.getClassificacao());
            }else {
                Series serie = (Series) title;
                System.out.println("Classificação: " + serie.getTotalDeAvaliacoes());
            }
        }

    }
}