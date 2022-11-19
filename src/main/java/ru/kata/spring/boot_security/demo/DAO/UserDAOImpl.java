package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getList() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(long id) {
        entityManager.remove(getUser(id));
    }

    @Override
    public void editUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public UserDetails getUser(String username) {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.name = :username", User.class);
        User user = query.setParameter("username", username)
                 .getSingleResult();
        return user;
//        String sql = "select * from User where name?=" + username;
//        return entityManager.createQuery(sql).getSingleResult();


    }
}
