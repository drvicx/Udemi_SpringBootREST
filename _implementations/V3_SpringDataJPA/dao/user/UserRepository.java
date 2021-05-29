package ru.nve.springboot.examples.demoApp1.dao.user;

import ru.nve.springboot.examples.demoApp1.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *=Spring Data JPA User DAO/Repository Implementation
 */
public interface UserRepository extends JpaRepository<User, Long> {
    //--thats all! No need to write any code!
}
