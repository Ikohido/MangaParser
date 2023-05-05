package org.pars;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<AnimeDTO> allAnime = new ArrayList<>();

        int offset = 0;
        while (true) {
            Document document = Jsoup.connect("https://readmanga.live/list?sortType=RATING&offset=" + offset).get();


            Elements allAnimeOnPage = document.getElementsByClass("col-sm-6");

            if (allAnimeOnPage.isEmpty()) {
                break;
            }

            for (Element element : allAnimeOnPage) {
                AnimeDTO animeDTO = new AnimeDTO();
                animeDTO.setTitle(element.select("img").attr("title"));
                animeDTO.setImageLink(element.select("img").attr("data-original"));

                Elements genresElements = element.getElementsByClass("element-link");
                List<String> genres = new ArrayList<>();
                for (Element currentGenre : genresElements) {
                    genres.add(currentGenre.text());

                }
                animeDTO.setGenres(genres);

                animeDTO.setDescription(element.select(".manga-description").text());
                allAnime.add(animeDTO);
                System.out.println(animeDTO + "\n");
            }
            offset += 70;
        }

        System.out.println("Всего аниме на сайте: " + allAnime.size());
    }
}


