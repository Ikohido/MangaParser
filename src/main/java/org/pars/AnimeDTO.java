package org.pars;

import java.util.List;

public class AnimeDTO {
    private String title;
    private String imageLink;
    private List<String> genres;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AnimeDTO{" +
                "title='" + title + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", genres=" + genres +
                ", description='" + description + '\'' +
                '}';
    }
}
