package ticket.service;

import java.util.Optional;
import ticket.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
