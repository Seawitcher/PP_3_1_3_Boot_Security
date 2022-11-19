package ru.kata.spring.boot_security.demo.DAO;






import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDAO {


    public void add(User user);
    public List<User> getList();
    public User getUser(long id);
    public void deleteUser(long id);
    public void editUser(User user);
}
