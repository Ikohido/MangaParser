package org.pars;

public class Attributes {

    private String manhwaName;
    private String genres;

    public String getManhwaName() {
        return manhwaName;
    }

    public void setManhwaName(String manhwaName) {
        this.manhwaName = manhwaName;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "manhwaName='" + manhwaName + '\'' +
                ", genres='" + genres + '\'' +
                '}';
    }
}
