package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int launchYear;
    private boolean planIncluded;
    private double somaAvaliacao;
    private int totalAvaliacoes;
    private String sinopsis;

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;

    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void exibeFichaTecnica() {
        System.out.println("Name: " + name);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Plan Included: " + planIncluded);
        System.out.println("Rating: " + somaAvaliacao);
        System.out.println("Rating Total: " + totalAvaliacoes);
        System.out.println("Sinopsis: " + sinopsis);

    }

    int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacoes++;
    }

    public double mediaAvaliacao() {
        return somaAvaliacao / totalAvaliacoes;
    }
}
