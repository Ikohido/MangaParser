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
        Elements imgAndTitle = allAnime.select("img");
        Elements descAndGenres = allAnime.select("div.desc").select("i.fa.fa-info-circle.fa-lgg.long-description.html-popover");
        Elements descAndGenres2 = descAndGenres.select("noindex");
        Elements descAndGenres3 = descAndGenres2.select(".html-popover-holder");


        for (Element element : imgAndTitle) {
            System.out.print("Тайтл: ");
            System.out.println(element.attr("title"));
            System.out.print("Картинка тайтла: ");
            System.out.println(element.attr("data-original"));
            System.out.println("Жанры и описание тайтла:");
            for (Element element2 : descAndGenres3) {
                System.out.println(element2.getElementsByTag("span").text());
            }
        }


    }
}


