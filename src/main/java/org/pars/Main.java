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
        List<AnimeDTO> anime = new ArrayList<>();
        Document document = Jsoup.connect("https://readmanga.live/list?sortType=rate")
                .userAgent("Chrome/81.0.4044.138").get();

        Elements allAnime = document.getElementsByClass("col-sm-6");
        Elements genres = allAnime.select(".badge.badge-light");
        for (Element element : allAnime) {
            AnimeDTO animeDTO = new AnimeDTO();
            animeDTO.setTitle(element.select("img").attr("title"));
            animeDTO.setImageLink(element.select("img").attr("data-original"));
            for (Element genress : genres) {
                animeDTO.setGenres(genress.text() + ",");

            }
            animeDTO.setDescription(element.select(".manga-description").text());

            System.out.println(animeDTO.toString().replaceAll("AnimeDTO", " ") + "\n");
        }


    }
}


