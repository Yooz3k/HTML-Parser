/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parserhd;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

/**
 *
 * @author Mat
 */
public class Parser {
    ArrayList<Movie> movies;
    ArrayList<Country> countries;
    ArrayList<Name> names;
    ArrayList<Producer> producers;
    
    private Parser()
    {
//        movies = new ArrayList<>();
//        countries = new ArrayList<>();
//        names = new ArrayList<>();
//        producers = new ArrayList<>();
        
    }
    
    public static void main(String[] args) throws IOException
    {
        Document doc = Jsoup.connect("https://pl.wikipedia.org/wiki/Toyota").get();
        System.out.println("Tytuł: " + doc.title() + "\n");
        
        Elements articleHeaders = doc.getElementsByClass("mw-headline");
        
        for (Element el : articleHeaders)
            System.out.println(el.text());
    }
}
