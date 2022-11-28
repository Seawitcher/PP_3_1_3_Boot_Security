package ru.kata.spring.boot_security.demo.DAO;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleDAO {

    boolean add(Role user);

//    List<Role> getRoleList();

    Role getRole(Long id);
//
//    Role findByName(String name);
//
//    List<Role> listByName(List<String> name);

    List<Role> getList();

    void deleteRole(Long id);

    void editRole(Role role);

    List<Role> listByName(List<String> name);

    Role findByName(String name);
}
