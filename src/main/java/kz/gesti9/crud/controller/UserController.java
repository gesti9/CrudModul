package kz.gesti9.crud.controller;

import kz.gesti9.crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kz.gesti9.crud.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<User> findAll(){
        return userService.showAll();
    }

    @GetMapping("/create")
    public void createUserForm(User user){
    }

    @PostMapping("/create")
    @ResponseBody
    public void createUser(@RequestBody  User user){
        userService.saveUser(user);
    }

    @GetMapping("/user-delete/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteById(id);
    }

    @PostMapping("/update-user/{id}")
    @ResponseBody
    public void updateUser(@PathVariable("id") Long id, @RequestBody User user){
        User user1 = userService.findById(id);
        user1 = userService.saveUser(user);
    }

}
