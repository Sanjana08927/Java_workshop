package service;

import com.pes.movies.entity.MovieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args) {
        MovieEntity movieEntity=new MovieEntity();
       // movieEntity.setMovieId(2);
        movieEntity.setMovieName("KGF 3");
        movieEntity.setMovieHero("Yash");
        movieEntity.setMovieHeroin("Radhika pandith");
        movieEntity.setMovieLanguage("kannada");
        movieEntity.setReleaseDate(LocalDate.of(2020,04,14));
        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(movieEntity);
        repo.readMovies();
    }
}
