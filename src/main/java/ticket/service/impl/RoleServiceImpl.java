package ticket.service.impl;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import ticket.dao.RoleDao;
import ticket.model.Role;
import ticket.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(() ->
                new NoSuchElementException("Role with name: "
                        + roleName + " not found"));
    }
}
