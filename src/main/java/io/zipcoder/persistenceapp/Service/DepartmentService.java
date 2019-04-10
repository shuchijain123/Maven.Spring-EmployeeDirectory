package io.zipcoder.persistenceapp.Service;

import io.zipcoder.persistenceapp.Models.DepartmentEntity;
import io.zipcoder.persistenceapp.Models.EmployeeEntity;
import io.zipcoder.persistenceapp.repositories.DepartmentRepository;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {


    private DepartmentRepository repository;

    @Autowired

    public DepartmentService(DepartmentRepository repository)

    {
        this.repository = repository;
    }





    public DepartmentEntity create(DepartmentEntity department)
    {


        return repository.save(department);
    }


    public DepartmentEntity show(Long dpt_num) {


        return repository.findById(dpt_num).get();
    }


    public DepartmentEntity update(Long dpt_num, DepartmentEntity newDepartmentData) {
        DepartmentEntity originalDepartment = repository.findById(dpt_num).get();
        originalDepartment.setDepartmentName(newDepartmentData.getDepartmentName());
        return repository.save(originalDepartment);
    }




}
