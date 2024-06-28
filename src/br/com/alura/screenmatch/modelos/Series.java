package br.com.alura.screenmatch.modelos;

public class Series extends Title{
    //region Properties
    private int seasons;
    private boolean active;
    private int episodeperSeason;
    private int minutesPerEpisode;

    //endregion

    //region getters and setters
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getEpisodeperSeason() {
        return episodeperSeason;
    }
    public void setEpisodeperSeason(int episodeperSeason) {
        this.episodeperSeason = episodeperSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDuracaoMinutos() {
        return seasons * episodeperSeason * minutesPerEpisode;
    }

    //endregion

}
