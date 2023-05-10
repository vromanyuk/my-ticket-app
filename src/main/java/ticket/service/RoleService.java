package ticket.service;

import ticket.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
