package ticket.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ticket.dao.AbstractDao;
import ticket.dao.RoleDao;
import ticket.exception.DataProcessingException;
import ticket.model.Role;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory, Class<Role> clazz) {
        super(factory, clazz);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery("SELECT r FROM Role r "
                            + "WHERE r.name = :roleName", Role.class)
                    .setParameter("roleName", Role.RoleName.valueOf(roleName))
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Couldn't get role by role name: "
                    + roleName, e);
        }
    }
}
