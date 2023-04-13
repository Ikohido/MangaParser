package org.pars;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList list = new ArrayList();

        var document = Jsoup.connect("https://readmanga.live/list?sortType=rate")
                .userAgent("Chrome/81.0.4044.138").get();

        var titleElements = document.select("h3");
        var genreElements = document.select("a.badge.badge-light.element-link");

        for (var element : titleElements) {
            System.out.println(element.text());
            System.out.println(genreElements.text());
            genreElements.next();

        }

    }
}