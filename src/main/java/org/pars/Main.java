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
        Elements img = allAnime.first().getElementsByClass("img");
        Elements hover = img.first().getElementsByClass("non-hover");
        hover.select("img.class");
        for (Element element : hover) {
            System.out.println(element.childNode(1).attr("title"));
            System.out.println(element.childNode(1).attr("data-original"));

        }

    }
}


