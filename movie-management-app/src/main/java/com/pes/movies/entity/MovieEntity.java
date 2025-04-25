package com.pes.movies.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter

@Setter
public class MovieEntity {
    private int movieId;
    private String movieName;
    private String movieHero;
    private String movieHeroin;
    private String movieLanguage;
    private LocalDate releaseDate;



}
