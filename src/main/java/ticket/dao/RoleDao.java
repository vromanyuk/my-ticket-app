package ticket.dao;

import java.util.Optional;
import ticket.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
