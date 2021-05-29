package ru.nve.springboot.examples.demoApp1.dao.employee;

import ru.nve.springboot.examples.demoApp1.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *=Spring Data JPA Employee DAO/Repository Implementation
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //--thats all! No need to write any code!
}
