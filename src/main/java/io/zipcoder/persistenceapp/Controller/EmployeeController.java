package io.zipcoder.persistenceapp.Controller;

import io.zipcoder.persistenceapp.Models.EmployeeEntity;
import io.zipcoder.persistenceapp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {


    private EmployeeService service;


     @Autowired
    public EmployeeController(EmployeeService service) {


        this.service = service;
    }


    @GetMapping("/employees/{id}")
    public  ResponseEntity<EmployeeEntity> show(@PathVariable Long id) {

        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }



    @PostMapping("/employees/")
    public  ResponseEntity<EmployeeEntity> create(@RequestBody EmployeeEntity employee) {

        return new ResponseEntity<>(service.create(employee), HttpStatus.CREATED);
    }


    @PutMapping("/employees/{id}")
    public  ResponseEntity<EmployeeEntity> update(@PathVariable Long id, @RequestBody EmployeeEntity employee) {

        return new ResponseEntity<>(service.update(id, employee), HttpStatus.OK);
    }




    @GetMapping("/employees/")
    public  ResponseEntity<List<EmployeeEntity>> show() {

        return new ResponseEntity<List<EmployeeEntity>>(service.getAllEmployees(), HttpStatus.OK);
    }


    @GetMapping("/employeesAll/{departmentManager}")
    public  ResponseEntity<List<EmployeeEntity>> findAllEemployeesManger(@PathVariable Long departmentManager) {

        return new ResponseEntity<List<EmployeeEntity>>(service.getAllEmployeesManager(departmentManager), HttpStatus.OK);
    }








}
