package org.pars;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://readmanga.live/list?sortType=rate")
                .userAgent("Chrome/81.0.4044.138").get();

        Elements allAnime = document.getElementsByClass("col-sm-6");

        for (Element element : allAnime) {
            System.out.println("Тайтл: " + element.select("img").attr("title"));
            System.out.println("Картинка тайтла: " + element.select("img").attr("data-original"));
            System.out.println("Жанры тайтла: " + element.select(".badge.badge-light").text());
            System.out.println("Описание тайтла: " + element.select(".manga-description").text());
            System.out.println("");
        }


    }
}


