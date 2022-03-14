package kz.gesti9.crud.services;

import kz.gesti9.crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kz.gesti9.crud.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> showAll(){
        return userRepository.findAll();
    }

    public User  saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
         userRepository.deleteById(id);
    }

}
