package br.com.alura.screenmacth.calculos;

public class FiltroRecomendacao {
    private String remoceomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem classificado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
