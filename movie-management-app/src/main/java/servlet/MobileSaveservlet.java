package servlet;

import com.pes.movies.entity.MovieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/save")
public class MobileSaveservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {
        MovieEntity entity = new MovieEntity();
        entity.setMovieName(req.getParameter("moviename"));
        entity.setMovieHero(req.getParameter("heroname"));
        entity.setMovieHeroin(req.getParameter("heroinename"));
        entity.setMovieLanguage(req.getParameter("language"));
        entity.setReleaseDate(LocalDate.parse(req.getParameter("releaseDate")));
        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(entity);

        PrintWriter respWriter = resp.getWriter();
        respWriter.print(entity.getMovieName()+":Movie saved ..!");


    }
}
