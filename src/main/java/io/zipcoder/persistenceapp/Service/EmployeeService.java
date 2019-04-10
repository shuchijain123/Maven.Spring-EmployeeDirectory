package io.zipcoder.persistenceapp.Service;


import io.zipcoder.persistenceapp.Models.DepartmentEntity;
import io.zipcoder.persistenceapp.Models.EmployeeEntity;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository repository;


    @Autowired

    public EmployeeService(EmployeeRepository repository)

    {
        this.repository = repository;
    }


    List<EmployeeEntity> myList =new ArrayList<>();





    public EmployeeEntity create(EmployeeEntity employee)
    {


        return repository.save(employee);
    }

    public EmployeeEntity update(Long id, EmployeeEntity newEmployeerData) {


        EmployeeEntity originalEmployee = repository.findById(id).get();


        originalEmployee.setDepartmentManager(newEmployeerData.getDepartmentManager());



        return repository.save(originalEmployee);
    }


       public EmployeeEntity show(Long id) {


        return repository.findById(id).get();
    }


    public void addEmployee(EmployeeEntity employee) {


       myList.add(employee);
    }


    public List<EmployeeEntity> getAllEmployees(){
        List<EmployeeEntity> emps = (List<EmployeeEntity>)repository.findAll();
        return emps;
    }


    public List<EmployeeEntity> getAllEmployeesManager(Long departmentManager){




         return repository.findEmployeeByManager(departmentManager);

    }



}
