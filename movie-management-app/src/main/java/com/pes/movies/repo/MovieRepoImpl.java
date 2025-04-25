package com.pes.movies.repo;

import com.pes.movies.entity.MovieEntity;

import javax.xml.transform.Result;
import java.sql.*;

public class MovieRepoImpl implements MovieRepo{
    @Override
    public void saveMovie(MovieEntity entity) {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String userName = "root";
        String psw = "Sanjana@2024";
        String query = "insert into movie_info(movie_name, movie_hero, movie_heroin, language, release_date)" + "values(?,?,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, entity.getMovieName());
            statement.setString(2, entity.getMovieHero());
            statement.setString(3, entity.getMovieHeroin());
            statement.setString(4, entity.getMovieLanguage());
            statement.setDate(5, Date.valueOf(entity.getReleaseDate()));

            statement.execute();
            System.out.println(entity.getMovieName() + ":Date is saved");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readMovies() {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String userName = "root";
        String psw = "Sanjana@2024";
        String query = "select * from movie_info";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                System.out.print(set.getInt("movie_id") + " " + set.getString(("movie_name") + ""));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}