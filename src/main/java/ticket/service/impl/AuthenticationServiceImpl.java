package ticket.service.impl;

import java.util.Set;
import org.springframework.stereotype.Service;
import ticket.model.User;
import ticket.service.AuthenticationService;
import ticket.service.RoleService;
import ticket.service.ShoppingCartService;
import ticket.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final String ROLE_USER = "USER";
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService, DataInitializer dataInitializer) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getByName(ROLE_USER)));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
