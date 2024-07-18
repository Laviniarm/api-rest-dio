package r.lavinia.service;

import r.lavinia.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
