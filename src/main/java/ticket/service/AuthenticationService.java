package ticket.service;

import ticket.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
