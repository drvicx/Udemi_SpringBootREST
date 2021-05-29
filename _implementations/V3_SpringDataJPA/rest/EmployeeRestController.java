package ru.nve.springboot.examples.demoApp1.rest;

import ru.nve.springboot.examples.demoApp1.entity.employee.Employee;
import ru.nve.springboot.examples.demoApp1.service.employee.EmployeeService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


/**
 *=EMPLOYEE REST-CONTROLLER
 * http://localhost:7070/employees
 */
@RestController
@RequestMapping("employees")
public class EmployeeRestController {

    // Employee Service instance
    private EmployeeService employeeService;

    // quick and dirty inject Employee Service with Constructor Injection
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // expose "/employees" endpoint and reurn list of employees
    @GetMapping("")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    //--реализация из урока 464 но без Session слоя
    //  add mapping for GET employees/{employeeId}
    //  http://localhost:7070/api/employees/1
    @GetMapping("{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        //--
        Employee theEmployee = employeeService.findById(employeeId);
        //--
        if (theEmployee == null) {
            throw new RuntimeException("Employee ID not found - " + employeeId);
        }
        return theEmployee;
    }

    //--add mapping for POST employees - Add new employee
    @PostMapping("")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        //--also just in case they pass an id in JSON .. set id to 0
        //  this is to force a save of new item .. instead of update
        theEmployee.setId(0);
        //--call save to database method from DAO-object
        employeeService.save(theEmployee);
        //--needs to return saved object
        return theEmployee;
    }

    //--add mapping for PUT employees - Update existing employee by ID
    @PutMapping("{employeeId}")
    public Employee updateEmployee(@PathVariable int employeeId, @RequestBody Employee theEmployee) {
        //--search object by id
        theEmployee.setId(employeeId);
        //--call save to database method from DAO-object
        employeeService.save(theEmployee);
        //--needs to return saved object
        return theEmployee;
    }

    //--add mapping for DELETE /employees/{employeeId} - Delete employee by ID
    @DeleteMapping("{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        //--create object by find record by id
        Employee tempEmployee = employeeService.findById(employeeId);
        //--throw Exception if null (if finding employee is not exists)
        if (tempEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        //--now call delete method
        employeeService.deleteById(employeeId);
        //--return JSON-message
        return  "Deleted employee id - " + employeeId;
    }

}
