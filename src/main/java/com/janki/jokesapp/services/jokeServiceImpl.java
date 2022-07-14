package com.janki.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class jokeServiceImpl implements jokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public jokeServiceImpl() {
        this.chuckNorrisQuotes= new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
