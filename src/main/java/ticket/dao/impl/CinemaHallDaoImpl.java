package ticket.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ticket.dao.AbstractDao;
import ticket.dao.CinemaHallDao;
import ticket.model.CinemaHall;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
