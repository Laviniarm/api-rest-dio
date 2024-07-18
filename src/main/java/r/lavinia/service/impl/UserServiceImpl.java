package r.lavinia.service.impl;

import org.springframework.stereotype.Service;
import r.lavinia.domain.model.User;
import r.lavinia.domain.repository.UserRepository;
import r.lavinia.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("this Accout number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
