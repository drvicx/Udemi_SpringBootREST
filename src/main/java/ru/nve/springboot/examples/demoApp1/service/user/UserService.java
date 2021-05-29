package ru.nve.springboot.examples.demoApp1.service.user;

import ru.nve.springboot.examples.demoApp1.entity.user.User;
import java.util.List;


/**
 *=User Service Interface
 */
public interface UserService {
    //--get all records
    public List<User> findAll();
    //--get single record by id
    public User findById(Long theId);
    //--add/save/update record
    public void save(User theUser);
    //--delete record by id
    public void deleteById(Long theId);
}
