package org.pars;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://readmanga.live/list?sortType=rate")
                .userAgent("Chrome/81.0.4044.138").get();

        Elements allAnime = document.getElementsByClass("col-sm-6");

        for (Element element : allAnime) {
            AnimeDTO animeDTO = new AnimeDTO();
            animeDTO.setTitle(element.select("img").attr("title"));
            animeDTO.setImageLink(element.select("img").attr("data-original"));
            animeDTO.setGenres(element.select(".badge.badge-light").text());
            animeDTO.setDescription(element.select(".manga-description").text());


            System.out.println(animeDTO.toString().replaceAll("AnimeDTO", " ") + "\n");


        }


    }
}


