package ru.kata.spring.boot_security.demo.service;





import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    public void add(User user);
    public List<User> getList();
    public User getUser(long id);
    public void deleteUser(long id);
    public void editUser(User user);
}
