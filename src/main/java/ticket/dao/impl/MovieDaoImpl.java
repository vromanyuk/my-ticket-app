package ticket.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ticket.dao.AbstractDao;
import ticket.dao.MovieDao;
import ticket.model.Movie;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
