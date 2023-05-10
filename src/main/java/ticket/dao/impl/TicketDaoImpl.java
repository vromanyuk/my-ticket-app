package ticket.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ticket.dao.AbstractDao;
import ticket.dao.TicketDao;
import ticket.model.Ticket;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
