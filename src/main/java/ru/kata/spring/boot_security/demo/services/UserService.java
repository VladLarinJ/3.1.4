package ru.kata.spring.boot_security.demo.services;



import ru.kata.spring.boot_security.demo.entities.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    void add(ArrayList<Integer> roles, String name, String lastName, String password, String email, Integer age);
    User getUserById(Integer id);
    List<User> listUsers();
    void updateUser(ArrayList<Integer> roles, String name, String lastName, String password, String email, Integer age, Integer id);
    void deleteUser(Integer id);
    User getUserByNamePass(String name, String password);
    User getUserByName(String name);
    User getUserByEmail(String email);
}
